package is.hi.noteshare.controllers;

import is.hi.noteshare.persistence.entities.*;
import is.hi.noteshare.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.List;


@Controller
public class HomeController {
    private final CourseService courseService;
    private final SchoolService schoolService;
    private final SubjectService subjectService;
    private final DegreeService degreeService;

    @Autowired
    public HomeController(CourseService courseService, SchoolService schoolService, SubjectService subjectService, DegreeService degreeService) {
        this.courseService = courseService;
        this.schoolService = schoolService;
        this.subjectService = subjectService;
        this.degreeService = degreeService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(HttpSession session, Model model){
        // fetch all data (possibly keep in session?)
        List<Course> courses = courseService.findAll();
        List<School> schools = schoolService.findAll();
        List<Subject> subjects = subjectService.findAll();
        List<Degree> degrees = degreeService.findAll();

        // add all courses or courses from search result
        List<Course> coursesSession = (List<Course>) session.getAttribute("courseList");
        List<Course> courseList = coursesSession == null ? courses : coursesSession;

        // get logged in user
        User userSession = (User) session.getAttribute("loggedInUser");
        if(userSession != null) {
            model.addAttribute("loggedInUser", userSession);
        }

        // add data to model
        model.addAttribute("search", new SearchCourse());
        model.addAttribute("courses", courseList);
        model.addAttribute("schools", schools);
        model.addAttribute("subjects", subjects);
        model.addAttribute("degrees", degrees);

        return "index";
    }

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public String search(SearchCourse search, BindingResult result, Model model, HttpSession session){
        if(result.hasErrors()){
            System.out.println(result.getAllErrors());
            return "redirect:/#filter";
        }

        List<Course> courses = courseService.findAll();

        // fetch objects from search parameters
        School school = schoolService.findById(search.getSchool());
        Subject subject = subjectService.findById(search.getSubject());
        Degree degree = degreeService.findById(search.getDegree());

        // course lists by parameter
        List<Course> schoolCourses = courses;
        List<Course> subjectCourses = courses;
        List<Course> degreeCourses = courses;
        List<Course> keywordCourses = courses;

        // fetch courses by parameter
        if(school != null) { schoolCourses = school.getCourses(); }
        if(subject != null) { subjectCourses = subject.getCourses(); }
        if(degree != null) { degreeCourses = degree.getCourses(); }
        if(!search.getKeyword().equals("") && search.getKeyword() != null) {
            keywordCourses = courseService.findByKeyword(search.getKeyword());
        }

        // find common courses
        schoolCourses.retainAll(subjectCourses);
        degreeCourses.retainAll(schoolCourses);
        keywordCourses.retainAll(degreeCourses);

        // keep search result in session
        session.setAttribute("courseList", keywordCourses);

        return "redirect:/#all-courses";
    }

    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String getAbout(){
        return "about";
    }

    @RequestMapping(value = "/contact", method = RequestMethod.GET)
    public String getContact(){
        return "contact";
    }

    @RequestMapping(value = "/profile", method = RequestMethod.GET)
    public String getProfile(){
        return "profile";
    }

    @RequestMapping(value = "/upload", method = RequestMethod.GET)
    public String getUpload(){
        return "upload";
    }
}



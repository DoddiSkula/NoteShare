package is.hi.noteshare.controllers;

import is.hi.noteshare.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import is.hi.noteshare.persistence.entities.Course;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.validation.BindingResult;

import java.util.List;

@Controller
public class CourseController {
    private CourseService courseService;

    @Autowired
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }
    @RequestMapping("/")
    public String coursePage(Model model){
        List<Course> allCourses = courseService.findAll();

        model.addAttribute("courses", allCourses);
        return "home";
    }

    @RequestMapping(value="/addcourse", method = RequestMethod.GET)
    public String addCourseGET(Course course) {
        return "newCourse";
    }

    @RequestMapping(value="/addcourse", method = RequestMethod.POST )
    public String addCoursePOST(Course course, BindingResult result, Model model){
        if(result.hasErrors()){
            return "newCourse";
        }
        courseService.save(course);
        return "redirect:/";
    }

    @RequestMapping(value="/delete/{id}", method = RequestMethod.GET)
    public String deleteCourse(@PathVariable("id") long id, Model model){
        Course courseToDelete = courseService.findOne(id);
        courseService.delete(courseToDelete);
        return "redirect:/";
    }
}


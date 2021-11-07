package is.hi.noteshare.controllers;

import is.hi.noteshare.persistence.entities.Course;
import is.hi.noteshare.persistence.entities.School;
import is.hi.noteshare.services.CourseService;
import is.hi.noteshare.services.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@Controller
public class HomeController {
    private final CourseService courseService;
    private final SchoolService schoolService;

    @Autowired
    public HomeController(CourseService courseService, SchoolService schoolService) {
        this.courseService = courseService;
        this.schoolService = schoolService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Model model){
        // TODO er notandi innskráður?
        List<Course> courses = courseService.findAll();
        List<School> schools = schoolService.findAll();

        model.addAttribute("courses", courses);
        model.addAttribute("schools", schools);

        return "index";
    }
}

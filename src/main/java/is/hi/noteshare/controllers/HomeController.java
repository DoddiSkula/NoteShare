package is.hi.noteshare.controllers;

import is.hi.noteshare.services.CourseService;
import is.hi.noteshare.services.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {
    private CourseService courseService;

    @Autowired
    public HomeController(CourseService courseService) {this.courseService = courseService;}

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Model model){
        // TODO er notandi innskráður?
        return "index";
    }
}

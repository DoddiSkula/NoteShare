package is.hi.noteshare.controllers;

import is.hi.noteshare.persistence.entities.Course;
import is.hi.noteshare.persistence.entities.User;
import is.hi.noteshare.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class CourseController {

    CourseService courseService;

    @Autowired
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @RequestMapping(value = "/course/{id}", method = RequestMethod.GET)
    public String courseGET(@PathVariable("id") long id, Model model, HttpSession session) {
        Course course = courseService.findById(id);

        // get logged in user
        User userSession = (User) session.getAttribute("loggedInUser");
        if(userSession != null) {
            model.addAttribute("loggedInUser", userSession);
        }

        model.addAttribute("course", course);

        return "course";
    }

}
package is.hi.noteshare.controllers;

import is.hi.noteshare.persistence.entities.Course;
import is.hi.noteshare.persistence.entities.User;
import is.hi.noteshare.services.CourseService;
import is.hi.noteshare.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Objects;

/*
    Endpoints:
    course/:id (GET)
    course/:id/favourite (POST)
    course/:id/remove (POST)
 */

@Controller
public class CourseController {
    private final UserService userService;
    private final CourseService courseService;

    @Autowired
    public CourseController(CourseService courseService, UserService userService) {
        this.courseService = courseService;
        this.userService = userService;
    }

    @RequestMapping(value = "/course/{id}", method = RequestMethod.GET)
    public String courseGET(@PathVariable("id") long id, Model model, HttpSession session) {
        Course course = courseService.findById(id);

        // get logged in user
        User userSession = (User) session.getAttribute("loggedInUser");
        if(userSession != null) {
            model.addAttribute("loggedInUser", userSession);
            model.addAttribute("isFavourited", userService.isFavourited(userSession, id));
        }

        model.addAttribute("course", course);

        return "course";
    }

    @RequestMapping(value = "/course/{id}/favourite", method = RequestMethod.POST)
    public String favoritePOST(@PathVariable("id") long id, HttpSession session){
        // get course
        Course course = courseService.findById(id);

        // get logged in user
        User userSession = (User) session.getAttribute("loggedInUser");

        userSession.getCourses().add(course);
        userService.favourite(userSession.getId(), id);

        return "redirect:/course/{id}";
    }

    @RequestMapping(value = "/course/{id}/remove", method = RequestMethod.POST)
    public String favoriteRemovePOST(@PathVariable("id") long id, HttpSession session){
        // get logged in user
        User userSession = (User) session.getAttribute("loggedInUser");

        // remove from db and session
        userService.removeFavouritedSession(userSession, id);
        userService.removeFavourite(userSession.getId(), id);

        return "redirect:/course/{id}";
    }

}
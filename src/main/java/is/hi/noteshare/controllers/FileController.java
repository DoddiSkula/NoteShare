package is.hi.noteshare.controllers;

import is.hi.noteshare.persistence.entities.Course;
import is.hi.noteshare.persistence.entities.User;
import is.hi.noteshare.services.CourseService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
public class FileController {
    private final CourseService courseService;

    public FileController(CourseService courseService) {
        this.courseService = courseService;
    }

    @RequestMapping(value = "/course/{id}/upload", method = RequestMethod.GET)
    public String courseGET(@PathVariable("id") long id, Model model, HttpSession session) {
        Course course = courseService.findById(id);

        // get logged in user
        User userSession = (User) session.getAttribute("loggedInUser");
        if(userSession != null) {
            model.addAttribute("loggedInUser", userSession);
        }

        model.addAttribute("course", course);

        return "upload";
    }

    @RequestMapping(value = "/course/{id}/upload", method = RequestMethod.POST)
    public String coursePOST(@PathVariable("id") long id, BindingResult result, Model model, HttpSession session) {
        if(result.hasErrors()){
            System.out.println(result.getAllErrors());
            return "redirect:/course/{id}";
        }

        Course course = courseService.findById(id);
        User userSession = (User) session.getAttribute("loggedInUser");


        return "redirect:/course/{id}";
    }

}

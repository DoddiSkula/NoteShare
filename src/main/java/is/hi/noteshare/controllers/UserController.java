package is.hi.noteshare.controllers;

import is.hi.noteshare.persistence.entities.School;
import is.hi.noteshare.persistence.entities.User;
import is.hi.noteshare.services.SchoolService;
import is.hi.noteshare.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UserController {
    private final UserService userService;
    private final SchoolService schoolService;

    @Autowired
    public UserController(UserService userService, SchoolService schoolService){
        this.userService = userService;
        this.schoolService = schoolService;
    }

    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public String signupGET(User user, Model model, HttpSession session){
        List<School> schoolList = schoolService.findAll();

        // get logged in user
        User userSession = (User) session.getAttribute("loggedInUser");
        if(userSession != null) {
            model.addAttribute("loggedInUser", userSession);
        }

        model.addAttribute("user", new User());
        model.addAttribute("schools", schoolList);

        return "signup";
    }

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public String signupPOST(User user, BindingResult result){
        if(result.hasErrors()){
            return "redirect:/signup";
        }

        user.setAdmin(false);
        user.setUsername(user.getEmail().split("@")[0]);

        User exists = (User) userService.findByUsername(user.getUsername());
        if(exists == null){
            userService.save(user);
        } else {
            return "redirect:/signup";
        }

        return "redirect:/login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginGET(User user, Model model, HttpSession session){
        // get logged in user
        User userSession = (User) session.getAttribute("loggedInUser");
        if(userSession != null) {
            model.addAttribute("loggedInUser", userSession);
        }

        model.addAttribute("user", new User());
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginPOST(User user, BindingResult result, Model model, HttpSession session){
        if(result.hasErrors()){
            System.out.println(result.getAllErrors());
            return "login";
        }
        user.setUsername(user.getEmail().split("@")[0]);
        User exists = userService.login(user);
        if(exists != null){
            session.setAttribute("loggedInUser", exists);
            return "redirect:/";
        }

        return "redirect:/login";
    }

    @RequestMapping(value = "/user/{username}", method = RequestMethod.GET)
    public String loginGET(@PathVariable("username") String username, User user, Model model, HttpSession session){
        // get logged in user
        User userSession = (User) session.getAttribute("loggedInUser");
        if(userSession != null) {
            model.addAttribute("loggedInUser", userSession);
        }

        return "profile";
    }

}
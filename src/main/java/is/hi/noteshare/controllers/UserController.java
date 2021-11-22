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
import java.util.Objects;

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

    @RequestMapping(value = "/logout", method = RequestMethod.POST)
    public String logoutPOST(User user, BindingResult result, Model model, HttpSession session){
        if(result.hasErrors()){
            return "redirect:/user/{username}";
        }
        // get logged in user
        User userSession = (User) session.getAttribute("loggedInUser");
        if(userSession != null) {
            session.removeAttribute("loggedInUser");
        }

        return "redirect:/";
    }

    @RequestMapping(value = "/user/{username}", method = RequestMethod.GET)
    public String profileGET(@PathVariable("username") String username, Model model, HttpSession session){
        // get user
        User user = userService.findByUsername(username);
        if(user != null) {
            School school = schoolService.findById(user.getSchoolId());
            model.addAttribute("user", user);
            model.addAttribute("myCourses", user.getCourses());
            model.addAttribute("school", school);

            // get logged in user
            User userSession = (User) session.getAttribute("loggedInUser");
            if (userSession != null) {
                model.addAttribute("loggedInUser", userSession);
                model.addAttribute("isOwner", Objects.equals(userSession.getEmail(), user.getEmail()));
            }
        }
        return "profile";
    }

    @RequestMapping(value = "/course/{id}/favourite", method = RequestMethod.POST)
    public String favoritePOST(@PathVariable("id") long id, HttpSession session){
        // get logged in user
        User userSession = (User) session.getAttribute("loggedInUser");

        userService.favourite(userSession.getId(), id);

        return "redirect:/course/{id}";
    }

    @RequestMapping(value = "/course/{id}/favourite/remove", method = RequestMethod.POST)
    public String favoriteRemovePOST(@PathVariable("id") long id, HttpSession session){
        // get logged in user
        User userSession = (User) session.getAttribute("loggedInUser");

        userService.removeFavourite(userSession.getId(), id);

        return "redirect:/course/{id}";
    }


}
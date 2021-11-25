package is.hi.noteshare.controllers;

import is.hi.noteshare.persistence.entities.File;
import is.hi.noteshare.persistence.entities.School;
import is.hi.noteshare.persistence.entities.User;
import is.hi.noteshare.services.FileService;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/*
    Endpoints:
    signup (GET, POST)
    login (GET, POST)
    logout (POST)
    user/:username (GET)
 */

@Controller
public class UserController {
    private final UserService userService;
    private final SchoolService schoolService;
    private final FileService fileService;

    @Autowired
    public UserController(UserService userService, SchoolService schoolService, FileService fileService) {
        this.userService = userService;
        this.schoolService = schoolService;
        this.fileService = fileService;
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

        // set user attributes
        user.setAdmin(false);
        user.setUsername(user.getEmail().split("@")[0]);

        // check if user exits
        User exists = userService.findByUsername(user.getUsername());
        if(exists != null){
            return "redirect:/signup";
        }

        // save user in db
        userService.save(user);

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
        if(user == null) { return "redirect:/"; }

        // get users school
        School school = schoolService.findById(user.getSchoolId());

        // get logged in user
        User userSession = (User) session.getAttribute("loggedInUser");
        if (userSession != null) {
            model.addAttribute("loggedInUser", userSession);
            model.addAttribute("isOwner", Objects.equals(userSession.getEmail(), user.getEmail()));
        }

        // get files
        List<File> files = fileService.findByUser(user.getId());
        Map<File, String> map = new HashMap<File, String>();
        for(File file: files) {
            User user2 = userService.findById(file.getUser());
            map.put(file, user2.getUsername());
        }

        model.addAttribute("user", user);
        model.addAttribute("myCourses", user.getCourses());
        model.addAttribute("school", school);
        model.addAttribute("files", map);

        return "profile";
    }

}
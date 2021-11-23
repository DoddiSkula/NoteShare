package is.hi.noteshare.controllers;

import is.hi.noteshare.persistence.entities.Course;
import is.hi.noteshare.persistence.entities.File;
import is.hi.noteshare.persistence.entities.FileUpload;
import is.hi.noteshare.persistence.entities.User;
import is.hi.noteshare.services.CourseService;
import is.hi.noteshare.services.FileService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;


import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

/*
    Endpoints:
    course/:id/upload (GET, POST)
 */

@Controller
public class FileController {
    private final CourseService courseService;
    private final FileService fileService;

    public FileController(CourseService courseService, FileService fileService) {
        this.courseService = courseService;
        this.fileService = fileService;
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
        model.addAttribute("file", new FileUpload());

        return "upload";
    }


    @RequestMapping(value = "/course/{id}/upload", method = RequestMethod.POST)
    public String coursePOST(@PathVariable("id") long id, FileUpload file, BindingResult result, Model model, HttpSession session) throws IOException {
        if(result.hasErrors() || file.getFileFormat().isEmpty()){
            return "redirect:/course/{id}";
        }

        User userSession = (User) session.getAttribute("loggedInUser");

        File uploadedFile = new File(new Date(System.currentTimeMillis()),
                file.getTitle(),
                file.getDescription(),
                userSession.getId(),
                id,
                file.getFileFormat().getOriginalFilename(),
                0,
                file.getFileFormat().getBytes());


        fileService.save(uploadedFile);

        return "redirect:/course/{id}";
    }

}

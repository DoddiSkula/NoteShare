package is.hi.noteshare.controllers;

import is.hi.noteshare.services.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import is.hi.noteshare.persistence.entities.School;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.validation.BindingResult;

import java.util.List;

@Controller
public class SchoolController {
    private SchoolService schoolService;

    @Autowired
    public SchoolController(SchoolService schoolService){
        this.schoolService = schoolService;
    }

    @RequestMapping("/")
    public String homePage(Model model){
        List<School> allSchools = schoolService.findAll();

        model.addAttribute("schools", allSchools);
        return "home";
    }

    @RequestMapping(value ="/addschool", method = RequestMethod.GET)
    public String addSchoolGET(School school){
        return "newSchool";
    }

    @RequestMapping(value= "/addschool", method = RequestMethod.POST)
    public String addSchoolPOST(School school, BindingResult result, Model model){
        if(result.hasErrors()){
            return "newSchool";
        }
        schoolService.save(school);
        return "redirect:/";
    }



    @RequestMapping(value="/delete/{id}", method = RequestMethod.GET)
    public String deleteSchool(@PathVariable("id") long id, Model model){
        School schoolToDelete = schoolService.findOne(id);
        schoolService.delete(schoolToDelete);
        return "redirect:/";
    }

}

package com.example.webapp.Controller;

import com.example.webapp.Model.University;
import com.example.webapp.Service.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class UniversityController {
    private final UniversityService universityService;

    @Autowired
    public UniversityController(UniversityService universityService) {
        this.universityService = universityService;
    }

    //vrací html page s univerzitami
    @GetMapping("/")
    public String getUniversity(Model model) {
        model.addAttribute("universities", universityService.getUniversity());
        return "universities";
    }
    //vrací select univerzitu podle id
    @GetMapping("/university/{id}")
    public String getuUiversityById(Model model, @PathVariable int id){
        model.addAttribute("university",universityService.getUniversityById(id));
        return "select-university";
    }

    //html form pro přidání univerzity
    @GetMapping("/signup")
    public String showSignUpForm(Model model, University u) {
        model.addAttribute("u", new University());
        return "add-university";
    }

    // post request univerzity do databáze a update universities
    @PostMapping("/")
    public String addUniversityAndUpdate(Model model, University u){
        universityService.addUniversity(u);
        model.addAttribute("universities", universityService.getUniversity());
        return "universities";

    }
}

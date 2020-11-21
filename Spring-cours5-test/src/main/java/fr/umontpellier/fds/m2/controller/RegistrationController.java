package fr.umontpellier.fds.m2.controller;

import fr.umontpellier.fds.m2.bean.Registration;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.Map;

@Controller
public class RegistrationController {

    @GetMapping("registration")
    public String getRegistration(@ModelAttribute("registration")Registration registration){
        return "registration";
    }

    @PostMapping("registration")
    public String addRegistration(@Valid @ModelAttribute("registration")Registration registration, BindingResult result){
        if (result.hasErrors()){return "registration";}
        System.out.println("Registration : "+registration.getName()+" "+registration.getFirstname()+" / email : "+registration.getEmail());
        return "redirect:registration";
    }







    ///////////////////////////////////////////////////////////////////////////////////////
    // Test de thymeleaf, rien à voir avec registration //////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////
    @GetMapping("home")
    public String getRegistration(Map<String,Object> model){
        model.put("message","yo les noobs :)");
        return "home";
    }
}

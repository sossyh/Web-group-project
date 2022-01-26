package com.Group11.Mekinaye;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/register/current")
@RequiredArgsConstructor

public class RegistrationPageController {
    private final  UserRepository repository;
    
    @GetMapping
    public String showRegistrationPage(Model model) {
    
        model.addAttribute("user",new User());
        return "Registration";
    }  
  @PostMapping
  public String registerUser( @Valid User user ,Errors errors ){
      
    if (errors.hasErrors()){
          return "Registration";
      }
      this.repository.save(user);
      return "redirect:/service/current";
  }
    
        
       
}

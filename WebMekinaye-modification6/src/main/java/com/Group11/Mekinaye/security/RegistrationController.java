package com.Group11.Mekinaye.security;

import javax.validation.Valid;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.support.SessionStatus;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/register/current")
public class RegistrationController {

   private final UserRepository userRepository;
   private final PasswordEncoder passwordEncoder;

   @GetMapping
   public String registerForm(Model model) {
       model.addAttribute("registration", new RegistrationForm());
     return "registration";
   }
   @PostMapping
   public String processRegistration( @Valid RegistrationForm form ,Errors errors) {
    if (errors.hasErrors()){
      return "registration";
  }
       userRepository.save(form.toUser(passwordEncoder));
       return "redirect:/login";
   }

}



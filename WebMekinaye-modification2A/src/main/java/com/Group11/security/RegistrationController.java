package com.Group11.security;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/Register")
public class RegistrationController {
 private final UserRepository userRepository;
 private final PasswordEncoder passwordEncoder ;

 @GetMapping
 public String registerForm() {
 return "RegistrationForm";
 }

 @PostMapping
 public String processRegistration(RegistrationForm form) {
 userRepository.save(form.toUser(passwordEncoder));
 return "redirect:/Login";
 }

}


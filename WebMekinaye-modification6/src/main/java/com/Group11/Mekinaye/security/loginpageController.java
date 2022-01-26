package com.Group11.Mekinaye.security;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/login/current")
@Controller
public class loginpageController {

@GetMapping
public String showloginpage(){
    
      
      
    return "Login";
}
    @PostMapping
    public String processloginpage( ){
        return "redirect:/order/current";
    }
}

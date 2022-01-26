package com.Group11.Mekinaye;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class HomePageController {          //I have no idea if this is correct this is just my guess.

    @GetMapping("/")
    public String home() {
        return "Home";
    }  
    @PostMapping("/")
    public String showRegistrationpage(){
        return "redirect:/register/current";
    } 
}

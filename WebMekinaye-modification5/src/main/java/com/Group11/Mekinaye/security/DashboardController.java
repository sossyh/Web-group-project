package com.Group11.Mekinaye.security;



import org.springframework.stereotype.Controller;
 import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/dashboard")
public class DashboardController {
    @GetMapping
    public String dashboard() {
        return "Dashboard";
    }  
    
}

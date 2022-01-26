package com.Group11.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
 @Bean
public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
 return http.build();
}

 public UserDetailsService userDetailsService(UserRepository userRepo) {
    return username -> {
    User user = userRepo.findByUsername(username);
    if (user != null)
    return user;
    throw new UsernameNotFoundException(
   "User '" + username + "' not found");
    };
    }
   
 PasswordEncoder bcryptPasswordEncoder() {
 return new BCryptPasswordEncoder();
 }
}






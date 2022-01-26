package com.Group11.Mekinaye.security;



//import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.security.crypto.password.PasswordEncoder;

import lombok.Data;

@Data

public class RegistrationForm {
  
  
    @NotNull
    @Size(max=10, message = "username is required " )
   private String username;

   @NotNull
   @Size(max=6, message = "weak password  " )
   private String password;
   
   @NotNull
   @Size(min=10, message = "fullname " )
   private String fullName;

   @NotNull
   @Size(min =10, message = "username is required " )
   private String phone;

   @NotNull

   @Size(max=50, message = "username is required " )
   private String street;

   @NotNull
   @Size(max=15, message = "username is required " )
   private String city;

   @NotNull
   @Size(max=15, message = "username is required " )
   private String state;
   
   @NotNull
   @Size(max=5, message = "username is required " )
   private String zip;



   User toUser(PasswordEncoder encoder) {
       User user = new User();
       user.setUsername(this.username);
       user.setPassword(encoder.encode(this.password));
       user.setFullName(this.fullName);
       user.setPhone(this.phone);
       return user;
   }
}


package com.Group11.Mekinaye.security;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.security.crypto.password.PasswordEncoder;

import lombok.Data;

@Data
public class RegistrationForm {
   private static final Admin Admin = null;
   @NotNull
   @Size(min = 5, message = "Name must be at least 5 characters long") 
   
private String username;
@NotNull
@Size(min = 5, message = "password is needed")
   private String password;
@NotNull

   private String fullName;
@NotNull
@Size(min = 10, message = "phone number is a must")
   private String phone;

   User toUser(PasswordEncoder encoder) {
       User user = new User();
       user.setUsername(this.username);
       user.setPassword(encoder.encode(this.password));
       user.setFullName(this.fullName);
       user.setPhone(this.phone);
       return user;
   }
   Admin toAdmin(PasswordEncoder encoder) {
    User user = new User();
    user.setUsername(this.username);
    user.setPassword(encoder.encode(this.password));
    user.setFullName(this.fullName);
    user.setPhone(this.phone);
    return Admin;
}
}


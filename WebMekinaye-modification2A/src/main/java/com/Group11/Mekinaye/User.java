package com.Group11.Mekinaye;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
//import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;
//import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
public class User {
     @NotNull
     
      public String Name;
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private Long  ID;
    @NotNull
     public String UserName;
    @NotNull
     private String Password;

      public String Email;
     @NotNull
     public String Phone_Number;
   private boolean isAdmin;
   @ManyToMany
   public Set<DeliveryOrder>userHistory;
public void useService(DeliveryOrder orders){
     this.userHistory.add(orders);
}
        
    }
    
    


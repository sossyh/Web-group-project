package com.Group11.Mekinaye;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE,force=true)
public class ServiceType{
    
    @Id
   public String ID;
   public  String Name;
    
@Enumerated(EnumType.STRING)
    private   Type type;
   public static enum Type {Gas,EngineFailure,Failure,OtherProblem};

}
    


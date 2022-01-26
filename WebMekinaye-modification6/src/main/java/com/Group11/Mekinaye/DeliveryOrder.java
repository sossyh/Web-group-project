package com.Group11.Mekinaye;

import java.io.Serializable;

import javax.persistence.CascadeType;

//import java.util.ArrayList;
import java.util.List;

//import javax.annotation.Generated;
//import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
//import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;
//import javax.persistence.OneToOne;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
//import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.CreditCardNumber;

//import org.hibernate.validator.constraints.pl.NIP;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@NoArgsConstructor
public class DeliveryOrder implements Serializable {
    private static final long serialVersionUID=1L;
    @NotBlank(message="please insert ur current location")
   public  String Delivery_Address;
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long Id;

    @NotBlank
    public  String City;
    @NotBlank
   public  String Road_Name;
    @NotBlank
    public String Road_Number;
     public enum Payment_Method{ Mobile_Banking, In_Cash};
@CreditCardNumber(message="please insert creditcardnumber")
    private String ccNumber;
    @Digits(integer=4,fraction=0,message="please insert cvv")
   private String ccVV;
    @OneToMany(cascade ={CascadeType.ALL} )
    private List<Services> ourService;
    
    

}

package com.Group11.Mekinaye;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

//import lombok.AllArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;
//import lombok.RequiredArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class RatingType {
@Id
private String id;
   @Enumerated(EnumType.STRING)
    private Type type;
  public static enum Type {very_good, good, bad};
    
}

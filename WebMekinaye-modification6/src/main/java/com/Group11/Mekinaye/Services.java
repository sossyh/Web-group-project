package com.Group11.Mekinaye;
//import java.util.ArrayList;
import java.util.List;
//import java.util.Set;

//import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
//import javax.persistence.OneToOne;

//import org.hibernate.annotations.ManyToAny;

import lombok.Data;
//import com.Group11.Mekinaye.ServiceType;
@Data
@Entity

public class Services {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
  private Long ID;
  @ManyToMany
  private List<ServiceType>maintainances ;
  private DeliveryOrder order;
  public void addServiceTypeToTheCart(ServiceType servicetype){
    this.maintainances.add(servicetype);
  }
}

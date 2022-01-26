package com.Group11.Mekinaye;
import com.Group11.Mekinaye.ServiceType.Type;
import java.util.HashMap;
import java.util.Map;

import org.springframework.core.convert.converter.Converter;

//import com.fasterxml.jackson.databind.util.Converter;

import org.springframework.stereotype.Component;
@Component
public class ServiceTypeByIdConverter implements Converter<String,ServiceType> {
  private Map<String,ServiceType>  MapA=new HashMap<>(); 
  public void  ServiceTypeByIdConverter(){
      MapA.put("TIRE",new ServiceType ("TIRE","flat_tire",Type.Failure));
      MapA.put("TIRE",new ServiceType ("TIRE","flat_tire",Type.Failure));
      MapA.put("TIRE",new ServiceType ("TIRE","flat_tire",Type.Failure));
      MapA.put("TIRE",new ServiceType ("TIRE","flat_tire",Type.Failure));
      MapA.put("TIRE",new ServiceType ("TIRE","flat_tire",Type.Failure));
      MapA.put("TIRE",new ServiceType ("TIRE","flat_tire",Type.Failure));
      MapA.put("TIRE",new ServiceType ("TIRE","flat_tire",Type.Failure));
      MapA.put("TIRE",new ServiceType ("TIRE","flat_tire",Type.Failure));}
      @Override
      public ServiceType convert(String ID){
          return MapA.get(ID);
      }

  }


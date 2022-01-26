package com.Group11.Mekinaye;
import com.Group11.Mekinaye.ServiceType.Type;
import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
@Slf4j
@Controller
@RequestMapping("/service/current")
@SessionAttributes("maintaitainanceorder")
@RequiredArgsConstructor
public class ServiceTypeController {
    private final ServiceTypeRepository repository;


    @GetMapping
    public String serviceType(Model model) {
model.addAttribute("serviceType",new Services());
Type[] types=Type.values();
List<ServiceType>maintainances=new ArrayList<>();
this.repository.findAll().forEach(s->maintainances.add(s));
for (Type type: types){
    model.addAttribute(type.toString().toLowerCase(), filterByType(maintainances,type));}

        return "ServiceType";
    } 

    private Iterable<ServiceType>filterByType(
        List<ServiceType>maintainances,Type type)
    {
        return maintainances
        .stream()
        .filter(x->x.getType().equals(type))
        .collect(Collectors.toList());
    }
    @PostMapping
    public String displayOrder(@Valid Services service,Errors errors){
        if(errors.hasErrors()){
            return "ServiceType";
        }
        log.info("processing the service"+service);
        return "redirect:/rating/current";

    }
    
}


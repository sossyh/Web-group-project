package com.Group11.Mekinaye;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.support.SessionStatus;

import lombok.RequiredArgsConstructor;

//import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/order/current")
@RequiredArgsConstructor
public class DeliveryOrderController {
    private final DeliveryOrderRepository repository;

    @GetMapping
    public String order(Model model) {
        model.addAttribute("deliveryOrder", new DeliveryOrder());
        return "Order";
    } 
@PostMapping
public String showRating(@Valid DeliveryOrder order,Errors errors,SessionStatus S){
    if (errors.hasErrors()){
        return "Order";
    }
    this.repository.save(order);
    
    return "redirect:/service/current";
}
}

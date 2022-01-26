package com.Group11.Mekinaye;
//import java.util.Arrays;
//mport java.util.List;
//mport java.util.stream.Collectors;
//import java.util.stream.Stream;

//import com.Group11.Mekinaye.RatingType.Type;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;
//import org.springframework.web.bind.support.SessionStatus;
@Controller
@RequestMapping("/rating/current")
@RequiredArgsConstructor
public class RatingController {
    private final RatingRepository repository;
  

    @GetMapping
    public String rating(Model model ) {
        Rating ratingA=new Rating() ;
        model.addAttribute("rating",ratingA);
        return "Rating";
    }  
    
 
    
    @PostMapping
   public String returnToHomePage(Rating rating)
{
    this.repository.save(rating);
    return "redirect:/rating/current";
}}


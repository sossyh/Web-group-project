package com.Group11.Mekinaye;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//import java.util.stream.Stream;

import com.Group11.Mekinaye.RatingType.Type;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;
//import org.springframework.web.bind.support.SessionStatus;
@Controller
@RequestMapping("/rating/current/")
@RequiredArgsConstructor
public class RatingController {
    private final RatingRepository repository;
    @ModelAttribute
    public void RatingMapper(Model model){
        List<RatingType>ratings=Arrays.asList(
            new RatingType("vego",Type.very_good),
            new RatingType("good",Type.good),
            new RatingType("rBAD",Type.bad));
            Type[] u =RatingType.Type.values();
            for (Type type: u){
                model.addAttribute(type.toString().toLowerCase(), filterByType(ratings,type));}      
   
    }

    @GetMapping
    public String rating(Model model ) {
        Rating ratingA=new Rating() ;
        model.addAttribute("rating",ratingA);
        return "Rating";
    }  
    private Iterable<RatingType>filterByType(
        List<RatingType>rating,Type type)
    {
        
        return rating
        .stream()
        .filter(x->x.getType().equals(type))
        .collect(Collectors.toList());
    }
 
    
    @PostMapping
   public String returnToHomePage(Rating rating)
{
    this.repository.save(rating);
    return "redirect:/";
}}


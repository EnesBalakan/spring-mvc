package com.springboot.mvc.validationdemo.controller;

import com.springboot.mvc.validationdemo.model.Car;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CarController {
    @Value("${colour}")
    private List<String> colour;

    @GetMapping("/showForm")
    public String showForm(Model theModel){
        theModel.addAttribute("car", new Car());
        return "car-form";
    }

    //Tell Spring MVC to perform validation
    @PostMapping("/processForm")
    public String processForm(
            @Valid @ModelAttribute("car") Car theCar,
            BindingResult theBindingResult){
    if (theBindingResult.hasErrors()){
        return "car-form";
    }
    else{
        return "car-results";
    }
    }
}

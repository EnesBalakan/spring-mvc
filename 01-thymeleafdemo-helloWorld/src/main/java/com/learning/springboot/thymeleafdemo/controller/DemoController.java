package com.learning.springboot.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
    //create mapping for helloWorld
    @GetMapping("/hello")
    public String sayHello(Model theModel){
        
    }

}

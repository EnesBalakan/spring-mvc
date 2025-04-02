package com.learning.springboot.thymeleafdemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

    //new a controller method to show initial HTML form
    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }
    //need a controller method to  process the HTML form
    @GetMapping("/processForm")
    public String processForm(){
        return "helloWorld";
    }

    // need a controller method to  read form data and
    // add data to the model

    @PostMapping("/processFormTwo")
    public String letsBuyCar(HttpServletRequest request, Model model){

        // read the request parameter from the HTML form
        String theName = request.getParameter("studentName");

        // convert the data to all caps (tüm harfleri büyük harfe çevir)
        theName = theName.toUpperCase();

        // create the message
        String result = "Yo! " + theName;

        // add message to the model
        model.addAttribute("message",result);

        return "helloWorld";
    }

    @PostMapping("/processFormThree")
    public String processFormThree(@RequestParam("studentName") String theName, Model model){


        // convert the data to all caps (tüm harfleri büyük harfe çevir)
        theName = theName.toUpperCase();

        // create the message
        String result = "Hey my Friend from v3!  " + theName;

        // add message to the model
        model.addAttribute("message2",result);

        return "helloWorld";
    }
}

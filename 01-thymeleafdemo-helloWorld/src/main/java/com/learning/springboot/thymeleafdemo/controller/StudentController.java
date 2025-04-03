package com.learning.springboot.thymeleafdemo.controller;

import com.learning.springboot.thymeleafdemo.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.List;

@Controller
public class StudentController {
    @Value("${languages}")
    private List<String> languages;

    // formumuzu gösteren parametre
    // Eklediğimiz Model uyarı verecek, ui olarak import et!
    @GetMapping("/showStudentForm")
    public String showForm(Model theModel){

        // student objesini oluştur
        Student theStudent = new Student();

        // student objesini modele ekle
        theModel.addAttribute("student", theStudent);

        // add the list of languages to the model
        theModel.addAttribute("languages", languages);

        return "student-form";
    }

    @PostMapping("/processStudentForm")
    public String processForm(@ModelAttribute("student") Student theStudent){

        // log the input data
        System.out.println("the student: " + theStudent.getFirstName() + " " + theStudent.getLastName());
        return "student-confirmation";
    }


}

package com.luv2code.springboot.thymeeafdemo.controller;

import com.luv2code.springboot.thymeeafdemo.entity.Employee;
import com.luv2code.springboot.thymeeafdemo.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
    private EmployeeService employeeService;

    public EmployeeController(EmployeeService theEmployeeService){
        employeeService = theEmployeeService;
    }

    // add mapping for "/list"
    @GetMapping("/list")
    public String list(Model theModel){
        // get the employees from db
        List<Employee> theEmployees = employeeService.findAll();
        // add to the spring model
        theModel.addAttribute("employees", theEmployees);

        return "employees/list-employees";
    }

    // Ekleme arayüzü...
    @GetMapping("/showFormForAdd")
    public String showFormAdd(Model theModel){

        // create model attribute to bind form data
        Employee theEmployee = new Employee();

        theModel.addAttribute("employee" , theEmployee);

        return "employees/employee-form";
    }

    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute("employee") Employee theEmployee){

        // save the employee
        employeeService.save(theEmployee);

        // use a redirect to prevent duplicate submiss
        return "redirect:/employees/list";
    }
}

package com.luv2code.springboot.thymeeafdemo.service;

import com.luv2code.springboot.thymeeafdemo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);

}

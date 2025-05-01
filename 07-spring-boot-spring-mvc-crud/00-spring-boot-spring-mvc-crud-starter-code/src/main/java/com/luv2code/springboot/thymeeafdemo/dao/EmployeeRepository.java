package com.luv2code.springboot.thymeeafdemo.dao;

import com.luv2code.springboot.thymeeafdemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // bu kadar... başka bişey yazmamıza gerek yok!

}

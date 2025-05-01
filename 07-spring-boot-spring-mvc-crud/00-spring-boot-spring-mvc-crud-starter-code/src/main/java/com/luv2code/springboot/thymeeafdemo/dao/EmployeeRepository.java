package com.luv2code.springboot.thymeeafdemo.dao;

import com.luv2code.springboot.thymeeafdemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // bu kadar... başka bişey yazmamıza gerek yok!

    // soyisme göre sıralayan metod ekliyoruz
    public List<Employee> findAllByOrderByLastNameAsc();


}

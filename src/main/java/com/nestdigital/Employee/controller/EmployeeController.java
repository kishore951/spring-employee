package com.nestdigital.Employee.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/")
    public String Homepage(){
        return "Welcome to my Homepage";

    }

    @GetMapping("/add")
    public String EmployeeAdd(){
        return "Add Employee";
    }

    @GetMapping("/search")
    public String EmployeeSearch(){

        return "Search Employee";
    }

    @GetMapping("/delete")
    public String Delete(){

        return "Delete Employee";
    }
}

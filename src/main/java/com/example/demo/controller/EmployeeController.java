package com.example.demo.controller;

import com.example.demo.Models.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {

    @RequestMapping("/emp")
    public String getEmployees()
    {
       
        return "api test";
    }
}

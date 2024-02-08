/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mihome.controller;

import com.mihome.entity.Employee;
import com.mihome.service.EmployeeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author alekseynesterov
 */
@Controller
public class MyController {
    
    @Autowired
    private EmployeeService employeeService;
    
    @RequestMapping("/")
    public String showAllEmployees(Model model){
        List<Employee> list = employeeService.getAllEmployees();
        model.addAttribute("allEmps", list);
        return "all-employees";
    }
    
    @RequestMapping("addNewEmployee")
    public String addNewEmployee(Model model){
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "employee-info";
    }
    
    @RequestMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Employee employee){
        employeeService.saveEmployee(employee);
        return "redirect:/";
    }
    
}

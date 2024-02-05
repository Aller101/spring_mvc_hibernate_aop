/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mihome.controller;

import com.mihome.dao.EmployeeDAO;
import com.mihome.entity.Employee;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author alekseynesterov
 */
@Controller
public class MyController {
    
    @Autowired
    private EmployeeDAO employeeDAO;
    
    @RequestMapping("/")
    public String showAllEmployees(Model model){
        List<Employee> list = employeeDAO.getAllEmployees();
        model.addAttribute("allEmps", list);
        return "all-employees";
    }
    
}

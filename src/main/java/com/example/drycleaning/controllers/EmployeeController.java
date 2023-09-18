package com.example.drycleaning.controllers;


import com.example.drycleaning.dtos.*;
import com.example.drycleaning.models.Employee;
import com.example.drycleaning.services.EmployeeService;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/allemployee")
    List<EmployeeDto> getAllEmplloyee(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    EmployeeHumanDto getEmployeeById(@PathVariable Integer id){
        return employeeService.getEmployeeById(id);
    }
    @PostMapping("/addemployee")
    EmployeeDto addEmployee(@RequestBody EmployeeHumanDto employeeHumanDto){
        return employeeService.addNewEmployee(employeeHumanDto);

    }
    @DeleteMapping("/delete/{id}")
    String deleteEmployee(@PathVariable Integer id){
        employeeService.deleteEmployee(id);
        return "Employee with id = " + id + " was deleted";
    }
    @PutMapping("/updatepost/{id}/{post}")
    EmployeeHumanDto updatePost(@PathVariable Integer id, @PathVariable String post){
        return employeeService.updatePost(id, post);
    }
    @PutMapping("/updatesalary/{id}/{salary}")
    EmployeeHumanDto updateSalary(@PathVariable Integer id, @PathVariable BigDecimal salary){
        return employeeService.updateSalary(id, salary);
    }

    @GetMapping("/findEmployeeByOrder/{id}")
    EmployeeOutDto findEmployeeByOrder(@PathVariable Integer id){
        return employeeService.findEmployeeByOrder(id);
    }


}
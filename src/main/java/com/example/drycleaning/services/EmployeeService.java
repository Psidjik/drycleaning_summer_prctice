package com.example.drycleaning.services;


import com.example.drycleaning.dtos.EmployeeDto;
import com.example.drycleaning.dtos.EmployeeHumanDto;

import java.math.BigDecimal;
import java.util.List;

public interface EmployeeService<ID> {
    List<EmployeeDto> getAllEmployees();
    EmployeeHumanDto addNewEmployee(EmployeeHumanDto employeeHumanDto);
    void deleteEmployee(ID employeeId);
    EmployeeHumanDto getEmployeeById(ID employeeId);
    EmployeeHumanDto updatePost(ID employeeId, String post);
    EmployeeHumanDto updateSalary(ID employeeId, BigDecimal salary);

}


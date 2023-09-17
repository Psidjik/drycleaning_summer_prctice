package com.example.drycleaning.services;


import com.example.drycleaning.dtos.EmployeeDto;
import com.example.drycleaning.dtos.EmployeeHumanDto;
import com.example.drycleaning.dtos.HumanDto;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

public interface EmployeeService<ID> {
    List<EmployeeDto> getAllEmployees();
    EmployeeDto addNewEmployee(EmployeeHumanDto employeeHumanDto);
    void deleteEmployee(ID employeeId);
    EmployeeHumanDto getEmployeeById(ID employeeId);

    Integer getEmployeeByIdForOrder(HumanDto humanDto);
    EmployeeHumanDto updatePost(ID employeeId, String post);
    EmployeeHumanDto updateSalary(ID employeeId, BigDecimal salary);

//    List<EmployeeDto> findOrderCountByEmployeeId();

}


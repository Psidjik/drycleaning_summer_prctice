package com.example.drycleaning.services.impl;

import com.example.drycleaning.dtos.EmployeeDto;
import com.example.drycleaning.dtos.EmployeeHumanDto;
import com.example.drycleaning.dtos.HumanDto;
import com.example.drycleaning.dtos.OrderDto;
import com.example.drycleaning.models.Employee;
import com.example.drycleaning.repositories.EmployeeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.drycleaning.services.EmployeeService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService<Integer> {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private ModelMapper modelMapper;
    @Override
    public List<EmployeeDto> getAllEmployees() {
        return employeeRepository.findAll().stream().map(employee -> modelMapper.map(employee, EmployeeDto.class)).collect(Collectors.toList());
    }//стрим создаёт поток данных

    @Override
    public EmployeeDto addNewEmployee(EmployeeHumanDto employeeHumanDto) {
        return modelMapper.map(employeeRepository.save(modelMapper.map(employeeHumanDto, Employee.class)), EmployeeDto.class);
    }

    @Override
    public void deleteEmployee(Integer employeeId) {
        employeeRepository.deleteById(employeeId);
    }

    @Override
    public EmployeeHumanDto getEmployeeById(Integer employeeId) {
        return modelMapper.map(employeeRepository.findById(employeeId).orElseThrow(), EmployeeHumanDto.class);
    }

    @Override
    public Integer getEmployeeByIdForOrder(HumanDto humanDto) {
//        getEmployeeById(humanDto.getId());
        return getEmployeeById(humanDto.getId()).getId();
    }


    @Override
    public EmployeeHumanDto updatePost(Integer employeeId, String post) {
        Employee employee = employeeRepository.findById(employeeId).orElseThrow();
        employee.setPost(post);
        employeeRepository.save(employee);
        return modelMapper.map(employee, EmployeeHumanDto.class);
    }

    @Override
    public EmployeeHumanDto updateSalary(Integer employeeId, BigDecimal salary) {
        Employee employee = employeeRepository.findById(employeeId).orElseThrow();
        employee.setSalary(salary);
        employeeRepository.save(employee);
        return modelMapper.map(employee, EmployeeHumanDto.class);
    }

//    @Override
//    public List<EmployeeDto> findOrderCountByEmployeeId() {
////        return employeeRepository.findOrderCountByEmployeeId().stream().map(employee -> modelMapper.map(employee, Object[].class)).collect(Collectors.toList());
//        List<Object[]> results = employeeRepository.findOrderCountByEmployeeId();
//        List<EmployeeDto> employeeDtos = new ArrayList<>();
//
//        for (Object[] result : results) {
//            EmployeeDto employeeDto = new EmployeeDto();
//            employeeDto.setId((Long) result[0]);
//            employeeDto((Date) result[1]);
//            employeeDto.setOrderCount((Long) result[2]);
//            employeeDtos.add(employeeDto);
//        }
//
//        return employeeDtos;
//    }



}

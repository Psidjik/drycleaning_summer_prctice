package com.example.drycleaning;

import com.example.drycleaning.dtos.ClientDto;
import com.example.drycleaning.dtos.EmployeeDto;
import com.example.drycleaning.dtos.OrderOutPutDto;
import com.example.drycleaning.models.Client;
import com.example.drycleaning.models.Employee;
import com.example.drycleaning.models.Order;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.modelmapper.config.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DrycleaningApplication {

    @Bean
//    Spring container
    public ModelMapper modelMapper(){
        ModelMapper modelMapper = new ModelMapper();

        modelMapper.getConfiguration()
                .setFieldMatchingEnabled(true)
                .setFieldAccessLevel(Configuration.AccessLevel.PRIVATE);

        TypeMap<Employee, EmployeeDto> typeMapEmployee = modelMapper.createTypeMap(Employee.class,EmployeeDto.class);
        typeMapEmployee.addMappings(m->m.map(src -> src.getHuman().getFirstName(),EmployeeDto::setFirstName));
        typeMapEmployee.addMappings(m->m.map(src -> src.getHuman().getLastName(),EmployeeDto::setLastName));
//        typeMapEmployee.addMappings(m->m.map(src -> src.getHuman().getPhoneNumber(),EmployeeDto::setPhoneNumber));

//        typeMapEmployee.addMappings(m->m.map(src -> src.getHuman().getLastName(),EmployeeDto::setLastName));
//
        TypeMap<Client, ClientDto> typeMapClient = modelMapper.createTypeMap(Client.class,ClientDto.class);
        typeMapClient.addMappings(m->m.map(src -> src.getHuman().getFirstName(),ClientDto::setFirstName));
        typeMapClient.addMappings(m->m.map(src -> src.getHuman().getLastName(),ClientDto::setLastName));
        typeMapClient.addMappings(m->m.map(src -> src.getHuman().getPhoneNumber(),ClientDto::setPhoneNumber));
//        typeMapClient.addMappings(m->m.map(src -> src.getHuman().getLastName(),ClientDto::setLastName));

        TypeMap<Order, OrderOutPutDto> typeMapVisitOut = modelMapper.createTypeMap(Order.class, OrderOutPutDto.class);
        typeMapVisitOut.addMappings(m->m.map(src -> src.getEmployee().getHuman().getFirstName(),OrderOutPutDto::setFirstNameEmployee));
        typeMapVisitOut.addMappings(m->m.map(src -> src.getEmployee().getHuman().getLastName(),OrderOutPutDto::setLastNameEmployee));
        typeMapVisitOut.addMappings(m->m.map(src -> src.getClient().getHuman().getFirstName(),OrderOutPutDto::setFirstNameClient));
        typeMapVisitOut.addMappings(m->m.map(src -> src.getClient().getHuman().getLastName(),OrderOutPutDto::setLastNameClient));

        return modelMapper;
    }
    public static void main(String[] args) {
        SpringApplication.run(DrycleaningApplication.class, args);
    }

}

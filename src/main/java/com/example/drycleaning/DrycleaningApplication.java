package com.example.drycleaning;

import com.example.drycleaning.dtos.*;
import com.example.drycleaning.models.Client;
import com.example.drycleaning.models.Employee;
import com.example.drycleaning.models.Human;
import com.example.drycleaning.models.Order;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.modelmapper.config.Configuration;
import org.modelmapper.convention.MatchingStrategies;
import org.modelmapper.spi.MatchingStrategy;
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

        TypeMap<Human, HumanDto> typeMapHuman = modelMapper.createTypeMap(Human.class,HumanDto.class);
//        typeMapHuman.addMappings(m->m.map(src -> src.getFirstName(),HumanDto::setFirstName));
//        typeMapHuman.addMappings(m->m.map(src -> src.getLastName(),HumanDto::setLastName));
//        typeMapHuman.addMappings(m->m.map(src -> src.getPhoneNumber(),HumanDto::setPhoneNumber));



        TypeMap<Employee, EmployeeHumanDto> typeMapEmployeeHuman = modelMapper.createTypeMap(Employee.class,EmployeeHumanDto.class);
        typeMapEmployeeHuman.addMappings(m->m.map(src -> src.getHuman().getEmployee().getHuman(),EmployeeHumanDto::setHumanDto));

        TypeMap<Client, ClientHumanDto> typeMapClientHuman = modelMapper.createTypeMap(Client.class,ClientHumanDto.class);
        typeMapClientHuman.addMappings(m->m.map(src -> src.getHuman().getClient().getHuman(),ClientHumanDto::setHumanDto));




//        typeMapHuman.;
//        typeMapEmployeeHuman.addMappings(m->m.map(src -> src.getHuman().getFirstName(),EmployeeHumanDto::setFirstName));
//        typeMapEmployeeHuman.addMappings(m->m.map(src -> src.getHuman().getFirstName(),EmployeeHumanDto::se));
//        typeMapEmployeeHuman.addMappings(m->m.map(src -> src.getHuman().getEmployee(),EmployeeHumanDto::setHumanDto));

//        typeMapEmployeeHuman.addMappings(m->m.map(src -> src.getHuman().getLastName(),EmployeeHumanDto::));



//        typeMapHuman.addMappings(m->m.map(src -> src.getEmployee(),HumanDto::se));
//        typeMapHuman.addMappings(m->m.map(src -> src.getPhoneNumber(),HumanDto::setPhoneNumber));
//        typeMapHuman.addMappings(m->m.map(src -> src.getHuman().getLastName(),EmployeeDto::setLastName));

//        typeMapEmployee.addMappings(m->m.map(src -> src.getHuman().getLastName(),EmployeeDto::setLastName));
//
        TypeMap<Client, ClientDto> typeMapClient = modelMapper.createTypeMap(Client.class, ClientDto.class);
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

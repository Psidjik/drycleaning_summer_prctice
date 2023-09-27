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

import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;
import java.lang.reflect.Type;
import java.util.Objects;

@SpringBootApplication
public class DrycleaningApplication {

    @Bean
    public ModelMapper modelMapper(){
        ModelMapper modelMapper = new ModelMapper();

        modelMapper.getConfiguration()
                .setFieldMatchingEnabled(true)
                .setFieldAccessLevel(Configuration.AccessLevel.PRIVATE);

        TypeMap<Employee, EmployeeOutDto> typeMapEmployeeOrder = modelMapper.createTypeMap(Employee.class,EmployeeOutDto.class);
        typeMapEmployeeOrder.addMappings((m->m.map(src -> src.getHuman().getFirstName(),EmployeeOutDto::setFirstName)));
        typeMapEmployeeOrder.addMappings((m->m.map(src -> src.getHuman().getLastName(), EmployeeOutDto::setLastName)));
        typeMapEmployeeOrder.addMappings(m -> m.map(src -> src.getOrderCount(), EmployeeOutDto::setOrderCount));
        typeMapEmployeeOrder.addMappings(m -> m.map(src -> src.getTotalCost(), EmployeeOutDto::setTotalCost));

        TypeMap<Employee, EmployeeDto> typeMapEmployee = modelMapper.createTypeMap(Employee.class,EmployeeDto.class);
        typeMapEmployee.addMappings(m->m.map(src -> src.getHuman().getId(),EmployeeDto::setId));
        typeMapEmployee.addMappings(m->m.map(src -> src.getId(),EmployeeDto::setId));
        typeMapEmployee.addMappings(m->m.map(src -> src.getSalary(),EmployeeDto::setSalary));
        typeMapEmployee.addMappings(m->m.map(src -> src.getHuman().getFirstName(),EmployeeDto::setFirstName));
        typeMapEmployee.addMappings(m->m.map(src -> src.getHuman().getLastName(),EmployeeDto::setLastName));

        TypeMap<EmployeeDto, Employee> typeMapEmployeeDTO = modelMapper.createTypeMap(EmployeeDto.class,Employee.class);
        typeMapEmployeeDTO.addMappings(m->m.map(src -> src.getId(),Employee::setId));

        //чтобы была ссылка на объект human
        TypeMap<Employee, EmployeeHumanDto> typeMapEmployeeHuman = modelMapper.createTypeMap(Employee.class,EmployeeHumanDto.class);
        typeMapEmployeeHuman.addMappings(m->m.map(src -> src.getHuman().getEmployee().getHuman(),EmployeeHumanDto::setHumanDto));
        //
        TypeMap<Client, ClientDto> typeMapClient = modelMapper.createTypeMap(Client.class, ClientDto.class);
        typeMapClient.addMappings(m->m.map(src-> src.getHuman().getClient().getE_mail(), ClientDto::setE_mail));
        typeMapClient.addMappings(m->m.map(src -> src.getHuman().getFirstName(),ClientDto::setFirstName));
        typeMapClient.addMappings(m->m.map(src -> src.getHuman().getLastName(),ClientDto::setLastName));
        typeMapClient.addMappings(m->m.map(src -> src.getHuman().getPhoneNumber(),ClientDto::setPhoneNumber));

        TypeMap<ClientDto, ClientHumanDto> typeMapClientHumanDto = modelMapper.createTypeMap(ClientDto.class, ClientHumanDto.class);
        typeMapClientHumanDto.addMappings(m->m.map(src-> src.getE_mail(), ClientHumanDto::setE_mail));
        //чтобы была ссылка на объект human
        TypeMap<Client, ClientHumanDto> typeMapClientHuman = modelMapper.createTypeMap(Client.class,ClientHumanDto.class);
        typeMapClientHuman.addMappings(m->m.map(src -> src.getHuman().getClient().getHuman(),ClientHumanDto::setHumanDto));
        typeMapClientHuman.addMappings(m->m.map(src -> src.getHuman().getClient().getE_mail(),ClientHumanDto::setE_mail));


        //для вывода, чтобы не было humanDto=null
        TypeMap<HumanDto, Human> typeMapHuman = modelMapper.createTypeMap(HumanDto.class,Human.class);
        typeMapHuman.addMappings(m->m.map(src -> src.getId(), Human::setId));
        typeMapHuman.addMappings(m->m.map(src -> src.getFirstName(), Human::setFirstName));
        typeMapHuman.addMappings(m->m.map(src -> src.getLastName(), Human::setLastName));
        typeMapHuman.addMappings(m->m.map(src -> src.getPhoneNumber(), Human::setPhoneNumber));


        TypeMap<Human, HumanDto> typeMapHumanDTO = modelMapper.createTypeMap(Human.class,HumanDto.class);
        typeMapHumanDTO.addMappings(m->m.map(src -> src.getId(), HumanDto::setId));
        typeMapHumanDTO.addMappings(m->m.map(src -> src.getFirstName(), HumanDto::setFirstName));
        typeMapHumanDTO.addMappings(m->m.map(src -> src.getLastName(), HumanDto::setLastName));
        typeMapHumanDTO.addMappings(m->m.map(src -> src.getPhoneNumber(), HumanDto::setPhoneNumber));


        TypeMap<Order, OrderOutPutDto> typeMapVisitOut = modelMapper.createTypeMap(Order.class, OrderOutPutDto.class);
        typeMapVisitOut.addMappings(m->m.map(src -> src.getId(),OrderOutPutDto::setId));
        typeMapVisitOut.addMappings(m->m.map(src -> src.getItemName(),OrderOutPutDto::setItemName));
        typeMapVisitOut.addMappings(m->m.map(src -> src.getDateOfVisit(),OrderOutPutDto::setDateOfVisit));
        typeMapVisitOut.addMappings(m->m.map(src -> src.getCost(),OrderOutPutDto::setCost));
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

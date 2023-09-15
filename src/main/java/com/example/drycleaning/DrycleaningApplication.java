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

        //
        TypeMap<Employee, EmployeeDto> typeMapEmployee = modelMapper.createTypeMap(Employee.class,EmployeeDto.class);
        typeMapEmployee.addMappings(m->m.map(src -> src.getHuman().getFirstName(),EmployeeDto::setFirstName));
        typeMapEmployee.addMappings(m->m.map(src -> src.getHuman().getLastName(),EmployeeDto::setLastName));

        //чтобы была ссылка на объект human
        TypeMap<Employee, EmployeeHumanDto> typeMapEmployeeHuman = modelMapper.createTypeMap(Employee.class,EmployeeHumanDto.class);
        typeMapEmployeeHuman.addMappings(m->m.map(src -> src.getHuman().getEmployee().getHuman(),EmployeeHumanDto::setHumanDto));
        //
        TypeMap<Client, ClientDto> typeMapClient = modelMapper.createTypeMap(Client.class, ClientDto.class);
        typeMapClient.addMappings(m->m.map(src -> src.getHuman().getFirstName(),ClientDto::setFirstName));
        typeMapClient.addMappings(m->m.map(src -> src.getHuman().getLastName(),ClientDto::setLastName));
        typeMapClient.addMappings(m->m.map(src -> src.getHuman().getPhoneNumber(),ClientDto::setPhoneNumber));
        //чтобы была ссылка на объект human
        TypeMap<Client, ClientHumanDto> typeMapClientHuman = modelMapper.createTypeMap(Client.class,ClientHumanDto.class);
        typeMapClientHuman.addMappings(m->m.map(src -> src.getHuman().getClient().getHuman(),ClientHumanDto::setHumanDto));

        //для вывода, чтобы не было humanDto=null
        TypeMap<HumanDto, Human> typeMapHuman = modelMapper.createTypeMap(HumanDto.class,Human.class);
        typeMapHuman.addMappings(m->m.map(src -> src.getFirstName(), Human::setFirstName));
        typeMapHuman.addMappings(m->m.map(src -> src.getLastName(), Human::setLastName));
        typeMapHuman.addMappings(m->m.map(src -> src.getPhoneNumber(), Human::setPhoneNumber));


        TypeMap<Order, OrderOutPutDto> typeMapVisitOut = modelMapper.createTypeMap(Order.class, OrderOutPutDto.class);
        typeMapVisitOut.addMappings(m->m.map(src -> src.getEmployee().getHuman().getFirstName(),OrderOutPutDto::setFirstNameEmployee));
        typeMapVisitOut.addMappings(m->m.map(src -> src.getEmployee().getHuman().getLastName(),OrderOutPutDto::setLastNameEmployee));
        typeMapVisitOut.addMappings(m->m.map(src -> src.getClient().getHuman().getFirstName(),OrderOutPutDto::setFirstNameClient));
        typeMapVisitOut.addMappings(m->m.map(src -> src.getClient().getHuman().getLastName(),OrderOutPutDto::setLastNameClient));










//        TypeMap<EmployeeHumanDto, HumanDto> typeMapEmployeeHumanDto = modelMapper.createTypeMap(EmployeeHumanDto.class,HumanDto.class);
//        typeMapEmployeeHumanDto.addMappings(m->m.map(src -> src.getHumanDto().getFirstName(), HumanDto::setFirstName));
//        typeMapEmployeeHumanDto.addMappings(m->m.map(src -> src.getHumanDto().getLastName(), HumanDto::setLastName));
//        typeMapEmployeeHumanDto.addMappings(m->m.map(src -> src.getHumanDto().getPhoneNumber(), HumanDto::setPhoneNumber));


//        TypeMap<Employee, HumanDto> dtoTypeMap = modelMapper.createTypeMap(Employee.class, HumanDto.class);
//        dtoTypeMap.addMappings(m->m.map(src -> src.getHuman().getEmployee().getHuman(), HumanDto::setFirstName));
////        dtoTypeMap.addMappings(m->m.map(src -> src.getHumanDto().getLastName(), HumanDto::setLastName));
////        dtoTypeMap.addMappings(m->m.map(src -> src.getHumanDto().getPhoneNumber(), HumanDto::setPhoneNumber));
//









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

//        typeMapClient.addMappings(m->m.map(src -> src.getHuman().getLastName(),ClientDto::setLastName));



        return modelMapper;
    }
    public static void main(String[] args) {
        SpringApplication.run(DrycleaningApplication.class, args);
    }

}

package com.example.drycleaning.init;


import com.example.drycleaning.dtos.ClientHumanDto;
import com.example.drycleaning.dtos.EmployeeHumanDto;
import com.example.drycleaning.dtos.HumanDto;
import com.example.drycleaning.dtos.OrderDto;
import com.example.drycleaning.services.ClientService;
import com.example.drycleaning.services.EmployeeService;
import com.example.drycleaning.services.HumanService;
import com.example.drycleaning.services.OrderService;
import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Date;

@Component
public class CommandLineRunnerImpl implements CommandLineRunner {

        private HumanService humanService;
        private EmployeeService employeeService;
        private ClientService clientService;
        private OrderService orderService;
        private ModelMapper modelMapper;

    public CommandLineRunnerImpl(HumanService humanService, EmployeeService employeeService, ClientService clientService, OrderService orderService, ModelMapper modelMapper) {
        this.humanService = humanService;
        this.employeeService = employeeService;
        this.clientService = clientService;
        this.orderService = orderService;
        this.modelMapper = modelMapper;
    }

    @Override
        public void run(String... args) throws  Exception{
            seedData();
        }
        private void seedData() throws IOException{
            HumanDto employeeHuman1 = new HumanDto(0, "Burenka", "Buren", "89636539365");
            HumanDto employeeHuman2 = new HumanDto(0, "Masha", "Sokolova", "87415236396");
            HumanDto employeeHuman3 = new HumanDto(0, "Misha", "Podzol", "89874563212");
            HumanDto employeeHuman4 = new HumanDto(0, "Denis", "Gribnik", "87894562321");

            HumanDto clientHuman1 = new HumanDto(0, "Goga", "Nikitin", "89636593993");
            HumanDto clientHuman2 = new HumanDto(0, "Den", "Buckin", "85236529654");
            HumanDto clientHuman3 = new HumanDto(0, "George", "Evklid", "85452145263");
            HumanDto clientHuman4 = new HumanDto(0, "Miha", "Mihail", "87452132563");
            HumanDto clientHuman5 = new HumanDto(0, "Oleg", "Olegovich", "89652147845");
            HumanDto clientHuman6 = new HumanDto(0, "Ilya", "Ivanov", "87459635874");
            HumanDto clientHuman7 = new HumanDto(0, "Ivan", "Petrov", "87945612321");
            HumanDto clientHuman8 = new HumanDto(0, "Petr", "Ivanov", "87942581436");
            HumanDto clientHuman9 = new HumanDto(0, "Kirill", "Nik", "89635471245");
            HumanDto clientHuman10 = new HumanDto(0, "Lyuda", "Vos", "87451478951");
            employeeService.addNewEmployee(new EmployeeHumanDto(0, new BigDecimal(70000), "Cleaner","11", employeeHuman1));
            employeeService.addNewEmployee(new EmployeeHumanDto(0, new BigDecimal(47500), "Cleaner","22",employeeHuman2));
            employeeService.addNewEmployee(new EmployeeHumanDto(0, new BigDecimal(57500), "Cleaner","33",employeeHuman3));
            employeeService.addNewEmployee(new EmployeeHumanDto(0, new BigDecimal(87500), "Admin","44",employeeHuman4));
            clientService.addNewClient(new ClientHumanDto(0,  "goga@mail.ru", clientHuman1));
            clientService.addNewClient(new ClientHumanDto(0,"den@mail.ru", clientHuman2 ));
            clientService.addNewClient(new ClientHumanDto(0,"goerge@mail.ru", clientHuman3 ));
            clientService.addNewClient(new ClientHumanDto(0,"miha@mail.ru", clientHuman4 ));
            clientService.addNewClient(new ClientHumanDto(0,"oleg@mail.ru", clientHuman5 ));
            clientService.addNewClient(new ClientHumanDto(0,"ivan@mail.ru", clientHuman6 ));
            clientService.addNewClient(new ClientHumanDto(0,"petr@mail.ru", clientHuman7 ));
            clientService.addNewClient(new ClientHumanDto(0,"kirill@mail.ru", clientHuman8 ));
            clientService.addNewClient(new ClientHumanDto(0,"lyuda@mail.ru", clientHuman9 ));
            clientService.addNewClient(new ClientHumanDto(0,"ilya@mail.ru", clientHuman10 ));

            orderService.addNewOrder(new OrderDto(0, "Джинсы", new Date(22,7 ,25), new BigDecimal(500), employeeService.getEmployeeById(1), clientService.getClientById(1)));
            orderService.addNewOrder(new OrderDto(0, "Куртка", new Date(22,7 ,25), new BigDecimal(1500), employeeService.getEmployeeById(1), clientService.getClientById(2)));
            orderService.addNewOrder(new OrderDto(0, "Постельное белье", new Date(22,7 ,26), new BigDecimal(7500), employeeService.getEmployeeById(1), clientService.getClientById(3)));
            orderService.addNewOrder(new OrderDto(0, "Покрывало", new Date(22,7 ,28), new BigDecimal(700), employeeService.getEmployeeById(2), clientService.getClientById(4)));
            orderService.addNewOrder(new OrderDto(0, "Зимняя Куртка", new Date(22,7 ,30), new BigDecimal(3500), employeeService.getEmployeeById(3), clientService.getClientById(5)));
            orderService.addNewOrder(new OrderDto(0, "Джинсы+Куртка", new Date(22,7 ,31), new BigDecimal(4500), employeeService.getEmployeeById(2), clientService.getClientById(6)));
            orderService.addNewOrder(new OrderDto(0, "Постельное белье+Халат", new Date(22,8 ,26), new BigDecimal(9500), employeeService.getEmployeeById(2), clientService.getClientById(7)));
            orderService.addNewOrder(new OrderDto(0, "Шорты+Спортивный костюм", new Date(22,8 ,27), new BigDecimal(8500), employeeService.getEmployeeById(1), clientService.getClientById(8)));
            orderService.addNewOrder(new OrderDto(0, "Коврик", new Date(22,8 ,28), new BigDecimal(3500), employeeService.getEmployeeById(2), clientService.getClientById(9)));
            orderService.addNewOrder(new OrderDto(0, "Ковер", new Date(22,8 ,29), new BigDecimal(10500), employeeService.getEmployeeById(3), clientService.getClientById(10)));
            orderService.addNewOrder(new OrderDto(0, "Шторы", new Date(22,8 ,30), new BigDecimal(7100), employeeService.getEmployeeById(1), clientService.getClientById(2)));

    }
    }



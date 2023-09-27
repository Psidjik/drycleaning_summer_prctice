package com.example.drycleaning.init;


import com.example.drycleaning.dtos.*;
import com.example.drycleaning.services.ClientService;
import com.example.drycleaning.services.EmployeeService;
import com.example.drycleaning.services.HumanService;
import com.example.drycleaning.services.OrderService;
import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

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
        private void seedData() throws IOException {
            HumanDto employeeHuman1 = new HumanDto(1, "Burenka", "Buren", "89636539365");
            HumanDto employeeHuman2 = new HumanDto(2, "Masha", "Sokolova", "87415236396");
            HumanDto employeeHuman3 = new HumanDto(3, "Misha", "Podzol", "89874563212");
            HumanDto employeeHuman4 = new HumanDto(4, "Denis", "Gribnik", "87894562321");
            HumanDto employeeHuman5 = new HumanDto(5, "Mihail", "Ivanov", "87894562586");
            HumanDto employeeHuman6 = new HumanDto(6, "Mustofa", "Tamaev", "87894562895");
            HumanDto employeeHuman7 = new HumanDto(7, "Dmitriy", "Ovechkin", "87894562425");

            HumanDto clientHuman1 = new HumanDto(8, "Goga", "Nikitin", "89636593993");
            HumanDto clientHuman2 = new HumanDto(9, "Denis", "Bukin", "85236529654");
            HumanDto clientHuman3 = new HumanDto(10, "George", "Evklid", "85452145263");
            HumanDto clientHuman4 = new HumanDto(11, "Miha", "Mihail", "87452132563");
            HumanDto clientHuman5 = new HumanDto(12, "Oleg", "Olegovich", "89652147845");
            HumanDto clientHuman6 = new HumanDto(13, "Ilya", "Ivanov", "87459635874");
            HumanDto clientHuman7 = new HumanDto(14, "Ivan", "Petrov", "87945612321");
            HumanDto clientHuman8 = new HumanDto(15, "Petr", "Ivanov", "87942581436");
            HumanDto clientHuman9 = new HumanDto(16, "Kirill", "Nikitin", "89635471245");
            HumanDto clientHuman10 = new HumanDto(17, "Lyuda", "Vos", "89101478951");
            HumanDto clientHuman11 = new HumanDto(18, "July", "Nort", "89851478951");
            HumanDto clientHuman12 = new HumanDto(19, "Ksenua", "Yankovsky", "86541478951");
            HumanDto clientHuman13 = new HumanDto(20, "Roman", "Tagirov", "89821478951");
            HumanDto clientHuman14 = new HumanDto(21, "Nurlan", "Saburov", "85621478951");
            HumanDto clientHuman15 = new HumanDto(22, "Rik", "Hum", "89991478951");


            EmployeeDto employeeDto0 = employeeService.addNewEmployee(new EmployeeHumanDto(1, new BigDecimal(70000), "Cleaner", "11", employeeHuman1));
            EmployeeDto employeeDto1 = employeeService.addNewEmployee(new EmployeeHumanDto(2, new BigDecimal(47500), "Cleaner", "22", employeeHuman2));
            EmployeeDto employeeDto2 = employeeService.addNewEmployee(new EmployeeHumanDto(3, new BigDecimal(57500), "Cleaner", "33", employeeHuman3));
            EmployeeDto employeeDto3 = employeeService.addNewEmployee(new EmployeeHumanDto(4, new BigDecimal(87500), "Admin", "44", employeeHuman4));
            EmployeeDto employeeDto4 = employeeService.addNewEmployee(new EmployeeHumanDto(5, new BigDecimal(100000), "Admin", "55", employeeHuman5));
            EmployeeDto employeeDto5 = employeeService.addNewEmployee(new EmployeeHumanDto(6, new BigDecimal(52000), "Cleaner", "66", employeeHuman6));
            EmployeeDto employeeDto6 = employeeService.addNewEmployee(new EmployeeHumanDto(7, new BigDecimal(64000), "Cleaner", "77", employeeHuman7));



            ClientDto clientDto0 = clientService.addNewClient(new ClientHumanDto(1, "goga@mail.ru", clientHuman1));
            ClientDto clientDto1 = clientService.addNewClient(new ClientHumanDto(2, "den@mail.ru", clientHuman2));
            ClientDto clientDto2 = clientService.addNewClient(new ClientHumanDto(3, "goerge@mail.ru", clientHuman3));
            ClientDto clientDto3 = clientService.addNewClient(new ClientHumanDto(4, "miha@mail.ru", clientHuman4));
            ClientDto clientDto4 = clientService.addNewClient(new ClientHumanDto(5, "oleg@mail.ru", clientHuman5));
            ClientDto clientDto5 = clientService.addNewClient(new ClientHumanDto(6, "ivan@mail.ru", clientHuman6));
            ClientDto clientDto6 = clientService.addNewClient(new ClientHumanDto(7, "petr@mail.ru", clientHuman7));
            ClientDto clientDto7 = clientService.addNewClient(new ClientHumanDto(8, "kirill@mail.ru", clientHuman8));
            ClientDto clientDto8 = clientService.addNewClient(new ClientHumanDto(9, "lyuda@mail.ru", clientHuman9));
            ClientDto clientDto9 = clientService.addNewClient(new ClientHumanDto(10, "ilya@mail.ru", clientHuman10));
            ClientDto clientDto10 = clientService.addNewClient(new ClientHumanDto(11, "July@mail.ru", clientHuman11));
            ClientDto clientDto11 = clientService.addNewClient(new ClientHumanDto(12, "Ksenua@mail.ru", clientHuman12));
            ClientDto clientDto12 = clientService.addNewClient(new ClientHumanDto(13, "Roman@mail.ru", clientHuman13));
            ClientDto clientDto13 = clientService.addNewClient(new ClientHumanDto(14, "Nurlan@mail.ru", clientHuman14));
            ClientDto clientDto14 = clientService.addNewClient(new ClientHumanDto(15, "Rik@mail.ru", clientHuman15));




            orderService.addNewOrder(new OrderDto(0, "Джинсы", new GregorianCalendar(2023, Calendar.AUGUST, 25), new BigDecimal(500), employeeDto0.getId(), clientDto0.getId()));
            orderService.addNewOrder(new OrderDto(0, "Куртка", new GregorianCalendar(2023, Calendar.AUGUST, 25), new BigDecimal(1500), employeeDto0.getId(), clientDto1.getId()));
            orderService.addNewOrder(new OrderDto(0, "Постельное белье", new GregorianCalendar(2023, Calendar.AUGUST, 26), new BigDecimal(7500), employeeDto0.getId(), clientDto2.getId()));
            orderService.addNewOrder(new OrderDto(0, "Покрывало", new GregorianCalendar(2023, Calendar.AUGUST, 26), new BigDecimal(700), employeeDto1.getId(), clientDto3.getId()));
            orderService.addNewOrder(new OrderDto(0, "Зимняя Куртка", new GregorianCalendar(2023, Calendar.AUGUST, 27), new BigDecimal(3500), employeeDto1.getId(), clientDto4.getId()));
            orderService.addNewOrder(new OrderDto(0, "Джинсы+Куртка", new GregorianCalendar(2023, Calendar.AUGUST, 27), new BigDecimal(4500), employeeDto1.getId(), clientDto5.getId()));
            orderService.addNewOrder(new OrderDto(0, "Постельное белье+Халат", new GregorianCalendar(2023, Calendar.AUGUST, 28), new BigDecimal(9500), employeeDto2.getId(), clientDto6.getId()));
            orderService.addNewOrder(new OrderDto(0, "Шорты+Спортивный костюм", new GregorianCalendar(2023, Calendar.AUGUST, 28), new BigDecimal(8500), employeeDto2.getId(), clientDto7.getId()));
            orderService.addNewOrder(new OrderDto(0, "Коврик", new GregorianCalendar(2023, Calendar.AUGUST, 28), new BigDecimal(3500), employeeDto3.getId(), clientDto8.getId()));
            orderService.addNewOrder(new OrderDto(0, "Куртка", new GregorianCalendar(2023, Calendar.AUGUST, 29), new BigDecimal(10500), employeeDto4.getId(), clientDto9.getId()));
            orderService.addNewOrder(new OrderDto(0, "Брюки", new GregorianCalendar(2023, Calendar.AUGUST, 29), new BigDecimal(8000), employeeDto5.getId(), clientDto10.getId()));
            orderService.addNewOrder(new OrderDto(0, "Пиджак", new GregorianCalendar(2023, Calendar.AUGUST, 30), new BigDecimal(3250), employeeDto6.getId(), clientDto11.getId()));
            orderService.addNewOrder(new OrderDto(0, "Кеды", new GregorianCalendar(2023, Calendar.AUGUST, 30), new BigDecimal(1200), employeeDto5.getId(), clientDto12.getId()));
            orderService.addNewOrder(new OrderDto(0, "Шторы", new GregorianCalendar(2023, Calendar.AUGUST, 30), new BigDecimal(15000), employeeDto2.getId(), clientDto13.getId()));
            orderService.addNewOrder(new OrderDto(0, "Рубашка", new GregorianCalendar(2023, Calendar.AUGUST, 31), new BigDecimal(1500), employeeDto1.getId(), clientDto14.getId()));
            orderService.addNewOrder(new OrderDto(0, "Китель", new GregorianCalendar(2023, Calendar.AUGUST, 31), new BigDecimal(4800), employeeDto6.getId(), clientDto14.getId()));
            orderService.addNewOrder(new OrderDto(0, "Шуба", new GregorianCalendar(2023, Calendar.AUGUST, 31), new BigDecimal(23125), employeeDto1.getId(), clientDto12.getId()));





        }
    }



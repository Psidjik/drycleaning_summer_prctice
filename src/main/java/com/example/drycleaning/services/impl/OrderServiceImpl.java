package com.example.drycleaning.services.impl;


import com.example.drycleaning.dtos.OrderDto;
import com.example.drycleaning.dtos.OrderOutPutDto;
import com.example.drycleaning.models.Order;
import com.example.drycleaning.repositories.OrderRepository;
import com.example.drycleaning.services.OrderService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class OrderServiceImpl implements OrderService<Integer> {

    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private ModelMapper modelMapper;
    @Override
    public OrderDto getOrder(Integer employeeId, Integer clientId,  Date dateOfVisit) {
        return modelMapper.map(orderRepository.findOrderByEmployeeIdAndClientIdAndDateOfVisit(employeeId, clientId, dateOfVisit), OrderDto.class);
    }

    @Override
    public void deleteOrder(Integer employeeId, Integer clientId, Date dateOfVisit) {
        orderRepository.deleteOrderByEmployeeIdAndClientIdAndDateOfVisit(employeeId, clientId, dateOfVisit);
    }

    @Override
    public OrderDto addNewOrder(OrderDto orderDto) {
        return  modelMapper.map(orderRepository.save(modelMapper.map(orderDto, Order.class)), OrderDto.class);
    }//map - функция которая применяет к каждому объекту какие либо действия
    @Override
    public List<OrderOutPutDto> getAllOrders() {
        return orderRepository.findAll().stream().map(order -> modelMapper.map(order, OrderOutPutDto.class)).collect(Collectors.toList());
    }
    @Override
    public void deleteOrderById(Integer id) {
        orderRepository.deleteById(id);
    }
    @Override
    public List<OrderOutPutDto> getAllOrderByDate(Date date) {
        return orderRepository.findAllByDateOfVisit(date).stream().map(order -> modelMapper.map(order, OrderOutPutDto.class)).collect(Collectors.toList());
    }

//    @Override
//    public List<OrderOutPutDto> getAllOrderWhereCostMore(BigDecimal cost) {
//        return orderRepository.;
//    }
}


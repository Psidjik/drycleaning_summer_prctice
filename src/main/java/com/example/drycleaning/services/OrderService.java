package com.example.drycleaning.services;


import com.example.drycleaning.dtos.OrderDto;
import com.example.drycleaning.dtos.OrderOutPutDto;
import com.example.drycleaning.models.Order;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

public interface OrderService<ID>{
    OrderDto getOrder(ID clientId, ID employeeId, Date dateOfVisit);
    //убрать даты
    void deleteOrder(ID employeeId, ID clientId, Date dateOfVisit);
    OrderDto addNewOrder(OrderDto orderDto);
//разобраться с ДТО и реализовать здесь метод который ищет ордер по айди таблицы
    List<OrderOutPutDto> getAllOrders();
    void deleteOrderById(ID orderId);
    List<OrderOutPutDto> getAllOrderByDate(Date date);
    OrderOutPutDto getOrderById(ID orderId);
    OrderOutPutDto updateItemName(ID orderId, String itemName);
}


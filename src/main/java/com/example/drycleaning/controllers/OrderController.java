package com.example.drycleaning.controllers;


import com.example.drycleaning.dtos.HumanDto;
import com.example.drycleaning.dtos.OrderDto;
import com.example.drycleaning.dtos.OrderOutPutDto;
import com.example.drycleaning.services.OrderService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/allorder")
    Iterable<OrderDto> getAllOrders(){
        return orderService.getAllOrders();
    }

    @GetMapping("/getorder/{employeeid}/{clientid}/{date}")
    OrderDto getOrder(@PathVariable Integer employeeid, @PathVariable Integer clientid, @PathVariable Date date){
        return orderService.getOrder(employeeid, clientid, date);
    }
    @GetMapping("/{id}")
    OrderOutPutDto getOrderById(@PathVariable Integer id){
        return orderService.getOrderById(id);
    }

    @GetMapping("/getordersbydate/{date}")
    Iterable<OrderDto> getOrderByDate(@PathVariable Date date){
        return orderService.getAllOrderByDate(date);
    }
    @DeleteMapping("/delete/{employeeid}/{clientid}/{date}")
    String deleteOrder(@PathVariable Integer employeeId,@PathVariable Integer clientId,@PathVariable Date dateOfVisit){
        orderService.deleteOrder(employeeId, clientId, dateOfVisit);
        return "Order with employeeId = " + employeeId + " clientId = " + clientId + " dateOfVisit = " + dateOfVisit + " was deleted";
    }
    @PostMapping("/addorder")
    OrderDto addOrder(@RequestBody OrderDto orderDto){
        return orderService.addNewOrder(orderDto);
    }

    @DeleteMapping("/delete/{id}")
    void deleteOrderById(@PathVariable Integer id){
        orderService.deleteOrderById(id);
    }


}

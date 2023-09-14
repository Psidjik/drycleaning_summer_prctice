package com.example.drycleaning.repositories;

import com.example.drycleaning.dtos.OrderDto;
import com.example.drycleaning.dtos.OrderOutPutDto;
import com.example.drycleaning.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;


@Repository
public interface OrderRepository extends JpaRepository<Order,Integer> {
void deleteOrderByEmployeeIdAndClientIdAndDateOfVisit(Integer employeeId, Integer clientId, Date dateOfVisit);
Order findOrderByEmployeeIdAndClientIdAndDateOfVisit(Integer employeeId, Integer clientId, Date dateOfVisit);
List<Order> findAllByDateOfVisit(Date dateOfVisit);


}


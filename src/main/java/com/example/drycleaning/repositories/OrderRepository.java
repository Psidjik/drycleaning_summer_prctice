package com.example.drycleaning.repositories;

import com.example.drycleaning.dtos.OrderDto;
import com.example.drycleaning.dtos.OrderOutPutDto;
import com.example.drycleaning.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;


@Repository
public interface OrderRepository extends JpaRepository<Order,Integer> {
void deleteOrderByEmployeeIdAndClientIdAndDateOfVisit(Integer employeeId, Integer clientId, Date dateOfVisit);
Order findOrderByEmployeeIdAndClientIdAndDateOfVisit(Integer employeeId, Integer clientId, Date dateOfVisit);
List<Order> findAllByDateOfVisit(Date dateOfVisit);


//    @Query("select p.person.contact from Patient p where p.id = :patientId")
//        Contact findContactByPatientId(@Param("patientId") Integer patientId);
//    @Query("select order ")
//    List<Order> findOrdersWhereCostMore(@Param("cost")BigDecimal cost);

//    @Query("SELECT o.dateOfVisit AS dateOfVisit, o.cost AS cost, e.human.firstName AS employeeName, c.human.firstName AS clientName " +
//            "FROM Orders o " +
//            "INNER JOIN o.employee e " +
//            "INNER JOIN o.client c " +
//            "WHERE e.employeeId = :employeeId AND c.clientId = :clientId")
//    List<Order> findOrderByEmployeeAndClient(@Param("employeeId") Integer employeeId,@Param("clientId") Integer clientId);



}


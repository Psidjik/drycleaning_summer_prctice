package com.example.drycleaning.repositories;

import com.example.drycleaning.dtos.HumanDto;
import com.example.drycleaning.dtos.OrderDto;
import com.example.drycleaning.models.Human;
import com.example.drycleaning.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HumanRepository extends JpaRepository<Human, Integer> {
    @Query("SELECT o.id AS order_id, o.dateOfVisit AS date, o.itemName AS itemName, o.cost AS cost, o.employee.id as employeeId, c.id as clientId " +
            "FROM Human h " +
            "JOIN Client c ON h.id = c.human.id " +
            "JOIN Order o ON c.id = o.client.id " +
            "WHERE h.phoneNumber = :phoneNumber")
    List<Object[]> findOrderIdAndDateByPhoneNumber(@Param("phoneNumber") String phoneNumber);

}

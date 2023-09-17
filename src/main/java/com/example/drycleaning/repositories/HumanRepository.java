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
    @Query("SELECT o " +
            "FROM Order o " +
            "JOIN o.client c " +
            "JOIN c.human h " +
            "WHERE h.phoneNumber = :phoneNumber")
    List<Order> findOrderIdAndDateByPhoneNumber(@Param("phoneNumber") String phoneNumber);

}

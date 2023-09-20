package com.example.drycleaning.repositories;

import com.example.drycleaning.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


@Repository
public interface ClientRepository extends JpaRepository<Client,Integer> {
    @Query("SELECT c " +
            "FROM Client c " +
            "JOIN FETCH c.order o " +
            "WHERE o.dateOfVisit = :date AND o.cost > :minTotalAmount ")
    List<Client> findClientsWithOrdersAboveTotalAmountAndDate(Date date, BigDecimal minTotalAmount);




}


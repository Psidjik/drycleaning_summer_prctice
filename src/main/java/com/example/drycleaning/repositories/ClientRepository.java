package com.example.drycleaning.repositories;

import com.example.drycleaning.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ClientRepository extends JpaRepository<Client,Integer> {

}


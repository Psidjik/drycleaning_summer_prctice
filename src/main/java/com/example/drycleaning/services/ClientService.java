package com.example.drycleaning.services;


import com.example.drycleaning.dtos.ClientDto;
import com.example.drycleaning.dtos.ClientHumanDto;
import com.example.drycleaning.dtos.HumanDto;
import com.example.drycleaning.dtos.OrderOutPutDto;
import com.example.drycleaning.models.Client;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface ClientService<ID>{
    List<ClientDto> getAllClients();
    ClientDto addNewClient(ClientHumanDto ClientHumanDto);
    ClientHumanDto getClientById(ID clientId);
    void deleteClient(ID clientId);
    ClientHumanDto updateE_mail(ID clientId, String e_mail);
    List<ClientDto> findClientsWithOrdersByDateOfVisitAboveTotalAmount(Date dateOfVisit, BigDecimal minTotalAmount);

}

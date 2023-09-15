package com.example.drycleaning.services;


import com.example.drycleaning.dtos.ClientDto;
import com.example.drycleaning.dtos.ClientHumanDto;
import com.example.drycleaning.dtos.HumanDto;

import java.util.List;

public interface ClientService<ID>{
    List<ClientDto> getAllClients();
    ClientDto addNewClient(ClientHumanDto ClientHumanDto);
    ClientHumanDto getClientById(ID clientId);

    Integer getClientByIdForOrder(HumanDto humanDto);
    void deleteClient(ID clientId);
    ClientHumanDto updateE_mail(ID clientId, String e_mail);
}

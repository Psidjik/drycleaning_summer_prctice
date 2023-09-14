package com.example.drycleaning.services;


import com.example.drycleaning.dtos.ClientDto;
import com.example.drycleaning.dtos.ClientHumanDto;

import java.util.List;

public interface ClientService<ID>{
    List<ClientDto> getAllClients();
    ClientHumanDto addNewClient(ClientHumanDto ClientHumanDto);
    ClientDto getClientById(ID clientId);
    void deleteClient(ID clientId);
    ClientHumanDto updateE_mail(ID clientId, String e_mail);
}

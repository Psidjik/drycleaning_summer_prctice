package com.example.drycleaning.services.impl;


import com.example.drycleaning.dtos.ClientDto;
import com.example.drycleaning.dtos.ClientHumanDto;
import com.example.drycleaning.models.Client;
import com.example.drycleaning.repositories.ClientRepository;
import com.example.drycleaning.services.ClientService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ClientServiceImpl implements ClientService<Integer> {
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<ClientDto> getAllClients() {
        return clientRepository.findAll().stream().map(client -> modelMapper.map(client, ClientDto.class)).collect(Collectors.toList());
    }

    @Override
    public ClientDto addNewClient(ClientHumanDto ClientHumanDto) {
        return modelMapper.map(clientRepository.save(modelMapper.map(ClientHumanDto, Client.class)), ClientDto.class);
    }
    @Override
    public ClientHumanDto getClientById(Integer clientId) {
        return modelMapper.map(clientRepository.findById(clientId), ClientHumanDto.class);
    }
    @Override
    public void deleteClient(Integer clientId) {
        clientRepository.deleteById(clientId);
    }

    @Override
    public ClientHumanDto updateE_mail(Integer clientId, String e_mail) {
        Client client = clientRepository.findById(clientId).orElseThrow();
        client.setE_mail(e_mail);
        clientRepository.save(client);
        return modelMapper.map(client, ClientHumanDto.class);
    }
}

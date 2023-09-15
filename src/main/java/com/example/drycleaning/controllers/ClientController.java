package com.example.drycleaning.controllers;


import com.example.drycleaning.dtos.ClientDto;
import com.example.drycleaning.dtos.ClientHumanDto;
import com.example.drycleaning.services.ClientService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    ClientService clientService;

    @GetMapping("/allclient")
    List<ClientDto> getAllClient(){
        return clientService.getAllClients();
    }

    @GetMapping("/{id}")
    ClientHumanDto getClientById(@PathVariable Integer id){
        return clientService.getClientById(id);
    }
    @PostMapping("/addclient")
    ClientDto addClient(@RequestBody ClientHumanDto clientHumanDto){
        return clientService.addNewClient(clientHumanDto);
    }
    @DeleteMapping("/delete/{id}")
    String deleteClient(@PathVariable Integer id){
        clientService.deleteClient(id);
        return "Client with id = " + id + " was deleted";
    }
    @PutMapping("/updateE_mail/{id}/{e_mail}")
    ClientHumanDto updateEmail(@PathVariable Integer id, @PathVariable String e_mail){
        return clientService.updateE_mail(id, e_mail);
    }
}

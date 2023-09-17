package com.example.drycleaning.controllers;


import com.example.drycleaning.dtos.HumanDto;
import com.example.drycleaning.dtos.OrderDto;
import com.example.drycleaning.dtos.OrderOutPutDto;
import com.example.drycleaning.models.Order;
import com.example.drycleaning.services.HumanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/human")
public class HumanController {
    @Autowired
    HumanService humanService;
    @GetMapping("/allhuman")
    List<HumanDto> getAllHumans(){
        List<HumanDto> humans = humanService.getAllHuman();
        return humans;
    }
    @GetMapping("/{id}")
    HumanDto getHumanById(@PathVariable Integer id){
        HumanDto humanDto = humanService.getHumanById(id);
        return humanDto;
    }
    @PostMapping("/addhuman")
    HumanDto addHuman(@RequestBody HumanDto humanDto){
        HumanDto human = humanService.addNewHuman(humanDto);
        return humanService.addNewHuman(human);
    }
    @DeleteMapping("/delete/{id}")
    String deleteHuman(@PathVariable Integer id){
        humanService.deleteHuman(id);
        return "Human with id = " + id + " was deleted";
    }
    @PutMapping("/updatefirstname/{id}/{firstname}")
    HumanDto updateFirstName(@PathVariable Integer id, @PathVariable String firstname){
        return humanService.updateFirstName(id, firstname);
    }
    @PutMapping("/updatelastname/{id}/{lastname}")
    HumanDto updateLastName(@PathVariable Integer id, @PathVariable String lastname){
        return humanService.updateLastName(id, lastname);
    }
    @GetMapping("/findOrderByPhoneNumber/{phoneNumber}")
    List<OrderOutPutDto> findOrderIdAndDateByPhoneNumber(@PathVariable String phoneNumber){
        return humanService.findOrderIdAndDateByPhoneNumber(phoneNumber);
    }


    }

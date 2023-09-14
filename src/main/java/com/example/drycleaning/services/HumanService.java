package com.example.drycleaning.services;


import com.example.drycleaning.dtos.HumanDto;

import java.util.List;

public interface HumanService<ID> {
    HumanDto addNewHuman(HumanDto humanDto);
    HumanDto updateFirstName(ID humanId, String firstName);
    HumanDto updateLastName(ID humanId, String lastName);
    void deleteHuman(ID humanId);
    HumanDto getHumanById(ID humanId);
    List<HumanDto> getAllHuman();
}




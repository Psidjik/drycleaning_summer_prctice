package com.example.drycleaning.services.impl;


import com.example.drycleaning.dtos.EmployeeHumanDto;
import com.example.drycleaning.dtos.HumanDto;
import com.example.drycleaning.models.Employee;
import com.example.drycleaning.models.Human;
import com.example.drycleaning.repositories.HumanRepository;
import com.example.drycleaning.services.HumanService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class HumanServiceImpl implements HumanService<Integer> {
    @Autowired
    private HumanRepository humanRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public HumanDto addNewHuman(HumanDto humanDto) {
        return modelMapper.map( humanRepository.save(modelMapper.map(humanDto, Human.class)),HumanDto.class);
    }

    @Override
    public HumanDto updateFirstName(Integer humanId, String firstName) {
        Human human = humanRepository.findById(humanId).orElseThrow();
        human.setFirstName(firstName);
        humanRepository.save(human);
        return modelMapper.map(human, HumanDto.class);
    }

    @Override
    public HumanDto updateLastName(Integer humanId, String lastName) {
        Human human = humanRepository.findById(humanId).orElseThrow();
        human.setLastName(lastName);
        humanRepository.save(human);
        return modelMapper.map(human, HumanDto.class);
    }

    @Override
    public void deleteHuman(Integer humanId) {
        humanRepository.deleteById(humanId);
    }

    @Override
    public HumanDto getHumanById(Integer humanId) {
        return modelMapper.map(humanRepository.findById(humanId).orElseThrow(), HumanDto.class);
    }

    @Override
    public List<HumanDto> getAllHuman() {
        return humanRepository.findAll().stream().map(human -> modelMapper.map(human, HumanDto.class)).collect(Collectors.toList());
    }
}

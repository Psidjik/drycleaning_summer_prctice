package com.example.drycleaning.dtos;

import java.math.BigDecimal;
import java.util.GregorianCalendar;

public class OrderDto {
    private Integer id;
    private String itemName;
    private GregorianCalendar dateOfVisit;
    private BigDecimal cost;
    private EmployeeHumanDto employeeHumanDto;
    private ClientDto clientDto;

    public OrderDto(Integer id, String itemName, GregorianCalendar dateOfVisit, BigDecimal cost, EmployeeHumanDto employeeHumanDto, ClientDto clientDto) {
        this.id = id;
        this.itemName = itemName;
        this.dateOfVisit = dateOfVisit;
        this.cost = cost;
        this.employeeHumanDto = employeeHumanDto;
        this.clientDto = clientDto;
    }

    public OrderDto() {
    }

    public ClientDto getClientDto() {
        return clientDto;
    }

    public void setClientDto(ClientDto clientDto) {
        this.clientDto = clientDto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public GregorianCalendar getDateOfVisit() {
        return dateOfVisit;
    }

    public void setDateOfVisit(GregorianCalendar dateOfVisit) {
        this.dateOfVisit = dateOfVisit;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public EmployeeHumanDto getEmployeeHumanDto() {
        return employeeHumanDto;
    }

    public void setEmployeeHumanDto(EmployeeHumanDto employeeHumanDto) {
        this.employeeHumanDto = employeeHumanDto;
    }

//    public ClientHumanDto getClientHumanDto() {
//        return clientHumanDto;
//    }
//
//    public void setClientHumanDto(ClientHumanDto clientHumanDto) {
//        this.clientHumanDto = clientHumanDto;
//    }

    @Override
    public String toString() {
        return "OrderDto{" +
                "id=" + id +
                ", itemName='" + itemName + '\'' +
                ", dateOfVisit=" + dateOfVisit +
                ", cost=" + cost +
                ", employeeHumanDto=" + employeeHumanDto +
//                ", clientHumanDto=" + clientHumanDto +
                '}';
    }
}



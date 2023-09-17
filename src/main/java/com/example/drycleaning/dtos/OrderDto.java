package com.example.drycleaning.dtos;

import java.math.BigDecimal;
import java.util.Date;
import java.util.GregorianCalendar;

public class OrderDto {
    private Integer id;
    private String itemName;
    private Date dateOfVisit;
    private BigDecimal cost;
//    private EmployeeHumanDto employeeHumanDto;
//    private ClientHumanDto clientHumanDto;

    private Integer employeeId;
    private Integer clientId;

//    public OrderDto(Integer id, String itemName, GregorianCalendar dateOfVisit, BigDecimal cost, EmployeeHumanDto employeeHumanDto, ClientHumanDto clientHumanDto) {
//        this.id = id;
//        this.itemName = itemName;
//        this.dateOfVisit = dateOfVisit;
//        this.cost = cost;
//        this.employeeHumanDto = employeeHumanDto;
//        this.clientHumanDto = clientHumanDto;
//    }


    public OrderDto(Integer id, String itemName, Date dateOfVisit, BigDecimal cost, Integer employeeId, Integer clientId) {
        this.id = id;
        this.itemName = itemName;
        this.dateOfVisit = dateOfVisit;
        this.cost = cost;
        this.employeeId = employeeId;
        this.clientId = clientId;
    }

    public OrderDto() {
    }

//    public ClientHumanDto getClientHumanDto() {
//        return clientHumanDto;
//    }
//
//    public void setClientHumanDto(ClientHumanDto clientHumanDto) {
//        this.clientHumanDto = clientHumanDto;
//    }

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

    public Date getDateOfVisit() {
        return dateOfVisit;
    }

    public void setDateOfVisit(Date dateOfVisit) {
        this.dateOfVisit = dateOfVisit;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    //    public EmployeeHumanDto getEmployeeHumanDto() {
//        return employeeHumanDto;
//    }
//
//    public void setEmployeeHumanDto(EmployeeHumanDto employeeHumanDto) {
//        this.employeeHumanDto = employeeHumanDto;
//    }

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
//                ", employeeHumanDto=" + employeeHumanDto +
//                ", clientHumanDto=" + clientHumanDto +
                '}';
    }
}



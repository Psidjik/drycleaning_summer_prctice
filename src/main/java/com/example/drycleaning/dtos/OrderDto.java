package com.example.drycleaning.dtos;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Date;
@NoArgsConstructor
@AllArgsConstructor
public class OrderDto {
    private Integer id;
    private String itemName;
    private Date dateOfVisit;
    private BigDecimal cost;
    private EmployeeHumanDto employeeHumanDto;
    private ClientHumanDto clientHumanDto;
//DTO для добавления в базу данных
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

    public EmployeeHumanDto getEmployeeHumanDto() {
        return employeeHumanDto;
    }

    public void setEmployeeHumanDto(EmployeeHumanDto employeeHumanDto) {
        this.employeeHumanDto = employeeHumanDto;
    }

    public ClientHumanDto getClientHumanDto() {
        return clientHumanDto;
    }

    public void setClientHumanDto(ClientHumanDto clientHumanDto) {
        this.clientHumanDto = clientHumanDto;
    }

    @Override
    public String toString() {
        return "OrderDto{" +
                "id=" + id +
                ", itemName='" + itemName + '\'' +
                ", dateOfVisit=" + dateOfVisit +
                ", cost=" + cost +
                ", employeeHumanDto=" + employeeHumanDto +
                ", clientHumanDto=" + clientHumanDto +
                '}';
    }
}



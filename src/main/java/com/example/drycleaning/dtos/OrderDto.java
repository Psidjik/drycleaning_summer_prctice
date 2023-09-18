package com.example.drycleaning.dtos;

import java.math.BigDecimal;
import java.util.Date;
import java.util.GregorianCalendar;

public class OrderDto {
    private Integer id;
    private String itemName;
    private GregorianCalendar dateOfVisit;
    private BigDecimal cost;

    private Integer employeeId;
    private Integer clientId;


    public OrderDto(Integer id, String itemName, GregorianCalendar dateOfVisit, BigDecimal cost, Integer employeeId, Integer clientId) {
        this.id = id;
        this.itemName = itemName;
        this.dateOfVisit = dateOfVisit;
        this.cost = cost;
        this.employeeId = employeeId;
        this.clientId = clientId;
    }

    public OrderDto() {
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

    @Override
    public String toString() {
        return "OrderDto{" +
                "id=" + id +
                ", itemName='" + itemName + '\'' +
                ", dateOfVisit=" + dateOfVisit +
                ", cost=" + cost +
                ", employeeId=" + employeeId +
                ", clientId=" + clientId +
                '}';
    }
}




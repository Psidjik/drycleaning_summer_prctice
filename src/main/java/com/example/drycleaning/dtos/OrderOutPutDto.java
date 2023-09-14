package com.example.drycleaning.dtos;
import java.math.BigDecimal;
import java.sql.Date;

public class OrderOutPutDto {
    private Integer id;
    private String itemName;
    private Date dateOfVisit;
    private BigDecimal cost;
    private String firstNameEmployee;
    private String lastNameEmployee;
    private String firstNameClient;
    private String lastNameClient;

    public OrderOutPutDto(Integer id, String itemName, Date dateOfVisit, BigDecimal cost, String firstNameEmployee,
                          String lastNameEmployee, String firstNameClient, String lastNameClient) {
        this.id = id;
        this.itemName = itemName;
        this.dateOfVisit = dateOfVisit;
        this.cost = cost;
        this.firstNameEmployee = firstNameEmployee;
        this.lastNameEmployee = lastNameEmployee;
        this.firstNameClient = firstNameClient;
        this.lastNameClient = lastNameClient;
    }

    public OrderOutPutDto() {
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

    public String getFirstNameEmployee() {
        return firstNameEmployee;
    }

    public void setFirstNameEmployee(String firstNameEmployee) {
        this.firstNameEmployee = firstNameEmployee;
    }

    public String getLastNameEmployee() {
        return lastNameEmployee;
    }

    public void setLastNameEmployee(String lastNameEmployee) {
        this.lastNameEmployee = lastNameEmployee;
    }

    public String getFirstNameClient() {
        return firstNameClient;
    }

    public void setFirstNameClient(String firstNameClient) {
        this.firstNameClient = firstNameClient;
    }

    public String getLastNameClient() {
        return lastNameClient;
    }

    public void setLastNameClient(String lastNameClient) {
        this.lastNameClient = lastNameClient;
    }

    @Override
    public String toString() {
        return "OrderOutPutDto{" +
                "id=" + id +
                ", itemName='" + itemName + '\'' +
                ", dateOfVisit=" + dateOfVisit +
                ", cost=" + cost +
                ", firstNameEmployee='" + firstNameEmployee + '\'' +
                ", lastNameEmployee='" + lastNameEmployee + '\'' +
                ", firstNameClient='" + firstNameClient + '\'' +
                ", lastNameClient='" + lastNameClient + '\'' +
                '}';
    }
}

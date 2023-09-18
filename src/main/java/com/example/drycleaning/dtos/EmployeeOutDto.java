package com.example.drycleaning.dtos;



import java.math.BigDecimal;
import java.util.List;

public class EmployeeOutDto {
    private Integer id;
    private String firstName;
    private String lastName;
    private BigDecimal salary;
    private Integer orderCount; // Добавление поля для количества заказов
    private BigDecimal totalCost; // Добавление поля для суммы заказов

    public EmployeeOutDto(Integer id, String firstName, String lastName, BigDecimal salary, Integer orderCount, BigDecimal totalCost) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.orderCount = orderCount;
        this.totalCost = totalCost;
    }

    public EmployeeOutDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public Integer getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }

    public BigDecimal getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(BigDecimal totalCost) {
        this.totalCost = totalCost;
    }

    @Override
    public String toString() {
        return "EmployeeOutDto{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", orderCount=" + orderCount +
                ", totalCost=" + totalCost +
                '}';
    }
}


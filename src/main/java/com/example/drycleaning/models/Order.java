package com.example.drycleaning.models;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Date;


@Entity
@Table(name = "orders")
public class Order {
    @Id
    @Column(name = "order_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "item_name",columnDefinition = "text")
    private String itemName;

    @Column(name = "date_of_visit", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dateOfVisit;

    @Column(name = "cost",  nullable = false)
    private BigDecimal cost;
    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "client_id")
    private Client client;

    @Transient
    private Integer sumOrderId;
    @Transient
    private BigDecimal sumOrderCost;



    public Order(Integer id, String itemName, Date dateOfVisit, BigDecimal cost, Employee employee, Client client) {
        this.id = id;
        this.itemName = itemName;
        this.dateOfVisit = dateOfVisit;
        this.cost = cost;
        this.employee = employee;
        this.client = client;
    }

    public Order(Integer id, Integer sumOrderId, BigDecimal sumOrderCost) {
        this.id = id;
        this.sumOrderId = sumOrderId;
        this.sumOrderCost = sumOrderCost;
    }

    public Order() {
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

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", itemName='" + itemName + '\'' +
                ", dateOfVisit=" + dateOfVisit +
                ", cost=" + cost +
                ", employee=" + employee +
                ", client=" + client +
                '}';
    }

    public Integer getSumOrderId() {
        return sumOrderId;
    }

    public void setSumOrderId(Integer sumOrderId) {
        this.sumOrderId = sumOrderId;
    }

    public BigDecimal getSumOrderCost() {
        return sumOrderCost;
    }

    public void setSumOrderCost(BigDecimal sumOrderCost) {
        this.sumOrderCost = sumOrderCost;
    }
}

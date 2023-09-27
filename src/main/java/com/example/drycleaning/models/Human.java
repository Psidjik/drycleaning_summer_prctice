package com.example.drycleaning.models;

import jakarta.persistence.*;


import java.sql.Date;

@Entity
@Table(name = "humans")
public class Human {
    @Id
    @Column(name = "human_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "first_name", length = 50, nullable = false)
    private String firstName;

    @Column(name = "last_name", length = 50, nullable = false)
    private String lastName;

    @Column(name = "phoneNumber",length = 20, nullable = false)
    private String phoneNumber;

    @OneToOne(mappedBy = "human", cascade = {CascadeType.REMOVE, CascadeType.REFRESH})
    private Employee employee;

    @OneToOne(mappedBy = "human",cascade = {CascadeType.REMOVE, CascadeType.REFRESH})
    private Client client;

    public Human(Integer id, String firstName, String lastName, String phoneNumber, Employee employee, Client client) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.employee = employee;
        this.client = client;
    }

    public Human() {
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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
        return "Human{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", employee=" + employee +
                ", client=" + client +
                '}';
    }
}

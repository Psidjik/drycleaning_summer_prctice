package com.example.drycleaning.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


import java.math.BigDecimal;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employees")
public class Employee {
    @Id
    @Column(name = "employee_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "salary", nullable = false)
    private BigDecimal salary;
    @Column(name = "post", length = 15, nullable = false)
    private String post;
    @Column(name = "contract_number", length = 25, nullable = false)
    private String contractNumber;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "human_id", referencedColumnName = "human_id")
    private Human human;
    //про каскадки более изучить
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", human=" + human +
                ", salary=" + salary +
                ", post='" + post + '\'' +
                ", contractNumber='" + contractNumber + '\'' +
                '}';
    }
}

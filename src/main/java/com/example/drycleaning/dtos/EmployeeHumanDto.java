package com.example.drycleaning.dtos;

import java.math.BigDecimal;

public class EmployeeHumanDto {
    private Integer id;
    private BigDecimal salary;
    private String post;
    private String contractNumber;
    public HumanDto humanDto;




    public EmployeeHumanDto(Integer id, BigDecimal salary, String post, String contractNumber, HumanDto humanDto) {
        this.id = id;
        this.salary = salary;
        this.post = post;
        this.contractNumber = contractNumber;
        this.humanDto = humanDto;
    }

    public EmployeeHumanDto() {
    }

    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
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

    public HumanDto getHumanDto() {
        return humanDto;
    }

    public void setHumanDto(HumanDto humanDto) {
        this.humanDto = humanDto;
    }

    @Override
    public String toString() {
        return "EmployeeHumanDto{" +
                "id=" + id +
                ", salary=" + salary +
                ", post='" + post + '\'' +
                ", contractNumber='" + contractNumber + '\'' +
                ", humanDto=" + humanDto +
                '}';
    }
}


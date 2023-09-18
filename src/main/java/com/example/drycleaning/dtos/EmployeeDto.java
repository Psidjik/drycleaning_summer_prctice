package com.example.drycleaning.dtos;



import java.math.BigDecimal;

public class EmployeeDto {
    private Integer id;
    private String firstName;
    private String lastName;
    private BigDecimal salary;
    private String post;
    private String contractNumber;



    public EmployeeDto(Integer id, String firstName, String lastName, BigDecimal salary, String post, String contractNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.post = post;
        this.contractNumber = contractNumber;
    }

    public EmployeeDto() {
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
        return "EmployeeDto{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", post='" + post + '\'' +
                ", contractNumber='" + contractNumber + '\'' +
                '}';
    }
}

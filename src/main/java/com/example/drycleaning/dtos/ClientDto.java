package com.example.drycleaning.dtos;


public class ClientDto {
    private Integer id;
    private String e_mail;
    private String firstName;
    private String lastName;
    private String phoneNumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ClientDto(Integer id, String e_mail, String firstName, String lastName) {
        this.id = id;
        this.e_mail = e_mail;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public ClientDto(Integer id, String e_mail, String firstName, String lastName, String phoneNumber) {
        this.id = id;
        this.e_mail = e_mail;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ClientDto() {
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
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

    @Override
    public String toString() {
        return "ClientDto{" +
                "id=" + id +
                ", e_mail='" + e_mail + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}


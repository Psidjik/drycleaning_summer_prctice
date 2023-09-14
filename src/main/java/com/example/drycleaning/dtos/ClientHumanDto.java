package com.example.drycleaning.dtos;

public class ClientHumanDto {

    private Integer id;
    private String e_mail;
    private HumanDto humanDto;

    public ClientHumanDto(Integer id, String e_mail, HumanDto humanDto) {
        this.id = id;
        this.e_mail = e_mail;
        this.humanDto = humanDto;
    }

    public ClientHumanDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }


    public HumanDto getHumanDto() {
        return humanDto;
    }

    public void setHumanDto(HumanDto humanDto) {
        this.humanDto = humanDto;
    }

    @Override
    public String toString() {
        return "ClientHumanDto{" +
                "id=" + id +
                ", e_mail='" + e_mail + '\'' +
                ", humanDto=" + humanDto +
                '}';
    }
}


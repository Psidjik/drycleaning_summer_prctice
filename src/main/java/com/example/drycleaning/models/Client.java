package com.example.drycleaning.models;

import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "clients")
public class Client {
    @Id
    @Column(name = "client_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "email", length = 20, nullable = false)
    protected String e_mail;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "human_id", referencedColumnName = "human_id")
    private Human human;

    @OneToMany(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
    @JoinColumn(name = "client_id", referencedColumnName = "client_id")
    private List<Order> order;


    public Client(Integer id, String e_mail, Human human) {
        this.id = id;
        this.e_mail = e_mail;
        this.human = human;
    }

    public Client() {
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

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", e_mail='" + e_mail + '\'' +
                ", human=" + human +
                '}';
    }
}


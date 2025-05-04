package me.dio.snatander.day.work._5.model;

import jakarta.persistence.*;

@Entity(name = "tab_user")

public class Account {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(unique = true) // numero da conta é unico
        private String number;

        private String agencia;

        @Column(scale = 13, precision = 2)
        private float balance;

        @Column(name = "aditional_limit", scale = 13, precision = 2)
        private float limit;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public float getLimit() {
        return limit;
    }

    public void setLimit(float limit) {
        this.limit = limit;
    }
}





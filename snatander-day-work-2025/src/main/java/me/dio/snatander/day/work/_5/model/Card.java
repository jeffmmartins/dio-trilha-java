package me.dio.snatander.day.work._5.model;

import jakarta.persistence.*;

@Entity(name = "tab_user")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String cardNumber;

    @Column(scale = 13, precision = 2)
    private float cardLimit;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public float getCardLimit() {
        return cardLimit;
    }

    public void setCardLimit(float cardLimit) {
        this.cardLimit = cardLimit;
    }
}

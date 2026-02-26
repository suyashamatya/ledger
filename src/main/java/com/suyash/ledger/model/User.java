package com.suyash.ledger.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "users")
public class User {
    @Id
    private int id;

    private String name;
    private BigDecimal balance;

    // Constructors
    public User() {

    }

    public User(String name) {
        this.name = name;
        this.balance = BigDecimal.ZERO;
    }

    // Getters & Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public BigDecimal getBalance() { return balance; }
    public void setBalance(BigDecimal balance) { this.balance = balance; }


}

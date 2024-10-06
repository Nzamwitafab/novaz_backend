package com.novaz.novazimpl.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Wallet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long walletID;

    @OneToOne
    @JoinColumn(name = "traderID")
    private Trader trader;

    private Double balance;

    @ElementCollection
    private List<String> transactionHistory;

    public Wallet() {
    }

    public Wallet(Long walletID, Trader trader, Double balance, List<String> transactionHistory) {
        this.walletID = walletID;
        this.trader = trader;
        this.balance = balance;
        this.transactionHistory = transactionHistory;
    }

    public Long getWalletID() {
        return walletID;
    }

    public void setWalletID(Long walletID) {
        this.walletID = walletID;
    }

    public Trader getTrader() {
        return trader;
    }

    public void setTrader(Trader trader) {
        this.trader = trader;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public List<String> getTransactionHistory() {
        return transactionHistory;
    }

    public void setTransactionHistory(List<String> transactionHistory) {
        this.transactionHistory = transactionHistory;
    }

    // Getters and Setters

}

package com.novaz.novazimpl.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transactionID;

    @ManyToOne
    @JoinColumn(name = "buyerID")
    private Trader buyer; // Use Trader object instead of buyerID

    @ManyToOne
    @JoinColumn(name = "sellerID")
    private Trader seller; // Use Trader object instead of sellerID

    @ManyToOne
    @JoinColumn(name = "tokenID")
    private Token token;

    private Double transactionAmount;
    private Date date;
    private Double transactionFee;

    public Transaction() {
    }

    public Transaction(Long transactionID, Trader buyer, Trader seller, Token token, Double transactionAmount,
            Date date, Double transactionFee) {
        this.transactionID = transactionID;
        this.buyer = buyer;
        this.seller = seller;
        this.token = token;
        this.transactionAmount = transactionAmount;
        this.date = date;
        this.transactionFee = transactionFee;
    }

    public Long getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(Long transactionID) {
        this.transactionID = transactionID;
    }

    public Trader getBuyer() {
        return buyer;
    }

    public void setBuyer(Trader buyer) {
        this.buyer = buyer;
    }

    public Trader getSeller() {
        return seller;
    }

    public void setSeller(Trader seller) {
        this.seller = seller;
    }

    public Token getToken() {
        return token;
    }

    public void setToken(Token token) {
        this.token = token;
    }

    public Double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(Double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getTransactionFee() {
        return transactionFee;
    }

    public void setTransactionFee(Double transactionFee) {
        this.transactionFee = transactionFee;
    }

    // Getters and Setters

}

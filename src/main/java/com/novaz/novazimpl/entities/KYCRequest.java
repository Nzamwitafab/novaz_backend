package com.novaz.novazimpl.entities;

import jakarta.persistence.*;

@Entity
public class KYCRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long kycRequestID;

    @ManyToOne
    @JoinColumn(name = "traderID")
    private Trader trader;

    private String status;
    private String documentType;
    private String documentURL;

    public KYCRequest() {
    }

    public KYCRequest(Long kycRequestID, Trader trader, String status, String documentType, String documentURL) {
        this.kycRequestID = kycRequestID;
        this.trader = trader;
        this.status = status;
        this.documentType = documentType;
        this.documentURL = documentURL;
    }

    public Long getKycRequestID() {
        return kycRequestID;
    }

    public void setKycRequestID(Long kycRequestID) {
        this.kycRequestID = kycRequestID;
    }

    public Trader getTrader() {
        return trader;
    }

    public void setTrader(Trader trader) {
        this.trader = trader;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getDocumentURL() {
        return documentURL;
    }

    public void setDocumentURL(String documentURL) {
        this.documentURL = documentURL;
    }

    // Getters and Setters

}

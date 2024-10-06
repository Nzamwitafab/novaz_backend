package com.novaz.novazimpl.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Token {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tokenID;

    @ManyToOne
    @JoinColumn(name = "propertyID")
    private Property property;

    private Double fractionValue;
    private Long digitalCertificateID;

    @ElementCollection
    private List<String> ownershipHistory;

    public Token() {
    }

    public Token(Long tokenID, Property property, Double fractionValue, Long digitalCertificateID,
            List<String> ownershipHistory) {
        this.tokenID = tokenID;
        this.property = property;
        this.fractionValue = fractionValue;
        this.digitalCertificateID = digitalCertificateID;
        this.ownershipHistory = ownershipHistory;
    }

    public Long getTokenID() {
        return tokenID;
    }

    public void setTokenID(Long tokenID) {
        this.tokenID = tokenID;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public Double getFractionValue() {
        return fractionValue;
    }

    public void setFractionValue(Double fractionValue) {
        this.fractionValue = fractionValue;
    }

    public Long getDigitalCertificateID() {
        return digitalCertificateID;
    }

    public void setDigitalCertificateID(Long digitalCertificateID) {
        this.digitalCertificateID = digitalCertificateID;
    }

    public List<String> getOwnershipHistory() {
        return ownershipHistory;
    }

    public void setOwnershipHistory(List<String> ownershipHistory) {
        this.ownershipHistory = ownershipHistory;
    }

    // Getters and Setters

}

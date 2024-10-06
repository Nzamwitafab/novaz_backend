package com.novaz.novazimpl.entities;

import jakarta.persistence.*;

@Entity
public class Property {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long propertyID;

    @ManyToOne
    @JoinColumn(name = "ownerID")
    private Trader owner;

    private String address;
    private Double size;
    private Double valuation;
    private String valuationReport;

    public Property() {
    }

    public Property(Long propertyID, Trader owner, String address, Double size, Double valuation,
            String valuationReport) {
        this.propertyID = propertyID;
        this.owner = owner;
        this.address = address;
        this.size = size;
        this.valuation = valuation;
        this.valuationReport = valuationReport;
    }

    public Long getPropertyID() {
        return propertyID;
    }

    public void setPropertyID(Long propertyID) {
        this.propertyID = propertyID;
    }

    public Trader getOwner() {
        return owner;
    }

    public void setOwner(Trader owner) {
        this.owner = owner;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public Double getValuation() {
        return valuation;
    }

    public void setValuation(Double valuation) {
        this.valuation = valuation;
    }

    public String getValuationReport() {
        return valuationReport;
    }

    public void setValuationReport(String valuationReport) {
        this.valuationReport = valuationReport;
    }

    // Getters and Setters

}

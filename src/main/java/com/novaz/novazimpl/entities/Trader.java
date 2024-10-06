package com.novaz.novazimpl.entities;

import jakarta.persistence.*;

@Entity
public class Trader {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long traderID;

    private String email;
    private String password;
    private String kycStatus;
    private Long digitalCertificateID;
    private String proofOfAddress;

    public Trader() {
    }

    public Trader(Long traderID, String email, String password, String kycStatus, Long digitalCertificateID,
            String proofOfAddress) {
        this.traderID = traderID;
        this.email = email;
        this.password = password;
        this.kycStatus = kycStatus;
        this.digitalCertificateID = digitalCertificateID;
        this.proofOfAddress = proofOfAddress;
    }

    public Long getTraderID() {
        return traderID;
    }

    public void setTraderID(Long traderID) {
        this.traderID = traderID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getKycStatus() {
        return kycStatus;
    }

    public void setKycStatus(String kycStatus) {
        this.kycStatus = kycStatus;
    }

    public Long getDigitalCertificateID() {
        return digitalCertificateID;
    }

    public void setDigitalCertificateID(Long digitalCertificateID) {
        this.digitalCertificateID = digitalCertificateID;
    }

    public String getProofOfAddress() {
        return proofOfAddress;
    }

    public void setProofOfAddress(String proofOfAddress) {
        this.proofOfAddress = proofOfAddress;
    }

    // Getters and Setters

}

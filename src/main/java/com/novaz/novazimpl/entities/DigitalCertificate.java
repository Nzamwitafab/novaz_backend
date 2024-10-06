package com.novaz.novazimpl.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class DigitalCertificate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long certificateID;

    @ManyToOne
    @JoinColumn(name = "ownerID")
    private Trader owner;

    @ManyToOne
    @JoinColumn(name = "tokenID")
    private Token token;

    private Date issuedDate;
    private Boolean revoked;

    public DigitalCertificate() {
    }

    public DigitalCertificate(Long certificateID, Trader owner, Token token, Date issuedDate, Boolean revoked) {
        this.certificateID = certificateID;
        this.owner = owner;
        this.token = token;
        this.issuedDate = issuedDate;
        this.revoked = revoked;
    }

    public Long getCertificateID() {
        return certificateID;
    }

    public void setCertificateID(Long certificateID) {
        this.certificateID = certificateID;
    }

    public Trader getOwner() {
        return owner;
    }

    public void setOwner(Trader owner) {
        this.owner = owner;
    }

    public Token getToken() {
        return token;
    }

    public void setToken(Token token) {
        this.token = token;
    }

    public Date getIssuedDate() {
        return issuedDate;
    }

    public void setIssuedDate(Date issuedDate) {
        this.issuedDate = issuedDate;
    }

    public Boolean getRevoked() {
        return revoked;
    }

    public void setRevoked(Boolean revoked) {
        this.revoked = revoked;
    }

    // Getters and Setters

}

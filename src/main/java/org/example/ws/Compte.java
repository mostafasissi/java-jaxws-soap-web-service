package org.example.ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;

import java.util.Date;

@XmlRootElement(name = "compte")
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte {
    private int code;
    private Double solde;
    @XmlTransient
    private Date dateCreation;

    public Compte(int code, Double solde, Date dateCreation) {
        this.code = code;
        this.solde = solde;
        this.dateCreation = dateCreation;
    }
    public Compte(){

    }

    public int getCode() {
        return code;
    }

    public Double getSolde() {
        return solde;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setSolde(Double solde) {
        this.solde = solde;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
}

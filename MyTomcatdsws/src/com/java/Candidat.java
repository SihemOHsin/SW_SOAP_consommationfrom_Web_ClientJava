package com.java;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Candidat implements Serializable{
    private String numInscription;
    private String prenom;
    private String nom;
    private Date dateNaissance;
    private String adresseMail ;
    @XmlTransient
    private Date dateInscription;
    private String nomgroupe ;

    public Candidat() {
    }

    public Candidat(String numInscription, String prenom, String nom, Date dateNaissance, String adresseMail, Date dateInscription, String nomgroupe) {
        this.numInscription = numInscription;
        this.prenom = prenom;
        this.nom = nom;
        this.dateNaissance = dateNaissance;
        this.adresseMail = adresseMail;
        this.dateInscription = dateInscription;
        this.nomgroupe = nomgroupe;
    }

	public String getNumInscription() {
		return numInscription;
	}

	public void setNumInscription(String numInscription) {
		this.numInscription = numInscription;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getAdresseMail() {
		return adresseMail;
	}

	public void setAdresseMail(String adresseMail) {
		this.adresseMail = adresseMail;
	}

	public Date getDateInscription() {
		return dateInscription;
	}

	public void setDateInscription(Date dateInscription) {
		this.dateInscription = dateInscription;
	}

	public String getNomgroupe() {
		return nomgroupe;
	}

	public void setNomgroupe(String nomgroupe) {
		this.nomgroupe = nomgroupe;
	}

	@Override
	public String toString() {
		return "Candidat [numInscription=" + numInscription + ", prenom=" + prenom + ", nom=" + nom + ", dateNaissance="
				+ dateNaissance + ", adresseMail=" + adresseMail + ", dateInscription=" + dateInscription
				+ ", nomgroupe=" + nomgroupe + "]";
	}
    
}

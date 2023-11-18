
package com.java;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour candidat complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="candidat">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numInscription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prenom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateNaissance" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="adresseMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomgroupe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "candidat", propOrder = {
    "numInscription",
    "prenom",
    "nom",
    "dateNaissance",
    "adresseMail",
    "nomgroupe"
})
public class Candidat {

    protected String numInscription;
    protected String prenom;
    protected String nom;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateNaissance;
    protected String adresseMail;
    protected String nomgroupe;

    /**
     * Obtient la valeur de la propriété numInscription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumInscription() {
        return numInscription;
    }

    /**
     * Définit la valeur de la propriété numInscription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumInscription(String value) {
        this.numInscription = value;
    }

    /**
     * Obtient la valeur de la propriété prenom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Définit la valeur de la propriété prenom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrenom(String value) {
        this.prenom = value;
    }

    /**
     * Obtient la valeur de la propriété nom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNom() {
        return nom;
    }

    /**
     * Définit la valeur de la propriété nom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNom(String value) {
        this.nom = value;
    }

    /**
     * Obtient la valeur de la propriété dateNaissance.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateNaissance() {
        return dateNaissance;
    }

    /**
     * Définit la valeur de la propriété dateNaissance.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateNaissance(XMLGregorianCalendar value) {
        this.dateNaissance = value;
    }

    /**
     * Obtient la valeur de la propriété adresseMail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdresseMail() {
        return adresseMail;
    }

    /**
     * Définit la valeur de la propriété adresseMail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdresseMail(String value) {
        this.adresseMail = value;
    }

    /**
     * Obtient la valeur de la propriété nomgroupe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomgroupe() {
        return nomgroupe;
    }

    /**
     * Définit la valeur de la propriété nomgroupe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomgroupe(String value) {
        this.nomgroupe = value;
    }

}

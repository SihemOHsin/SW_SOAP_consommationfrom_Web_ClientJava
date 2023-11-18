
package com.java;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getNoteEtudiant complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getNoteEtudiant">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numInscription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomMatiere" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getNoteEtudiant", propOrder = {
    "numInscription",
    "nomMatiere"
})
public class GetNoteEtudiant {

    protected String numInscription;
    protected String nomMatiere;

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
     * Obtient la valeur de la propriété nomMatiere.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomMatiere() {
        return nomMatiere;
    }

    /**
     * Définit la valeur de la propriété nomMatiere.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomMatiere(String value) {
        this.nomMatiere = value;
    }

}

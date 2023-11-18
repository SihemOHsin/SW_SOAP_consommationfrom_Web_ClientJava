
package com.java;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getAllNoteMatiere complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getAllNoteMatiere">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
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
@XmlType(name = "getAllNoteMatiere", propOrder = {
    "nomMatiere"
})
public class GetAllNoteMatiere {

    protected String nomMatiere;

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

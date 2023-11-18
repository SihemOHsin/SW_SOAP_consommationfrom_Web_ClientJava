
package com.java;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getInfoEtudiant complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getInfoEtudiant">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numInscription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getInfoEtudiant", propOrder = {
    "numInscription"
})
public class GetInfoEtudiant {

    protected String numInscription;

    /**
     * Obtient la valeur de la propri�t� numInscription.
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
     * D�finit la valeur de la propri�t� numInscription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumInscription(String value) {
        this.numInscription = value;
    }

}

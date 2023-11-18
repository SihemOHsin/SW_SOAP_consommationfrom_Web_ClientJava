
package com.java;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour note complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="note">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="candidat" type="{http://java.com/}candidat" minOccurs="0"/>
 *         &lt;element name="dateEpreuve" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="idNote" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="matiere" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "note", propOrder = {
    "candidat",
    "dateEpreuve",
    "idNote",
    "matiere",
    "note"
})
public class Note {

    protected Candidat candidat;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateEpreuve;
    protected Long idNote;
    protected String matiere;
    protected double note;

    /**
     * Obtient la valeur de la propriété candidat.
     * 
     * @return
     *     possible object is
     *     {@link Candidat }
     *     
     */
    public Candidat getCandidat() {
        return candidat;
    }

    /**
     * Définit la valeur de la propriété candidat.
     * 
     * @param value
     *     allowed object is
     *     {@link Candidat }
     *     
     */
    public void setCandidat(Candidat value) {
        this.candidat = value;
    }

    /**
     * Obtient la valeur de la propriété dateEpreuve.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateEpreuve() {
        return dateEpreuve;
    }

    /**
     * Définit la valeur de la propriété dateEpreuve.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateEpreuve(XMLGregorianCalendar value) {
        this.dateEpreuve = value;
    }

    /**
     * Obtient la valeur de la propriété idNote.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdNote() {
        return idNote;
    }

    /**
     * Définit la valeur de la propriété idNote.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdNote(Long value) {
        this.idNote = value;
    }

    /**
     * Obtient la valeur de la propriété matiere.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatiere() {
        return matiere;
    }

    /**
     * Définit la valeur de la propriété matiere.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatiere(String value) {
        this.matiere = value;
    }

    /**
     * Obtient la valeur de la propriété note.
     * 
     */
    public double getNote() {
        return note;
    }

    /**
     * Définit la valeur de la propriété note.
     * 
     */
    public void setNote(double value) {
        this.note = value;
    }

}

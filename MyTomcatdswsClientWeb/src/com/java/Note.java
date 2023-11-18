
package com.java;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour note complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
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
     * Obtient la valeur de la propri�t� candidat.
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
     * D�finit la valeur de la propri�t� candidat.
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
     * Obtient la valeur de la propri�t� dateEpreuve.
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
     * D�finit la valeur de la propri�t� dateEpreuve.
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
     * Obtient la valeur de la propri�t� idNote.
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
     * D�finit la valeur de la propri�t� idNote.
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
     * Obtient la valeur de la propri�t� matiere.
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
     * D�finit la valeur de la propri�t� matiere.
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
     * Obtient la valeur de la propri�t� note.
     * 
     */
    public double getNote() {
        return note;
    }

    /**
     * D�finit la valeur de la propri�t� note.
     * 
     */
    public void setNote(double value) {
        this.note = value;
    }

}

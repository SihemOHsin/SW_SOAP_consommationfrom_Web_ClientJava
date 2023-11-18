package com.java;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Note implements Serializable{
    private Long idNote;
    private String matiere;
    private Date dateEpreuve;
    private double note ;
    private Candidat candidat;

    public Note() {
    }

    public Note(Long idNote, String matiere, Date dateEpreuve, double note, Candidat candidat) {
        this.idNote = idNote;
        this.matiere = matiere;
        this.dateEpreuve = dateEpreuve;
        this.note = note;
        this.candidat = candidat;
    }

    public Candidat getCandidat() {
		return candidat;
	}

	public void setCandidat(Candidat candidat) {
		this.candidat = candidat;
	}

	public Long getIdNote() {
        return idNote;
    }

    public void setIdNote(Long idNote) {
        this.idNote = idNote;
    }

    public String getMatiere() {
        return matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    public Date getDateEpreuve() {
        return dateEpreuve;
    }

    public void setDateEpreuve(Date dateEpreuve) {
        this.dateEpreuve = dateEpreuve;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Note{" +
                "idNote=" + idNote +
                ", matiere='" + matiere + '\'' +
                ", dateEpreuve=" + dateEpreuve +
                ", note=" + note +
                '}';
    }
}

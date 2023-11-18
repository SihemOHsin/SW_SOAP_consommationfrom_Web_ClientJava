package com.java;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
public class GestionNotes {
	
    private ArrayList<Note> notes = new ArrayList<Note>();
    public GestionNotes() {

        // ajou data for test saoui
        notes.add(new Note(1L, "Math", new Date(), 5.0, new Candidat("11", "hsin", "sihem",new Date(),"sihemouledhsin@gmail.com",new Date(),"lti04")));
        notes.add(new Note(2L, "soa", new Date(), 10.0, new Candidat("22", "daoud", "maryam",new Date(),"maryam@gmail.com",new Date(),"l01")));
        notes.add(new Note(1L, "soa", new Date(), 20.0, new Candidat("11", "hsin", "sihem",new Date(),"sihemouledhsin@gmail.com",new Date(),"lti04")));
        notes.add(new Note(1L, "Java", new Date(), 15.0, new Candidat("11", "hsin", "sihem",new Date(),"sihemouledhsin@gmail.com",new Date(),"lti04")));

       /* notes.add(new Note(1L, "net", new Date(), 5.0, new Candidat("11", "hsin", "sihem",new Date(),"sihemouledhsin@gmail.com",new Date(),"lti04")));
        notes.add(new Note(2L, "soa", new Date(), 10.0, new Candidat("22", "daoud", "maryam",new Date(),"maryam@gmail.com",new Date(),"l01")));
        notes.add(new Note(1L, "soa", new Date(), 20.0, new Candidat("11", "hsin", "sihem",new Date(),"sihemouledhsin@gmail.com",new Date(),"lti04")));
        notes.add(new Note(1L, "Java", new Date(), 15.0, new Candidat("11", "hsin", "sihem",new Date(),"sihemouledhsin@gmail.com",new Date(),"lti04")));

        notes.add(new Note(1L, "Math", new Date(), 5.0, new Candidat("33", "test", "salem",new Date(),"sihemouledhsin@gmail.com",new Date(),"lti04")));
        notes.add(new Note(2L, "soa", new Date(), 10.0, new Candidat("44", "zayeni", "safa",new Date(),"maryam@gmail.com",new Date(),"l01")));
        notes.add(new Note(1L, "soa", new Date(), 20.0, new Candidat("55", "houda", "ali",new Date(),"sihemouledhsin@gmail.com",new Date(),"lti04")));
        notes.add(new Note(1L, "Java", new Date(), 15.0, new Candidat("66", "h", "sihem",new Date(),"sihemouledhsin@gmail.com",new Date(),"lti04")));

        notes.add(new Note(1L, "Java", new Date(), 15.0, new Candidat("11", "Ali", "Mohamed", new Date(), "ali.mohamed@email.com", new Date(), "lti01")));
        notes.add(new Note(2L, "C++", new Date(), 14.5, new Candidat("12", "Mahmoud", "Ahmed", new Date(), "mahmoud.ahmed@email.com", new Date(), "lti02")));
        notes.add(new Note(3L, "Python", new Date(), 13.8, new Candidat("13", "Fatima", "Youssef", new Date(), "fatima.youssef@email.com", new Date(), "lti03")));
        notes.add(new Note(4L, "JavaScript", new Date(), 16.2, new Candidat("14", "Aisha", "Mustafa", new Date(), "aisha.mustafa@email.com", new Date(), "lti04")));
        notes.add(new Note(5L, "HTML", new Date(), 14.0, new Candidat("15", "Mohsen", "Amin", new Date(), "mohsen.amin@email.com", new Date(), "lti05")));
        notes.add(new Note(6L, "CSS", new Date(), 15.5, new Candidat("16", "Nour", "Ramadan", new Date(), "nour.ramadan@email.com", new Date(), "lti06")));
        notes.add(new Note(7L, "SQL", new Date(), 14.7, new Candidat("17", "Ahmed", "Abdullah", new Date(), "ahmad.abdullah@email.com", new Date(), "lti07")));
        notes.add(new Note(8L, "React", new Date(), 16.8, new Candidat("18", "Sara", "Hassan", new Date(), "sara.hasan@email.com", new Date(), "lti08")));
        notes.add(new Note(9L, "Angular", new Date(), 15.3, new Candidat("19", "Omar", "Saleh", new Date(), "omar.saleh@email.com", new Date(), "lti09")));
        notes.add(new Note(10L, "Node.js", new Date(), 16.1, new Candidat("20", "Jamal", "Khaled", new Date(), "jamal.khaled@email.com", new Date(), "lti10")));
*/
    }

	@WebMethod
    public Candidat getInfoEtudiant(@WebParam(name = "numInscription") String numInscription) {
        for (Note note : notes) {
            if (numInscription.equals(note.getCandidat().getNumInscription())) {
                return note.getCandidat();
            }
        }
        throw new IllegalArgumentException("Candidat n'existe pas pour ce numéro d'inscription : " + numInscription);
    }

	@WebMethod
    public Note getNoteEtudiant(@WebParam(name = "numInscription") String numInscription, @WebParam(name = "nomMatiere") String nomMatiere) {
        for (Note note : notes) {
            if (numInscription.equals(note.getCandidat().getNumInscription()) && nomMatiere.equals(note.getMatiere())) {
                return note;
            }
        }
        throw new IllegalArgumentException("Note n'existe pas pour ce numéro d'inscription : " + numInscription + " et nom de matière : " + nomMatiere);
    }

	@WebMethod
    public List<Note> getAllNotes() {
        //List<Note> notes = new ArrayList<Note>();
        //notes.add(new Note(1L, "Math", new Date(), 5.0, new Candidat("11", "hsin", "sihem", new Date(), "sihemouledhsin@gmail.com", new Date(), "lti04")));
        //notes.add(new Note(2L, "soa", new Date(), 10.0, new Candidat("22", "daoud", "maryam", new Date(), "maryam@gmail.com", new Date(), "l01")));
        return notes;
    }

	@WebMethod
    public List<Note> getAllNoteMatiere(@WebParam(name = "nomMatiere") String nomMatiere) {
        List<Note> res = new ArrayList<Note>();
        for (Note note : notes) {
            if (nomMatiere.equals(note.getMatiere())) {
                res.add(note);
            }
        }
        if (res.isEmpty()) {
            throw new IllegalArgumentException("Aucune note trouvée pour le nom de la matière : " + nomMatiere);
        }
        return res;
    }
}

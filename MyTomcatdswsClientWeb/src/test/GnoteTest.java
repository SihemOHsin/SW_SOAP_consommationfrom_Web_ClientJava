package test;

import java.util.List;

import javax.servlet.http.HttpServlet;

import com.java.Candidat;
import com.java.GestionNotes;
import com.java.GestionNotesService;
import com.java.Note;

public class GnoteTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GestionNotes stub = new GestionNotesService().getGestionNotesPort();
		String matiere = "soa";

        List<Note> notesMatiere = stub.getAllNoteMatiere(matiere);

        if (notesMatiere != null && !notesMatiere.isEmpty()) {
            System.out.println("Liste des notesMatiere :" + matiere);
            for (Note noteM : notesMatiere) {
                System.out.println("id note: " + noteM.getIdNote());
                System.out.println("Date Epreuve: " + noteM.getDateEpreuve());
                System.out.println("Note: " + noteM.getNote());
                System.out.println();
            }
        } else {
            System.out.println("Not found matiere: " + matiere);
        }}}
		/*
		 GestionNotes stub = new GestionNotesService().getGestionNotesPort();
		 
		String numInscription = "22";
        String matiereEtd = "soa";

        Note noteEtd = stub.getNoteEtudiant(numInscription, matiereEtd);

        if (noteEtd != null) {
            System.out.println("Note de l'etd (numInscription): " + numInscription + " & Matiere: " + matiereEtd);
            System.out.println("Note: " + noteEtd.getNote());

        } else {
            System.out.println("Not found pour etd (numInscription): " + numInscription + " et Matiere: " + matiereEtd);
        }
	}}

		/*		GestionNotes stub = new GestionNotesService().getGestionNotesPort();
        String numInscription = "22";

        if (numInscription != null && !numInscription.isEmpty()) {

            Candidat candidat = stub.getInfoEtudiant(numInscription);
System.out.println(candidat);
System.out.println(candidat.getNom());

System.out.println(candidat.getAdresseMail());
System.out.println(candidat.getNomgroupe());
System.out.println(candidat.getNumInscription());



        }}
		
		GestionNotes stub = new GestionNotesService().getGestionNotesPort();
		List<Note> notes = stub.getAllNotes();
		System.out.println("note");
		System.out.println(notes);


		if (notes != null && !notes.isEmpty()) {
			System.out.println("liste des notes:");
			for (Note note : notes) {
				System.out.println("ID note: " + note.getIdNote());
				System.out.println("Matiere: " + note.getMatiere());
				System.out.println("Date Epreuve: " + note.getDateEpreuve());
				System.out.println("Note: " + note.getNote());
				System.out.println();
			}
		} else {
			System.out.println("not found");
		}

	}*/
		



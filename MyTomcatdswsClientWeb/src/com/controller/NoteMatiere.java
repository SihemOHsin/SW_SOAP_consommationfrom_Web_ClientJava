package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.GestionNotes;
import com.java.GestionNotesService;
import com.java.Note;

/**
 * Servlet implementation class NoteMatiere
 */
@WebServlet("/NoteMatiere")
public class NoteMatiere extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NoteMatiere() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		GestionNotes stub = new GestionNotesService().getGestionNotesPort();
        String matiere = request.getParameter("matiere"); 

        List<Note> notesMatiere = stub.getAllNoteMatiere(matiere);

        if (notesMatiere != null && !notesMatiere.isEmpty()) {
            request.setAttribute("notesMatiere", notesMatiere);
        } else {
            request.setAttribute("matiereNotFound", true);
        }

        request.getRequestDispatcher("noteMatiere.jsp").forward(request, response);
    }
}
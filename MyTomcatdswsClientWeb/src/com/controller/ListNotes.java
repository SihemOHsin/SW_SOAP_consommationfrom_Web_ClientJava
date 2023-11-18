package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.java.GestionNotes;
import com.java.GestionNotesService;
import com.java.Note;

/**
 * Servlet implementation class ListNotes
 */
@WebServlet("/ListNotes")
public class ListNotes extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//GestionNotesService service;
    //GestionNotes gestion_notes;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListNotes() {
        super();
        // TODO Auto-generated constructor stub
        //service = new GestionNotesService();
        //gestion_notes = service.getGestionNotesPort();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
    	GestionNotes stub = new GestionNotesService().getGestionNotesPort();

        List<Note> notes = stub.getAllNotes();

	    request.setAttribute("notes", notes);

	    // Forward the request to the JSP
	    RequestDispatcher dispatcher = request.getRequestDispatcher("listNotes.jsp");
	    dispatcher.forward(request, response);	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

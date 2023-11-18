package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.Candidat;
import com.java.GestionNotes;
import com.java.GestionNotesService;

/**
 * Servlet implementation class InfoCandidat
 */
@WebServlet("/InfoCandidat")
public class InfoCandidat extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InfoCandidat() {
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
        String numInscription = request.getParameter("numInscription");

        if (numInscription != null && !numInscription.isEmpty()) {

            Candidat candidat = stub.getInfoEtudiant(numInscription);

            if (candidat != null) {
                request.setAttribute("candidat", candidat);
            } else {

                request.setAttribute("candidatNotFound", true);
            }
        } else {
            // Handle the case when input is missing or empty
            request.setAttribute("searchInputInvalid", true);
        }
        request.getRequestDispatcher("info.jsp").forward(request, response);
 
	}
}









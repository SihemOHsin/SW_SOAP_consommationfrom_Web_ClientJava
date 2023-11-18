<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="com.java.Note" %>
<%@ include file="menu.jsp" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Results</title>
</head>
<body>
    <div class="container">
        <h1>note</h1>

        <form action="NoteEtudiant" method="post">
            <label for="numInscription">Num Inscription:</label>
            <input type="text" id="numInscription" name="numInscription">
            <label for="matiere">Matiere:</label>
            <input type="text" id="matiere" name="matiere">
            <input type="submit" value="Get Note Etudiant avec ID et Matiere">
        </form>

        <hr>

        <div class="alert alert-info">
            <%
                Note noteEtd = (Note) request.getAttribute("noteEtd");

                if (noteEtd != null) {
            %>
                <p>Note: <%= noteEtd.getNote() %></p>
            <%
                } else if (request.getAttribute("noteEtdNotFound") != null) {
            %>
                <p>Note n'existe pas</p>
            <%
                }
            %>
        </div>
    </div>
</body>
</html>

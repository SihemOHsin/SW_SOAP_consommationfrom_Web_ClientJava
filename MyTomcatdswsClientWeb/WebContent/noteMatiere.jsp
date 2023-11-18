<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="com.java.Note, java.util.List" %>
<%@ include file="menu.jsp" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Results</title>
</head>
<body>
    <div class="container">
        <h1>Liste des Notes par Matiere</h1>

        <form action="NoteMatiere" method="post">
            <label for="matiere">Matiere:</label>
            <input type="text" id="matiere" name="matiere">
            <input type="submit" value="Get Notes Matiere">
        </form>

        <hr>

        <div>
            <%
            List<Note> notesMatiere = (List<Note>) request.getAttribute("notesMatiere");

            if (notesMatiere != null && !notesMatiere.isEmpty()) {
            %>
            <table class="table table-bordered">
                <tr>
                    <th>ID Note</th>
                    <th>Date Epreuve</th>
                    <th>Note</th>
                </tr>
                <%
                for (Note note : notesMatiere) {
                %>
                <tr>
                    <td><%= note.getIdNote() %></td>
                    <td><%= note.getDateEpreuve() %></td>
                    <td><%= note.getNote() %></td>
                </tr>
                <%
                }
                %>
            </table>
            <%
            } else if (request.getAttribute("matiereNotFound") != null) {
            %>
            <p>Matiere not found</p>
            <%
            }
            %>
        </div>
    </div>
</body>
</html>

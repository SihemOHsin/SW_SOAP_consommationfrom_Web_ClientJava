<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="com.java.Candidat" %>
    	<%@include file="menu.jsp" %>


<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Candidat Information</title>
</head>
<body>
    <div class="container">
<br>
    <h1>Information de Candidat </h1>
<br>
    <form action="InfoCandidat" method="post">
        <label for="numInscription">Donner un ID:</label>
        <input type="text" id="numInscription" name="numInscription">
        <input type="submit" value="Voir Info">
    </form>

    <%
        Candidat candidat = (Candidat) request.getAttribute("candidat");

        if ( candidat != null) {
    %>
    <table class="table table-bordered table-info">
  <thead>
        <tr>
            <th>ID Etudiant</th>
            <td><%= candidat.getNumInscription() %></td>
        </tr>
        <tr>
            <th>Nom</th>
            <td><%= candidat.getPrenom() %></td>
        </tr>
        <tr>
            <th>Prenon</th>
            <td><%= candidat.getNom() %></td>
        </tr>
        <tr>
            <th>Date naissance</th>
            <td><%= candidat.getDateNaissance() %></td>
        </tr>
        <tr>
            <th>Email</th>
            <td><%= candidat.getAdresseMail() %></td>
        </tr>
        <tr>
            <th>Nom de Groupe</th>
            <td><%= candidat.getNomgroupe() %></td>
        </tr>
          </thead>     
    </table>
    <%
        } else {
    %>
    <p>Candidat n'exist pas</p>
    <%
        }
    %>
    </div>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="com.java.Note , java.util.List" %>
    	<%@include file="menu.jsp" %>

<!DOCTYPE html>
<html>
<head>
    <title>Liste des Notes</title>
</head>
<body>
    <div class="container">
<br>
    <h1>Liste des Notes</h1>
    <br>
    <table id="example" class="table table-striped" style="width:100%">      
        <thead>
        <tr>
            <th>Candidat</th>
            <th>Matiere</th>
            <th>Date Epreuve</th>
            <th>Note</th>
        </tr>
        </thead>
        <tbody>
        <%
            List<Note> notes = (List<Note>) request.getAttribute("notes");

            if (notes != null && !notes.isEmpty()) {
                for (Note note : notes) {
        %>
        
                <tr>
                    <td><%= note.getCandidat().getNom() %></td>
                    <td><%= note.getMatiere() %></td>
                    <td><%= note.getDateEpreuve() %></td>
                    <td><%= note.getNote() %></td>
                </tr>
                </tbody>

    
        <%
                }
            } else {
        %>
                <tr>
                    <td colspan="4">No notes </td>
                </tr>
        <%
            }
        %>
                  <tfoot>
        <tr>
                <th>Nom</th>
                <th>Matiere</th>
                <th>Date</th>
                <th>Note</th>
            </tr>
        </tfoot>
    </table>
    </div>
<script>
$('#example').DataTable({
    "paging": true, 
    "pageLength": 5, 
    "searching": true, 
    "ordering": true, 
    
});
</script>

</body>
</html>

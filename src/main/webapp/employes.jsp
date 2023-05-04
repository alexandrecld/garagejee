<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Employés</title>
</head>
<body>
    <h1>Liste des employés</h1>
    <table>
        <tr>
            <th>ID</th>
            <th>Type</th>
            <th>Nom</th>
        </tr>
        <%-- Itérer sur les employés et les afficher --%>
        <c:forEach var="employe" items="${employes}">
            <tr>
                <td>${employe.id}</td>
                <td>${employe.type}</td>
                <td>${employe.nom}</td>
            </tr>
        </c:forEach>
    </table>

    <h2>Ajouter un nouvel employé</h2>
    <form action="${pageContext.request.contextPath}/employes" method="post">
        <label for="type">Type:</label>
        <input type="text" id="type" name="type" required>
        <br>
        <label for="nom">Nom:</label>
        <input type="text" id="nom" name="nom" required>
        <br>
        <input type="submit" value="Ajouter">
    </form>
</body>
</html>

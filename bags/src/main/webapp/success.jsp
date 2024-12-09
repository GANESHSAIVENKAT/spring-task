<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ListOfBagNames</title>
</head>
<body>
        <form>
        <label for="bag">Select a Bag:</label>
        <select id="bag" name="bagName">
            <c:forEach var="bags" items="${bagnames}">
             
                <option>${bags}</option>
            </c:forEach>
        </select>
    </form>
</body>
</html>
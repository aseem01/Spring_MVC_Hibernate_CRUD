<%-- 
    Document   : employeelist
    Created on : Feb 16, 2018, 9:49:01 PM
    Author     : Aseem
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EmployeeList</title>
    </head>
    <body>
    <center> <h1>Employee List</h1></center>
    <table align="center" table border="2" width="70%" cellpadding="2">
        <tr>
            <th>Name</th>
            <th>Salary</th>
            <th>Designation</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        
        <c:forEach items="${elist}" var="emp">
            <tr>
                
                <td>${emp.name}</td>
                <td>${emp.salary}</td>
                <td>${emp.designation}</td>
                <td><a href="editemp?id=${emp.id}">Edit</a></td>
                <td><a href="deleteemp?id=${emp.id}">Delete</a></td>
                
            </tr>
        </c:forEach>
        
    </table>
    </body>
</html>

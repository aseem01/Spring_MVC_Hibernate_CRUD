<%-- 
    Document   : employeeform
    Created on : Feb 16, 2018, 7:19:00 PM
    Author     : Aseem
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center> <h1>Edit Employee</h1></center>
    <form method="post" action="Edit" ModelAttribute="User">
        <table align="center">
            <tr>  
                <td></td>    
                <td><input type="hidden"  name="id"  value="${user.id}"/></td>  
            </tr>   
            <tr>
                <td>Name</td>
                <td><input type="text" name="name" value="${user.name}"</td>
            </tr>

            <tr>
                <td>Salary</td>
                <td><input type="text" name="salary" value="${user.salary}"</td>
            </tr>

            <tr>
                <td>Designation</td>
                <td><input type="text" name="designation" value="${user.designation}"</td>
            </tr>

            <tr>
                <td></td>
                <td><input type="submit" value="Edit Save"</td>
            </tr>


        </table>
    </form>
</body>
</html>

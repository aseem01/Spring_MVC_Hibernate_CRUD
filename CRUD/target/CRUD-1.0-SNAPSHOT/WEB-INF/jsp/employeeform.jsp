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
    <center> <h1>Add New Employee</h1></center>
        <form method="post" action="save" ModelAttribute="User">
            <table align="center">
                <tr>
                    <td>Name</td>
                    <td><input type="text" name="name"</td>
                </tr>
                
                <tr>
                    <td>Salary</td>
                    <td><input type="text" name="salary"</td>
                </tr>
                
                <tr>
                    <td>Designation</td>
                    <td><input type="text" name="designation"</td>
                </tr>
                
                <tr>
                    <td></td>
                    <td><input type="submit" value="save"</td>
                </tr>
                
                
            </table>
        </form>
    </body>
</html>

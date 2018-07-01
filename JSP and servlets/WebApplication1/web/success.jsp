<%-- 
    Document   : success
    Created on : Jun 22, 2018, 12:07:12 PM
    Author     : cb.en.u4cse16307
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <style>
            form.ex1 {
                margin-left: 100px;
            }
            h1.ex1{
                margin-left: 100px;
            }
        </style>
        <br/>
        <h1 class="ex1">Login</h1>
        <br>
        <hr>
        <br>
        <br>
        <!-- ${un} -->

        <%=request.getParameter("username")%>

        logged in Successfully 


    </body>
</html>


<%-- 
    Document   : login
    Created on : Jun 22, 2018, 12:04:11 PM
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

        <form  class="ex1" action="./login" method="POST">
            Username: <input type="text" name="username">
            <br>
            <br>
            Password: <input type="password" name="password">
            <br>

            <br>
            <br>
            <input type="submit"> 
            <br>
        </form>


    </body>
</html>

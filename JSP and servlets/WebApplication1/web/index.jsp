<%-- 
    Document   : index
    Created on : Jun 22, 2018, 11:10:08 AM
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
        <h1 class="ex1">Welcome</h1>
        <br>
        <hr>
        <br>
        <br>

        <form  class="ex1" action="./NewServlet" method="GET">
            Username: <input type="text" name="username">
            <br>
            <br>
            Password: <input type="password" name="password">
            <br>
            <br>
            Institution:
            <select name = "institution">
                <option>SSN</option>
                <option>Amrita</option>
            </select>
            <br>
            <br>
            Checkbox: 
            <br>
            <input name="cb1" type ="checkbox" value="cb1"> choice 1
            <br>
            <input name="cb2" type ="checkbox" value="cb2"> choice 2
            <br>
            <br>
            Gender:
            <br>
            <input type="radio" name="gender" value="male" checked> Male<br>
            <input type="radio" name="gender" value="female"> Female<br>
            <br>
            <br>
            Description:
            <br>
            <textarea  value="description">
            </textarea>
            <br>
            <br>
            <input type="submit"> 
            <br>
        </form>


    </body>
</html>

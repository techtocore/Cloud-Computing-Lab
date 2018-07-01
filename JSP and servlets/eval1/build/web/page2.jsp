<%-- 
    Document   : page2
    Created on : 29 Jun, 2018, 10:35:47 AM
    Author     : akash
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
        <h1 class="ex1">Check BMI</h1>
        <br>
        <hr>
        <br>
        <br>

        <form  class="ex1" method="GET">
            First Name: <input type="text" name="fn">
            <br>
            <br>
            Last Name: <input type="text" name="ln">
            <br>
            <br>
            DOB: <input type="text" name="dob">
            <br>
            <br>
            Gender: <input type="radio" name="gender" value="male" checked="checked" />     Male        <input type="radio" name="gender" value="female" />     Female
            <br>
            <br>
            Height: <input type="text" name="h">
            <br>
            <br>
            Weight: <input type="text" name="w">
            <br>
            <br>
            <br>
            <input type="submit"> 
            <br>
        </form>

        <br>
        <br>



        <%-- start web service invocation --%><hr/>
        <%
            try {
                akash.WebService1_Service service = new akash.WebService1_Service();
                akash.WebService1 port = service.getWebService1Port();
                // TODO initialize WS operation arguments here
                java.lang.String arg0 = request.getParameter("dob");
                // TODO process result here
                boolean result = port.dateCheck(arg0);
                //out.println("Result = "+result);
                if (result) {
                    // out.println("yes");
                    String gen = request.getParameter("gender");
                    String w = request.getParameter("w");
                    String h = request.getParameter("h");
                    boolean chk = port.bmi(gen, w, h);
                    
                    if(chk)
                    {
                         out.println("      BMI is High");
                    }
                    else 
                    {
                         out.println("      BMI is low");
                    }

                } else {
                    out.println("Invalid date");
                }
            } catch (Exception ex) {
                // TODO handle custom exceptions here
            }
        %>
        <%-- end web service invocation --%><hr/>
        <br>
        <br>
    </body>
</html>

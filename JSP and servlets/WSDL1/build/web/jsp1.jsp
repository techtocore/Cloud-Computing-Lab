<%-- 
    Document   : jsp1
    Created on : 28 Jun, 2018, 12:25:40 PM
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
        <br>
        <h1 class ="ex1">Service Consumer</h1>
        <br>
        <hr>
        <br>
        <form class="ex1"  method="GET">
            <br>
            Operand 1: <input type="text" name="operand1">
            <br>
            <br>
            Operand 2: <input type="text" name="operand2">
            <br>
            <br>
            Operator: <input type="text" name="operator">
            <br>
            <br>
            <input type="submit">


        </form>
        <br>
        <br>

        <%
            try {
                org.tempuri.Calculator service = new org.tempuri.Calculator();
                org.tempuri.CalculatorSoap port = service.getCalculatorSoap();
                // TODO initialize WS operation arguments here
                String a = request.getParameter("operand1");
                String b = request.getParameter("operand2");

                int intA = Integer.parseInt(a);
                int intB = Integer.parseInt(b);
                // TODO process result here
                int result = port.add(intA, intB);
                out.println("       Result = " + result);
            } catch (Exception ex) {
                // TODO handle custom exceptions here
                //out.println(ex);
            }
            // request.getSession.SetAttribute("attr",result);
%>

    </body>
</html>

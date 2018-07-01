<%-- 
    Document   : process
    Created on : 28 Jun, 2018, 12:51:22 PM
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
        <h1>Webserver Response</h1>
        
        <%-- start web service invocation --%><hr/>
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
                out.println("Result = " + result);
            } catch (Exception ex) {
                // TODO handle custom exceptions here
            }
           // request.getSession.SetAttribute("attr",result);
        %>
        <br>
        <%-- end web service invocation --%><hr/>

    </body>
</html>

<%-- 
    Document   : test
    Created on : 23 Jun, 2018, 10:09:13 AM
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
        <h1>Hello World!</h1>
    <%-- start web service invocation --%><hr/>
    
    <%
    try {
	akash.NewWebService_Service service = new akash.NewWebService_Service();
	akash.NewWebService port = service.getNewWebServicePort();
	 // TODO initialize WS operation arguments here
	java.lang.String name = request.getParameter("email");
	// TODO process result here
	java.lang.String result = port.hello(name);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    </body>
</html>

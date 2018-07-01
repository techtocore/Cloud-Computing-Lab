<%-- 
    Document   : page1
    Created on : 29 Jun, 2018, 10:14:02 AM
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
        <h1 class="ex1">Hi There!</h1>
        <br>
        <form class="ex1" method="GET">

            <input type="text" name="name" size="15" pattern="[a-zA-Z]" placeholder="Enter Name">
            <br>
            <br>
            <input type="reset" value="Reset">
            <br>
            <br>
            <input type="submit">

        </form>

        <br>
        <br>
        <hr>
        <br>
        <br>
        <%
            try {
                akash.WebService1_Service service = new akash.WebService1_Service();
                akash.WebService1 port = service.getWebService1Port();
                // TODO initialize WS operation arguments here
                java.lang.String name = request.getParameter("name");
                // TODO process result here
                boolean result = port.nameCheck(name);
                //out.println("Result = "+result);
                if (result) {

                    response.sendRedirect("page2.jsp");
                } else {
                    out.println("<script>");
                    out.println("alert(\"Invalid name\");");
                    out.println("</script>");
                }

            } catch (Exception ex) {
                // TODO handle custom exceptions here
                System.out.println(ex);
            }
        %>



    </body>


</html>

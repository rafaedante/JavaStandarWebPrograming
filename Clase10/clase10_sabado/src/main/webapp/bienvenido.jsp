<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <div align="center">
            <h1>Bienvenido</h1>
             <hr>
             Bienvenido, <i><%=session.getAttribute("user")%></i>
             <br><br>
             <a href="LoginServlet?accion=logout">[Logout]</a>
             <hr>
        </div>

    </body>
</html>

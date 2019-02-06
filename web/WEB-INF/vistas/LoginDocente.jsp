<%-- 
    Document   : LoginDocente
    Created on : 05-feb-2019, 19:25:30
    Author     : Docente
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <section class ="header">
            <ul> 
                <!--<li><a href="Index.html">Atras</a></li>-->
            </ul>
        </section>
        <section class = "formulario_pedido">
            <form method= "post" action="<%=request.getContextPath()%>/LoginDocente.html">
                <h3>Login Docente</h3>
                <p>User</p>
                <input id="usuarioDocetne" type="text" name="usuarioDocente" placeholder="User" required><br>
                <p>Password</p>
                <input id="claveDocente" type="text" name="claveDocente" placeholder="Password" required><br><br>
                <input type="submit" value="Enviar" name="submit"/>
        </section> 
    </body>
</html>

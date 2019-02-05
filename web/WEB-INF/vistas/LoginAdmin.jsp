<%-- 
    Document   : LoginAdmin
    Created on : 05-feb-2019, 11:03:39
    Author     : Usuario
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
                <li><a href="Index.html">Atras</a></li>
            </ul>
        </section>
        <section class = "formulario_pedido">
            <form method= "post" action="<%=request.getContextPath()%>/LoginAdmin.html">
                <h3>Login Admin</h3>
                <p>User</p>
                <input id="usuario" type="text" name="usuario" placeholder="User" required><br>
                <p>Password</p>
                <input id="clave" type="text" name="clave" placeholder="Password" required><br><br>
                <input type="submit" value="Enviar" name="submit"/>
        </section> 
    </body>
</html>

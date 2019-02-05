<%-- 
    Document   : formpedido
    Created on : 21-ene-2019, 18:22:12
    Author     : Usuario
--%>

<%@page import="clases.Pedido"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
Pedido objPedido = (Pedido) request.getAttribute("pedido");

%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>FormPedido</title>
         </head>
    <body>
        <section class ="header">
            <ul>
                <li><a href="login.html">Administrador</a></li>
            </ul>
        </section>

        <section class = "formulario">
            <form method= "post" action="<%=request.getContextPath()%>/ActualizarPedido.html">
                <h1>Bienvenido</h1>
                <h3>Hoja de Pedidos</h3>
                <p>ID</p>
                <input id="id" type="integer" name="id" value="<%=objPedido.getId()%>" placeholder="ID" required><br>
                <p>Fecha</p>
                <input id="fecha" type="text" name="fecha" value="<%=objPedido.getFecha()%>"  placeholder="Fecha" required><br>
                <p>Nombre</p>
                <input id="nombre" type="text" name="nombre" value="<%=objPedido.getNombre()%>" placeholder="Nombre" required><br>
                <p>Apellido</p>
                <input id="apellido" type="text" name="apellido" value="<%=objPedido.getApellido()%>" placeholder="Apellido" required><br>
                <p>Empresa</p>
                <input id="empresa" type="text" name="empresa" value="<%=objPedido.getEmpresa()%>" placeholder="Empresa" required><br>
                <p>Teléfono</p>
                <input id="telefono" type="text" name="telefono" value="<%=objPedido.getTelefono()%>"  placeholder="Telefono" required><br>
                <br>
                <h3>Objetivo de Pedido</h3>
                <p>Estudio</p>
                <input id="estudio" type="text" name="estudio" value="<%=objPedido.getEstudio()%>" placeholder="Estudio" required><br>
                <p>Proyecto</p>
                <input id="proyecto" type="text" name="proyecto" value="<%=objPedido.getProyecto()%>" placeholder="Proyecto" required><br>
                <p>Control de Calidad</p>
                <input id="controlcalidad" type="text" name="controlcalidad" value="<%=objPedido.getControlcalidad()%>" placeholder="Control de Calidad" required><br>
                <p>Ensayos</p>
                <input id="ensayos" type="text" name="ensayos" value="<%=objPedido.getEnsayos()%>"  placeholder="Ensayos" required><br>
                <h3>Observaciones</h3>
                <input id="observaciones" type="text" name="observaciones" value="<%=objPedido.getObservaciones()%>" placeholder="Observaciones"><br><br>
                <input type="submit" value="Enviar" name="submit"/>
        </section>  
    </body>
</html>

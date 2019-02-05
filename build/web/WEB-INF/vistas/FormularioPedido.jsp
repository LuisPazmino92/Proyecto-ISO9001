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

        <section class = "formulario_pedido">
            <form method= "post" action="<%=request.getContextPath()%>/PedidosCliente.html">
                <h1>Bienvenido</h1>
                <h3>Hoja de Pedidos</h3>
                <p>Fecha</p>
                <input id="fecha" type="text" name="fecha" placeholder="Fecha" required><br>
                <p>Nombre</p>
                <input id="nombre" type="text" name="nombre" placeholder="Nombre" required><br>
                <p>Apellido</p>
                <input id="apellido" type="text" name="apellido" placeholder="Apellido" required><br>
                <p>Empresa</p>
                <input id="empresa" type="text" name="empresa"  placeholder="Empresa" required><br>
                <p>Teléfono</p>
                <input id="telefono" type="text" name="telefono"  placeholder="Telefono" required><br>
                <br>
                <h3>Objetivo de Pedido</h3>
                <p>Estudio</p>
                <input id="estudio" type="text" name="estudio"  placeholder="Estudio" required><br>
                <p>Proyecto</p>
                <input id="proyecto" type="text" name="proyecto"  placeholder="Proyecto" required><br>
                <p>Control de Calidad</p>
                <input id="controlcalidad" type="text" name="controlcalidad"  placeholder="Control de Calidad" required><br>
                <p>Ensayos</p>
                <input id="ensayos" type="text" name="ensayos"  placeholder="Ensayos" required><br>
                <h3>Observaciones</h3>
                <input id="observaciones" type="text" name="observaciones" placeholder="Observaciones"><br><br>
                <input type="submit" value="Enviar" name="submit"/>
        </section>  
    </body>
</html>

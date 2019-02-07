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

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>       
        <link rel="stylesheet" type="text/css" href="css/stylerenzo.css">

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>FormPedido</title>
    </head>
    <body>
        <section class ="header">
            <ul>
                <div class="row">
                    <div class="col">
                        <!--<a  class="btn btn-danger " href="index.html">Administrador</a>-->
                        <p></p>
                    </div>
                    <div class="col">
                        <!--<a  class="btn btn-danger " href="index.html">Administrador</a>-->
                        <p></p>
                    </div>
                    <div class="col">
                        <!--<a  class="btn btn-danger " href="index.html">Administrador</a>-->
                        <p></p>
                    </div>
                </div>
                <!--<li><a href="login.html">Administrador</a></li>-->
            </ul>
        </section>

        <section class = "formulario">
            <div class="row">
                <div class="col-3"></div>


                <div class="col-5">
                    <h1>Bienvenido</h1>
                    <h3>Hoja de Pedidos</h3>
                    <form method= "post" action="<%=request.getContextPath()%>/ActualizarPedido.html">
                        <div class="form-group row">

                            <label for="id" class="col-3 col-form-label">Id:</label>
                            <input class="form-control col-9" id="id" type="integer" name="id" value="<%=objPedido.getId()%>" placeholder="ID" required><br>
                            <label for="fecha" class="col-3 col-form-label">Fecha:</label>
                            <input class="form-control col-9" id="fecha" type="text" name="fecha" value="<%=objPedido.getFecha()%>"  placeholder="Fecha" required><br>
                            <label for="nombre" class="col-3 col-form-label">Nombre:</label>
                            <input class="form-control col-9" id="nombre" type="text" name="nombre" value="<%=objPedido.getNombre()%>" placeholder="Nombre" required><br>
                            <label for="apellido" class="col-3 col-form-label">Apellido:</label>
                            <input class="form-control col-9" id="apellido" type="text" name="apellido" value="<%=objPedido.getApellido()%>" placeholder="Apellido" required><br>
                            <label for="apellido" class="col-3 col-form-label">Empresa:</label>
                            <input class="form-control col-9" id="empresa" type="text" name="empresa" value="<%=objPedido.getEmpresa()%>" placeholder="Empresa" required><br>
                            <label for="telefono" class="col-3 col-form-label">Teléfono:</label>
                            <input class="form-control col-9" id="telefono" type="text" name="telefono" value="<%=objPedido.getTelefono()%>"  placeholder="Telefono" required><br>

                            <h3 class="col-12">Objetivo de Pedido</h3>
                            <label  for="estudio" class="col-3 col-form-label">Estudio</label>
                            <input class="form-control col-9" id="proyecto" type="text" name="estudio" value="<%=objPedido.getEstudio()%>" placeholder="Estudio" required><br>

                            <label  for="proyecto" class="col-3 col-form-label">Proyecto</label>
                            <input  class="form-control col-9" id="proyecto" type="text" name="proyecto" value="<%=objPedido.getProyecto()%>" placeholder="Proyecto" required><br>

                            <label  for="proyecto" class="col-3 col-form-label">Control de Calidad</label>
                            <input  class="form-control col-9" id="controlcalidad" type="text" name="controlcalidad" value="<%=objPedido.getControlcalidad()%>" placeholder="Control de Calidad" required><br>

                            <label  for="ensayos" class="col-3 col-form-label">Ensayos</label>
                            <input class="form-control col-9"  id="ensayos" type="text" name="ensayos" value="<%=objPedido.getEnsayos()%>"  placeholder="Ensayos" required><br>

                            <label  for="ensayos" class="col-3 col-form-label">Observaciones</label>
                            <input class="form-control col-9" id="observaciones" type="text" name="observaciones" value="<%=objPedido.getObservaciones()%>" placeholder="Observaciones"><br><br>

                            <input type="submit" value="Enviar" name="submit" class="btn btn-danger"/>


                        </div>
                    </form>
                </div>

                <div class="col-3"><a  class="btn btn-danger "href="login.html">Administrador</a></div>
            </div>


        </section> 
    </body>
</html>

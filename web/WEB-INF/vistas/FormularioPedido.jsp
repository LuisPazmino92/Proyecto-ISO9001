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
        <section class ="headerpedido">
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

            </ul>
        </section>

        <section>

            <div class="row">
                <div class="col-3"></div>


                <div class="col-5">

                    <h1>Formulario de Pedido</h1>
                    <h3>Hoja de Pedidos</h3>
                    <form method= "post" action="<%=request.getContextPath()%>/PedidosCliente.html">
                        <div class="form-group row">
                            <label for="fecha"class="col-3 col-form-label">Fecha:</label>
                            <input id="fecha" type="text" name="fecha" placeholder="Fecha" required class="form-control col-9">

                            <label for="nombre"class="col-3 col-form-label">Nombre:</label>
                            <input id="nombre" type="text" name="nombre" placeholder="Nombre" required  class="form-control col-9">

                            <label for="apellido"class="col-3 col-form-label">Apellido:</label>
                            <input id="apellido" type="text" name="apellido" placeholder="Apellido" required class="form-control col-9">

                            <label for="empresa"class="col-3 col-form-label">Empresa:</label>
                            <input id="empresa" type="text" name="empresa"  placeholder="Empresa" required class="form-control col-9">

                            <label for="telefono"class="col-3 col-form-label">Teléfono:</label>
                            <input id="telefono" type="text" name="telefono"  placeholder="Telefono" required>

                            <h3 class="col-12">Objetivo de Pedido</h3>
                            <label for="estudio"class="col-3 col-form-label">Estudio:</label>
                            <input id="estudio" type="text" name="estudio"  placeholder="Estudio" required class="form-control col-9">

                            <label for="proyecto"class="col-3 col-form-label">Proyecto:</label>
                            <input id="proyecto" type="text" name="proyecto"  placeholder="Proyecto" required class="form-control col-9">

                            <label for="controlcalidad"class="col-3 col-form-label">Control de Calidad:</label>
                            <input id="controlcalidad" type="text" name="controlcalidad"  placeholder="Control de Calidad" required class="form-control col-9">

                            <label for="ensayos"class="col-3 col-form-label">Ensayos:</label>
                            <input id="ensayos" type="text" name="ensayos"  placeholder="Ensayos" required class="form-control col-9">

                            <label for="observaciones"class="col-3 col-form-label">Observaciones:</label>
                            <input id="observaciones" type="text" name="observaciones" placeholder="Observaciones" class="form-control col-9">


                            <input type="submit" value="Enviar" name="submit" class="btn btn-danger"/>
                        </div>
                    </form>
                </div>
                <div class="col-3"><a  class="btn btn-danger " href="index.html">Administrador</a></div>
            </div>


        </section>  

    </body>
</html>

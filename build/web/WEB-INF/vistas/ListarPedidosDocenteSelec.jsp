<%-- 
    Document   : ListarPedidosDocenteSelec
    Created on : 06-feb-2019, 23:29:25
    Author     : Usuario
--%>

<%@page import="java.util.List"%>
<%@page import="interfaz.IntPedidoDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="clases.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>       

        <title>Listar</title>
    </head>
    <body>
        <%
            //Docente objdocente = (Docente) request.getAttribute("objdocente");
            //int id = objdocente.getIdDocetne();
            //System.out.println("Id DOCENTE EN LISTAR PEDIDOS DOCENTE JSP " + id);
        %>
        <section class ="header">
            <ul> 

                <li><a href="index.html">Salir</a></li>

            </ul>
        </section>
        <form id="frmMostrarCabeceraUsuario">
            <table id="tablaMostrarCabeceraUsuario">
                <tr>
                    <th>
                        <h1> Formulario </h1>
                    </th>
                </tr>
                <tr>
                    <td>
                        <a href="index.html" class="link"><h4> Pagina principal </h4></a>
                    </td>
                </tr>
            </table>
        </form>

        <hr>

        <form id="frmMostrarCuerpoUsuario" method ="post">
            <table class="table">
                <thead class="thead-dark">
                    <tr>
                        <th scope="col">
                            ID
                        </th>
                        <th scope="col">
                            ID DOCENTE
                        </th>
                        <th scope="col">
                            ID PEDIDO
                        </th>
                        <th scope="col">
                            FECHA
                        </th>
                        <th scope="col">
                            NOMBRE
                        </th>
                        <th scope="col">
                            APELLIDO
                        </th>
                        <th scope="col">
                            EMPRESA
                        </th>
                        <th scope="col">
                            TELEFONO
                        </th>
                        <th class="Titulo">
                            ESTUDIO
                        </th>
                        <th scope="col">
                            PROYECTO
                        </th>
                        <th scope="col">
                            CONTROL CALIDAD
                        </th>
                        <th scope="col">
                            ENSAYOS
                        </th>
                        <th scope="col">
                            OBSERVACIONES
                        </th>
                        <th scope="col">
                            REPORTES
                        </th>
                    </tr> 
                </thead>

                <%
                    List<PedidoDocente> lista = (List<PedidoDocente>) request.getAttribute("lista");
                    for (PedidoDocente objPedido : lista) {

                %>
                <tbody>
                    <tr>
                        <th scope="row">1</th>
                        <td>
                            <%=objPedido.getId()%>
                        </td>
                        <td>
                            <%=objPedido.getIdDocente()%>
                        </td>
                        <td>
                            <%=objPedido.getIdPedido()%>
                        </td>
                        <td>
                            <%=objPedido.getFecha()%>
                        </td>
                        <td>
                            <%=objPedido.getNombre()%>
                        </td>
                        <td>
                            <%=objPedido.getApellido()%>
                        </td>
                        <td>
                            <%=objPedido.getEmpresa()%>
                        </td>
                        <td>
                            <%=objPedido.getTelefono()%>
                        </td>
                        <td>
                            <%=objPedido.getEstudio()%>
                        </td>
                        <td>
                            <%=objPedido.getProyecto()%>
                        </td>
                        <td>
                            <%=objPedido.getControlcalidad()%>
                        </td>
                        <td>
                            <%=objPedido.getEnsayos()%>
                        </td>
                        <td>
                            <%=objPedido.getObservaciones()%>
                        </td>
                        <td class="Opcion">
                            <a onclick="return confirm('¿Seguro que desea Agregar?');" action="<%=request.getContextPath()%>" href="AgregarPedidoDocente.html?idPedido=<%=objPedido.getId()%>"> Reportes</a>
                        </td>
                    </tr>
                </tbody>

                    <%
                        }
                    %>

            </table>
        </form>
    </body>
</html>




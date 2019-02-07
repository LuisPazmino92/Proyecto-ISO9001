<%-- 
    Document   : ListarPedidosDocente
    Created on : 05-feb-2019, 20:48:55
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
        <title>Listar</title>
    </head>
    <body>
        <%
        Docente objdocente = (Docente) request.getAttribute("objdocente");
        int id = objdocente.getIdDocetne();
        System.out.println("Id DOCENTE EN LISTAR PEDIDOS DOCENTE JSP " + id);
        %>
        <section class ="header">
            <ul> 
                <li><a href="VerPedidosDocente.html?idDocente=<%=objdocente.getIdDocetne()%>">Ver Pedidos</a></li>

                <li><a href="index.html">Salir</a></li>
                
            </ul>
        </section>
        <form id="frmMostrarCabeceraUsuario">
            <table id="tablaMostrarCabeceraUsuario">
                <tr>
                    <th>
                        <h1> formulario </h1>
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
            <table id="tablaMostrarCuerpoUsuario">
                <tr>
                    <th class="Titulo">
                        ID
                    </th>
                    <th class="Titulo">
                        FECHA
                    </th>
                    <th class="Titulo">
                        NOMBRE
                    </th>
                    <th class="Titulo">
                        APELLIDO
                    </th>
                    <th class="Titulo">
                        EMPRESA
                    </th>
                    <th class="Titulo">
                        TELEFONO
                    </th>
                    <th class="Titulo">
                        ESTUDIO
                    </th>
                    <th class="Titulo">
                        PROYECTO
                    </th>
                    <th class="Titulo">
                        CONTROL CALIDAD
                    </th>
                    <th class="Titulo">
                        ENSAYOS
                    </th>
                    <th class="Titulo">
                        OBSERVACIONES
                    </th>
                </tr>    

                <%
                   
                    List<Pedido> lista = (List<Pedido>)request.getAttribute("lista");
                    for(Pedido objPedido :lista){
                         
                %>

                <tr>
                    <td>
                        <%=objPedido.getId()%>
                    </td>
                    <td>
                        <%=objPedido.getFecha()%>
                    </td>
                    <td>
                        <%=objPedido.getNombre()%>
                    </td>
                    <td>
                        <%=objPedido.getApellido() %>
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
                        <a onclick="return confirm('¿Seguro que desea Agregar?');" action="<%=request.getContextPath()%>" href="AgregarPedidoDocente.html?idPedido=<%=objPedido.getId()%>&&idDocente=<%=objdocente.getIdDocetne()%>"> Agregar</a>
                    </td>
                </tr>

                <%
                    }
                %>

            </table>
        </form>
    </body>
</html>



<%-- 
    Document   : ListarPedidos
    Created on : 05-feb-2019, 12:13:55
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
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>       

        <title>Listar</title>
    </head>
    <body>
        <form id="frmMostrarCabeceraUsuario">
            <table id="tablaMostrarCabeceraUsuario">
                <tr>
                    <th>
                        <h1>Tabla de Pedidos </h1>
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

        <form id="frmMostrarCuerpoUsuario">
            <table class="table">
                <thead class="thead-dark">
                    <tr>
                        <th scope="col">
                            ID
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
                        <th scope="col">
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
                            ACTUALZIAR
                        </th>
                        <th scope="col">
                            ELIMINAR
                        </th>


                    </tr>    
                </thead>

                <%

                    List<Pedido> lista = (List<Pedido>) request.getAttribute("lista");
                    //ArrayList<Pedido> lista = pedpedidodao.
                    for (Pedido objPedido : lista) {

                %>


                <tbody>
                    <tr>
                        <th scope="row">1</th>
                        <td><%=objPedido.getId()%></td>
                        <td><%=objPedido.getFecha()%></td>
                        <td><%=objPedido.getNombre()%></td>
                        <td><%=objPedido.getApellido()%></td>
                        <td><%=objPedido.getEmpresa()%></td>
                        <td><%=objPedido.getTelefono()%></td>
                        <td><%=objPedido.getEstudio()%></td> 
                        <td><%=objPedido.getProyecto()%></td>
                        <td<%=objPedido.getControlcalidad()%> </td>
                        <td> <%=objPedido.getEnsayos()%> </td>
                        <td> <%=objPedido.getObservaciones()%></td>
                        <td class="Opcion"> <a onclick="return confirm('¿Seguro que desea eliminar?');" href="<%=request.getContextPath()%>/EliminarPedido.html?id=<%=objPedido.getId()%>"> Eliminar</a></td>
                        <td class="Opcion"><a href="<%=request.getContextPath()%>/ActualizarPedido.html?id=<%=objPedido.getId()%>">Actualizar</a></td>

                        <!--
               
                            
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
                        <a onclick="return confirm('¿Seguro que desea eliminar?');" href="<%=request.getContextPath()%>/EliminarPedido.html?id=<%=objPedido.getId()%>"> Eliminar</a>
                    </td>
                    <td class="Opcion">
                        <a href="<%=request.getContextPath()%>/ActualizarPedido.html?id=<%=objPedido.getId()%>">Actualizar</a>
                    </td>
                </tr>
                
                      
        
                    </table>-->
                </tbody>
                <%
                    }
                %>
            </table>
        </form>
    </body>
</html>



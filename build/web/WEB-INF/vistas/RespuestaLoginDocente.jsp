<%-- 
    Document   : RespuestaLogin
    Created on : 05-feb-2019,20:1:16
    Author     : Docente
--%>


<%@page import="clases.Docente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1 align = "center">
            <%
             Docente objdocente = (Docente) request.getAttribute("objdocente");
             int id = objdocente.getIdDocetne();
             System.out.println("Id DOCENTE EN RESPUESTALOGIG DOCENTE JSP " + id);
             
            if (request.getParameter("mensaje")!=null) {
                    out.print(request.getParameter("mensaje"));
                }
            %>
        </h1>
        <h2 align = "center" >
<<<<<<< HEAD
            <a href = "<%=request.getContextPath()%>/ListarPedidosDocente.html">OkRespuestaLoginDOcetne</a><!-- Redireccionamos a la pagina deseada-->
=======
            <a href = "<%=request.getContextPath()%>/ListarPedidosDocente.html?idDocente=<%=objdocente.getIdDocetne()%>" >Ok</a><!-- Redireccionamos a la pagina deseada-->
>>>>>>> 6b416b3c572c5b064901bb72d4a0169687a9a3fc
        </h2>
    </body>
</html>

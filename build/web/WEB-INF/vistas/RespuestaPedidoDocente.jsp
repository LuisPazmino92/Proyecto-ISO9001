<%-- 
    Document   : RespuestaPedidoDocente
    Created on : 06-feb-2019, 22:51:31
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
        <h1 align = "center">
            <%
            if (request.getParameter("mensaje")!=null) {
                    out.print(request.getParameter("mensaje"));
                }
            %>
        </h1>
        <h2 align = "center" >
            <a href = "<%=request.getContextPath()%>/index.html">Ok</a><!-- Redireccionamos a la pagina deseada-->
        </h2>
    </body>
</html>


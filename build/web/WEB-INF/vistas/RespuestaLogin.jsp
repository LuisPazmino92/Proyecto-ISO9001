<%-- 
    Document   : RespuestaLogin
    Created on : 05-feb-2019, 14:01:16
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>       

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div  class="container">
            <div  class="row">
                <div  class="col-8 ">

                    <h2 class="alert alert-success text-justify text-center text-uppercase">
                        <%
                            if (request.getParameter("mensaje") != null) {
                                out.print(request.getParameter("mensaje"));
                            }
                        %>
                    </h2>

                </div>
                <div  class="col-8">
                    <h2 class="alert alert-success text-justify text-center text-uppercase">
                        <a href = "<%=request.getContextPath()%>/ListarPedidos.html">Ok</a><!-- Redireccionamos a la pagididos.html">OkRespuestaLogina deseada-->
                    </h2>                                       <!--login.html-->
                </div>
            </div>
    </body>
</html>

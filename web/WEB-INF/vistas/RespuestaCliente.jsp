<%-- 
    Document   : RespuestaCliente
    Created on : 05-feb-2019, 14:51:04
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

        <style>

            .border{
                background-color: gray;
                height: 200px;
            }
            .border1{
                background-color: aquamarine;
                height: 150px;
            }
        </style>

    </head>
    <body>
        <div  class="container">
            <div  class="row">
                <div  class="col ">

                    <div class="alert alert-success">
                        <%
                            if (request.getParameter("mensaje") != null) {
                                out.print(request.getParameter("mensaje"));
                            }
                        %>
                    </div>

                </div>

                <div  class="col border">
                    <h2 align = "center" >
                        <a href = "<%=request.getContextPath()%>/index.html">okRespuestaCliente</a><!-- Redireccionamos a la pagina deseada-->
                    </h2>                                       <!--login.html-->
                </div>
            </div>
    </body>
</html>


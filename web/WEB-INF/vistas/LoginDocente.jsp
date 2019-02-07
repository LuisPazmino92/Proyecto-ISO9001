<%-- 
    Document   : LoginDocente
    Created on : 05-feb-2019, 19:25:30
    Author     : Docente
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
        <section class ="headerlogindeocente">

            <div class="row">
                <div class="col"><p></p>
                </div>
                <div class="col">

                    <p></p>
                </div>
                <div class="col">

                    <p></p>
                </div>
            </div>


        </section>
        <section>

            <div class="row">
                <div class="col-4"></div>


                <div class="col-4">
                    <h1>Login Docente</h1>
                    <form method= "post" action="<%=request.getContextPath()%>/LoginDocente.html">
                        <div class="form-group row">
                            <label for="user"class="col-4 col-form-label">User:</label>
                            <input  class="form-control col-8" id="usuarioDocetne" type="text" name="usuarioDocente" placeholder="User" required><br>
                            <label for="password"class="col-4 col-form-label">Password:</label>
                            <input class="form-control col-8" id="claveDocente" type="password" name="claveDocente" placeholder="Password" required><br><br>
                            <input type="submit" value="Enviar" name="submit" class="btn btn-danger" />
                        </div>
                    </form>
                </div>
                <div class="col-4"></div>
            </div>

        </section> 
    </body>
</html>

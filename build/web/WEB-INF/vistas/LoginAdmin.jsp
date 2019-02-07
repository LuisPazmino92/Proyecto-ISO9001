<%-- 
    Document   : LoginAdmin
    Created on : 05-feb-2019, 11:03:39
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>ISO 9001</title>

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>       


        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
        <link href="css/style.css" rel="stylesheet" type="text/css"  media="all" />
        <link href='//fonts.googleapis.com/css?family=Roboto' rel='stylesheet' type='text/css'>
        <link href='//fonts.googleapis.com/css?family=PT+Sans+Narrow' rel='stylesheet' type='text/css'>
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <link rel="stylesheet" type="text/css" href="css/estilos.css">
        <link rel="stylesheet" type="text/css" href="css/iconos.css">

    </head>
    <body>
        <!---start-header---->
        <header>
            <section class="wrap">
                <section class="logo">
                    <a href="index.html"><img src="imagenes/logo.png" title="logo" /></a>
                </section>
                <section class="top-nav">
                    <h2>Registro de Proyectos UTPL</h2>
                    <ul>


                        <li><a href="index.html">Inicio</a></li>

                    </ul>
                </section>
                <div class="clear"> </div>
            </section>
        </header>

        <section class ="headerloginadmin">

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
                <div class="col-8"><img src="imagenes/fondo.jpg">  </div>

                <div class="col-3">
                    <h1>Login Admin</h1>
                    <form method= "post" action="<%=request.getContextPath()%>/LoginAdmin.html">
                        <div class="form-group row">
                            <label for="user"class="col-3 col-form-label">User:</label>
                            <input id="usuario" type="text" name="usuario" placeholder="usuario@utpl.edu.ec" required class="form-control col-9">
                            <label for="pass"class="col-3 col-form-label">Password:</label>
                            <input id="clave" type="text" name="clave" placeholder="Contraseña" required  class="form-control col-9">
                            <!--<button type="submit">Ingresar</button>-->
                            <input type="submit" value="Ingresar" name="submit" class="btn btn-danger" />
                        </div>
                    </form>
                </div>
                <div class="col-1"></div>
            </div>

            <footer>
                <section class="iconos">
                    <ul>
                        <a href=""><span class="icon-facebook2 estilo_icono"></span></a>
                        <a href=""><span class="icon-instagram estilo_icono"></span></a>
                        <a href=""><span class="icon-google-plus2 estilo_icono"></span></a>
                    </ul>
                </section>
                <section class="texto_footer">
                    <h6>©Registro de Proyectos UTPL</h6>
                    <h6>@renzo - @pazmiño - @danilo</h6>
                </section>

            </footer>
    </body>
</html>
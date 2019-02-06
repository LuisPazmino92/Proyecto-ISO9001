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
    <main>
        <section class="seccion1">
            <img src="imagenes/fondo.jpg">
        </section>
        <section class="seccion2">

            <h1>Registro de Usuarios</h1>
            <h2>Para iniciar sesión ingrese su usuario con el formato usuario@utpl.edu.ec</h2>

            <section class="login">

               <form method= "post" action="<%=request.getContextPath()%>/LoginAdmin.html">
                   
                 
                <input id="usuario" type="text" name="usuario" placeholder="usuario@utpl.edu.ec" required><br>
               
                <input id="clave" type="text" name="clave" placeholder="Contraseña" required><br><br>
                <button type="submit">Ingresar</button>
                </form>
               
                    <div class="error"><span></span></div>
                <h2>Si olvidó su contraseña o desea gestionar sus credenciales de acceso a los servicios de UTPL, haga click aquí.</h2>
            </section>
        </section>

    </main>
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
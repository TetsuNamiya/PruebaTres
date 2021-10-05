<%@page import="controlador.conexion"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="CSS/Login2.css" type="text/css" rel="stylesheet" />
<link href="CSS/PaginaDos.css" type="text/css" rel="stylesheet" />
<title>Ingresar Usuario hola</title>
</head>
<header>

	<nav>
	
		<a href="Usuario.jsp" class="nav-item">Volver</a>
		<a href="Login.jsp" class="nav-item">Salir</a>		
		<div class="animation start-home"></div>
	</nav>	
</header>
<body>
<%
conexion con=new conexion();
con.conexionbd();
%>
<div class="mobile-screen">
  <div class="header">
    <h1>Ingresar Usuario</h1>
  </div>
  
  <div class="logo"></div>

  <form action="Servletgestionusuarios" method="post" id="login-form">
    <input type="text" name="cedu" placeholder="Cedula" required="" id="username" />
    <input type="text" name="corre" placeholder="Correo" required="" id="username" />
    <input type="text" name="NomUsu" placeholder="Nombre Usuario" required="" id="username" />
    <input type="text" name="Pass" placeholder="Password" required="" id="username" />
    <input type="text" name="Usu" placeholder="Usuario o Nick" required="" id="username" />
    <input type="submit" name="btnins" class="login-btn" value="Ingresar Usuario">
  </form>
   
  
</div>
</body>
</html>
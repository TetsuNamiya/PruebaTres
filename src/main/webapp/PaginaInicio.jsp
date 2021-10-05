<%@page import="controlador.conexion"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link href="CSS/PaginaInicio.css" type="text/css" rel="stylesheet" />
<title>Pagina Inicio</title>
</head>
<header>
	<nav>
		<a href="Usuario.jsp" class="nav-item">Usuarios</a>
		<a href="#" class="nav-item">Clientes</a>
		<a href="#" class="nav-item">Proveedores</a>
		<a href="#" class="nav-item">Productos</a>
		<a href="#" class="nav-item">Ventas</a>
		<a href="#" class="nav-item">Reportes</a>		
		<div class="animation start-home"></div>
	</nav>	

</header>
<form id="random" class="random" action="ServletExit" method="post">
		<input id="random" class="random" type="submit" name="btnsal" value="Salir">
	</form>	
		
<body>

</body>
</html>
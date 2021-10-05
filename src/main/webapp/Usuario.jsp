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
		<a href="Ingresar.jsp" class="nav-item">Ingresar</a>
		<a href="#" class="nav-item">Consultar</a>
		<a href="#" class="nav-item">Actualizar</a>
		<a href="#" class="nav-item">Eliminar</a>
		<a href="PaginaInicio.jsp" class="nav-item">Volver</a>	
		<div class="animation start-home"></div>
	</nav>	

</header>
<form id="random" class="random" action="ServletExit" method="post">
		<input id="random" class="random" type="submit" name="btnsal" value="Salir">
	</form>	
		
<body>


</body>
</html>
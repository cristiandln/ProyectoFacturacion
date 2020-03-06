<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%@include file="navbar.jsp"%>
	<!-- Usando beans y FORM-->

	<!-- Bean para la busqueda -->
	<%
		if (request.getParameter("id_pedido") != null) {  //id_pedido tiene que llamarse igual que la id com.vipper.modelo.pedidos (en este caso se busca por id_pedido)
	%>
	<!-- (que es la primary key de pedidos -->
	<jsp:useBean id="mp1" scope="request"
		class="com.vipper.modelo.pedidos" />
	<jsp:setProperty property="id_pedido" name="mp1" />
	<!-- mp1 por mostrar pedido 1 -->
	<jsp:forward page="servletpedidos?op=1"></jsp:forward>
	<%
		}
	%>
	<!-- Fin Bean para la busqueda -->
	
	<!-- FORM PARA LA BUSQUEDA -->
	<div style="padding-top: 1%; padding-left: 5%;">
		<h1>Buscar Pedidos</h1>
	</div>
	<form action="crudPedidos.jsp" method="post"
		style="padding-top: 2%; padding-left: 5%; padding-right: 5%;">
		<div class="form-group row">
			<label class="col-sm-2 col-form-label" for="id_pedido">ID
				Pedido</label>
			<div class="col-sm-10">
				<input type="number" class="form-control" name="id_pedido"
					id="id_pedido" placeholder="Id Pedido" required>
			</div>
		</div>
		<button type="submit" class="btn btn-primary btn-lg btn-block">BUSCAR</button>
	</form>
	<!-- FIN FORM PARA LA BUSQUEDA -->
	
	
	

</body>
</html>
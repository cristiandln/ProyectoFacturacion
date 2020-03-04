<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Alta ServiciosProductos</title>
</head>
<body>

	<%@include file="navbar.jsp"%>


	<!-- NUEVO BEANS  -->

	<%
		if (request.getParameter("descripcion") != null &&
		request.getParameter("coste") != null &&
		request.getParameter("id_ClienteProveedor") != null &&
		request.getParameter("iva") != null) {  //id_servicio tiene que llamarse igual que la id com.vipper.modelo.serviciosProductos (en este caso se busca por id_servicio)
	%>
	<!-- (que es la primary key de serviciosProductos -->
	<jsp:useBean id="msp1" scope="request"
		class="com.vipper.modelo.serviciosProductos" />
	<jsp:setProperty property="*" name="msp1" />
	<!-- msp1 por mostrar servicio producto 1 -->
	<jsp:forward page="servletserviciosproductos?op=2"></jsp:forward>
	<%
		}
	%>

	<!-- FIN NUEVO BEANS   -->

	<div style="padding-top: 1%; padding-left: 5%;">
		<h1>Alta Servicios Productos</h1>
	</div>
	<!--  <form action="servletserviciosproductos?op=2" method="post" style="padding-top: 2%; padding-left: 5%; padding-right: 5%;">-->
	<form action="altaServiciosProductos.jsp" method="post"
		style="padding-top: 2%; padding-left: 5%; padding-right: 5%;">
		<div class="form-row">
			<div class="form-group col-md-6">
				<label for="descripcion">Descripcion</label> <input type="text"
					class="form-control" id="descripcion" name="descripcion"
					placeholder="Descripción del servicio..." maxlength="45" required>
			</div>
			<div class="form-group col-md-6">
				<label for="coste">Coste</label> <input type="number"
					class="form-control" id="coste" name="coste"
					placeholder="Coste del servicio..." step="0.01" required>
			</div>
		</div>
		<div class="form-row">
			<div class="form-group col-md-6">
				<label for="id_Cliente">Id cliente</label> <input type="number"
					class="form-control" id="id_ClienteProveedor"
					name="id_ClienteProveedor" placeholder="Id Cliente" required>
			</div>
			<div class="form-group col-md-6">
				<label for="iva">IVA</label> <input type="number"
					class="form-control" id="iva" name="iva" placeholder="IVA servicio"
					step="0.01" required>
			</div>
		</div>
		<button type="submit" class="btn btn-primary">ALTA</button>
	</form>



	<%@include file="footer.jsp"%>

</body>
</html>
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

	<!-- Usando beans-->

	<!-- Bean para la busqueda -->
	<%
		if (request.getParameter("id_servicio") != null) {  //id_servicio tiene que llamarse igual que la id com.vipper.modelo.serviciosProductos (en este caso se busca por id_servicio)
	%>
	<!-- (que es la primary key de serviciosProductos -->
	<jsp:useBean id="msp1" scope="request"
		class="com.vipper.modelo.serviciosProductos" />
	<jsp:setProperty property="id_servicio" name="msp1" />
	<!-- msp1 por mostrar servicio producto 1 -->
	<jsp:forward page="servletserviciosproductos?op=1"></jsp:forward>
	<%
		}
	%>
	<!-- Fin Bean para la busqueda -->

	<!-- Bean para la alta -->
	<%
		if (request.getParameter("descripcion") != null &&
		request.getParameter("coste") != null &&
		request.getParameter("id_ClienteProveedor") != null &&
		request.getParameter("iva") != null) {  
	%>
	<!-- (que es la primary key de serviciosProductos -->
	<jsp:useBean id="msp2" scope="request"
		class="com.vipper.modelo.serviciosProductos" />
	<jsp:setProperty property="*" name="msp2" />
	<!-- msp1 por mostrar servicio producto 1 -->
	<jsp:forward page="servletserviciosproductos?op=2"></jsp:forward>
	<%
		}
	%>
	<!-- FIN Bean para la alta -->

	<!-- Bean para la BAJA -->
	<%
		if (request.getParameter("bajaid_servicio") != null) {  //id_servicio tiene que llamarse igual que la id com.vipper.modelo.serviciosProductos (en este caso se busca por id_servicio)
		int id_servicio = Integer.parseInt(request.getParameter("bajaid_servicio"));
	%>
	<!-- (que es la primary key de serviciosProductos -->
	<jsp:useBean id="msp3" scope="request"
		class="com.vipper.modelo.serviciosProductos" />
	<jsp:setProperty property="id_servicio" name="msp3" value="<%=id_servicio %>" />
	<!-- msp1 por mostrar servicio producto 1 -->
	<jsp:forward page="servletserviciosproductos?op=3"></jsp:forward>
	<%
		}
	%>
	<!-- Fin Bean para la BAJA -->

	<!-- FORM PARA LA BUSQUEDA -->

	<div style="padding-top: 1%; padding-left: 5%;">
		<h1>Buscar ServicioProductos</h1>
	</div>
	<form action="crudServiciosProductos.jsp" method="post"
		style="padding-top: 2%; padding-left: 5%; padding-right: 5%;">
		<div class="form-group row">
			<label class="col-sm-2 col-form-label" for="id_servicio">ID
				producto</label>
			<div class="col-sm-10">
				<input type="number" class="form-control" name="id_servicio"
					id="id_servicio" placeholder="Id producto" required>
			</div>
		</div>
		<button type="submit" class="btn btn-primary btn-lg btn-block">BUSCAR</button>
	</form>

	<!-- FIN FORM PARA LA BUSQUEDA -->

	<!-- Bean para la alta -->

	<div style="padding-top: 1%; padding-left: 5%;">
		<h1>Alta Servicios Productos</h1>
	</div>
	<!--  <form action="servletserviciosproductos?op=2" method="post" style="padding-top: 2%; padding-left: 5%; padding-right: 5%;">-->
	<form action="crudServiciosProductos.jsp" method="post"
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
		<button type="submit" class="btn btn-primary btn-lg btn-block">ALTA</button>
	</form>

	<!-- Fin Bean para la alta -->


	<!-- Bean para la baja -->
	<div style="padding-top: 1%; padding-left: 5%;">
		<h1>Baja ServicioProductos</h1>
	</div>
	<form action="crudServiciosProductos.jsp" method="post"
		style="padding-top: 2%; padding-left: 5%; padding-right: 5%;">
		<div class="form-group row">
			<label class="col-sm-2 col-form-label" for="id_servicio">ID
				producto</label>
			<div class="col-sm-10">
				<input type="number" class="form-control"  name="bajaid_servicio"
					id="id_servicio" placeholder="Id producto" required>
			</div>
		</div>
		<button type="submit" class="btn btn-primary btn-lg btn-block">BAJA</button>
	</form>
	<!-- Bean para la baja -->

	<%@include file="footer.jsp"%>

</body>
</html>
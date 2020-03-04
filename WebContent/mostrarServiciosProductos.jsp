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

<div style="padding-top: 1%;padding-left: 5%;"><h1>Busqueda realizada sobre ServiciosProductos</h1></div>

<jsp:useBean id="msp1" class="com.vipper.modelo.serviciosProductos" scope="request"></jsp:useBean>
<div style="padding-top: 1%;padding-left: 5%;padding-right: 5%;">
<table class="table" >
  <thead class="thead-dark">
    <tr>
      <th scope="col">ID</th>
      <th scope="col">Descripción</th>
      <th scope="col">Precio</th>
      <th scope="col">Cliente Proveedor</th>
      <th scope="col">IVA</th>
    </tr>
  </thead>
  <tbody>
    <tr>
    	<%
		if (request.getParameter("id_servicio") != null || request.getParameter("bajaid_servicio") != null) { 
		%>	
		<th scope="row"><%=msp1.getId_servicio() %></th>
		<%}else{ %>
			<th scope="row">#</th>
      <%} %>
      <td><%=msp1.getDescripcion() %></td>
      <td><%=msp1.getCoste() %></td>
      <td><%=msp1.getId_ClienteProveedor() %></td>
      <td><%=msp1.getIva() %></td>
    </tr>
  </tbody>
</table>

<a href="crudServiciosProductos.jsp"><button  type="submit" class="btn btn-primary btn-lg btn-block">VOLVER</button></a>
</div>

<%@include file="footer.jsp"%>
</body>
</html>
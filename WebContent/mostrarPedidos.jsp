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

<div style="padding-top: 1%;padding-left: 5%;"><h1>Busqueda realizada sobre Pedidos</h1></div>

<jsp:useBean id="mp1" class="com.vipper.modelo.pedidos" scope="request"></jsp:useBean>
<div style="padding-top: 1%;padding-left: 5%;padding-right: 5%;">
<table class="table" >
  <thead class="thead-dark">
    <tr>
      <th scope="col">ID</th>
     
     
    </tr>
  </thead>
  <tbody>
    <tr>
    	<%
		if (request.getParameter("id_pedido") != null || request.getParameter("bajaid_pedido") != null) { 
		%>	
		<th scope="row"><%=mp1.getId_pedido() %></th>
		<%}else{ %>
			<th scope="row">#</th>
      <%} %>
     <!--  <td></td> -->
    </tr>
  </tbody>
</table>

<a href="crudPedidos.jsp"><button  type="submit" class="btn btn-primary btn-lg btn-block">VOLVER</button></a>
</div>

<%@include file="footer.jsp"%>

</body>
</html>
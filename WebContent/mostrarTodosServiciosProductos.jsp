<%@page import="java.util.ArrayList"%>
<%@page import="com.vipper.modelo.serviciosProductos"%>

<%@include file="navbar.jsp"%>

<p>Nuestros Productos son :</p>
<!-- Usar un scriplet para recoger todos los productos que están en el ámbito request -->
<%
		ArrayList<serviciosProductos> jsptodos = (ArrayList<serviciosProductos>) request.getAttribute("rtodos");
	%>
<table class="table">
	<thead class="thead-dark">
		<tr>
			<th scope="col">ID</th>
			<th scope="col">Descripción</th>
			<th scope="col">Precio</th>
			<th scope="col">Cliente Proveedor</th>
			<th scope="col">IVA</th>
		</tr>
	</thead>
	<%
			for (serviciosProductos elemento : jsptodos) {
		%>
	<tr>
		<th scope="row"><%=elemento.getId_servicio() %></th>
		<td><%=elemento.getDescripcion() %></td>
		<td><%=elemento.getCoste() %></td>
		<td><%=elemento.getId_ClienteProveedor() %></td>
		<td><%=elemento.getIva() %></td>
	</tr>
	<%
			}
		%>
</table>

<%@include file="footer.jsp"%>
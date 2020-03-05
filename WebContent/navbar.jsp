<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
	integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
	integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
	integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
	crossorigin="anonymous"></script>
</head>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
	<a class="navbar-brand" href="#">Facturacion</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navbarText" aria-controls="navbarText"
		aria-expanded="false" aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>
	<div class="collapse navbar-collapse" id="navbarText">
		<ul class="navbar-nav mr-auto">
			<li class="nav-item active"><a class="nav-link" href="index.jsp">INICIO</a>
			</li>
			
			<!-- NAVBAR SERVICIOS PRODUCTOS -->
			<li class="nav-item dropdown"><a
				class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
				role="button" data-toggle="dropdown" aria-haspopup="true"
				aria-expanded="false"> ServiciosProductos </a>
				<div class="dropdown-menu" aria-labelledby="navbarDropdown">
					<a class="dropdown-item" href="crudServiciosProductos.jsp">ServicioProducto</a>
					<div class="dropdown-divider"></div>
					<a class="dropdown-item" href="servletserviciosproductos?op=4">Mostrar
						todos</a>
				</div></li>
				
			<!-- FIN NAVBAR PEDIDOS -->
			
			<!-- NAVBAR CLIENTE PROVEEDORES -->
			<li class="nav-item dropdown"><a
				class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
				role="button" data-toggle="dropdown" aria-haspopup="true"
				aria-expanded="false"> Cliente Proveedores </a>
				<div class="dropdown-menu" aria-labelledby="navbarDropdown">
					<a class="dropdown-item" href="crudClienteProveedores.jsp">Cliente Proveedores</a>
					<div class="dropdown-divider"></div>
					<a class="dropdown-item" href="servletclienteproveedores?op=4">Mostrar
						todos</a>
				</div></li>
				
			<!-- FIN NAVBAR PEDIDOS -->
			
			<!-- NAVBAR PEDIDOS -->
			<li class="nav-item dropdown"><a
				class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
				role="button" data-toggle="dropdown" aria-haspopup="true"
				aria-expanded="false"> PEDIDOS </a>
				<div class="dropdown-menu" aria-labelledby="navbarDropdown">
					<a class="dropdown-item" href="crudPedidos.jsp">Pedidos</a>
					<div class="dropdown-divider"></div>
					<a class="dropdown-item" href="servletpedidos?op=4">Mostrar
						todos</a>
				</div></li>
				
			<!-- FIN NAVBAR PEDIDOS -->
			
			<!-- NAVBAR FORMA DE PAGO -->
			<li class="nav-item dropdown"><a
				class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
				role="button" data-toggle="dropdown" aria-haspopup="true"
				aria-expanded="false"> Forma de Pago </a>
				<div class="dropdown-menu" aria-labelledby="navbarDropdown">
					<a class="dropdown-item" href="crudFormaDePago.jsp">Forma de pago</a>
					<div class="dropdown-divider"></div>
					<a class="dropdown-item" href="servletformadepago?op=4">Mostrar
						todos</a>
				</div></li>
				
			<!-- FIN NAVBAR FORMA DE PAGO -->
			
			<!-- NAVBAR CONTRATOS-->
			<li class="nav-item dropdown"><a
				class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
				role="button" data-toggle="dropdown" aria-haspopup="true"
				aria-expanded="false"> Contratos </a>
				<div class="dropdown-menu" aria-labelledby="navbarDropdown">
					<a class="dropdown-item" href="crudContratos.jsp">Contratos</a>
					<div class="dropdown-divider"></div>
					<a class="dropdown-item" href="servletcontratos?op=4">Mostrar
						todos</a>
				</div></li>
				
			<!-- FIN NAVBAR CONTRATOS -->
			
			<!-- NAVBAR FACTURAS -->
			<li class="nav-item dropdown"><a
				class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
				role="button" data-toggle="dropdown" aria-haspopup="true"
				aria-expanded="false"> Facturas </a>
				<div class="dropdown-menu" aria-labelledby="navbarDropdown">
					<a class="dropdown-item" href="crudFacturas.jsp">Facturas</a>
					<div class="dropdown-divider"></div>
					<a class="dropdown-item" href="servletfacturas?op=4">Mostrar
						todos</a>
				</div></li>
				
			<!-- FIN FACTURAS -->
			
			
			<li class="nav-item"><a class="nav-link" href="#">OTRA
					OPCION</a></li>
		</ul>
		<span class="navbar-text"> </span>
	</div>
</nav>
package com.vipper.negocio;

import java.sql.SQLException;
import java.util.List;

import com.vipper.modelo.serviciosProductos;
import com.vipper.persistencia.AccesoServiciosProductos;

/**
 * @author Cristian
 *
 */
public class allServiciosProductos {

	/* 1. Llamar a la capa de persistencia para obtener el producto
	 * 2. añadir el producto al contenido
	 * 3 aumentar el importe*/
	private double importe;
	List<serviciosProductos> contenido;
	
	
	public boolean altaServiciosProductos(int id) throws ClassNotFoundException, SQLException {
		
		AccesoServiciosProductos asp1 = new AccesoServiciosProductos();
		serviciosProductos sp1 = asp1.mostrarUnoServiciosProductos(id);
		return contenido.add(sp1);
		
	}
	
	
	
//	public boolean altaProducto(int id) throws ClassNotFoundException, SQLException {
//		/* 1. Llamar a la capa de persistencia para obtener el producto
//		 * 2. añadir el producto al contenido
//		 * 3 aumentar el importe*/
//		
//		AccesoProductos ap1 = new AccesoProductos();
//		
//		Producto p1 = ap1.mostrarUno(id);
//		importe+=p1.getPrecio();
//	
//		
//		return contenido.add(p1);
//		
//	}
//	
//	public boolean bajaProducto(int id) throws ClassNotFoundException, SQLException {
//		//* 1. Llamar a la capa de persistencia para obtener el producto
//		 //* 2. remover el producto al contenido
//		
//		Producto p1= null;
//		
//		for (Producto producto : contenido) {
//			if(producto.getId()==id) {
//				// * 3 restar el importe*/
//				importe-=producto.getPrecio();
//				p1=producto;
//				break;
//			}
//		}
//		//bolean si se ha removido el producto
//		return contenido.remove(p1);
//		
//	}
	
	
}

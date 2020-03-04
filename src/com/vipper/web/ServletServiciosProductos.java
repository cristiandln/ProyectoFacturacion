package com.vipper.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vipper.modelo.serviciosProductos;
import com.vipper.persistencia.AccesoServiciosProductos;

/**
 * Servlet implementation class ServletServiciosProductos
 */
@WebServlet("/servletserviciosproductos")
public class ServletServiciosProductos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletServiciosProductos() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest r, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int jopcion = Integer.parseInt(r.getParameter("op"));
		serviciosProductos jserviciosProductos=null;
		AccesoServiciosProductos asp1=null;
		RequestDispatcher rd=null;
		switch (jopcion) {
		case 1:
			//mostrarUNO serviciosProductos
			jserviciosProductos = (serviciosProductos) r.getAttribute("msp1");
			asp1 = new AccesoServiciosProductos();
			try {
				jserviciosProductos = asp1.mostrarUnoServiciosProductos(jserviciosProductos.getId_servicio());
				//asp1.altaServiciosProductos(jserviciosProductos.getDescripcion(), jserviciosProductos.getCoste(),jserviciosProductos.getId_ClienteProveedor(), jserviciosProductos.getIva());
				System.out.println("ServicioProducto de la BBDD --> "+ jserviciosProductos.toString());
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e.toString());
			}
			
			//se guarda el producto con los datos que se obtienen de la bbdd
			//en el ambito request
			r.setAttribute("msp1", jserviciosProductos);
			rd = r.getRequestDispatcher("/mostrarServiciosProductos.jsp");
			rd.forward(r, response);
			break;
			
		case 2:
			//ALTA serviciosProductos
			jserviciosProductos = (serviciosProductos) r.getAttribute("msp2");
			asp1 = new AccesoServiciosProductos();
			try {
				
				asp1.altaServiciosProductos(jserviciosProductos.getDescripcion(), jserviciosProductos.getCoste(),jserviciosProductos.getId_ClienteProveedor(), jserviciosProductos.getIva());
				
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e.toString());
			}
			//se guarda el producto con los datos que se obtienen de la bbdd
			//en el ambito request
			r.setAttribute("msp1", jserviciosProductos);
			rd = r.getRequestDispatcher("/mostrarServiciosProductos.jsp");
			rd.forward(r, response);
			break;
			
		case 3:
			//BAJA serviciosProductos
			jserviciosProductos = (serviciosProductos) r.getAttribute("msp3");
			asp1 = new AccesoServiciosProductos();
			try {
				jserviciosProductos = asp1.mostrarUnoServiciosProductos(jserviciosProductos.getId_servicio());
				asp1.bajaServiciosProductos(jserviciosProductos.getId_servicio());
				System.out.println("ServicioProducto de la BBDD --> "+ jserviciosProductos.toString());
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e.toString());
			}
			
			//se guarda el producto con los datos que se obtienen de la bbdd
			//en el ambito request
			r.setAttribute("msp1", jserviciosProductos);
			rd = r.getRequestDispatcher("/mostrarServiciosProductos.jsp");
			rd.forward(r, response);
			
			
			break;
			
		case 4:
			// Entra aquí cuando se hace clic en el enalce de index.html
			List<serviciosProductos> serviciosProductosBBDD = null;
			
			asp1 = new AccesoServiciosProductos();
			
			try {
				serviciosProductosBBDD = asp1.mostrarTodosServiciosProductos();
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e.toString());
			}
			
			//Guardar los productos en el ambito Request
			
			r.setAttribute("rtodos", serviciosProductosBBDD);
			
			//Redirigir a la página mostrarTodos.jsp
			
			rd = r.getRequestDispatcher("/mostrarTodosServiciosProductos.jsp");
			rd.forward(r, response);
			
			break;
			
			
			default:
				break;
		}
		
	}

}

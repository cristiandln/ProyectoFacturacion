package com.vipper.web;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vipper.modelo.pedidos;
import com.vipper.modelo.serviciosProductos;
import com.vipper.persistencia.AccesoPedidos;
import com.vipper.persistencia.AccesoServiciosProductos;

/**
 * Servlet implementation class ServletPedidos
 */
@WebServlet("/servletpedidos")
public class ServletPedidos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletPedidos() {
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
		int jopcion = Integer.parseInt(r.getParameter("op"));//del request recojo el parámetro op,ej: puede venir "servletpedidos?op=1", convertido a int con ParseInt,xq voy a manejar enteros mejor con el switch, sabiendo qu evan a ser enteros todas las opciones
		//instanciamos todos los objetos fuera del switch para poder reutilizarlo dentro de cada caso del switch
		pedidos jpedidos=null;
		AccesoPedidos ap1=null;
		RequestDispatcher rd=null;
		//se contemplan las opciones y manejamos los casos con switch
		switch (jopcion) {
		case 1:
			//mostrarUNO pedidos
			//del request pedimos el atributo del bin en este caso llamado mp1 que va a tener el cuerpo de Pedidos y vamos a recoger sus atributos casteandolo a objeto Pedidos e instanciandolos
			jpedidos = (pedidos) r.getAttribute("mp1");
			//instanciamos el objeto para la persistencia que tenemos ya creado y realizamos acciones con el, en este caso de busqueda
			ap1 = new AccesoPedidos();
			try {
				//igualamos el resultado del metodo de mostrar uno (recogiendo la id para buscar) que nos devolvera un objeto pedidos completo para igualarlo a uno instanciado en el mismo nivel
				jpedidos = ap1.mostrarUnoPedidos(jpedidos.getId_pedido());
				//asp1.altaServiciosProductos(jserviciosProductos.getDescripcion(), jserviciosProductos.getCoste(),jserviciosProductos.getId_ClienteProveedor(), jserviciosProductos.getIva());
				System.out.println("ServicioProducto de la BBDD --> "+ jpedidos.toString());
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e.toString());
			}
			
			//se guarda el pedido con los datos que se obtienen de la bbdd
			//en el ambito request
			r.setAttribute("mp1", jpedidos);
			//se redirecciona la informacion hacia el jsp /mostrarPedidos, el mismo recogera los datos necesarios a mostrar
			rd = r.getRequestDispatcher("/mostrarPedidos.jsp");
			//recogemos el request (dondee estaran ya los datos guardados anteriormente) y lo daremos como respuesta, para que se pueda recoger desde mostrarPedidos 
			rd.forward(r, response);
			break;
			default:
				break;
		
			
		}
	}

}
	

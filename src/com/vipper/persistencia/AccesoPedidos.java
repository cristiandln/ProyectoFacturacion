package com.vipper.persistencia;

import java.sql.CallableStatement;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.vipper.modelo.pedidos;

public class AccesoPedidos extends Conexion{
	
		
	public pedidos mostrarUnoPedidos (int id) throws ClassNotFoundException, SQLException {
		//Definir variables
				String sql = "call facturacion.mostrarUnoPedidos(?);";
				pedidos uno = null; //Declaramos una variable tipo "pedidos" llamada uno
				CallableStatement st;
				ResultSet rs;
				
				//abrir la Conexion
				abrirConexion();
				
				//Recoger el comando de la conexión
				st = miConexion.prepareCall(sql);
				
				//Asignar valor a los parámetros
				st.setInt(1, id); //éste 1 corresponde a la posición de los signos de interrogación. Empiezan en 1.
				
				//Ejecutamos únicament el comando porque no hay parámetros de entrada
				
				rs = st.executeQuery();
				
				//Recorremos el ResultSet para crear la Colección. Ponemos un if porque solo voy a recuperar un valor
				if (rs.next()) {
					uno = new pedidos(rs.getInt("id_pedido"),rs.getString("descripcion"),
							rs.getInt("id_ClienteProveedor"),rs.getInt("id_forma_pago"),rs.getDouble("total"),
							rs.getDate("fecha"),rs.getInt("id_servicio"), rs.getInt("id_contrato"), rs.getDouble("importe_facturado"));
					
					//No necesitamos añadirlo a la colección
					//todos.add(p);
					
				}
				cerrarConexion();
				return uno;
	}
	
	public boolean altaPedidos (String descripcion,	int id_ClienteProveedor,int id_forma_pago,
	double total,Date fecha,int id_servicio,int id_contrato,double importe_facturado) throws ClassNotFoundException, SQLException {
		//Variables
		String sql = "call facturacion.altaPedidos(?,?,?,?,?,?,?,?);";
		CallableStatement st;
		int numregistros;
		pedidos p1 = new pedidos();
        
        //Abrir la conexión
        abrirConexion(); //lo vamos a propagar con throw
        
        //Obtener el comando de la conexion
        st=miConexion.prepareCall(sql);
        st.setString(1, descripcion);
        st.setInt(2, id_ClienteProveedor);
        st.setInt(3, id_forma_pago);
        st.setDouble(4, total);
        st.setDate(5,fecha);
        st.setInt(6,id_servicio);
        st.setInt(7,id_contrato);
        st.setDouble(8,importe_facturado);
        
        numregistros=st.executeUpdate();
        cerrarConexion();
        return numregistros>0; 
        
	}
	
	public boolean bajaPedidos(int id_pedido) throws ClassNotFoundException, SQLException{
        //Declaramos las variables
        String sql = "call facturacion.bajaPedidos(?);";
        CallableStatement st;
        
        /*ResultSet rs;
        Asunto a1=null;
        NO LOS VAMOS A NECESITAR PORQUE NO VAN A DEVOLVER NADA
        */
            int numregistros;
                
        //Abrir la conexión
        abrirConexion(); //lo vamos a propagar con throw
        
        //Obtener el comando de la conexion
        st=miConexion.prepareCall(sql);
        
        //Asignar valor al parámetro
        st.setInt(1, id_pedido);
              
        
        numregistros=st.executeUpdate();
         cerrarConexion();
         return numregistros>0;    
}

}

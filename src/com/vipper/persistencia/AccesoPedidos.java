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
	
	public int altaPedidos (pedidos p1) throws ClassNotFoundException, SQLException {
		//Variables
		String sql = "call facturacion.altaPedidos(?,?,?,?,?,?,?,?);";
		CallableStatement st;
		int numregistros;
        
        //Abrir la conexión
        abrirConexion(); //lo vamos a propagar con throw
        
        //Obtener el comando de la conexion
        st=miConexion.prepareCall(sql);
        st.setString(1, p1.getDescripcion());
        st.setInt(2, p1.getId_ClienteProveedor());
        st.setInt(3, p1.getId_forma_pago());
        st.setDouble(4, p1.getTotal());
        st.setDate(5, (Date) p1.getFecha());
        st.setInt(6,p1.getId_servicio());
        st.setInt(7, p1.getId_contrato());
        st.setDouble(8, p1.getImporte_facturado());
        
        numregistros=st.executeUpdate();
        cerrarConexion();
        return numregistros; 
        
	}
	
	public int bajaPedidos(pedidos p1) throws ClassNotFoundException, SQLException{
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
        st.setInt(1, p1.getId_pedido());
              
        
        numregistros=st.executeUpdate();
         cerrarConexion();
         return numregistros;    
}

}

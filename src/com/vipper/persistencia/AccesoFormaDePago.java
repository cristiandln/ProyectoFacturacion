package com.vipper.persistencia;


import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;


import com.vipper.modelo.formaDePago;

public class AccesoFormaDePago extends Conexion {

	
	//metodo public q devuelve un list  (list importar el de java.util)
	public formaDePago mostrarUnoFormaDePago (int id_formapago) throws ClassNotFoundException, SQLException {
		
	//declaracion variables	
		String sql= "call facturacion.mostrarUnoFormaDePago(?);";
		formaDePago fp = null;
		 
		
		
	//declarar statement y resultSEt
		CallableStatement st;
		ResultSet rs;
		
		//abrir conexion elegir la primera opcion: throws
		abrirConexion();
		
		//obtener el comando
		
		st=miConexion.prepareCall(sql);
		st.setInt(1,id_formapago);

		
		//ejecutar el comando
		rs=st.executeQuery();
		
		//recorrer el RS para crear la coleccion
		if (rs.next()) {
      fp=new formaDePago(rs.getInt("id_formaPago"), 
    		 				rs.getString("descripcion"),
    		 				rs.getDouble("valor"));
		}			
		
		
		//cerrar conexion
		cerrarConexion();
		return fp;

	}
	public boolean altaFormaDePago(String descripcion, double valor) throws ClassNotFoundException, SQLException  {
		
		//declaracion variables	
		String sql= "call facturacion.altaFormaDePago(?, ?);";
		formaDePago altafp =null;
		
	//declarar statement y resultSEt
		CallableStatement st;
		int numRegistros;
		//abrir conexion elegir la primera opcion: throws
		abrirConexion();
		
		//obtener el comando
		st=miConexion.prepareCall(sql);
		//asignar valor al parametro
	    st.setString(1,descripcion);
	    st.setDouble(2, valor);
		

		numRegistros=st.executeUpdate();
	
		//cerrar conexion
		cerrarConexion();
		return numRegistros>0;
		//nota: nos dara error y es porque tenemos que lanzar las excepciones.
		
	}
	
	public boolean bajaFormaDePago (int id_formaPago) throws ClassNotFoundException, SQLException {
		
		//declaracion variables	
			String sql= "call facturacion.bajaFormaDePago(?);";
		//declarar statement y resultSEt
			CallableStatement st;
			ResultSet rs;
			String bajafp=null;
			int numRegistros;
			
			//abrir conexion elegir la primera opcion: throws
			abrirConexion();
			//obtener el comando
			st=miConexion.prepareCall(sql);
			
			//asignar el valor al parametro
			st.setInt(1,id_formaPago);
			
			
			numRegistros=st.executeUpdate();
		
			//cerrar conexion
			cerrarConexion();
			return numRegistros>0;

		}

}

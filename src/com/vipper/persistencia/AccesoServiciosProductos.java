package com.vipper.persistencia;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.vipper.modelo.serviciosProductos;

public class AccesoServiciosProductos extends Conexion {
	
	
	
	public List<serviciosProductos> mostrarTodosServiciosProductos() throws ClassNotFoundException, SQLException {
		
		serviciosProductos sp1 =null;
		List<serviciosProductos> todos = new ArrayList<serviciosProductos>();
		String sql = "call facturacion.mostrarTodosServiciosProductos();";
		CallableStatement st;
		ResultSet rs;
		abrirConexion();
		st= miConexion.prepareCall(sql);
		
		rs=st.executeQuery();
		
		while (rs.next()) {
			sp1= new serviciosProductos(rs.getInt("id_servicio"),
					rs.getString("descripcion"),
					rs.getDouble("coste"),
					rs.getInt("id_ClienteProveedor"),
					rs.getDouble("iva"));
			todos.add(sp1);
			
		}
		
		cerrarConexion();
		return todos;
	}
	

	public serviciosProductos mostrarUnoServiciosProductos(int id) throws ClassNotFoundException, SQLException {
		serviciosProductos sp1 =null;
		String sql = "call facturacion.mostrarUnoServiciosProductos(?);";
		CallableStatement st;
		ResultSet rs;
		abrirConexion();
		st= miConexion.prepareCall(sql);
		st.setInt(1, id);
		
		rs=st.executeQuery();
		
		if (rs.next()) {
			sp1= new serviciosProductos(rs.getInt("id_servicio"),
					rs.getString("descripcion"),
					rs.getDouble("coste"),
					rs.getInt("id_ClienteProveedor"),
					rs.getDouble("iva"));
		}
		
		cerrarConexion();
		return sp1;
	}
	
    public boolean bajaServiciosProductos(int id) throws ClassNotFoundException, SQLException {

        String sql = "call facturacion.bajaServiciosProductos(?);";
        CallableStatement st;
        int numRegistros;

        abrirConexion();

        st = miConexion.prepareCall(sql);
        st.setInt(1, id);

        numRegistros = st.executeUpdate();

        cerrarConexion();

        return numRegistros > 0;
        
    }
    
    public boolean altaServiciosProductos(String descripcion,double coste,int id_ClienteProveedor,double iva) throws ClassNotFoundException, SQLException {

        String sql = "call facturacion.altaServiciosProductos(?,?,?,?);";
        CallableStatement st;
        int numRegistros;

        abrirConexion();

        st = miConexion.prepareCall(sql);
        st.setString(1, descripcion);
        st.setDouble(2, coste);
        st.setInt(3, id_ClienteProveedor);
        st.setDouble(4, iva);

        numRegistros = st.executeUpdate();

        cerrarConexion();

        return numRegistros > 0;
        
    }
	
	
}

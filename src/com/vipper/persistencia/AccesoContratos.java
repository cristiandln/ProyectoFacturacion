package com.vipper.persistencia;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.vipper.modelo.contratos;
import com.vipper.modelo.formaDePago;

public class AccesoContratos extends Conexion {

	public contratos mostrarUnoContratos(int id_contrato) throws ClassNotFoundException, SQLException {

		// declaracion variables
		String sql = "call facturacion.mostrarUnoContratos(?);";
		contratos c1 = null;

		// declarar statement y resultSEt
		CallableStatement st;
		ResultSet rs;

		// abrir conexion elegir la primera opcion: throws
		abrirConexion();

		// obtener el comando

		st = miConexion.prepareCall(sql);
		st.setInt(1, id_contrato);

		// ejecutar el comando
		rs = st.executeQuery();

		// recorrer el RS para crear la coleccion
		if (rs.next()) {
			c1 = new contratos(rs.getInt("id_contrato"), 
					rs.getInt("id_ClienteProveedor"), 
					rs.getDouble("comision"),
					rs.getString("encargadoFacturacion"));
		}

		// cerrar conexion
		cerrarConexion();
		return c1;

	}

	public boolean altaContratos(int id_ClienteProveedor, double Comision, String encargadoFacturacion)
			throws ClassNotFoundException, SQLException {

		// declaracion variables
		String sql = "call facturacion.altaContratos(?,?,?);";
		int numRegistros;
		// declarar statement y resultSEt
		CallableStatement st;

		// abrir conexion elegir la primera opcion: throws
		abrirConexion();

		// obtener el comando
		st = miConexion.prepareCall(sql);
		// asignar valor al parametro
		st.setInt(1, id_ClienteProveedor);
		st.setDouble(2, Comision);
		st.setString(3, encargadoFacturacion);
		// ejecutar el comando
		numRegistros = st.executeUpdate();

		// cerrar conexion
		cerrarConexion();

		return numRegistros > 0;
		// nota: nos dara error y es porque tenemos que lanzar las excepciones.

	}

	public boolean bajaContratos(int id_contrato) throws ClassNotFoundException, SQLException {

		// declaracion variables
		String sql = "call facturacion.bajaContratos(?);";
		// declarar statement y resultSEt
		CallableStatement st;
		int numRegistros;

		// abrir conexion elegir la primera opcion: throws
		abrirConexion();
		// obtener el comando
		st = miConexion.prepareCall(sql);

		// asignar el valor al parametro
		st.setInt(1, id_contrato);

		numRegistros = st.executeUpdate();

		// cerrar conexion
		cerrarConexion();
		return numRegistros > 0;

	}

}

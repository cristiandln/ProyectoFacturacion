package com.vipper.modelo;

import java.io.Serializable;

public class contratos implements Serializable{

	private int id_contrato;
	private int id_Cliente_Proveedor;
	private double comision;
	private String encargadoFacturacion;

	public contratos(int id_contrato, int id_Cliente_Proveedor, double comision, String encargadoFacturacion) {
		super();
		this.id_contrato = id_contrato;
		this.id_Cliente_Proveedor = id_Cliente_Proveedor;
		this.comision = comision;
		this.encargadoFacturacion = encargadoFacturacion;
	}

	public contratos() {
		super();
	}

	@Override
	public String toString() {
		return "contratos [id_contrato=" + id_contrato + ", id_Cliente_Proveedor=" + id_Cliente_Proveedor
				+ ", comision=" + comision + ", encargadoFacturacion=" + encargadoFacturacion + "]";
	}

	public int getId_contrato() {
		return id_contrato;
	}

	public void setId_contrato(int id_contrato) {
		this.id_contrato = id_contrato;
	}

	public int getId_Cliente_Proveedor() {
		return id_Cliente_Proveedor;
	}

	public void setId_Cliente_Proveedor(int id_Cliente_Proveedor) {
		this.id_Cliente_Proveedor = id_Cliente_Proveedor;
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

	public String getEncargadoFacturacion() {
		return encargadoFacturacion;
	}

	public void setEncargadoFacturacion(String encargadoFacturacion) {
		this.encargadoFacturacion = encargadoFacturacion;
	}

}

package com.vipper.modelo;

import java.io.Serializable;
import java.time.LocalDate;

public class facturas implements Serializable {
	private int id_factura;
	private  int id_ClienteProveedor; 
	private  int id_pedido; 
	private  LocalDate fecha; 
	private  int id_servicio;
	private  double importe;
	private  int id_formaPago;
	private  int id_contrato;
	private  String concepto; 
	private  double iva;
	
	@Override
	public String toString() {
		return "facturas [id_factura=" + id_factura + ", id_ClienteProveedor=" + id_ClienteProveedor + ", id_pedido="
				+ id_pedido + ", fecha=" + fecha + ", id_servicio=" + id_servicio + ", importe=" + importe
				+ ", id_formaPago=" + id_formaPago + ", id_contrato=" + id_contrato + ", concepto=" + concepto
				+ ", iva=" + iva + "]";
	}

	public facturas() {
		super();
	}

	public facturas(int id_factura, int id_ClienteProveedor, int id_pedido, LocalDate fecha, int id_servicio,
			double importe, int id_formaPago, int id_contrato, String concepto, double iva) {
		super();
		this.id_factura = id_factura;
		this.id_ClienteProveedor = id_ClienteProveedor;
		this.id_pedido = id_pedido;
		this.fecha = fecha;
		this.id_servicio = id_servicio;
		this.importe = importe;
		this.id_formaPago = id_formaPago;
		this.id_contrato = id_contrato;
		this.concepto = concepto;
		this.iva = iva;
	}

	public int getId_factura() {
		return id_factura;
	}

	public void setId_factura(int id_factura) {
		this.id_factura = id_factura;
	}

	public int getId_ClienteProveedor() {
		return id_ClienteProveedor;
	}

	public void setId_ClienteProveedor(int id_ClienteProveedor) {
		this.id_ClienteProveedor = id_ClienteProveedor;
	}

	public int getId_pedido() {
		return id_pedido;
	}

	public void setId_pedido(int id_pedido) {
		this.id_pedido = id_pedido;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public int getId_servicio() {
		return id_servicio;
	}

	public void setId_servicio(int id_servicio) {
		this.id_servicio = id_servicio;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public int getId_formaPago() {
		return id_formaPago;
	}

	public void setId_formaPago(int id_formaPago) {
		this.id_formaPago = id_formaPago;
	}

	public int getId_contrato() {
		return id_contrato;
	}

	public void setId_contrato(int id_contrato) {
		this.id_contrato = id_contrato;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public double getIva() {
		return iva;
	}

	public void setIva(double iva) {
		this.iva = iva;
	}
	
	

}

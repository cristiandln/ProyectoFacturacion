package com.vipper.modelo;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

public class pedidos implements Serializable{
	private int id_pedido;
	private String descripcion;
	private int id_ClienteProveedor;
	private int id_forma_pago;
	private double total;
	private Date fecha;
	private int id_servicio;
	private int id_contrato;
	private double importe_facturado;
	
	@Override
	public String toString() {
		return "pedidos [id_pedido=" + id_pedido + ", descripcion=" + descripcion + ", id_ClienteProveedor="
				+ id_ClienteProveedor + ", id_forma_pago=" + id_forma_pago + ", total=" + total + ", fecha=" + fecha
				+ ", id_servicio=" + id_servicio + ", id_contrato=" + id_contrato + ", importe_facturado="
				+ importe_facturado + "]";
	}
	
	public pedidos() {
		// TODO Auto-generated constructor stub
	}

	public pedidos(int id_pedido, String descripcion, int id_ClienteProveedor, int id_forma_pago, double total,
			Date fecha, int id_servicio, int id_contrato, double importe_facturado) {
		super();
		this.id_pedido = id_pedido;
		this.descripcion = descripcion;
		this.id_ClienteProveedor = id_ClienteProveedor;
		this.id_forma_pago = id_forma_pago;
		this.total = total;
		this.fecha = fecha;
		this.id_servicio = id_servicio;
		this.id_contrato = id_contrato;
		this.importe_facturado = importe_facturado;
	}

	

	/**
	 * @return the id_pedido
	 */
	public int getId_pedido() {
		return id_pedido;
	}

	/**
	 * @param id_pedido the id_pedido to set
	 */
	public void setId_pedido(int id_pedido) {
		this.id_pedido = id_pedido;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the id_ClienteProveedor
	 */
	public int getId_ClienteProveedor() {
		return id_ClienteProveedor;
	}

	/**
	 * @param id_ClienteProveedor the id_ClienteProveedor to set
	 */
	public void setId_ClienteProveedor(int id_ClienteProveedor) {
		this.id_ClienteProveedor = id_ClienteProveedor;
	}

	/**
	 * @return the id_forma_pago
	 */
	public int getId_forma_pago() {
		return id_forma_pago;
	}

	/**
	 * @param id_forma_pago the id_forma_pago to set
	 */
	public void setId_forma_pago(int id_forma_pago) {
		this.id_forma_pago = id_forma_pago;
	}

	/**
	 * @return the total
	 */
	public double getTotal() {
		return total;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(double total) {
		this.total = total;
	}

	/**
	 * @return the fecha
	 */
	public Date getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	/**
	 * @return the id_servicio
	 */
	public int getId_servicio() {
		return id_servicio;
	}

	/**
	 * @param id_servicio the id_servicio to set
	 */
	public void setId_servicio(int id_servicio) {
		this.id_servicio = id_servicio;
	}

	/**
	 * @return the id_contrato
	 */
	public int getId_contrato() {
		return id_contrato;
	}

	/**
	 * @param id_contrato the id_contrato to set
	 */
	public void setId_contrato(int id_contrato) {
		this.id_contrato = id_contrato;
	}

	/**
	 * @return the importe_facturado
	 */
	public double getImporte_facturado() {
		return importe_facturado;
	}

	/**
	 * @param importe_facturado the importe_facturado to set
	 */
	public void setImporte_facturado(double importe_facturado) {
		this.importe_facturado = importe_facturado;
	}
	
	
	

}

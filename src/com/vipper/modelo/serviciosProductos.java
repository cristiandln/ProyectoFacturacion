package com.vipper.modelo;

import java.io.Serializable;

public class serviciosProductos implements Serializable{
private int id_servicio;
private String descripcion;
private double coste;
private int id_ClienteProveedor;
private double iva;

public serviciosProductos() {
	// TODO Auto-generated constructor stub
}

public serviciosProductos(int id_servicio, String descripcion, double coste, int id_ClienteProveedor, double iva) {
	super();
	this.id_servicio = id_servicio;
	this.descripcion = descripcion;
	this.coste = coste;
	this.id_ClienteProveedor = id_ClienteProveedor;
	this.iva = iva;
}

@Override
public String toString() {
	return "serviciosProductos [id_servicio=" + id_servicio + ", descripcion=" + descripcion + ", coste=" + coste
			+ ", id_ClienteProveedor=" + id_ClienteProveedor + ", iva=" + iva + "]";
}

public int getId_servicio() {
	return id_servicio;
}

public void setId_servicio(int id_servicio) {
	this.id_servicio = id_servicio;
}

public String getDescripcion() {
	return descripcion;
}

public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}

public double getCoste() {
	return coste;
}

public void setCoste(double coste) {
	this.coste = coste;
}

public int getId_ClienteProveedor() {
	return id_ClienteProveedor;
}

public void setId_ClienteProveedor(int id_ClienteProveedor) {
	this.id_ClienteProveedor = id_ClienteProveedor;
}

public double getIva() {
	return iva;
}

public void setIva(double iva) {
	this.iva = iva;
}



}

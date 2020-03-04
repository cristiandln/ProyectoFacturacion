package com.vipper.modelo;

import java.io.Serializable;

public class formaDePago implements Serializable {
int id_formaPago;
String descripcion;
double valor;


@Override
public String toString() {
	return "formaDePago [id_formaPago=" + id_formaPago + ", descripcion=" + descripcion + ", valor=" + valor + "]";
}
public formaDePago(int id_formaPago, String descripcion, double valor) {
	super();
	this.id_formaPago = id_formaPago;
	this.descripcion = descripcion;
	this.valor = valor;
}
public formaDePago() {
	super();
}
public int getId_formaPago() {
	return id_formaPago;
}
public void setId_formaPago(int id_formaPago) {
	this.id_formaPago = id_formaPago;
}
public String getDescripcion() {
	return descripcion;
}
public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}
public double getValor() {
	return valor;
}
public void setValor(double valor) {
	this.valor = valor;
}


}

package com.krakeded.demo;

public class Producto {

	private int codigo;
	private String nombre;
	private String descripcion;
	private double peso;
	
	//getter y setter
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	//constructor con dos parametros codigo y nombre
	public Producto(int codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}
	
	
	
	
	
}

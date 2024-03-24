package com.clearminds.componentes;

public class Celda {
	private Producto producto;
	private int stock;
	private String codigo;
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public void ingresarProducto(Producto producto, int stockInicial) {
		this.producto = producto;
		stock = stockInicial;
	}
	public Celda(String codigo) {
		this.codigo = codigo;
	}
	
	public void imprimir() {
		System.out.println("*****************CELDA "+getCodigo());
		System.out.println("Stock:"+getStock());
		if(getProducto() != null) {
			System.out.println("Nombre Producto: "+ getProducto().getNombre());
			System.out.println("Precio Producto: "+ getProducto().getPrecio());
			System.out.println("Codigo Producto: "+ getProducto().getCodigo());
		}else {
			System.out.println("La celda no tiene producto");
		}
	}
	
}

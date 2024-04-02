package com.krakedev.persistencia.entidades;

import java.math.BigDecimal;

public class Profesor {

	private int codigo;
    private String nombre;
    private BigDecimal saldo;
    
	public Profesor(int codigo, String nombre, BigDecimal saldo) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.saldo = saldo;
	}
	public Profesor() {
	}
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
	public BigDecimal getSaldo() {
		return saldo;
	}
	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}
	@Override
	public String toString() {
		return "Profesor [codigo=" + codigo + ", nombre=" + nombre + ", saldo=" + saldo + "]";
	}
    
    
}

package com.entidades;

public class Numero {

	private String numeroCarta;
	private int valor;
	
	public String getNumeroCarta() {
		return numeroCarta;
	}
	public void setNumeroCarta(String numeroCarta) {
		this.numeroCarta = numeroCarta;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public Numero(String nuevaCarta, int valor) {
		this.numeroCarta = nuevaCarta;
		this.valor = valor;
	}
	public void mostrar() {
		System.out.println(getNumeroCarta()+"-"+getValor());
	}
}

package com.krakedev;

public class Calculadora {
	
	public int sumar(int valor1,int valor2) {
		return valor1+valor2;
	}
	

	public int restar(int valor1,int valor2) {
		return valor1-valor2;
	}
	
	/**
	 * metodo multiplicar 
	 * @param valor1
	 * @param valor2
	 * @return
	 */
	public double multiplicar(double valor1, double valor2) {
		return valor1*valor2;
	}
	/**
	 * metodo dividir
	 * @param dividendo
	 * @param divisor
	 * @return
	 */
	public double dividir(double dividendo, double divisor) {
		return dividendo/divisor;
	}
	/**
	 * metodo promediar
	 * @param valor1
	 * @param valor2
	 * @param valor3
	 * @return
	 */
	public double promediar(double valor1,double valor2,double valor3) {
		return (valor1+valor2+valor3)/3;
	}
	
	public void mostrarResultado() {
		System.out.println("Ahorita no joven, Sali almuerzo. Regreso en 15 minutos");
	}

}

package com.krakedev.test;

import com.krakedev.Calculadora;

public class TestCalculadora {
	public static void main(String[] args) {
		Calculadora calcu = new Calculadora();
		int resultadoSuma;
		int resultadoResta;
		double resultadoMultiplicar;
		double resultadoDividir;
		double resultadoPromediar;
		resultadoSuma=calcu.sumar(4, 5);
		resultadoResta = calcu.restar(6, 2);
		System.out.println("Resultado Suma: "+ resultadoSuma);
		System.out.println("Resultado Suma: "+ resultadoResta);
		
		
		//mutiplicar
		System.out.println("********multiplicar***************");
		resultadoMultiplicar = calcu.multiplicar(10, 5);
		System.out.println("Resultado multiplicar: " + resultadoMultiplicar);
		//Dividir
		System.out.println("********divicir***************");
		resultadoDividir = calcu.dividir(10, 2);
		System.out.println("Resultado dividir: " + resultadoDividir);
		
		//promediar
		System.out.println("********promediar***************");
		resultadoPromediar = calcu.promediar(10, 8,9);
		System.out.println("Resultado promediar: " + resultadoPromediar);
		
		calcu.mostrarResultado();
		
	}

}

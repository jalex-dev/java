package com.krakedev;

public class TestCalculadora {
	public static void main(String[] args) {
		Calculadora calcu = new Calculadora();
		int resultadoSuma;
		int resultadoResta;
		resultadoSuma=calcu.sumar(4, 5);
		resultadoResta = calcu.restar(6, 2);
		System.out.println("Resultado Suma: "+ resultadoSuma);
	}

}

package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		
		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo();

		int areaR1;
		int areaR2;
		double perimetroP1;
		double perimetroP2;
		r1.base = 10;
		r1.altura = 5;
		
	
		r2.base = 8;
		r2.altura = 3;

		areaR1=r1.calcularArea();
		
		areaR2=r2.calcularArea();
		
		perimetroP1 = r1.calcularPerimetro();
		perimetroP2 = r2.calcularPerimetro();
		
		

		
		System.out.println("Area de R1: "+areaR1);
		System.out.println("Area de R2: "+areaR2);

		System.out.println("Perimetro de R1: "+perimetroP1);
		System.out.println("Perimetro de R2: "+perimetroP2);
	}

}

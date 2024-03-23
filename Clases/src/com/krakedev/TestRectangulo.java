package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		
		Rectangulo r1 = new Rectangulo(10,2);
		Rectangulo r2 = new Rectangulo(8,3);

		int areaR1;
		int areaR2;
		double perimetroP1;
		double perimetroP2;
		//r1.setBase(10);
		//r1.setAltura(5);
		
	
		//r2.setBase(8);
		//r2.setAltura(3);

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

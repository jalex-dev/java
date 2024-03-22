package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		Cuadrado c1 = new Cuadrado();
		Cuadrado c2 = new Cuadrado();
		Cuadrado c3 = new Cuadrado();

		c1.setLado(4);
		c2.setLado(6);
		c3.setLado(12);
		
		double areaC1;
		double perimetroC1;
		
		double areaC2;
		double perimetroC2;
		
		double areaC3;
		double perimetroC3;
		
		
		//mostrar resultado
		System.out.println("******************Cuadrado 1******************");
		areaC1= c1.calcularArea() ;
		System.out.println("Area de C1: "+ areaC1);
		perimetroC1 =c1.calcularPerimetro();
		System.out.println("Perimetro de C1: "+perimetroC1);

		//mostrar resultado
		System.out.println("******************Cuadrado 2******************");
		areaC2= c2.calcularArea() ;
		System.out.println("Area de C2: "+ areaC2);
		perimetroC2 =c2.calcularPerimetro();
		System.out.println("Perimetro de C2: "+perimetroC2);
		
		//mostrar resultado
		System.out.println("******************Cuadrado 3******************");
		areaC3= c3.calcularArea() ;
		System.out.println("Area de C3: "+ areaC3);
		perimetroC3 =c3.calcularPerimetro();
		System.out.println("Perimetro de C3: "+perimetroC3);
}

}

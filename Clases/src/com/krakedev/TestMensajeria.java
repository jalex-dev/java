package com.krakedev;

public class TestMensajeria {

	int num = 5 ;
	public static void main(String[] args) {
		
		TestMensajeria obj = new TestMensajeria();
		
		Mensajeria m = new Mensajeria();
		m.saludar();
		m.saludarAmigo("Joao", "Rodrig");
		
		System.out.println(obj.num);
	}
	

}

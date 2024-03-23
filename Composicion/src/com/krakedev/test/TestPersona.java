

package com.krakedev.test;

import com.krakedev.composicion.Direccion;
import com.krakedev.composicion.Persona;

public class TestPersona {
	public static void main(String[] args) {
		Persona p1 = new Persona();
		
		p1.setNombre("Graciela");
		p1.setApellido("Benabides");
		Direccion dir1 = new Direccion();
		dir1.setCallePrimaria("Avenida siempre viva");
		dir1.setCalleSecundaria("la que cruxa");
		dir1.setNumero("N-54");
		
		p1.setDireccion(dir1);
		String nombre = p1.getNombre();
		
		
		Direccion d1= p1.getDireccion();
		
		System.out.println("Nombre: "+nombre);
		//d1 esta null y trato de invocar un metodo con esa varible 
		System.out.println(d1.getCallePrimaria());
							//null.algunMetodo
		p1.imprimir();
		
		Persona p2 = new  Persona()	;
		p2.setNombre("Anastacia");
		Direccion d2 = new Direccion("Av shyris", "Eloy alfaro", "S/N");
		p2.setDireccion(d2);
		p2.imprimir();
		
		Persona p3 = new Persona();
		p3.setDireccion(new Direccion("ssss","eew","123"));
		p3.imprimir();
		System.out.println("Fin");

		
	}

}

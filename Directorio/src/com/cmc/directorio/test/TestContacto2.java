package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Admincontactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto2 {

	public static void main(String[] args) {

		// Crear dos objetos de tipo Contacto
        Telefono telefono1 = new Telefono("movi", "0982234234", 20);
        Telefono telefono2 = new Telefono("claro", "0997123456", 15);
        
        Contacto contactoMasPesado;
        
        Contacto contacto1 = new Contacto("Juan", "Pérez", telefono1, 70.5);
        Contacto contacto2 = new Contacto("María", "López", telefono2, 65.2);
	
        Admincontactos ac = new Admincontactos();
        contactoMasPesado= ac.buscarMasPesado(contacto1, contacto2);
        if (contactoMasPesado != null) {
            System.out.println("\nEl contacto más pesado es: " );
            contactoMasPesado.imprimir();
        } else {
            System.out.println("\nAmbos contactos tienen el mismo peso.");
        }
        
        // Comparar las operadoras de los teléfonos de los contactos
        boolean mismaOperadora = ac.compararOperadoras(contacto1, contacto2);
       
        System.out.println("\nLos dos contactos tienen la misma operadora: "+ mismaOperadora);
        
	}

}

package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Admincontactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {

	public static void main(String[] args) {
		Telefono telf = new Telefono("movi", "0982234234", 20);
		AdminTelefono at = new AdminTelefono();
		Admincontactos ac = new Admincontactos();
		
        Contacto c = new Contacto("Juana", "Torres", telf, 70.5);
        
        
        System.out.println("Nombre: " + c.getNombre());
		System.out.println("Apellido: " + c.getApellido());
		System.out.println("Activo: " + (c.isActivo() ? "Sí" : "No"));

		System.out.println("Teléfono: " + telf.getNumero() + "| Operadora: " + telf.getOperadora()+ "| Tiene Whatsapp: "+telf.isTieneWhatsapp());

		System.out.println("Peso: " + c.getPeso() + " kg");
		
		ac.activarUsuario(c);
		c.imprimir();
		//activar mensajeria
		at.activarMensajeria(telf);
		
		ac.activarUsuario(c);
		c.imprimir();


	}

}

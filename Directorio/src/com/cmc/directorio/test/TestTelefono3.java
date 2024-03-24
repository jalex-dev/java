package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {
	public static void main(String[] args) {
		// Crear tres objetos de tipo Telefono
        Telefono telefono1 = new Telefono("movi", "0982234234", 20);
        Telefono telefono2 = new Telefono("claro", "0997123456", 15);
        Telefono telefono3 = new Telefono("movi", "0978112233", 30);
        
        AdminTelefono at = new AdminTelefono();
        int contarMovi =at.contarMovi(telefono1, telefono2, telefono3);
        System.out.println("Telefono de la operadora movi: "+ contarMovi);
	}

}

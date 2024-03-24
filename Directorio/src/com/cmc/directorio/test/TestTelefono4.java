package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono4 {
	public static void main(String[] args) {
		Telefono telefono1 = new Telefono("movi", "0982234234", 20);
        Telefono telefono2 = new Telefono("claro", "0997123456", 15);
        Telefono telefono3 = new Telefono("movi", "0978112233", 30);
        Telefono telefono4 = new Telefono("claro", "0997123426", 25);

        
        AdminTelefono at = new AdminTelefono();
        int contarClaro =at.contarClaro(telefono1, telefono2, telefono3,telefono4);
        System.out.println("Telefono de la operadora claro: "+ contarClaro);
	}

}

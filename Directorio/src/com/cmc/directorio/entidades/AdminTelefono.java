package com.cmc.directorio.entidades;

public class AdminTelefono {
	
	public void activarMensajeria(Telefono telf) {
		if(telf.getOperadora() =="movi") {
			
			telf.setTieneWhatsapp(true);
			System.out.println("Se activo mensajeria a este numero "+telf.getNumero());
		}
	}
	
	public int contarMovi(Telefono telefono1, Telefono telefono2, Telefono telefono3) {
		int contadorMovi = 0;

		if (telefono1.getOperadora().equalsIgnoreCase("movi")) {
			contadorMovi++;
		}
		if (telefono2.getOperadora().equalsIgnoreCase("movi")) {
			contadorMovi++;
		}
		if (telefono3.getOperadora().equalsIgnoreCase("movi")) {
			contadorMovi++;
		}

		return contadorMovi;
	}
	
	public int contarClaro(Telefono telefono1, Telefono telefono2, Telefono telefono3,Telefono telefono4) {
		int contadorClaro = 0;

		if (telefono1.getOperadora().equalsIgnoreCase("claro")) {
			contadorClaro++;
		}
		if (telefono2.getOperadora().equalsIgnoreCase("claro")) {
			contadorClaro++;
		}
		if (telefono3.getOperadora().equalsIgnoreCase("claro")) {
			contadorClaro++;
		}
		if (telefono4.getOperadora().equalsIgnoreCase("claro")) {
			contadorClaro++;
		}

		return contadorClaro ;
	}

}

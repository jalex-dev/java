package com.cmc.directorio.entidades;

public class Admincontactos {

	public Contacto buscarMasPesado(Contacto c1, Contacto c2) {
		if (c1.getPeso() > c2.getPeso()) {
			return c1;
		} else if (c2.getPeso() > c1.getPeso()) {
			return c2;
		} else {
			return null; // Ambos contactos tienen el mismo peso
		}
	}
	
	public boolean compararOperadoras(Contacto contacto1, Contacto contacto2) {
	    if (contacto1.getTelefono() != null && contacto2.getTelefono() != null) {
	        String operadora1 = contacto1.getTelefono().getOperadora();
	        String operadora2 = contacto2.getTelefono().getOperadora();
	        
	        return operadora1.equalsIgnoreCase(operadora2);
	    } else {
	        return false; // Al menos uno de los contactos no tiene información de teléfono
	    }
	}

	public void activarUsuario(Contacto contacto) {
	    if (contacto.getTelefono() != null && contacto.getTelefono().isTieneWhatsapp()) {
	        contacto.setActivo(true);
	    }
	}
}

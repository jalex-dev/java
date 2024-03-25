package com.krakedev.evaluacion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Directorio {
	 private ArrayList<Contacto> contactos;
	    private Date fechaModificacion;
	    
	    private ArrayList<Contacto> correctos;
	    private ArrayList<Contacto> incorrectos;

	    // Constructor
	    public Directorio() {
	        contactos = new ArrayList<>();
	        fechaModificacion = new Date(); // Fecha actual
	    }

	    // Método para agregar un contacto al directorio
	    public boolean agregarContacto(Contacto contacto) {
	    	if (buscarPorCedula(contacto.getCedula()) == null) {
	            boolean agregado = contactos.add(contacto);
	            if (agregado) {
	                fechaModificacion = new Date(); // Actualizar fecha de modificación
	            }
	            return agregado;
	        } else {
	            return false; // No se puede agregar el contacto si la cédula ya existe
	        }
	    }

	    // Método para buscar un contacto por cédula
	    public Contacto buscarPorCedula(String cedula) {
	        for (Contacto contacto : contactos) {
	            if (contacto.getCedula().equals(cedula)) {
	                return contacto;
	            }
	        }
	        return null; // Retornar null si no se encuentra el contacto
	    }
	 // Método para consultar la fecha de última modificación
	    public String consultarUltimaModificacion() {
	        SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	        return formato.format(fechaModificacion);
	    }
	    // Método para contar los contactos sin dirección asignada
	    public int contarPerdidos() {
	        int sinDirección = 0;
	        for (Contacto contacto : contactos) {
	            if (contacto.getDireccion() == null) {
	                sinDirección++;
	            }
	        }
	        return sinDirección;
	    }
	    
	    public int contarFijos() {
	        int fijos = 0;
	        for (Contacto contacto : contactos) {
	            for (Telefono telefono : contacto.getTelefonos()) {
	                if (telefono.getTipo().equals("Convencional") && telefono.getEstado().equals("C")) {
	                    fijos++;
	                    break; // Salir del bucle interno una vez que se encuentra un teléfono fijo con estado "C"
	                }
	            }
	        }
	        return fijos;
	    }
	    
	    
	    
	    public ArrayList<Contacto> getCorrectos() {
			return correctos;
		}

		public void setCorrectos(ArrayList<Contacto> correctos) {
			this.correctos = correctos;
		}

		public ArrayList<Contacto> getIncorrectos() {
			return incorrectos;
		}

		public void setIncorrectos(ArrayList<Contacto> incorrectos) {
			this.incorrectos = incorrectos;
		}
		
		

		public ArrayList<Contacto> getContactos() {
			return contactos;
		}

		public void setContactos(ArrayList<Contacto> contactos) {
			this.contactos = contactos;
		}

		// Método para depurar los contactos
	    public void depurar() {
	        correctos = new ArrayList<>();
	        incorrectos = new ArrayList<>();

	        for (Contacto contacto : contactos) {
	            if (contacto.getDireccion() != null) {
	                correctos.add(contacto);
	            } else {
	                incorrectos.add(contacto);
	            }
	        }

	        // Vaciar la lista de contactos
	        contactos.clear();
	    }
}

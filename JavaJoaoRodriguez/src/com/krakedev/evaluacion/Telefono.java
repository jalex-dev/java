package com.krakedev.evaluacion;

public class Telefono {
	private String numero;
	private String tipo;
	private String estado;
	
	public String getNumero() {
		return numero;
	}
	public String getTipo() {
		return tipo;
	}
	public String getEstado() {
		return estado;
	}
	
	 // Constructor
    public Telefono(String número, String tipo) {
        this.numero = número;
        this.tipo = tipo;
        validarTelefono();
    }
    
 // Método para validar el teléfono y establecer su estado
    private void validarTelefono() {
        if (numero != null && tipo != null) {
            if (tipo.equals("Movil") && numero.length() == 10) {
                estado = "C";
            } else if (tipo.equals("Convencional") && numero.length() == 7) {
                estado = "C";
            } else {
                estado = "E";
            }
        } else {
            estado = "E";
        }
    }
}

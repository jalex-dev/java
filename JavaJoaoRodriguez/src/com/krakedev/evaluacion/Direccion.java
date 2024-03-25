package com.krakedev.evaluacion;

public class Direccion {
	private String callePrincipal;
    private String calleSecundaria;

    // Constructor
    public Direccion(String callePrincipal, String calleSecundaria) {
        this.callePrincipal = callePrincipal;
        this.calleSecundaria = calleSecundaria;
    }

    // Getter para callePrincipal
    public String getCallePrincipal() {
        return callePrincipal;
    }

    // Setter para callePrincipal
    public void setCallePrincipal(String callePrincipal) {
        this.callePrincipal = callePrincipal;
    }

    // Getter para calleSecundaria
    public String getCalleSecundaria() {
        return calleSecundaria;
    }

    // Setter para calleSecundaria
    public void setCalleSecundaria(String calleSecundaria) {
        this.calleSecundaria = calleSecundaria;
    }
}

package com.krakedev.estaticos.ejercicio.test;

import java.util.ArrayList;

import com.krakedev.estaticos.ejercicio.entidades.Alarma;
import com.krakedev.estaticos.ejercicio.logica.AdminAlarmas;
import com.krakedev.estaticos.ejercicio.utils.DiaSemana;

public class TestAlarmas {
	public static void main(String[] args) {
		
		Alarma alarma1= new Alarma(DiaSemana.LUNES,5,45);
		Alarma alarma2= new Alarma(DiaSemana.MARTES,13,00);
		Alarma alarma3= new Alarma(DiaSemana.MIERCOLES,23,00);
		
		AdminAlarmas admin= new AdminAlarmas();
		
		admin.agregarAlarma(alarma1);
		admin.agregarAlarma(alarma2);
		admin.agregarAlarma(alarma3);
		
		ArrayList<Alarma> alarmasActuales= admin.getAlarmas();
		
		System.out.println("Lista de alarmas: ");
        for (Alarma alarma : alarmasActuales) {
            System.out.println(alarma);
        }
		
	}

}

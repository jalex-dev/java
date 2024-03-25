package krakedev.entidades;

public class Nota {
	private Materia materia;
	private double calificacion;
	
	
	public Materia getMateria() {
		return materia;
	}


	public void setMateria(Materia materia) {
		this.materia = materia;
	}


	public double getCalificacion() {
		return calificacion;
	}


	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}


	public Nota(Materia materia, double calificacion) {
		this.materia = materia;
		this.calificacion = calificacion;
	}


	// Método para mostrar la información de la nota con un formato específico
    public void mostrar() {
        System.out.print("clase[");
        if (materia != null) {
            System.out.print("codigo=" + materia.getCodigo() + " ");
            System.out.print("nombre=" + materia.getNombre() + " ");
        }
        System.out.println("calificacion=" + calificacion + "]");
    }
	

}

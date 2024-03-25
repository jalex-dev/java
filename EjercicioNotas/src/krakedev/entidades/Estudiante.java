package krakedev.entidades;

import java.util.ArrayList;

public class Estudiante {
	
	private String nombre;
	private String apellido;
	private String cedula;
	private ArrayList<Nota> notas;
	
	
	
	 public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public ArrayList<Nota> getNotas() {
		return notas;
	}
	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}
	// Constructor
    public Estudiante( String cedula,String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.notas = new ArrayList<Nota>();
    }
    
 // Constructor
    public Estudiante( ) {
        this.notas = new ArrayList<Nota>();
    }
    // Método para agregar una nueva nota verificando si ya existe una nota con el mismo código de materia
    public void agregarNota(Nota nota) {
        String codigoMateria = nota.getMateria().getCodigo();
        for (Nota n : notas) {
            if (n.getMateria().getCodigo().equals(codigoMateria)) {
                System.out.println("La materia con código " + codigoMateria + " ya tiene una calificación asignada.");
                return;
            }
        }
        double calificacion = nota.getCalificacion();
        if (calificacion >= 0 && calificacion <= 10) {
            notas.add(nota);
        } else {
            System.out.println("La calificación debe estar entre 0 y 10.");
        }
    }
    // Método para modificar la calificación de una materia por su código
    public void modificarNota(String codigoMateria, double nuevaCalificacion) {
        boolean encontrado = false;
        for (Nota nota : notas) {
            if (nota.getMateria().getCodigo().equals(codigoMateria)) {
                if (nuevaCalificacion >= 0 && nuevaCalificacion <= 10) {
                    nota.setCalificacion(nuevaCalificacion);
                    encontrado = true;
                } else {
                    System.out.println("La nueva calificación debe estar entre 0 y 10.");
                }
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Código de materia no encontrado.");
        }
    }

 // Método para calcular el promedio de las notas del estudiante
    public double calcularPromedioNotasEstudiante() {
        double sumaCalificaciones = 0;
        for (Nota nota : notas) {
            sumaCalificaciones += nota.getCalificacion();
        }
        if (!notas.isEmpty()) {
            return sumaCalificaciones / notas.size();
        } else {
            return 0;
        }
    }
    public void mostrar() {
        System.out.print("Estudiante[nombre=" + nombre + " apellido=" + apellido + " cedula=" + cedula + " notas=");
        if (!notas.isEmpty()) {
            for (Nota nota : notas) {
                nota.mostrar();
            }
        } else {
            System.out.print("Sin notas asignadas");
        }
        System.out.println("]");
    }
}

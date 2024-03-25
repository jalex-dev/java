package krakedev.entidades;

import java.util.ArrayList;

public class Curso {
	private ArrayList<Estudiante> estudiantes;
	
	 public Curso() {
	        estudiantes = new ArrayList<>();
	    }
	
	public Estudiante buscarEstudiantePorCedula(String cedula) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getCedula().equals(cedula)) {
                System.out.println("El estudiante con cédula " + cedula + " ya está matriculado en el curso.");
                return null;
            }
        }
        return new Estudiante(); // Retornar un estudiante vacío si no se encuentra
    }
	
	 // Método para matricular un estudiante en el curso
    public void matricularEstudiante(Estudiante estudiante) {
        Estudiante encontrado = buscarEstudiantePorCedula(estudiante.getCedula());
        if (encontrado != null) {
            estudiantes.add(estudiante);
        }
    }
    
    public double calcularPromedioCurso() {
        if (!estudiantes.isEmpty()) {
            double sumaPromedios = 0;
            for (Estudiante estudiante : estudiantes) {
                sumaPromedios += estudiante.calcularPromedioNotasEstudiante();
            }
            return sumaPromedios / estudiantes.size();
        } else {
            return 0;
        }
    }
    public void mostrar() {
        System.out.print("Curso[estudiantes=");
        if (!estudiantes.isEmpty()) {
            for (Estudiante estudiante : estudiantes) {
                estudiante.mostrar();
            }
        } else {
            System.out.print("Sin estudiantes matriculados");
        }
        System.out.println("]");
    }

	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}
    
    
}

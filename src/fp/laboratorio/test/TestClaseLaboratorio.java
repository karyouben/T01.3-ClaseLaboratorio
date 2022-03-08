package fp.laboratorio.test;

import java.time.LocalDateTime;
import java.time.Month;

import fp.laboratorio.ClaseLaboratorio;
import fp.laboratorio.ClaseLaboratorioImpl;
import fp.laboratorio.Estudiante;
import fp.laboratorio.EstudianteImpl;

public class TestClaseLaboratorio {

	public static void main(String[] args) {
		ClaseLaboratorio clase = new ClaseLaboratorioImpl(6);
		System.out.println("Numero de estudiantes: " + clase);
		
		// Ejercicio 5
		//Defina el profesor,aula y horario para el laboratorio.
		clase.setAula("A4.30");
		clase.setProfesor("Jane Doe");
		clase.setFechaHora(LocalDateTime.of(2019, Month.FEBRUARY,22,15,30));
		System.out.println(clase);
		
		Estudiante e7 = new EstudianteImpl ("Margaret", "Hamilton", "marham");
		e7.sumarPuntos(23.0);
		System.out.println(e6==e7);
		System.out.println(e6.equals(e7));
		System.out.println(e6.hashCode());
		System.out.println(e7.hashCode());
		System.out.println(e1.hashCode());
		
		System.out.println(e1.compareTo(e7));

	}

}

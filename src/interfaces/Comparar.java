package interfaces;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import javax.annotation.Generated;

public class Comparar {
	
	public static void main(String[] args) {
		List<Estudiante> estudiantes = new LinkedList<>();
		
		estudiantes.add(new Estudiante(23456789, "Jones Luis", 34512));
		estudiantes.add(new Estudiante(56524221, "Andrade Andrea", 754857));
		estudiantes.add(new Estudiante(23323131, "Danone Gino", 23311));
		estudiantes.add(new EstudianteAyudante(37278327, "Pedraza Jimena", 21123));
		
		
		for (Estudiante e: estudiantes) {
			System.out.println(e);
		}
		
		Collections.sort(estudiantes);

		System.out.println("---Ordenados---");
		for (Estudiante e: estudiantes) {
			System.out.println(e);
		}
		
		Collections.sort(estudiantes, new PersonaPorDniComparator());

		System.out.println("---Ordenados---");
		for (Estudiante e: estudiantes) {
			System.out.println(e);
		}
		
		
	}
}

class PersonaPorDniComparator implements Comparator<Persona> {
	@Override
	public int compare(Persona o1, Persona o2) {
		return o1.getDni() - o2.getDni();
	}
}


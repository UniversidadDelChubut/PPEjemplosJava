package edu.udc.pp.interfacescondefault;

import java.util.LinkedList;
import java.util.List;

public class TestInterfas {

	public static void main(String[] args) {
		
		List<Asalariado> trabajadores = new LinkedList<>();
		
		trabajadores.add(new Docente(12345678, "Carlos", 5));
		trabajadores.add(new EstudianteAyudante(12345679, "Maximo", 45678));
		
		//trabajadores.add(new Estudiante(12345679, "Maximo", 45678));
	}

}

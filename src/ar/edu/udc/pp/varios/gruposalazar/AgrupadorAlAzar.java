package ar.edu.udc.pp.varios.gruposalazar;

import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.io.BufferedReader;

public class AgrupadorAlAzar {

	private List <String> todosNombres = new LinkedList<String>();
	
	public AgrupadorAlAzar(String archivoNombres) {
		
		try {
			
			BufferedReader br = new BufferedReader(new FileReader(archivoNombres));
			String nombre;
			while ((nombre=br.readLine())!= null) {
				if (! todosNombres.contains(nombre)) {
					todosNombres.add(nombre);
				}
			}
			br.close();
		} catch (IOException e) {
			System.out.println("Error al obtener los datos del archivo " + archivoNombres );
			e.printStackTrace();
		}
		

		
	}
	
	@SuppressWarnings("unchecked")
	public void agruparEImprimir(int cantidadGrupos) {
		
		Collections.shuffle(todosNombres);
		
		@SuppressWarnings("rawtypes")
		List [] grupos =  new List[cantidadGrupos];  
		for (int i = 0;  i < cantidadGrupos; i++) {		
			grupos[i] = new LinkedList<String>();
		}
		
		
		
		int i = 0;
		for (String nombre: todosNombres) {
			grupos [i++ % cantidadGrupos].add(nombre);
		}
		
		char letra = 'A';
		for (List <String> grupo: grupos){
			Collections.sort(grupo);
			System.out.println("Grupo " + letra++);
			for (String nombre:grupo) {
				System.out.println( "    " + nombre );
			}
			System.out.println("--------");
		}
		
		
	}
}

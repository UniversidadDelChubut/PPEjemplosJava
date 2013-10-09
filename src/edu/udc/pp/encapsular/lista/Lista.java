package edu.udc.pp.encapsular.lista;

import edu.udc.pp.objetos.perros.Perro;

public class Lista {
	
	private Perro [] elementos;
	int indexLibre = 0;

	public Lista() {
		this.elementos = new Perro[5];
	}
	
	public void add(Perro perro) {
		if (indexLibre == this.elementos.length) {
			this.redimensionarLista();
		}
		this.elementos[indexLibre++] = perro;
	}
	
	public Perro get(int pos){
		return this.elementos[pos];
	}
	
	private void redimensionarLista(){
		Perro [] nuevaLista = new Perro[this.elementos.length + 5];
		for (int i = 0; i < this.elementos.length ; i++){
			nuevaLista[i] = this.elementos[i];
		}
		this.elementos = nuevaLista;
	}
	
	public int longitud(){
		return this.indexLibre;
	}
}

	
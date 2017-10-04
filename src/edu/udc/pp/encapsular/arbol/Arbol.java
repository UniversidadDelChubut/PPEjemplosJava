package edu.udc.pp.encapsular.arbol;



public class Arbol {
	
	private NodoArbol raiz;
	private int cantidadNodos = 0;
	
	
	public void agregar (int clave, Persona persona) {
		if (raiz == null) {
			this.raiz = new NodoArbol(clave, persona);
			return;
		}
		
		agregar(this.raiz, clave, persona);
		
		
	}
	
	private void agregar (NodoArbol nodo, int clave, Persona persona) {
		
		if (clave < nodo.getClave()) {
			if (nodo.getIzquierdo() == null) {
				nodo.setIzquierdo(new NodoArbol(clave, persona));
			} else {
				agregar(nodo.getIzquierdo(), clave, persona);
			}
		}
		
		if (clave > nodo.getClave()) {
			if (nodo.getDerecho() == null) {
				nodo.setDerecho(new NodoArbol(clave, persona));
			} else {
				agregar(nodo.getDerecho(), clave, persona);
			}

		}		
	}
	
	

}

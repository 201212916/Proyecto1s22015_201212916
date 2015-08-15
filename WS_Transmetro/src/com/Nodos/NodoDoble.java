package com.Nodos;

public class NodoDoble {

	private Object Dato;
	private NodoDoble siguiente, anterior;

	public NodoDoble() {
		this.Dato = null;
		this.siguiente = null;
		this.anterior = null;
	}

	public NodoDoble(Object dato) {
		this.Dato = dato;
		this.siguiente = null;
		this.anterior = null;
	}

	public Object getDato() {
		return Dato;
	}

	public void setDato(Object dato) {
		Dato = dato;
	}

	public NodoDoble getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(NodoDoble siguiente) {
		this.siguiente = siguiente;
	}

	public NodoDoble getAnterior() {
		return anterior;
	}

	public void setAnterior(NodoDoble anterior) {
		this.anterior = anterior;
	}

}

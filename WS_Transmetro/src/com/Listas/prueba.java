package com.Listas;

class pruebaT <T> {

	T obj;
	
	public pruebaT(T o){
		this.obj = o;
	}
	
	public pruebaT(){
		this.obj = null;
	}
	
	public void tipoClase(){
		System.out.println("EL nodo es de tipo: " + obj.getClass().getName());
	}

}

public class prueba{
	
	public static void main(String [] args){
		
		pruebaT<String> p = new pruebaT<String>();
		
		p.tipoClase();
	}
}

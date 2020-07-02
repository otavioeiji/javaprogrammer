package br.com.impacta.generics;

public class ClasseGenerica<T extends Comparable<T>> {

	private T elemento;
	
	public void setElemento(T elemento){
		this.elemento = elemento;
	}
	
	public T getElemento(){
		//this.elemento
		return this.elemento;
	}

}

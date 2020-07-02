package br.com.impacta.figuras;

public abstract class Figura {
	public abstract double calcularArea();
	public abstract double calcularPerimetro();
	
	public String mostrarInfoFigura(){
		String msg = "A classe Figura possui métodos abstratos, " +
					 "e por isso, a classe deve também ser abstrata";
		return msg;
	}
}

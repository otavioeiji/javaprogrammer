package br.com.impacta.figuras;

public abstract class Figura {
	public abstract double calcularArea();
	public abstract double calcularPerimetro();
	
	public String mostrarInfoFigura(){
		String msg = "A classe Figura possui m�todos abstratos, " +
					 "e por isso, a classe deve tamb�m ser abstrata";
		return msg;
	}
}

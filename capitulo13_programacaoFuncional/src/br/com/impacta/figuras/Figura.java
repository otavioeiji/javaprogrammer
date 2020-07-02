package br.com.impacta.figuras;

public interface Figura {	
	
	double calcularArea();
	double calcularPerimetro();
	/*
	 * Em interfaces, todos os m�todos s�o p�blicos e 
	 * abstratos por defini��o
	 */
	String dataCriacao = "05/07/2015";
	/*
	 * todos atributos de interfaces s�o: public, static e final
	 * por defini��o 
	 */
	
	//M�todo default: similar � m�todo de inst�ncia, por�m comum a
	//todos os objetos de classes que implementam a interface
	default String apresentarFigura(){
		String resultado = "Area: " + this.calcularArea() +
		           "\nPerimetro: " + this.calcularPerimetro();
		return resultado;
	}
	
}

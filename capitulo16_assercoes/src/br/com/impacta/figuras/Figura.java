package br.com.impacta.figuras;

public interface Figura {	
	
	double calcularArea();
	double calcularPerimetro();
	/*
	 * Em interfaces, todos os métodos são públicos e 
	 * abstratos por definição
	 */
	String dataCriacao = "05/07/2015";
	/*
	 * todos atributos de interfaces são: public, static e final
	 * por definição 
	 */
	
	//Método default: similar à método de instância, porém comum a
	//todos os objetos de classes que implementam a interface
	default String apresentarFigura(){
		String resultado = "Area: " + this.calcularArea() +
		           "\nPerimetro: " + this.calcularPerimetro();
		return resultado;
	}
	
}

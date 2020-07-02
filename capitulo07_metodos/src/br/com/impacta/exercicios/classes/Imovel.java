package br.com.impacta.exercicios.classes;

public class Imovel {
	private double area;
	private Endereco endereco;
	private int numComodos;
	private Proprietario proprietario;
	
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public int getNumComodos() {
		return numComodos;
	}
	public void setNumComodos(int numComodos) {
		this.numComodos = numComodos;
	}
	public Proprietario getProprietario() {
		return proprietario;
	}
	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}
	
	public String getDados(){
		String resultado = "Área: " + this.getArea() +
				           "\nNum. Comodos: " + this.getNumComodos();
		
			if(this.getEndereco() != null){
				resultado += "\n=====ENDEREÇO=====\n" +
			    this.getEndereco().getDados();
			}
			if(this.getProprietario() != null){
				resultado += "\n=====PROPRIETÁRIO=====\n" +
				this.getProprietario().getDados();		
			}
		return resultado;
	}
}

package br.com.impacta.exercicios.classes;

public abstract class Imovel {
	private double area;
	private Endereco endereco;
	private int numComodos;
	private Proprietario proprietario;

	public Imovel(double area, 
			      Proprietario proprietario){
		
		this.setArea(area);
		this.setProprietario(proprietario);
	}
	
	public Imovel(double area, 
			      Proprietario proprietario, 
			      Endereco endereco){
		
		this(area, proprietario);
		this.setEndereco(endereco);
	}
	
	public Imovel(double area, 
			      Proprietario proprietario, 
			      int numComodos){
		
		this(area, proprietario);
		this.setNumComodos(numComodos);
	}

	public Imovel(double area, 
			      Proprietario proprietario, 
			      int numComodos,
			      Endereco endereco){
		
		this(area, proprietario, numComodos);
		this.setEndereco(endereco);		
	}
	
	//método abstrato
	public abstract double calcular();
	
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

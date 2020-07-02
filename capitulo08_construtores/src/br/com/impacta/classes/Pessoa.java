package br.com.impacta.classes;

import br.com.impacta.enumeracoes.Sexos;

public class Pessoa {
	
	private String nome;	
	private int idade;
	private Endereco endereco; 	//Pessoa TEM UM Endereco
	private Sexos sexo;			//Pessoa TEM UM Sexo (Sexos)
	
	//Regra: Para definirmos um objeto Pessoa, temos que conhecer,
	//no mínimo, seu nome e seu sexo. Definir construtores que 
	//contemplem esta regra, e em seguida, acrescente outros constru-
	//tores para receber os outros parâmetros. Fazer com que um
	//construtor utilize informações do outro, como na classe Endereco
	
	public Pessoa(String nome, Sexos sexo){
		this.setNome(nome);
		this.setSexo(sexo);
	}
	
	public Pessoa(String nome, Sexos sexo, int idade){
		this(nome, sexo);
		this.setIdade(idade);
	}
	
	public Pessoa(String nome, Sexos sexo, int idade, Endereco end){
		this(nome, sexo, idade);
		this.setEndereco(end);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Sexos getSexo() {
		return sexo;
	}
	public void setSexo(Sexos sexo) {
		this.sexo = sexo;
	}

	public String getDados(String titulo){		
		String resultado = titulo + "\nNome: " + this.getNome() +
				           "\nIdade: " + this.getIdade() + 
				           "\nSexo: " + this.getSexo();
		
						if(this.getEndereco() != null){
				           resultado += "\nEndereço: " +
				           "\n" + this.getEndereco().getDados();
						}
		return resultado;
	}
	public String getDados(){
		return this.getDados("DADOS PESSOAIS");
		
	}
}









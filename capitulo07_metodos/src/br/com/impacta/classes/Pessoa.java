package br.com.impacta.classes;

import br.com.impacta.enumeracoes.Sexos;

public class Pessoa {
	
	private String nome;	
	private int idade;
	private Endereco endereco; 	//Pessoa TEM UM Endereco
	private Sexos sexo;			//Pessoa TEM UM Sexo (Sexos)
	
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









package br.com.impacta.exercicios.classes;

public class Proprietario {
	private String nome, telefone;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getDados(){
		String resultado = "Propriet�rio: " + this.getNome() +
				          "\nTelefone: " + this.getTelefone();
		return resultado;
	}
}

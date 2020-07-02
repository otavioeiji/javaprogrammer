package br.com.impacta.classes;

import br.com.impacta.enumeracoes.Sexos;

public class Cliente extends Pessoa{
	
	private String cpf, telefone;

	public Cliente(String nome, Sexos sexo, String cpf, String fone){
		super(nome, sexo);
		this.setCpf(cpf);
		this.setTelefone(fone);
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	@Override	
	public String getDados(){
		return super.getDados() +
				"\nCPF: " + this.getCpf() +
				"\nTelefone: " + this.getTelefone();		
	}	
}

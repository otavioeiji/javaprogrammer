package br.com.impacta.classes;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

	private String cnpj;
	private String descricao;
	private List<Funcionario> funcionarios;
	
	public Empresa(String cnpj, String descricao){
		this.setCnpj(cnpj);
		this.setDescricao(descricao);
		this.setFuncionarios(new ArrayList<Funcionario>());
	}
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}
	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
	
	@Override
	public String toString(){
		return this.getCnpj() + " - " + this.getDescricao();
	}
}










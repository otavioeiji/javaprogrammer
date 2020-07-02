package br.com.impacta.classes;

import br.com.impacta.enumeracoes.Sexos;

public class Funcionario extends Pessoa {

	private String cargo;
	private double salario;
	
	
	public Funcionario(String nome, Sexos sexo){
		super(nome, sexo);
	}
	
	public Funcionario(String nome, Sexos sexo, String cargo){
		this(nome, sexo);
		this.setCargo(cargo);
	}
	
	public Funcionario(String nome, Sexos sexo, String cargo, 
			           double salario){
		this(nome, sexo, cargo);
		this.setSalario(salario);
	}
	
	
	
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	@Override	
	public String getDados(){
		return super.getDados() +
				"\nCargo: " + this.getCargo() +
				"\nSalário: " + this.getSalario();		
	}	
	
}






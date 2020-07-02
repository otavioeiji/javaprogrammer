package br.com.impacta.classes;

import java.io.Serializable;

import br.com.impacta.enumeracoes.Sexos;
import br.com.impacta.excecoes.SalarioInvalidoException;

public class Funcionario extends Pessoa {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int registro;
	public int getRegistro() {
		return registro;
	}

	public void setRegistro(int registro) {
		this.registro = registro;
	}

	private String cargo;
	transient private double salario;
	
	public Funcionario() {}
	
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
	
	public Funcionario(String nome, Sexos sexo, int idade,
			              String cargo, double salario){
		super(nome,sexo,idade);
		this.setCargo(cargo);
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
		if(salario < 788.00){
			throw new SalarioInvalidoException("Salário inválido");
		}
		this.salario = salario;
	}
	
	@Override	
	public String getDados(){
		return super.getDados() +
				"\nCargo: " + this.getCargo() +
				"\nSalário: " + this.getSalario();		
	}	
	
	@Override
	public String toString(){
		return super.toString() + ", " +
	           this.getCargo() + ", " +
			   this.getSalario();	
	}
	
}






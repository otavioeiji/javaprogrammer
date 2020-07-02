package br.com.impacta.classes;

import java.io.Serializable;

/*
 * capitulo 09
 */
public class Endereco implements Comparable<Endereco>, Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String logradouro;
	private int numero;
	private String cidade;
	
	//public Endereco() { }
	public Endereco(String logradouro){
		this.setLogradouro(logradouro);
	}
	
	public Endereco(String logradouro, int numero){
		this(logradouro);
		this.setNumero(numero);
	}
	
	public Endereco(String logradouro, int numero, String cidade){
		this(logradouro, numero);
		this.setCidade(cidade);
	}
	
	public String getDados(){
		
		String resultado = "Logradouro: " + this.getLogradouro() +
				           "\nNúmero: " + this.getNumero() +
				           "\nCidade: " + this.getCidade();
		return resultado;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		if(numero < 0){
			this.numero = -numero;
		}
		else {
			this.numero = numero;
		}
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	@Override
	public String toString(){
		return "[" + this.getLogradouro() + ", " + 
	                 this.getNumero() + ", " + 
				     this.getCidade() + "]";
	}
	
	@Override
	public int hashCode(){
		return this.getLogradouro().hashCode() +
				this.getNumero() + 
				this.getCidade().hashCode();
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj instanceof Endereco){
			Endereco end = (Endereco)obj;
			if(this.getLogradouro().equals(end.getLogradouro()) && 
				this.getNumero() == end.getNumero() &&
				this.getCidade().equals(end.getCidade())){
				return true;
			}
		}
		return false;
	}
	@Override
	public int compareTo(Endereco arg0) {
		if(this.getLogradouro().compareTo(arg0.getLogradouro()) == 0){
			return this.getNumero().compareTo(arg0.getNumero());
		}
		
		return this.getLogradouro().compareTo(arg0.getLogradouro());
		
	}
}





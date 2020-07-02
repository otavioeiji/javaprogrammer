package br.com.impacta.threads;

public class ContaCorrente {

	private double saldo;
	
	public ContaCorrente(double saldo){
		this.saldo = saldo;
	}
	
	public void efetuarSaque(double valor){
		saldo -= valor;
	}
	
	public double verificarSaldo(){
		return this.saldo;
	}
}

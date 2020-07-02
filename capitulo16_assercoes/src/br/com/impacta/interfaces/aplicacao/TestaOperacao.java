package br.com.impacta.interfaces.aplicacao;

import br.com.impacta.interfaces.Operacao;

public class TestaOperacao {
	public static void main(String[] args) {
		//String show(double x);
		Operacao op = d -> "Valor apresentado: " + d;
		System.out.println(op.show(150));
	}
}

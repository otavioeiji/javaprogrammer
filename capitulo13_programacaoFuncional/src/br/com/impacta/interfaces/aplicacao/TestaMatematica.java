package br.com.impacta.interfaces.aplicacao;

import br.com.impacta.interfaces.Matematica;

public class TestaMatematica {
	public static void main(String[] args) {
		//int calcular(int x, int y);
		
		Matematica mat1 = (x, y) -> x + y; //expressão lambda
		int soma = mat1.calcular(15, 12);
		System.out.println("Soma: " + soma);
		
		mat1 = (a, b) -> a + 2*b;
		System.out.println("Calculo: " + mat1.calcular(3, 3));
		
	}
}

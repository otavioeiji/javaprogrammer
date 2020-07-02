package br.com.impacta.interfaces.aplicacao;

import br.com.impacta.interfaces.Exercicio01;

public class TestaExercicio01 {
	public static void main(String[] args) {
		//double execute(String s, int x);
		Exercicio01 ex01 = (s, x) -> {
			double div = (double)x / s.length();
			return div;
		};
		
		//Exercicio01 ex01 = (s, x) -> (double)x / s.length();
		
		System.out.println("Ex. 01: " + ex01.execute("Java", 10));
	}
}

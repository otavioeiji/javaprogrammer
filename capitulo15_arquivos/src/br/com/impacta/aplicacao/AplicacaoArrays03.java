package br.com.impacta.aplicacao;

import static javax.swing.JOptionPane.showInputDialog;
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;

public class AplicacaoArrays03 {
	public static void main(String[] args) {
		/*
		 * Escrever um programa que solicite ao usuário
		 * uma quantidade de nomes e de notas ( a quant. de 
		 * nomes deve ser igual à de notas) e, em seguida, 
		 * solicite ao usuário o valor dos nomes e das notas,
		 * mostrado no final todos os valores.
		 */
		
		int quant = parseInt(showInputDialog("Quantos alunos?"));
		String[] nomes = new String[quant];
		double[] notas = new double[quant];
		
		for (int i = 0; i < notas.length; i++) {
			nomes[i] = showInputDialog("Nome do aluno " + (i+1));
			notas[i] = parseDouble(showInputDialog("Nota do aluno " + (i+1)));
		}
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println(nomes[i] + ": nota = " + notas[i]);
		}
	}
}






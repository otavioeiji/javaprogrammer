package br.com.impacta.aplicacao;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class AplicacaoArrays04 {
	public static void main(String[] args) {
		
		int quant = parseInt(showInputDialog("Quantos alunos?"));
		String[] nomes = new String[quant];
		double[] notas = new double[quant];
		
		for (int i = 0; i < notas.length; i++) {
			nomes[i] = showInputDialog("Nome do aluno " + (i+1));
			notas[i] = parseDouble(showInputDialog("Nota do aluno " + (i+1)));
		}
		
		double maiorNota = notas[0];
		int posicao = 0;
		for (int i = 1; i < notas.length; i++) {
			if(notas[i] > maiorNota){
				maiorNota = notas[i];
				posicao = i;
			}
		}
		System.out.println("Aluno com maior nota: " + nomes[posicao]);
		System.out.println("Nota deste aluno: " + notas[posicao]);
	}
}

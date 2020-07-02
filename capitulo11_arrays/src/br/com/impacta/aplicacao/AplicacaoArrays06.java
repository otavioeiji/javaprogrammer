package br.com.impacta.aplicacao;

public class AplicacaoArrays06 {
	public static void main(String[] args) {
		double[] turma1 = {7.5, 8.0, 4.5, 9.5, 10.0};
		double[] turma2 = {3.0, 2.5, 4.0};
		double[] turma3 = {9.5, 9.5, 8.5, 10.0};
		
		double[][] notas = new double[3][];
		notas[0] = turma1;
		notas[1] = turma2;
		notas[2] = turma3;
		
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[i].length; j++) {
				System.out.print(notas[i][j] + " ");
			}
			System.out.println();
		}
 	}
}










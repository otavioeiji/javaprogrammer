package capitulo04_estruturas.exercicios;

import javax.swing.JOptionPane;

public class MediaFinal {
	public static void main(String[] args) {
		/*
		 * O usu�rio solicita o nome e as notas de 
		 * um aluno. N�o sabemos quantas avalia��es
		 * foram realizadas. O usu�rio fornece as notas 
		 * e, se a nota fornecida for negativa, o programa 
		 * encerra exibindo a m�dia do aluno, juntamente
		 * com seu status: aprovado ou reprovado. Ele � aprovado
		 * se a m�dia for maior ou igual a 7.
		 * Obs.: se o usu�rio fornecer nota acima de 10, o 
		 * programa  N�O acata esta nota.
		 */
		String nome = JOptionPane.
				showInputDialog("Qual o nome do aluno?");
		double soma = 0, nota = 0;
		int cont = 0;
		do {
			nota = Double.parseDouble(JOptionPane.
					showInputDialog("Fornecer a nota "));
			if(nota < 0){
				break;
			}
			else if(nota <= 10){
				soma += nota;
				cont++;
			}			
		} while(true);
		double media =(cont == 0) ? soma: soma / cont;
		System.out.printf("M�dia: %.1f -> Resultado: %s",
				      media,(media < 7 ? "Reprovado": "Aprovado"));
	}
}





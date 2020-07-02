package capitulo04_estruturas.exercicios;

import javax.swing.JOptionPane;

public class MediaFinal {
	public static void main(String[] args) {
		/*
		 * O usuário solicita o nome e as notas de 
		 * um aluno. Não sabemos quantas avaliações
		 * foram realizadas. O usuário fornece as notas 
		 * e, se a nota fornecida for negativa, o programa 
		 * encerra exibindo a média do aluno, juntamente
		 * com seu status: aprovado ou reprovado. Ele é aprovado
		 * se a média for maior ou igual a 7.
		 * Obs.: se o usuário fornecer nota acima de 10, o 
		 * programa  NÂO acata esta nota.
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
		System.out.printf("Média: %.1f -> Resultado: %s",
				      media,(media < 7 ? "Reprovado": "Aprovado"));
	}
}





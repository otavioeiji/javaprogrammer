package capitulo04_estruturas.exercicios;

import javax.swing.JOptionPane;

public class ValorTotalGasto {
	public static void main(String[] args) {
		/*
		 * O usuário solicita informações sobre o nome
		 * de um cliente e o valor pago por um produto
		 * (comprado em uma loja, por exemplo). Existem
		 * 5 clientes na loja. Escreva um programa que solicite
		 * ao usuário:
		 * - o nome do cliente
		 * - o valor gasto por ele
		 * e exiba na tela estes dados. 
		 * No final, mostrar o valor total gasto pelos clientes
		 */
		
		double total = 0;
		for (int i = 0; i < 5; i++) {
			String nome = JOptionPane.
				showInputDialog("Nome do cliente " + (i+1));
			double valor = 
				Double.parseDouble(JOptionPane.
					showInputDialog("Valor gasto pelo cliente " + (i+1)));
			
			System.out.printf("Cliente %d: %-10s, Valor gasto: %7.2f%n",
					                 i+1, nome, valor);
			total += valor;
		}
		System.out.printf("Total: %10.2f", total);
	}
}






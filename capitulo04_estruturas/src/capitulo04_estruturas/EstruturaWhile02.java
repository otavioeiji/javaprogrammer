package capitulo04_estruturas;

import javax.swing.JOptionPane;

public class EstruturaWhile02 {
	public static void main(String[] args) {
		/*
		 * O usuário informa uma certa quantidade
		 * de numeros. Quando ele informar o numero 0
		 * o programa para de executar.
		 */
		while(true){
			int n = Integer.parseInt(
					JOptionPane.showInputDialog(
							"Fornecer um numero"));
			if(n == 0){
				break;
			}
			System.out.println(n);
		}
		System.out.println("--FINALIZADO--");
	}
}

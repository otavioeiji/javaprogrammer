package capitulo04_estruturas;

import javax.swing.JOptionPane;

public class EstruturaWhile04 {
	public static void main(String[] args) {
		/*
		 * O usu�rio informa uma certa quantidade
		 * de numeros. Quando ele informar o numero 0
		 * o programa para de executar. Quando informar
		 * um n�mero negativo, o valor n�o � exibido 
		 * na tela. Caso contr�rio, o valor � exibido.
		 */
		while(true){
			int n = Integer.parseInt(
					JOptionPane.showInputDialog(
							"Fornecer um numero"));
			if(n == 0){
				break;
			}
			if(n < 0){
				continue;
			}
			System.out.println(n);
		}
		System.out.println("--FINALIZADO--");
	}
}

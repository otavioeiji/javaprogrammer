package capitulo04_estruturas.exercicios;

import javax.swing.JOptionPane;

public class CaixaEletronico02 {
	public static void main(String[] args) {
		/*
		 * Um caixa eletronico possui as seguintes cédulas:
		 * R$ 50,00
		 * R$ 20,00
		 * R$ 10,00
		 * R$  5,00
		 * 
		 * O usuário fornece o valor do saque. Com base neste
		 * valor, o programa informa a quantidade de cada cédula,
		 * levando em conta que as maiores cédulas são pagas
		 * primeiro. O valor do saque deve ser multiplo de 5.
		 */
		int q50 = 0, q20 = 0, q10 = 0, q5 = 0;
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Valor do saque"));

		if(valor % 5 != 0){
			JOptionPane.showMessageDialog(null, 
					"O valor deve ser multiplo de 5");
			return;
		}
		
		int valorSaque = valor;
		q50 = valor / 50;
		valor %= 50;
		
		q20 = valor / 20;
		valor %= 20;
		
		q10 = valor / 10;
		valor %= 10;
		
		q5 = valor / 5;
		valor %= 5;
		
		String resultado = "Valor do saque: " + valorSaque +
				           "\nNotas de 50: " + q50 +
				           "\nNotas de 20: " + q20 +
				           "\nNotas de 10: " + q10 +
				           "\nNotas de 5 : " + q5;
		
		JOptionPane.showMessageDialog(null, resultado);
		
		
		
	}

}

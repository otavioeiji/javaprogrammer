package capitulo04_estruturas.exercicios;

import javax.swing.JOptionPane;

public class Bilheteria02 {
	public static void main(String[] args) {
		/*
		 * Em um clube, o usu�rio paga pelo ingresso um valor
		 * que depende da sua idade. Os valores s�o:
		 * 
		 * At� 17 anos: R$ 20,00
		 * Entre 18, at� 59 anos: R$ 30,00
		 * A partir de 60 anos: R$ 15,00
		 * 
		 * Escreva um programa que, com base na idade da pessoa,
		 * apresente o valor a ser pago pelo ingresso.
		 */
		
		int idade = Integer.parseInt(
				JOptionPane.showInputDialog("Qual sua idade?"));
		
		double ingresso;
		
		ingresso = 
			(idade <= 17) ? 20 : (idade > 17 && idade <= 59 ) ? 30 : 15; 
				
		JOptionPane.showMessageDialog(null, "Voc� pagar� " + 
		                                       ingresso + " reais.");

	}
}

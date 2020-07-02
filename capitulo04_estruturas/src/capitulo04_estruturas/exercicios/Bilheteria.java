package capitulo04_estruturas.exercicios;

import javax.swing.JOptionPane;

public class Bilheteria {
	public static void main(String[] args) {
		/*
		 * Em um clube, o usuário paga pelo ingresso um valor
		 * que depende da sua idade. Os valores são:
		 * 
		 * Até 17 anos: R$ 20,00
		 * Entre 18, até 59 anos: R$ 30,00
		 * A partir de 60 anos: R$ 15,00
		 * 
		 * Escreva um programa que, com base na idade da pessoa,
		 * apresente o valor a ser pago pelo ingresso.
		 */
		
		int idade = Integer.parseInt(
				JOptionPane.showInputDialog("Qual sua idade?"));
		
		double ingresso;
		
		if(idade <= 17){
			ingresso = 20; 
		}
		else if(idade > 17 && idade <= 59){
			ingresso = 30;
		}
		else {
			ingresso = 15;
		}
		JOptionPane.showMessageDialog(null, "Você pagará " + 
		                                       ingresso + " reais.");
	}
}

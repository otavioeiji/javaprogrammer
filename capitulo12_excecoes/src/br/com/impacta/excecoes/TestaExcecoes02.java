package br.com.impacta.excecoes;

import javax.swing.JOptionPane;
public class TestaExcecoes02 {
	public static void main(String[] args) {
		try {
			
			int idade = Integer.parseInt(JOptionPane.
					showInputDialog("Qual a sua idade?"));
			
			
			
			
			
			System.out.println("Sua idade é: " + idade);
		} catch (NumberFormatException e) {
			
			
			
			//e.printStackTrace();
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
}

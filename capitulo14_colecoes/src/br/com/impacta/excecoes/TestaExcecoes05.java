package br.com.impacta.excecoes;

import javax.swing.JOptionPane;

public class TestaExcecoes05 {
	public static void main(String[] args) {
		try {
			String nome = JOptionPane.showInputDialog("Informe seu nome:");
			System.out.println("Nome informado: " + nome.toUpperCase());

			int idade = Integer.parseInt(JOptionPane.
					showInputDialog("Qual a sua idade?"));
			System.out.println("Sua idade é: " + idade);
			
		} catch (NullPointerException | NumberFormatException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro Geral: " + e.getMessage());
		}
	}

}

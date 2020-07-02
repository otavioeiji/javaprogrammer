package br.com.impacta.excecoes;

import javax.swing.JOptionPane;

public class TestaExcecoes01 {
	public static void main(String[] args) {

		//NullPointerException é gerado pelo JVM
		try {
			String nome = JOptionPane.showInputDialog("Informe seu nome:");
			System.out.println("Nome informado: " + nome.toUpperCase());
			
		} catch (NullPointerException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
		}
	}
}

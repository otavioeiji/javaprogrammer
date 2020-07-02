package br.com.impacta.interfaces.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.interfaces.Mensagem;

public class TestaMensagem {
	public static void main(String[] args) {
		//void show();
		Mensagem msg = () -> System.out.println("Interface Mensagem");
		msg.show();
		
		//expressão lambda que possui mais de uma instrução
		msg = () -> {
			String texto = JOptionPane.showInputDialog("Informe um texto:");
			JOptionPane.showMessageDialog(null, "Texto: " + texto);
		};
		msg.show();
	}
}

package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Pessoa;
import br.com.impacta.utilitarios.Utilitarios;

public class AplicacaoPessoa {
	public static void main(String[] args) {
		
		Pessoa pessoa = Utilitarios.criarPessoa();
		
		JOptionPane.showMessageDialog(null, pessoa.getDados(),"Meu exemplo",JOptionPane.WARNING_MESSAGE);		
		JOptionPane.showMessageDialog(null, pessoa.getDados("INFORMAÇÕES"));
		JOptionPane.showMessageDialog(null, Utilitarios.exibirAutoria());
	}
}

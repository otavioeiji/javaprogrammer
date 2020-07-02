package br.com.impacta.interfaces.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Funcionario;
import br.com.impacta.classes.Pessoa;
import br.com.impacta.enumeracoes.Sexos;
import br.com.impacta.interfaces.Exercicio02;

public class TestaExercicio02 {
	public static void main(String[] args) {
		//Pessoa execute(String nome, int idade);
		Exercicio02 ex02 = (s, n) -> {
			Pessoa p = new Funcionario(s, Sexos.MASCULINO);
			p.setIdade(n);
			return p;
		};
		
		JOptionPane.showMessageDialog(null, ex02.execute("Zé", 45).getDados());
	}
}







package br.com.impacta.interfaces.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Funcionario;
import br.com.impacta.enumeracoes.Sexos;
import br.com.impacta.interfaces.Exercicio04;

public class TestaExercicio04 {
	public static void main(String[] args) {
		//void executar(T param);
		Exercicio04<String> ex04 = p -> System.out.println(p.toUpperCase());
		ex04.executar("Vanessa");
		
		Exercicio04<Double> ex041 = p -> JOptionPane.showMessageDialog(null, 
				                                              "Valor: " +  p);
		ex041.executar(123.4);
		
		Exercicio04<Funcionario> ex042 =
				p -> JOptionPane.showMessageDialog(null, p.getDados());
		ex042.executar(new Funcionario("Jose", Sexos.MASCULINO,
				                                    "Politico", 788));
		
	}
}

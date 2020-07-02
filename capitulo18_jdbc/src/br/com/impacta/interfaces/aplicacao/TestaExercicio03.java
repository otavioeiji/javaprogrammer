package br.com.impacta.interfaces.aplicacao;

import br.com.impacta.classes.Endereco;
import br.com.impacta.interfaces.Exercicio03;

public class TestaExercicio03 {
	public static void main(String[] args) {
		//void execute(Endereco end);
		Exercicio03 ex03 = e -> System.out.println(e.getDados());
		
		Endereco end = new Endereco("Paulista", 1009, "São Paulo");
		ex03.execute(end);
		
	}
}

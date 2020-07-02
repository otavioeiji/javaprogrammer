package br.com.impacta.aplicacao;

import java.util.ArrayList;
import java.util.List;

import br.com.impacta.classes.Funcionario;
import br.com.impacta.enumeracoes.Sexos;
import br.com.impacta.utilitarios.Utilitarios;

public class AplicacaoTestaListas {
	public static void main(String[] args) {
		
		List<String> strings = new ArrayList<String>();
		strings.add("barulho");
		strings.add("não dá");
		strings.add("paciencia");
		strings.add("headache");
		strings.add("pelo amor de Deus");
		
		Utilitarios.listarNomes(strings);
		System.out.println("---------------------------");
		
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		funcionarios.add(new Funcionario("Beto", Sexos.MASCULINO, "pedreiro"));
		funcionarios.add(new Funcionario("Ze", Sexos.MASCULINO, "chefe"));
		
		Utilitarios.listarPessoas(funcionarios);
		System.out.println("---------------------------");
		Utilitarios.listarFuncionarios(funcionarios);
		
	}
}











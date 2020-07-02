package br.com.impacta.utilitarios;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Endereco;
import br.com.impacta.classes.Pessoa;
import br.com.impacta.enumeracoes.Sexos;

public class Utilitarios {
	
	public static Pessoa criarPessoa(){
		Pessoa p = null;
		
		String nome = JOptionPane.showInputDialog("Qual o seu nome?");
		int idade = Integer.parseInt(JOptionPane.
				           showInputDialog("Qual a sua idade?"));
		int sexo = Integer.parseInt(JOptionPane.
						showInputDialog("Qual o sexo? (1-Masc, 2-Fem"));
		Sexos tipoSexo;
		
		//p.setNome(nome);
		//p.setIdade(idade);
		if(sexo == 1){
			tipoSexo = Sexos.MASCULINO;
			//p.setSexo(Sexos.MASCULINO);
		}
		else {
			tipoSexo = Sexos.FEMININO;
			//p.setSexo(Sexos.FEMININO);
		}
		//Pessoa p = new Pessoa(nome, tipoSexo, idade, criarEndereco());
		
		//p.setEndereco(criarEndereco());
		
		return p;
	}
	
	public static Endereco criarEndereco(){
		
		String log = JOptionPane.showInputDialog("Informe a rua");
		int num = Integer.parseInt(JOptionPane.
				     showInputDialog("Informe o numero"));
		String cidade = JOptionPane.showInputDialog("Informe a cidade");
		
		Endereco end = new Endereco(log, num, cidade);
		
//		end.setLogradouro(log);
//		end.setNumero(num);
//		end.setCidade(cidade);
		return end;
	}

	public static String exibirAutoria(){
		String resultado = "Classe desenvolvida pela turma " +
	                       "de Java Programmer - domingo";
		return resultado; 
	}	
}

package br.com.impacta.utilitarios;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Endereco;
import br.com.impacta.classes.Pessoa;
import br.com.impacta.enumeracoes.Sexos;

public final class Utilitarios {
	
	public static Pessoa criarPessoa(){
		Pessoa p = null;
		
		String nome = JOptionPane.showInputDialog("Qual o seu nome?");
		int idade = Integer.parseInt(JOptionPane.
				           showInputDialog("Qual a sua idade?"));
		
		Sexos tipoSexo = (Sexos)JOptionPane.showInputDialog(
												null,
												"Qual o sexo?",
												"Seleção do sexo",
												JOptionPane.QUESTION_MESSAGE,
												null,
												Sexos.values(),
												Sexos.MASCULINO);
		
		
		//p.setNome(nome);
		//p.setIdade(idade);
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
	
	//método que recebe como parâmetro um array de nomes e retorna
	//o último nome
	public static String mostrarUltimo(String[] nomes){
		return nomes[nomes.length - 1];		
	}
	
	//método que recebe uma quantidade qualquer de números reais
	//e retorna a média entre eles: varargs
	public static double mostrarMedia(double m, double... numeros){
		double soma = 0;
		for (double d : numeros) {
			soma += d;
		}
		return soma / numeros.length;
	}
	
	//método que recebe: dia, mes, ano (inteiros) e, com base 
	//nestas informações, retornar o número de dias para terminar
	//o ano fornecido.
	public static int calcularDias(int dia, int mes, int ano){
		int[] dias = {31,ano % 4 == 0?29:28,31,30,31,30,31,31,30,31,30,31};
		int diasrestantes = dias[mes-1] - dia;
		for (int i = mes; i < dias.length; i++) {
			diasrestantes += dias[i];
		}
		return diasrestantes;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

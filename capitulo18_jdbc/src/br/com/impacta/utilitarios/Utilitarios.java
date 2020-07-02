package br.com.impacta.utilitarios;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Endereco;
import br.com.impacta.classes.Funcionario;
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
		try {
			return nomes[nomes.length - 1];	
		} catch (ArrayIndexOutOfBoundsException e) {			
			throw new ArithmeticException(e.getMessage());
		}
		
		
//		if(nomes.length < 1){
//			throw new ArithmeticException(
//					"A lista deve ter pelo menos um nome");
//		}
//		return nomes[nomes.length - 1];		
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
	public static int calcularDias(int dia, int mes, int ano) {
		if(mes < 1 || mes > 12){
			throw new IllegalArgumentException("Mês Inválido");
		}
		
		int[] dias = {31,ano % 4 == 0?29:28,31,30,31,30,31,31,30,31,30,31};

		if(dia < 1 || dia > dias[mes-1]){
			throw new IllegalArgumentException("Dia inválido para o mês informado");
		}
		
		int diasrestantes = dias[mes-1] - dia;
		for (int i = mes; i < dias.length; i++) {
			diasrestantes += dias[i];
		}
		return diasrestantes;
	}
	
	/*
	 * os parâmetros do método calcularSoma não podem ser 
	 * negativos
	 */
	public static double calcularSoma(double a, double b) 
			                                      throws Exception {
		if(a < 0 || b < 0){
			throw new ArithmeticException(
					"Os operandos devem ser positivos");
		}
		return a + b;
	}
	
	/*
	 * método que recebe uma String e retorna a String
	 * convertida em objeto Date.
	 */
	public static Date criarData(String data) throws ParseException{
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		
		return df.parse(data); //lança ParseException
	}
	
	
	/*
	 * usando try-catch aninhado
	 */
	public static String efetuarCalculos(){
		try {
			int x = 10 / 0;
			
		} catch (ArithmeticException e) {
			try {
				int[] m = {1, 3, 5, 7};
				int j = m[4];
			} catch (ArrayIndexOutOfBoundsException e2) {
				e2.initCause(e);
				throw e2;
			}
		}
		return "";
	}
	
	//método que recebe uma coleção do tipo List como parâmetro
	public static void listarNomes(List<String> nomes){
		nomes.add("silencio...");
		nomes.forEach(s -> System.out.println(s));
	}
	
	
	public static void listarPessoas(List<? extends Pessoa> pessoas){		
		//não é permitido alterar algum elemento da lista
		//informada como parâmetro por causa da sua indeterminação
		pessoas.forEach(p -> System.out.println(p));
	}
	
	public static void listarFuncionarios(List<? super Funcionario> func){
		func.add(new Funcionario("Manoel", Sexos.MASCULINO));
		//neste caso foi permitido adicionar elemento na lista porque
		//o tipo base é um subtipo, que é permitido para qualquer 
		//parâmetro de tipo da lista
		func.forEach(s -> System.out.println(s));
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

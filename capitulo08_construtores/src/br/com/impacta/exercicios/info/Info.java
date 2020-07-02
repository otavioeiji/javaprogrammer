package br.com.impacta.exercicios.info;

import javax.swing.JOptionPane;

import br.com.impacta.exercicios.classes.Endereco;
import br.com.impacta.exercicios.classes.Imovel;
import br.com.impacta.exercicios.classes.Proprietario;
import br.com.impacta.exercicios.enumeracoes.Opcoes;

public class Info {
	
	public static Endereco criarEndereco(){
		String logradouro = JOptionPane.showInputDialog("Informe a rua");
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero"));
		String cidade = JOptionPane.showInputDialog("Informe a cidade");
		
		Endereco endereco = new Endereco(logradouro, numero, cidade);
		return endereco;
	}
	
	public static Proprietario criarProprietario(Opcoes opcao){
		
		Proprietario prop;
		String nome = JOptionPane.showInputDialog("Nome do proprietario");
		if(opcao == Opcoes.REQUERIDOS){
			prop = new Proprietario(nome);
		}
		else {
			String fone = JOptionPane.showInputDialog("Telefone do proprietario");
			prop = new Proprietario(nome, fone);
		}
		return prop;
	}
	
	public static Imovel criarImovel(){
		double area = Double.parseDouble(JOptionPane.showInputDialog("Área do imóvel"));
		int numc = Integer.parseInt(JOptionPane.showInputDialog("Num. Comodos"));
		
		Proprietario prop = criarProprietario(Opcoes.REQUERIDOS);
		Endereco end = criarEndereco();
		
		Imovel imovel = new Imovel(area, prop, numc, end);
		return imovel;		
	}
}







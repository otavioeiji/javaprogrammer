package br.com.impacta.aplicacao;

import java.text.ParseException;
import java.util.Date;

import javax.swing.JOptionPane;

import br.com.impacta.utilitarios.Utilitarios;

public class AplicacaoTestaMetodos {
	public static void main(String[] args){
		
		//m�todo: mostrarUltimo
		//String[] nomes = {"Elias", "Furlan", "Antonio", "Jorge"};
		
		try{
			String[] nomes = {};
			System.out.println(Utilitarios.mostrarUltimo(nomes));
		}
		catch(ArithmeticException e){
			JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage());
		}
		
		//m�todo: mostrarMedia
		double media = Utilitarios.mostrarMedia(5, 7, 3, 8, 9);
		System.out.println("M�dia: " + media);
		
		//m�todo: calcularDias
		int dias;
		try {
			dias = Utilitarios.calcularDias(31, 12, 2015);
			System.out.println("Faltam " + dias + " dias");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());			
		}
		
		//m�todo calcularSoma
		
		try {
			double soma = Utilitarios.calcularSoma(20, 30);
			System.out.println(soma);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		
		//exibi��o da data e hora atuais
		Date data;
		try {
			data = Utilitarios.criarData("05/08/2015");
			System.out.println(data);
		} catch (ParseException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		
		
		//m�todo efetuarCalculos
		System.out.println(Utilitarios.efetuarCalculos());
		
	}
}










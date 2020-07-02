package br.com.impacta.aplicacao;

import br.com.impacta.utilitarios.Utilitarios;

public class AplicacaoTestaMetodos {
	public static void main(String[] args) {
		
		//método: mostrarUltimo
		String[] nomes = {"Elias", "Furlan", "Antonio", "Jorge"};
		System.out.println(Utilitarios.mostrarUltimo(nomes));
		
		//método: mostrarMedia
		double media = Utilitarios.mostrarMedia(5, 7, 3, 8, 9);
		System.out.println("Média: " + media);
		
		//método: calcularDias
		int dias = Utilitarios.calcularDias(31, 12, 2015);
		System.out.println("Faltam " + dias + " dias");
		
	}
}

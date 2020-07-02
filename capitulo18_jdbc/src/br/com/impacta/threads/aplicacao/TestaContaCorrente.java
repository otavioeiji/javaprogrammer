package br.com.impacta.threads.aplicacao;

import br.com.impacta.threads.OperacoesContaCorrente;

public class TestaContaCorrente {
	public static void main(String[] args) {
		OperacoesContaCorrente cc = new OperacoesContaCorrente();
		Thread joao = new Thread(cc, "joao"); //new
		Thread maria = new Thread(cc, "maria");//new
		
		joao.start(); //ready to run
		
		try {
			joao.join(); 
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		maria.start(); //ready to run
		System.out.println("=====FIM=====");
	}
}

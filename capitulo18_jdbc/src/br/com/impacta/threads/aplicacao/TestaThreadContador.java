package br.com.impacta.threads.aplicacao;

import br.com.impacta.threads.ThreadContador;

public class TestaThreadContador {
	public static void main(String[] args) {

		ThreadContador cont = new ThreadContador();
		Thread t = new Thread(cont);
		t.start();
		
		synchronized(t){
			try {
				System.out.println("Aguardando.........");
				//t.wait();
				t.wait(5000); //entra no estado suspended
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println("Total calculado: " + cont.total);
		}
		
		
	}
}

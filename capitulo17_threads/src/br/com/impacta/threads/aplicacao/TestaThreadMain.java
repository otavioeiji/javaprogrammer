package br.com.impacta.threads.aplicacao;

import br.com.impacta.threads.NovaThread;

public class TestaThreadMain {
	public static void main(String[] args) {

		NovaThread t = new NovaThread();
		t.start();		
		for (int i = 0; i < 50; i++) {			
			System.out.print("*");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}
}

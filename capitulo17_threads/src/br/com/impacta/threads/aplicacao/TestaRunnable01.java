package br.com.impacta.threads.aplicacao;

import br.com.impacta.threads.NovaThread01;

public class TestaRunnable01 {
	public static void main(String[] args) {
		
		NovaThread01 nt = new NovaThread01();
		Thread t = new Thread(nt);
		t.start();
		
	}
}

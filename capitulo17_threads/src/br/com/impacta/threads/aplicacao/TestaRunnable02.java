package br.com.impacta.threads.aplicacao;

import br.com.impacta.threads.NovaThread02;

public class TestaRunnable02 {
	public static void main(String[] args) {
		NovaThread02 nt = new NovaThread02();
		
		Thread t1 = new Thread(nt, "oi");
		Thread t2 = new Thread(nt);
		t2.setName("tchau");
		
		t1.start();
		t2.start();
	}
}

package br.com.impacta.threads.aplicacao;

import br.com.impacta.threads.NovaThread02;

public class TestaRunnable03 {
	public static void main(String[] args) {

		//NovaThread02 nt = new NovaThread02();		
		Thread t1 = new Thread(new NovaThread02(), "oi");		
		t1.start();
	}
}

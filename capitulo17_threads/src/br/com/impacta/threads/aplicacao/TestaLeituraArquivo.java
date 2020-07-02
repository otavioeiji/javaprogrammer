package br.com.impacta.threads.aplicacao;

import br.com.impacta.threads.LeituraArquivoThread;

public class TestaLeituraArquivo {
	public static void main(String[] args) {
		
		LeituraArquivoThread arquivo = new LeituraArquivoThread();
		Thread t1 = new Thread(arquivo,"Primeiro");
		Thread t2 = new Thread(arquivo,"Segundo");
		
		t1.start();
		t2.start();
		
	}
}

package br.com.impacta.threads;

import java.io.FileReader;

public class LeituraArquivoThread implements Runnable {

	@Override
	public void run() {
		lerArquivo();
	}

	public synchronized void lerArquivo(){
		try {
			FileReader arquivo = 
					new FileReader("C:/Windows/asrcs_run.log");
			String nome = Thread.currentThread().getName();
			System.out.println("\n=======Thread: " + nome + "=========");
			while(true){
				int ch = arquivo.read();
				if(ch == -1){
					break;
				}
				System.out.print((char)ch);
				//Thread.sleep(25);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}		
	}
}

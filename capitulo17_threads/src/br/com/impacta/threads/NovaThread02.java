package br.com.impacta.threads;

public class NovaThread02 implements Runnable {

	@Override
	public void run() {
		String nome = Thread.currentThread().getName();
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread em execução: " + nome);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) { }
		}		
	}
}

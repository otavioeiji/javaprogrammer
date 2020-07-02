package br.com.impacta.threads;

public class NovaThread extends Thread {

	@Override
	public void run(){
		for (int i = 0; i < 50; i++) {			
			System.out.print(".");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

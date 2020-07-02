package br.com.impacta.threads;

public class ThreadContador implements Runnable {

	public int total;
	@Override
	public void run(){
		synchronized(this){ //inicia o estado blocked
			for (int i = 0; i < 100; i++) {
				total += i;
			}
			//this.notify();
			
			this.notifyAll(); //libera a thread de suspended, 
			                  //colocando-a em ready to run
		}
	}
}

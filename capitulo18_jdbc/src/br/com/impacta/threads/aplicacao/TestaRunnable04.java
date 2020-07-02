package br.com.impacta.threads.aplicacao;

public class TestaRunnable04 {
	public static void main(String[] args) {
		
//		public void run(){
//			String nome = Thread.currentThread().getName();	
//			System.out.print(nome);
//		}
		
//		() -> { 
//		         String nome = Thread.currentThread().getName();
//		         System.out.print(nome); 
//		      }
		Thread t = new Thread( () -> {
			String nome = Thread.currentThread().getName();
			System.out.print(nome);
		}, "oi");
		
		t.start();
		
		
	}
}

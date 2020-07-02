package br.com.impacta.threads;

public class OperacoesContaCorrente implements Runnable {

	ContaCorrente conta = new ContaCorrente(100);
	
	public void realizarOperacoes(double saque){
		String nome = Thread.currentThread().getName();
		
		System.out.println("---------------------------");
		System.out.println("Saldo disponivel para " + nome + " = " +
		                      conta.verificarSaldo());
		if(conta.verificarSaldo() >= saque){
			try {
				Thread.sleep(100); //interrompe a thread, até o estado
				                   //resume
			} catch (Exception e) {
				// TODO: handle exception
			}
			conta.efetuarSaque(saque);
			System.out.println("Saque realizado para " + nome + " = "+saque);
			System.out.println("Saldo atual para " + nome + " = " +
			                       conta.verificarSaldo());
		}
		else {
			System.out.println("Saldo insuficiente para " + nome);
		}
		
	}
	
	@Override
	public void run() {
		
		//synchronized(this){
			for (int i = 0; i < 5; i++) {
				realizarOperacoes(25);
			}
		//}
	}

}

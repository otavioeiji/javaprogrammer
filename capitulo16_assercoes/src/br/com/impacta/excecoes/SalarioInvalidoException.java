package br.com.impacta.excecoes;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;

public class SalarioInvalidoException extends RuntimeException {

	public SalarioInvalidoException(){}
	
	public SalarioInvalidoException(String erro){
		super(erro);
	}
	
	@Override
	public String getMessage(){
		Date data = new Date();
		String msg = "[" + data + "]\n";
		
		try {
			InetAddress address = InetAddress.getLocalHost();
			msg += address.getCanonicalHostName();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 msg += "\n\n" + super.getMessage();
		
		return msg;
	}
}

package br.com.impacta.classes;

public class Endereco {
	
	private String logradouro;
	private int numero;
	private String cidade;
	
	public void setDados(String logradouro, int numero,String cidade ){
		this.setLogradouro(logradouro);
		this.setNumero(numero);
		this.setCidade(cidade);
	}
	
//	public void exibirDados(){
//		System.out.println("Logradouro: " + logradouro);
//		System.out.println("Número: " + numero);
//		System.out.println("Cidade: " + cidade);
//	}
	
	public String getDados(){
		String resultado = "Logradouro: " + this.getLogradouro() +
				           "\nNúmero: " + this.getNumero() +
				           "\nCidade: " + this.getCidade();
		return resultado;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if(numero < 0){
			this.numero = -numero;
		}
		else {
			this.numero = numero;
		}
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
}





package br.com.impacta.exercicios.classes;

public class ImovelVenda extends Imovel {

	public ImovelVenda(double area, 
			           Proprietario proprietario,
			           double preco, double desconto) {
		super(area, proprietario);
		this.setPreco(preco);
		this.setDesconto(desconto);
		
	}

	private double preco, desconto;

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	@Override
	public String getDados(){
		String resultado = super.getDados() +
				"\n===== IMÓVEL VENDA =====" +
				"\nPreço Inicial: " + this.getPreco() +
				 "\nDesconto: " + this.getDesconto() +
				 "\nPreço Venda: " + this.calcular();
		
		return resultado;
	}	
	
	@Override
	public double calcular() {
		return this.getPreco() - this.getDesconto();
	}
	
	
}

package br.com.impacta.exercicios.classes;

public class ImovelLocacao extends Imovel {

	public ImovelLocacao(double area, Proprietario proprietario,
			double aluguel, int periodo) {
		super(area, proprietario);
		this.setAluguel(aluguel);
		this.setPeriodo(periodo);
	}
	private double aluguel;
	private int periodo;
	
	public double getAluguel() {
		return aluguel;
	}
	public void setAluguel(double aluguel) {
		this.aluguel = aluguel;
	}
	public int getPeriodo() {
		return periodo;
	}
	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}
	
	@Override
	public String getDados(){
		String resultado = super.getDados() +
				"\n===== IMÓVEL LOCAÇÃO =====" +
				"\nPreço Aluguel: " + this.getAluguel() +
				 "\nPeríodo: " + this.getPeriodo() +
				 "\nTotal Aluguel: " + this.calcular();
		
		return resultado;
	}	
	@Override
	public double calcular() {
		return this.getPeriodo() * this.getAluguel();
	}	
}








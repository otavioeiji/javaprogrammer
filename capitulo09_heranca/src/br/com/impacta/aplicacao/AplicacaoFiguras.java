package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.figuras.Circulo;
import br.com.impacta.figuras.Figura;
import br.com.impacta.figuras.Retangulo;

public class AplicacaoFiguras {
	public static void main(String[] args) {
		Retangulo retangulo = new Retangulo(10, 12);
		exibirFigura(retangulo);
		
		Circulo circulo = new Circulo(15);
		exibirFigura(circulo);
		
	}
	
	private static void exibirFigura(Figura figura){
		String resultado = "Area: " + figura.calcularArea() +
				           "\nPerimetro: " + figura.calcularPerimetro();
		
		JOptionPane.showMessageDialog(null, resultado);
	}
}

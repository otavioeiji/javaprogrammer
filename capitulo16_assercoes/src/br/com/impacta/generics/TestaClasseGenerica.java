package br.com.impacta.generics;

public class TestaClasseGenerica {
	public static void main(String[] args) {
		
		ClasseGenerica<Double> cg1 = new ClasseGenerica<Double>();
		cg1.setElemento(123.4);
		double d = cg1.getElemento();
		
		ClasseGenerica<String> cg2 = new ClasseGenerica<String>();
		cg2.setElemento("Java");
		String s = cg2.getElemento();
	}
}

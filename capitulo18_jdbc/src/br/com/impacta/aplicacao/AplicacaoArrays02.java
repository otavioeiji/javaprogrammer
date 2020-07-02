package br.com.impacta.aplicacao;

public class AplicacaoArrays02 {
	public static void main(String[] args) {
		
		int[] m;
		m = new int[]{3, -2, 1, 4};
		//semelhante a:
		//int[] m = {3, -2, 1, 4};	-----> simplificada
		//ou
		//int[] m = new int[]{3, -2, 1, 4}; -----> completa
	
		for(int x :  m ){ //for aprimorado, ou foreach
			System.out.println(x);
		}
	}
}

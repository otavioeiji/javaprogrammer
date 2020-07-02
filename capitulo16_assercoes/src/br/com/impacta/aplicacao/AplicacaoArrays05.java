package br.com.impacta.aplicacao;

public class AplicacaoArrays05 {
	public static void main(String[] args) {
		
		String[] dias = new String[]{"Domingo", "Segunda", "Terca"};
		dias = new String[]{"Domingo", "Segunda", "Terca", "Quarta"};
		
		//Array Bidimensional - Forma 1
		int[][] numeros = new int[3][4];
				                   numeros[0][0] = 3;
				                   numeros[0][1] = 7;
				                   numeros[0][2] = 12;
				                   numeros[0][3] = 11;
				                   
				                   numeros[1][0] = 15;
				                   numeros[1][1] = 8;
				                   numeros[1][2] = -4;
				                   numeros[1][3] = 0;

				                   numeros[2][0] = 5;
				                   numeros[2][1] = 16;
				                   numeros[2][2] = 20;
				                   numeros[2][3] = 14;

		//Array Bidimensional - Forma 2	
        int[][] numeros1 = { {3,7,12,11,8} , {15,8} , {5,16,20,14} };
        
        for (int i = 0; i < numeros1.length; i++) {
			for (int j = 0; j < numeros1[i].length; j++) {
				System.out.print(numeros1[i][j] + " ");
			}
			System.out.println();
		}
				                   
		
	}
}
















package br.com.impacta.assercoes;

public class TestaAssercao {
	
	public static void main(String[] args) {
		
		assert(args.length == 3):"Parâmetros inválidos";
		System.out.println("Curso: " + args[0]);
		System.out.println("Dias: " + args[1]);
		System.out.println("Duração: " + args[2]);
		
		
		int soma = somarNumeros(-12, 13);
		System.out.println(soma);
	}
	
	public static int somarNumeros(int x, int y){
		assert(x >= 0):"O valor de x deve ser positivo";
		return x + y;
	}
	
}

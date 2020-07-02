package capitulo04_estruturas.exercicios;

public class GeraSenha02 {
	public static void main(String[] args) {
		/*
		 * Gerar uma senha com 8 dígitos, sendo os dígitos
		 * impares numéricos, e os dígitos pares, caracteres, 
		 * e armazená-la em uma
		 * String. Cada digito da parte numérica é 
		 * um número aleatório entre 0 e 9, e cada
		 * dígito caractere é uma letra entre 'A' e 'Z'
		 */
		
		String senha = "";
		for (int i = 0; i < 4; i++) {
			senha += (int)(Math.random()*10);
			senha += (char)(Math.random() * (90-65+1) + 65);
		}
		System.out.println("Senha: " + senha);
	}
}

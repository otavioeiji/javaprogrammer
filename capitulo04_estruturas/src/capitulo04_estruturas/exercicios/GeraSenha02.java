package capitulo04_estruturas.exercicios;

public class GeraSenha02 {
	public static void main(String[] args) {
		/*
		 * Gerar uma senha com 8 d�gitos, sendo os d�gitos
		 * impares num�ricos, e os d�gitos pares, caracteres, 
		 * e armazen�-la em uma
		 * String. Cada digito da parte num�rica � 
		 * um n�mero aleat�rio entre 0 e 9, e cada
		 * d�gito caractere � uma letra entre 'A' e 'Z'
		 */
		
		String senha = "";
		for (int i = 0; i < 4; i++) {
			senha += (int)(Math.random()*10);
			senha += (char)(Math.random() * (90-65+1) + 65);
		}
		System.out.println("Senha: " + senha);
	}
}

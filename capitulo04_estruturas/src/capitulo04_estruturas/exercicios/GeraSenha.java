package capitulo04_estruturas.exercicios;

public class GeraSenha {
	public static void main(String[] args) {
		/*
		 * Gerar uma senha num�rica com 4 d�gitos, 
		 * e armazen�-la em uma
		 * String. Cada digito da senha � um n�mero aleat�rio
		 * entre 0 e 9.
		 */
		
		String senha = "";
		for (int i = 0; i < 4; i++) {
			senha += (int)(Math.random()*10);
		}
		System.out.println("Senha: " + senha);
	}
}

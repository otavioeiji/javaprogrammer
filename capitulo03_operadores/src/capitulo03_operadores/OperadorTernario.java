package capitulo03_operadores;

public class OperadorTernario {
	public static void main(String[] args) {
		
		int idade = 17;
		String res = (idade < 18) ? "Menor de idade" : "Maior de Idade";
		System.out.println(res);
	}
}

package capitulo03_operadores;

public class OperadoresAritmeticos02 {
	public static void main(String[] args) {
		int n1 = 20, n2 = 10;
		System.out.println("n1 = " + n1 + ", n2 = " + n2);
		
		n1 /= 2;
		n2 += 5;
		System.out.println("n1 = " + n1 + ", n2 = " + n2);
		
		n1 -= (n2 - 10);
		System.out.println("n1 = " + n1 + ", n2 = " + n2);
		
		n1 %= 5;
		n2 %= 3;
		System.out.println("n1 = " + n1 + ", n2 = " + n2);
	}
}
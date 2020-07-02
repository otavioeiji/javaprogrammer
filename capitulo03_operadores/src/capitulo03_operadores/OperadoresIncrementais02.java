package capitulo03_operadores;

public class OperadoresIncrementais02 {
	public static void main(String[] args) {
		
		int n1 = 10, n2 = 10;
		System.out.println("n1 = " + n1);
		System.out.println("n2 = " + n2);
		System.out.println("----------------");
		
		int x = n1++;
		int y = ++n2;
		
		System.out.println("n1 = " + n1);
		System.out.println("n2 = " + n2);
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		
	}
}

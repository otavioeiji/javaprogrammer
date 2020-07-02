package capitulo03_operadores;

public class OperadoresAritmeticos01 {
	public static void main(String[] args) {
		
		int x = 10, y = 3;
		double n;
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("x/y = " + x/y);
		
		n = x/y;
		System.out.println("n = " + n);
		
		n = (double)x/y;
		
		//n = 20.3 / y;
		
		System.out.println("n = " + n);
		System.out.println("x % y = " + x%y);
	}
}

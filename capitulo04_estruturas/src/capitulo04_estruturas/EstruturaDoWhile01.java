package capitulo04_estruturas;

public class EstruturaDoWhile01 {
	public static void main(String[] args) {
		int n = (int)(Math.random() * 10);
		
		do {
			System.out.println(n++);
		} while(n < 6);
		
		System.out.println("--FINALIZADO--");
	}
}

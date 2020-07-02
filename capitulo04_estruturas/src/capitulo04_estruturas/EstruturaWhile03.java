package capitulo04_estruturas;

public class EstruturaWhile03 {
	public static void main(String[] args) {
		int n = (int)(Math.random() * 10);
		
		while(n < 6){
			System.out.println(n++);
		}
		System.out.println("--FINALIZADO--");
	}
}

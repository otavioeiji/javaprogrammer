package capitulo03_operadores.exercicios;

public class Quiz {
	public static void main(String[] args) {
		
		int a = 10, b = 10, c = 10;
		
		int x = 10 * a++ - --b;		//x = 91 (a=11, b=9, c=10)
		int y = b-- + ++c - a*b;	//y = 9+11-11*8=-68 (a=11, b=8, c=11)
		int z = a + b + c--;		//z = 11+8+11 = 30
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}

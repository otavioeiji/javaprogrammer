package capitulo03_operadores;

public class OperadoresLogicos02 {
	public static void main(String[] args) {
		
		int a = 10, b = 10;
		
		boolean b1 = (a < 20 | b == 8); 	 //true, a=10, b=10
		System.out.println(b1 + ",a=" + a + ",b=" + b);
		
		boolean b2 = (++a > 10 & b-- <= 10);//true, a=11, b=9
		System.out.println(b2 + ",a=" + a + ",b=" + b);
		
		boolean b3 = (b == 10 & ++a > 0);	 //false, a=12, b=9
		System.out.println(b3 + ",a=" + a + ",b=" + b);
		
		boolean b4 = (b <= 8 | ++a < 20);	//true ,a=13 ,b=9
		System.out.println(b4 + ",a=" + a + ",b=" + b);
	}
}

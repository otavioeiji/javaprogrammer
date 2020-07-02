package capitulo03_operadores;

public class OperadoresRelacionais01 {
	public static void main(String[] args) {
		
		int a = 10, b = 10, c = 10;
		
		boolean b1 = (a == b);		//true (a=10, b=10, c=10)
		boolean b2 = (--b < c);		//true (a=10, b=9, c=10)
		boolean b3 = (c++ >= ++b);	//true (a=10, b=10, c=11)
		boolean b4 = (--a != --c);	//true (a=9, b=10, c=10)
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		
	}
}

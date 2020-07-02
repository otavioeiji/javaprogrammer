package capitulo03_operadores;

public class OperadoresLogicos01 {
	public static void main(String[] args) {
		
		int a = 10, b = 10;
		
		boolean b1 = (a < 20 || b == 8); 	 //true, a=10, b=10
		System.out.println(b1 + ",a=" + a + ",b=" + b);
		
		boolean b2 = (++a > 10 && b-- <= 10);//true, a=11, b=9
		System.out.println(b2 + ",a=" + a + ",b=" + b);
		
		boolean b3 = (b == 10 && ++a > 0);	 //false, a=11, b=9
		System.out.println(b3 + ",a=" + a + ",b=" + b);
		
		/*
		 * Os operadores && e || são conhecidos como operadores
		 * "short-circuit", ou seja, o JVM avalia apenas aquilo
		 * que for suficiente para o resultado. No caso do terceiro
		 * exemplo (b3), apenas a instrução b==10 foi avaliada, pois
		 * ela foi suficiente para retornar false.
		 */
		
		boolean b4 = (b <= 8 || ++a < 20);	//true ,a=12 ,b=9
		System.out.println(b4 + ",a=" + a + ",b=" + b);
	}
}






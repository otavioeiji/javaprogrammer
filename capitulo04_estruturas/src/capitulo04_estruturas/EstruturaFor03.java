package capitulo04_estruturas;

public class EstruturaFor03 {
	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			double valor = Math.random() * 100;
			
			if(valor < 50){
				continue;
			}
			System.out.println(valor);
		}
	}
}

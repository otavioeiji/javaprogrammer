package capitulo02_variaveis;

import javax.swing.JOptionPane;

public class VariaveisChar01 {
	public static void main(String[] args) {
		char ch1 = 'x';
		char ch2 = 'y';
		char ch3 = 27559;  //0 a 65535 - Tabela Unicode
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch1 + ch2);
		System.out.println("Soma: " + ch1 + ch2);
		System.out.println("ch3: " + ch3);
		JOptionPane.showMessageDialog(null, "ch3: " + ch3);
	}
}

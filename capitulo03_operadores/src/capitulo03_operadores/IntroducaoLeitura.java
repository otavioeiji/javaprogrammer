package capitulo03_operadores;

import javax.swing.JOptionPane;

public class IntroducaoLeitura {
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Informe seu nome");
		//JOptionPane.showMessageDialog(null, "Seu nome: " + nome);
		
		int idade = 
			Integer.parseInt(JOptionPane.
					showInputDialog("Informe sua idade"));
		//JOptionPane.showMessageDialog(null,"Sua idade: " + idade);
		
		double salario = 
			Double.parseDouble(JOptionPane.
					showInputDialog("Informe seu salário")); 
		//JOptionPane.showMessageDialog(null, "Seu salário: " + salario);
		
		String resultado = "Seu nome: " + nome +
				           "\nSua idade: " + idade +
				           "\nSeu salário: " + salario;
		
		JOptionPane.showMessageDialog(null, resultado);
		System.out.println(resultado);
		
		
		
		
	}
}

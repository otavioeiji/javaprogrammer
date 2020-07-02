package capitulo04_estruturas.exercicios;

import javax.swing.JOptionPane;

public class ValeTransporte {
	public static void main(String[] args) {
		
		double salario = Double.parseDouble(
				JOptionPane.showInputDialog("Qual o salário?"));
		double vt = 140;		
		double desconto = salario * 0.06;
		
		if(desconto < vt){
			vt = desconto;
		}
		
		JOptionPane.showMessageDialog(null, "Valor descontado: " + vt);		
	}
}

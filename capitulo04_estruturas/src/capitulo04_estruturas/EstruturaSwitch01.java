package capitulo04_estruturas;

import javax.swing.JOptionPane;

public class EstruturaSwitch01 {
	public static void main(String[] args) {

		int diaSemana = Integer.parseInt(
				JOptionPane.showInputDialog("Informe o dia (1 a 7)"));
		
		if(diaSemana < 1 || diaSemana > 7){
			JOptionPane.showMessageDialog(null, "Dia inválido");
			return;
		}
		String dia;
		
		switch(diaSemana){
		case 1: dia = "segunda-feira";break;
		case 2: dia = "terça-feira";break;
		case 3: dia = "quarta-feira";break;
		case 4: dia = "quinta-feira";break;
		case 5: dia = "sexta-feira";break;
		case 6: dia = "sábado";break;
		default: dia = "domingo";
		}
		
		JOptionPane.showMessageDialog(null, "Dia Escolhido: " + dia);
	}
}

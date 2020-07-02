package capitulo04_estruturas.exercicios;

import javax.swing.JOptionPane;

public class AdivinhaNumero {
	public static void main(String[] args) {
		int gerado = (int)(Math.random() * 100);
		int max = 100, min = 0;
		int adivinha = 0, tentativas = 0;
		do {
			tentativas++;
			adivinha = Integer.parseInt(
				JOptionPane.showInputDialog(
					"Fornecer um numero [" + min + ", " + max + "]"));
			if(adivinha < min || adivinha > max){ continue; }
			if(adivinha < gerado){
				min = adivinha;
			}
			else if (adivinha > gerado){
				max = adivinha;
			}			
		} while(adivinha != gerado);
		JOptionPane.showMessageDialog(null, "Acertou em " + 
		                                 tentativas + " tentativas");
	}
}

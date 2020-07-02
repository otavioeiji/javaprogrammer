package capitulo02_variaveis;

import javax.swing.JOptionPane;

public class VariaveisChar02 {
	public static void main(String[] args) {
		
		char aspas = '\"';
		String descricao = "Nosso \"curso" + aspas + 
				           " iniciou dia '17/05'\ne "
				           + "terminará dia 23/08";
		JOptionPane.showMessageDialog(null, descricao);
	}
}

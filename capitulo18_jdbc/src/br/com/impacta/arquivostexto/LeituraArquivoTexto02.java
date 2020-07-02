package br.com.impacta.arquivostexto;

import java.io.FileReader;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class LeituraArquivoTexto02 {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			JFileChooser chooser = new JFileChooser();
			if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {

				FileReader arquivo = new FileReader(
									chooser.getSelectedFile());
				while (true) {
					int ch = arquivo.read();
					if (ch == -1) { // EOF - End Of File
						break;
					}
					System.out.print((char) ch);
				}
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}

}

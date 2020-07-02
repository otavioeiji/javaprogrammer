package br.com.impacta.arquivostexto;

import java.io.FileReader;

import javax.swing.JOptionPane;

public class LeituraArquivoTexto01 {
	public static void main(String[] args) {
		try {
			FileReader arquivo = 
					new FileReader("C:/Windows/aau_installer.log");
			while(true){
				int ch = arquivo.read();
				if(ch == -1){ //EOF - End Of File
					break;
				}
				System.out.print((char)ch);
			}
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
}

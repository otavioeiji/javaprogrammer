package br.com.impacta.arquivostexto;

import java.io.FileWriter;

import javax.swing.JOptionPane;

public class GravacaoArquivoTexto01 {
	public static void main(String[] args) {
		
		String texto = "Curso Java Programmer \r\n" +
	                   "Inicio em 17/05 \r\n" +
				       "Término 23/08";
		
		try {
			FileWriter arquivo = new FileWriter(
					"C:/Users/emilio/Documents/Curso_JavaProgrammer_Domingo/arquivos/texto.txt");
			arquivo.write(texto);
			//arquivo.flush();
			arquivo.close();
			JOptionPane.showMessageDialog(null, "Arquivo gerado com sucesso!");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
}

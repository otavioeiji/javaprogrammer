package br.com.impacta.arquivostexto;

import java.io.FileWriter;

import javax.swing.JOptionPane;

public class GravacaoArquivoTexto02 {
	public static void main(String[] args) {
		/*
		 * Em uma estrutura de repeticao, o usuário fornece
		 * alguns nomes. Quando ele não mais quiser fornecer
		 * nomes, basta pressionar "Enter" ou "Cancelar" na
		 * caixa de diálogo. Os nomes fornecidos serão 
		 * armazenados em um arquivo chamado nomes.txt
		 */
		try {
			FileWriter arquivo = new FileWriter(
				"C:/Users/emilio/Documents/Curso_JavaProgrammer_Domingo/arquivos/nomes.txt",true);
			
			while(true){
				String nome = JOptionPane.showInputDialog("Informe um nome:");
				if(nome == null || nome.trim().equals("")){
					break;
				}
				arquivo.write(nome + "\r\n");
			}
			arquivo.close();
			JOptionPane.showMessageDialog(null, "Lista de nomes criada!!");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
}

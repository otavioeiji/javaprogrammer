package br.com.impacta.arquivosbinarios;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Endereco;

public class GravacaoObjetos01 {
	public static void main(String[] args) {
		Endereco endereco = new 
				Endereco("Duque de Caxias", 120, "São Paulo");
		
		try {
			FileOutputStream fos = new FileOutputStream("C:/Users/emilio/"
				+ "Documents/Curso_JavaProgrammer_Domingo/arquivos/dados.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(endereco);
			oos.close();
			JOptionPane.showMessageDialog(null, 
					"Objeto Armazenado com sucesso!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

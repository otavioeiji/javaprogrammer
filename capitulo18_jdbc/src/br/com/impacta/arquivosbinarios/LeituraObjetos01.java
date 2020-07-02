package br.com.impacta.arquivosbinarios;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import br.com.impacta.classes.Endereco;

public class LeituraObjetos01 {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("C:/Users/emilio/"
					+ "Documents/Curso_JavaProgrammer_Domingo/arquivos/dados.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Endereco endereco = (Endereco)ois.readObject();
			System.out.println("Logradouro: " + endereco.getLogradouro());
			System.out.println("Numero: " + endereco.getNumero());
			System.out.println("Cidade: " + endereco.getCidade());
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

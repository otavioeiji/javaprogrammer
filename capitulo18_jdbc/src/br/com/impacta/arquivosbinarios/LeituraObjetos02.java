package br.com.impacta.arquivosbinarios;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import br.com.impacta.classes.Funcionario;

public class LeituraObjetos02 {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("C:/Users/emilio/"
					+ "Documents/Curso_JavaProgrammer_Domingo/"
					+ "arquivos/funcionario.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Funcionario funcionario = (Funcionario)ois.readObject();
			System.out.println(funcionario.getDados());
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

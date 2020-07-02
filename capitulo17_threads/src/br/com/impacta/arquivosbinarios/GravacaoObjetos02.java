package br.com.impacta.arquivosbinarios;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Endereco;
import br.com.impacta.classes.Funcionario;
import br.com.impacta.enumeracoes.Sexos;

public class GravacaoObjetos02 {
	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario("Cesar", 
				               Sexos.MASCULINO, 
				               34, "Atendente", 2000);
		
		
		
		try {
			FileOutputStream fos = new FileOutputStream("C:/Users/emilio/"
				+ "Documents/Curso_JavaProgrammer_Domingo/arquivos/funcionario.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(funcionario);
			oos.close();
			JOptionPane.showMessageDialog(null, 
					"Objeto Armazenado com sucesso!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}

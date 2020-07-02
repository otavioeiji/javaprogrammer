package br.com.impacta.aplicacao;

import java.awt.HeadlessException;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Cliente;
import br.com.impacta.classes.Endereco;
import br.com.impacta.classes.Funcionario;
import br.com.impacta.enumeracoes.Sexos;
import br.com.impacta.utilitarios.Utilitarios;

public class AplicacaoPessoa {
	public static void main(String[] args) {

		try {
			//Referência e instância da classe Funcionario
			Funcionario func = new Funcionario("Gerson", Sexos.MASCULINO, 
					                                  25, "Motoboy", 200);
			
			func.setEndereco(new Endereco("Rua Clelia", 1200, " S. Paulo"));
			
			JOptionPane.showMessageDialog(null, func.getDados());
		} catch (Exception e) {
			//e.printStackTrace();
			String erro = "";
			for(StackTraceElement st: e.getStackTrace()){
				erro += st.toString() + "\n";
			}
			
			erro += "\nERRO: " + e.getMessage();
			JOptionPane.showMessageDialog(null, erro);
		}		
	}
}





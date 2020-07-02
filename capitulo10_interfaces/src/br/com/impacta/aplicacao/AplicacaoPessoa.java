package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Cliente;
import br.com.impacta.classes.Endereco;
import br.com.impacta.classes.Funcionario;
import br.com.impacta.enumeracoes.Sexos;
import br.com.impacta.utilitarios.Utilitarios;

public class AplicacaoPessoa {
	public static void main(String[] args) {

		//Refer�ncia e inst�ncia da classe Funcionario
		Funcionario func = new Funcionario("Gerson", Sexos.MASCULINO);
		func.setCargo("Motoboy");
		func.setSalario(2000);	
		func.setEndereco(new Endereco("Rua Clelia", 1200, " S. Paulo"));
		
		JOptionPane.showMessageDialog(null, func.getDados());
		
		//Refer�ncia e inst�ncia da classe Cliente
		Cliente cliente = new Cliente("Maria", Sexos.FEMININO,
				                       "12345678900", "3254-2200");
		cliente.setEndereco(Utilitarios.criarEndereco());
		
		JOptionPane.showMessageDialog(null, cliente.getDados());
		
		
	}
}





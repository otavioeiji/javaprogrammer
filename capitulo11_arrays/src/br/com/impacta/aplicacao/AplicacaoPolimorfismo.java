package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Cliente;
import br.com.impacta.classes.Funcionario;
import br.com.impacta.classes.Pessoa;
import br.com.impacta.enumeracoes.Sexos;

public class AplicacaoPolimorfismo {
	public static void main(String[] args) {
		
		Pessoa pessoa = new Funcionario("João", Sexos.MASCULINO, 
				                        "Motorista", 2500);		
		pessoa.setIdade(25);
		
		//alterar o salario
		if(pessoa instanceof Funcionario){
			((Funcionario)pessoa).setSalario(25000);
		}		
		exibirPessoa(pessoa);
		
		pessoa = new 
			Cliente("Claudia", Sexos.FEMININO, "32156481478","2215-1745");
		pessoa.setIdade(30);
		
		//alterar o telefone		
		if(pessoa instanceof Cliente){
			((Cliente) pessoa).setTelefone("9852-1125");
		}
		exibirPessoa(pessoa);
	}
	
	private static void exibirPessoa(Pessoa p){
		String tipo = p.getClass().getSimpleName();
		
		JOptionPane.showMessageDialog(null, tipo + "\n\n" + p.getDados());
	}
}




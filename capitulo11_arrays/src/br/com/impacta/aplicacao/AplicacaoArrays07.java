package br.com.impacta.aplicacao;
import br.com.impacta.classes.Cliente;
import br.com.impacta.classes.Funcionario;
import br.com.impacta.classes.Pessoa;
import br.com.impacta.enumeracoes.Sexos;

public class AplicacaoArrays07 {
	public static void main(String[] args) {
		
		Pessoa[] pessoas  = new Pessoa[3];
		pessoas[0] = new Funcionario("Zeca", Sexos.MASCULINO,  
				                     "Professor", 1000);                   
		pessoas[1] = new Cliente("Ana", Sexos.FEMININO, 
				                 "12312312310", "3255-9963");
		
		Funcionario fn = new Funcionario("Carlos", Sexos.MASCULINO);
		pessoas[2] = fn;
		
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa.getDados());
			System.out.println("-----------------");
		}
		
		
	}
}








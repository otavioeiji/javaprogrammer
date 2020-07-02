package capitulo06_classes.pacote02;

import capitulo06_classes.pacote01.Pessoa;

public class TestaPessoaPacoteDiferente {
	public static void main(String[] args) {
		
		Pessoa p = new Pessoa(); //(1)
		p.nome = "Rebecca";
		p.idade = 23;	
		
		System.out.println("Nome: " + p.nome);
		System.out.println("Idade: " + p.idade);
	}
}

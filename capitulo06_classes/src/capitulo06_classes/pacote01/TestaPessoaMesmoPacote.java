package capitulo06_classes.pacote01;

public class TestaPessoaMesmoPacote {
	public static void main(String[] args) {
		
		Pessoa p = new Pessoa(); //(1)
		p.nome = "Rebecca";
		p.idade = 23;		
		System.out.println("Nome: " + p.nome);
		System.out.println("Idade: " + p.idade);
		
		Pessoa p1 = new Pessoa(); //(2)
		p1.nome = "Emilio";
		p1.idade = 45;
		System.out.println("Nome: " + p1.nome);
		System.out.println("Idade: " + p1.idade);                          
		
		Pessoa p2 = p; //(3)
		p = null;      //(4)
		System.out.println("Nome: " + p2.nome);
		System.out.println("Idade: " + p2.idade);
		
		p2 = new Pessoa();  //(5)
		
	}
}

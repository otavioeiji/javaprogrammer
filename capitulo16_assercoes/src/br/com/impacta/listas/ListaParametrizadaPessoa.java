package br.com.impacta.listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.impacta.classes.Cliente;
import br.com.impacta.classes.Funcionario;
import br.com.impacta.classes.Pessoa;
import br.com.impacta.enumeracoes.Sexos;

public class ListaParametrizadaPessoa {
	public static void main(String[] args) {
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		pessoas.add(new Funcionario("Douglas", Sexos.MASCULINO, 51, "Tecnico", 3500));
		pessoas.add(new Funcionario("Simone",Sexos.FEMININO,23,"Secretaria",3000));
		pessoas.add(new Cliente("Ademir", Sexos.MASCULINO, "111222233345", "996325186"));
		pessoas.add(new Cliente("Gabriel", Sexos.MASCULINO,"98765432100","70529954"));
		
		pessoas.forEach(p -> System.out.println(p));
		System.out.println("------------------------------------");
		Collections.sort(pessoas);
		pessoas.forEach(p -> System.out.println(p));
	}
	
}







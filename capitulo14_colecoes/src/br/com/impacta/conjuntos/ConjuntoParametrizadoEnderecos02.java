package br.com.impacta.conjuntos;

import java.util.LinkedHashSet;
import java.util.Set;

import br.com.impacta.classes.Endereco;

public class ConjuntoParametrizadoEnderecos02 {
	
	public static void main(String[] args) {
		Set<Endereco> enderecos = new LinkedHashSet<Endereco>();
		enderecos.add(new Endereco("Paulista", 1009, "São Paulo"));
		enderecos.add(new Endereco("Paulista", 326, "São Paulo"));
		enderecos.add(new Endereco("Rio Branco", 2500, "Rio de Janeiro"));
		enderecos.add(new Endereco("Bela Cintra", 425, "São Paulo"));
		enderecos.add(new Endereco("Getulio Vargas", 1200, "Cuiabá"));
		enderecos.add(new Endereco("Afonso Pena", 200, "Campo Grande"));
		enderecos.add(new Endereco("Bernardino de Campos", 124, "Santo Andre"));
		enderecos.add(new Endereco("Paulista", 1009, "São Paulo"));
		
		enderecos.forEach(e -> System.out.println(e));
		
	}

}

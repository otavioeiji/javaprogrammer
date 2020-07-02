package br.com.impacta.conjuntos;

import java.util.LinkedHashSet;
import java.util.Set;

import br.com.impacta.classes.Endereco;

public class ConjuntoParametrizadoEnderecos02 {
	
	public static void main(String[] args) {
		Set<Endereco> enderecos = new LinkedHashSet<Endereco>();
		enderecos.add(new Endereco("Paulista", 1009, "S�o Paulo"));
		enderecos.add(new Endereco("Paulista", 326, "S�o Paulo"));
		enderecos.add(new Endereco("Rio Branco", 2500, "Rio de Janeiro"));
		enderecos.add(new Endereco("Bela Cintra", 425, "S�o Paulo"));
		enderecos.add(new Endereco("Getulio Vargas", 1200, "Cuiab�"));
		enderecos.add(new Endereco("Afonso Pena", 200, "Campo Grande"));
		enderecos.add(new Endereco("Bernardino de Campos", 124, "Santo Andre"));
		enderecos.add(new Endereco("Paulista", 1009, "S�o Paulo"));
		
		enderecos.forEach(e -> System.out.println(e));
		
	}

}

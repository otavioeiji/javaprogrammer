package br.com.impacta.listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.impacta.classes.Endereco;
import br.com.impacta.classes.OrdenacaoLogradouro;

public class ListaParametrizadaEndereco {
	public static void main(String[] args) {
		
		List<Endereco> enderecos = new ArrayList<Endereco>();
		enderecos.add(new Endereco("Paulista", 1009, "São Paulo"));
		enderecos.add(new Endereco("Paulista", 326, "São Paulo"));
		enderecos.add(new Endereco("Rio Branco", 2500, "Rio de Janeiro"));
		enderecos.add(new Endereco("Bela Cintra", 425, "São Paulo"));
		enderecos.add(new Endereco("Getulio Vargas", 1200, "Cuiabá"));
		enderecos.add(new Endereco("Afonso Pena", 200, "Campo Grande"));
		enderecos.add(new Endereco("Bernardino de Campos", 124, "Santo Andre"));
		
		//lista original
		enderecos.forEach(s -> System.out.println(s));
		System.out.println("---------------------------------");
		
		//lista ordenada pelo logradouro
		Collections.sort(enderecos, new OrdenacaoLogradouro());
		enderecos.forEach(s -> System.out.println(s));
		System.out.println("---------------------------------");

		
	}
}
















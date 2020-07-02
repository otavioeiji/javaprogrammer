package br.com.impacta.conjuntos;

import java.util.HashSet;
import java.util.Set;

public class TestaConjuntoHashSet {
	public static void main(String[] args) {
		Set<Integer> numeros = new HashSet<Integer>();
		numeros.add(1254);
		numeros.add(6501);
		numeros.add(8547);
		numeros.add(6678);
		numeros.add(9475);
		numeros.add(6501);
		
		numeros.forEach(n -> System.out.println(n));
		System.out.println("----------------------------");
		
		Set<String> nomes = new HashSet<String>();
		nomes.add("Cesar");
		nomes.add("Jocel");
		nomes.add("Francisco");
		nomes.add("Claudinei");
		nomes.add("Jocel");
		
		nomes.forEach(s -> System.out.println(s));
		nomes.forEach(s -> System.out.println(s.hashCode()));
		
	}
}






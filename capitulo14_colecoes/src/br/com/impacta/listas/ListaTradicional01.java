package br.com.impacta.listas;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.impacta.classes.Cliente;
import br.com.impacta.classes.Funcionario;
import br.com.impacta.enumeracoes.Sexos;

public class ListaTradicional01 {
	public static void main(String[] args) {
		List lista = new ArrayList();
		lista.add("Dinossauros");
		lista.add("Umbanda");
		lista.add("Paulista");
		lista.add(321.5);
		lista.add(new Date());
		lista.add(new Funcionario("Denis", Sexos.MASCULINO, "Jornalista", 70000));
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		System.out.println("--------------------------");
		
		for (int i = 0; i < lista.size(); i++) {
			if(lista.get(i) instanceof String){
				String elemento = (String)lista.get(i);
				System.out.println(elemento);
			}
		}
	}
}








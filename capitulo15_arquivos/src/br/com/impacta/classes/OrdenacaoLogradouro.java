package br.com.impacta.classes;

import java.util.Comparator;

public class OrdenacaoLogradouro implements Comparator<Endereco>{

	@Override
	public int compare(Endereco arg0, Endereco arg1) {		
		return arg0.getLogradouro().compareTo(arg1.getLogradouro());
	}



}

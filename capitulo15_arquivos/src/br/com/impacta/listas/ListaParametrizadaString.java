package br.com.impacta.listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaParametrizadaString {
	public static void main(String[] args) {
		
		List<String> cursos = new ArrayList<String>();
		cursos.add("Turismo");
		cursos.add("Jornalismo");
		cursos.add("Pedagogia");
		cursos.add("Excel");
		cursos.add("Enfermagem");
		cursos.add("Direito");
		
		cursos.add(1, "Engenharia");
		cursos.remove(0);
		cursos.remove("Excel");
		
		for(String curso: cursos){
			System.out.println(curso);
		}
		System.out.println("--------------------");
		
		Collections.sort(cursos);
		
		cursos.forEach(s -> System.out.println(s));
	}
}






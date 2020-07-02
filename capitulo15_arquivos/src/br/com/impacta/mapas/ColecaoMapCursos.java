package br.com.impacta.mapas;

import java.util.LinkedHashMap;
import java.util.Map;

public class ColecaoMapCursos {
	public static void main(String[] args) {
		//coleção de cursos cujos elementos são formados
		//pelo código do curso e pela sua descrição
		Map<Integer, String> cursos = new LinkedHashMap<>();
		cursos.put(123, "Java");
		cursos.put(945, "Asp.Net");
		cursos.put(845, "Spring MVC");
		cursos.put(410, "Hibernate");
		
		//exibindo a própria coleção
		System.out.println(cursos);
		
		//usando a estrutura foreach
		for(Map.Entry<Integer, String> item : cursos.entrySet()){
			System.out.println(item.getKey()+ ","+ item.getValue());
		}
		if(cursos.containsKey(845)){
			System.out.println("Curso 845: " + cursos.get(845));
		}
		
	}
}

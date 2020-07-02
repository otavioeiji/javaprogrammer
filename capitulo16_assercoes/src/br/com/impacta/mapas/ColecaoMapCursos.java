package br.com.impacta.mapas;

import java.util.LinkedHashMap;
import java.util.Map;

public class ColecaoMapCursos {
	public static void main(String[] args) {
		//cole��o de cursos cujos elementos s�o formados
		//pelo c�digo do curso e pela sua descri��o
		Map<Integer, String> cursos = new LinkedHashMap<>();
		cursos.put(123, "Java");
		cursos.put(945, "Asp.Net");
		cursos.put(845, "Spring MVC");
		cursos.put(410, "Hibernate");
		
		//exibindo a pr�pria cole��o
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

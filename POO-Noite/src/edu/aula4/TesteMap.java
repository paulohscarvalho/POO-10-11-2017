package edu.aula4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TesteMap {

	public static void main(String[] args) {

		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("Sao Paulo", 10000000);
		map.put("Rio", 5000000);
		map.put("Salvador", 1000000);
		map.put("Salvador", 2000000);
		
		Set<String> chaves = map.keySet();
		
		for (String chave : chaves) { 
			System.out.println( 
			"Chave : " + chave + "  Valor : " + map.get( chave ) );
		}

	}

}

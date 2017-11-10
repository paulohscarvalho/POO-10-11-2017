package edu.aula4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TesteHashSet {

	public static void main(String[] args) {
		Set h = new HashSet();
		h.add("Texto1");
		h.add(10);
		h.add(20.0f);
		h.add(true);
		h.add(new String[] {"1", "2", "3"});
		h.add(new StringBuffer("String Buffer Text"));
		
		Iterator objIterator = h.iterator();
		
		while (objIterator.hasNext()) { 
			System.out.println( objIterator.next() );
		}
		
		System.out.println( "Tamanho do Conjunto " + h.size() );
		
		System.out.println( "Elemento Texto1 C : " + h.contains(20.1f));
	}

}

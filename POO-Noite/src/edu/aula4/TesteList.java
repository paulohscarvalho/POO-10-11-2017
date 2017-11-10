package edu.aula4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.Vector;

public class TesteList {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		long horaInicio = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) { 
			lista.add( UUID.randomUUID().toString() );
			// lista.add("Asldfjslkdjflksjdflksjdflksjdlkfjsldfjskljflsdjfklsjdklfjslkdf");
		}
		
		System.out.println( lista.get( 3132 ) );
		
		//lista.forEach( e -> {System.out.println( e );});
		
		long horaFim = System.currentTimeMillis();
		
		System.out.println("Hora inicio : " + horaInicio);
		System.out.println("Hora fim : " + horaFim);
		System.out.println("Hora gap : " + (horaFim - horaInicio));
		

	}

}

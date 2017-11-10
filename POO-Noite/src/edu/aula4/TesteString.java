package edu.aula4;
public class TesteString {
	public static void main(String[] args) {
		long horarioInicio = System.currentTimeMillis();
		String a = "";
		for (int i = 0; i < 100000; i++) { 
			a = a + "*";
		}
		System.out.println( a.length() );
		long horarioFim = System.currentTimeMillis();
		System.out.println("Horario Inicio : " + horarioInicio);
		System.out.println("Horario Fim : " + horarioFim);
		System.out.println("Tempo despendido : " + (horarioFim - horarioInicio));
	}
}

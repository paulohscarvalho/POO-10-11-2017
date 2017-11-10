package edu.aula4;
public class TesteStringBuffer {
	public static void main(String[] args) {
		long horarioInicio = System.currentTimeMillis();
		StringBuffer a = new StringBuffer();
		for (int i = 0; i < 1000000; i++) { 
			a.append("*");
		}
		System.out.println( a.length() );
		long horarioFim = System.currentTimeMillis();
		System.out.println("Horario Inicio : " + horarioInicio);
		System.out.println("Horario Fim : " + horarioFim);
		System.out.println("Tempo despendido : " + (horarioFim - horarioInicio));
	}
}

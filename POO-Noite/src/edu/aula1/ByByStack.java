package edu.aula1;

public class ByByStack {
	
	public static int count = 0;
	
	public static void main(String[] args) {
		System.out.printf("Executando %d \n", count++);
		main(args);

	}

}

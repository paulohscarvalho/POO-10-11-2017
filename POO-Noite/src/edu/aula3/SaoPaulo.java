package edu.aula3;

public class SaoPaulo extends Time implements Corrupcao {
	
	public final static String TECNICO = "Rogerio Ceni";
	
	public void procurarTecnico() { 
		System.out.println("Procurando tecnico");
	}
	
	public void contrataJogador() { 
		System.out.println("S�o Paulo, contrata jogador de base");
	}
	
	public void lavagemDinheiro() { 
		System.out.println("S�o Paulo, lavando dinheiro");
	}

}

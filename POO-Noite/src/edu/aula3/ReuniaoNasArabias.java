package edu.aula3;

public class ReuniaoNasArabias {
	
	
	public void desovarDinheiro(Corrupcao c) { 
		c.lavagemDinheiro();
	}
	
	public static void main(String[] args) {
		SaoPaulo sp = new SaoPaulo();
		Palmeiras pl = new Palmeiras();
		Politico gilmar = new Politico();
		
		ReuniaoNasArabias reuniao = new ReuniaoNasArabias();
		
		reuniao.desovarDinheiro(gilmar);
	}

}

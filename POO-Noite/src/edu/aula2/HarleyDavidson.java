package edu.aula2;

public class HarleyDavidson extends Moto {
	
	public HarleyDavidson() { 
		System.out.println("Instanciada a HarleyDavidson");
	}

	@Override
	public void acelerar(int velocidade) { 
		System.out.println("Esta a " + velocidade + "km/h da HarleyDavidson");
	}

}

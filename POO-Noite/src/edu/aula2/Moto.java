package edu.aula2;

public class Moto {
	Pneu p1;
	Pneu p2;
	public Moto() { 
		System.out.println("Moto criada ...");
	}
	
	public void criar() { 
		int j = 5;
		p1 = new Pneu();
		p2 = new Pneu();
	}
	
	public void acelerar(int velocidade) { 
		System.out.println("Esta a " +velocidade+ "km/h da moto");
	}

}

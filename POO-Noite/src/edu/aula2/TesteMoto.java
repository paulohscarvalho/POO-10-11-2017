package edu.aula2;

public class TesteMoto {

	public static void main(String[] args) {
		System.out.println("da Moto");
		Moto m1 = new Moto();
		
		System.out.println("da HarleyDavidson");
		HarleyDavidson h1 = new HarleyDavidson();
		
		System.out.println("da HarleyDavidson disfar�ada");
		Moto m2 = new HarleyDavidson();
		
		System.out.println("da Moto disfar�ada");
		HarleyDavidson h2 = (HarleyDavidson) new Moto();		

		
	}

}

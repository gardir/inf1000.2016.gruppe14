public class MainBil {

	public static void main(String[] args) {

		// antar utslipp er et eller annet pr. aar og vekt er i kg
		Bil bilnavn = new Bil("Blaa", "318", 5000, 1300);

		Bil fiestaen = new Bil("Roed", "Fiesta", 1300, 950);

		Bil pappaLandCruiser =
			new Bil("Soelv", "Toyota", 13000, 2200);

		skrivUtBil(bilnavn);
		skrivUtBil(fiestaen);
		skrivUtBil(pappaLandCruiser);
		
	}

	/*
	 * Metoden skriver ut informasjon om bilen
	 */
	public static void skrivUtBil(Bil bilen) {
		System.out.println("Bilen " + bilen.hentModell()
		                   + " er " + bilen.hentFarge()
		                   + " skader miljoete med " + bilen.hentUtslipp()
		                   + " med en vekt paa " + bilen.hentVekt());
	}
	
}

import java.util.Scanner;

public class TestKlasse {

	public static void main(String[] args) {
		System.out.println("Velkommen til INF1000");

		// Oppsett av variabler
		int brukersAlder;
		int myndighetsAlder = 18;
		String brukersNavn;
		Scanner tastatur = new Scanner(System.in);

		// Hent informasjon fra bruker
		// Foerst navn
		System.out.println("Skriv inn navnet ditt");
		brukersNavn = tastatur.nextLine();

		// Deretter alder
		System.out.println("Skriv inn din alder");
		String brukersAlderSomString = tastatur.nextLine();
		// Konverterer til typen 'int'
		brukersAlder = Integer.parseInt(brukersAlderSomString);

		// Skriver ut beskjed til bruker - navnet foerst og er likt uansett
		System.out.println("Hei " + brukersNavn + "!");
		// Deretter om han er myndig eller ei, som er resultat av alderen bruker skrev
		if (brukersAlder < myndighetsAlder) {
			System.out.println("Med alder paa " + brukersAlder + " er du nok ikke myndig (enda)");
		} else if (brukersAlder == myndighetsAlder) {
			System.out.println("Joess - du er akkurat myndig i aar med " + brukersAlder + " som alder!");
		} else {
			// Kan regne med 'int' typene, men ikke med String
			int aarSidenMyndig = brukersAlder - myndighetsAlder;
			System.out.println("Det er " + aarSidenMyndig + " aar siden du var myndig" );
		}
	}

	public static void linjeskift() {
		// Metoden min 'linjeskift' kaller paa en tom println for aa kun faa et linjeskift
		System.out.println();
	}
	
}

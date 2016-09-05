import java.util.Scanner;

public class Utskrift {

	public static void main(String[] args) {
		// Her kan man kommentere inn/ut den delen man vil kjoere
		//tekstTesten();
		tallTesten();
	}
	
	public static void tekstTesten() {
		// Foerst lage en Scanner ved variabelnavn tastatur for aa hente fra bruker
		Scanner tastatur = new Scanner(System.in);
		// Bruker utskrift metoden vi skrev lenger nede for aa skrive ut hva vi vil bruker skal skrive
		utskrift("Gi meg et navn");
		String navn = tastatur.nextLine();
		// Skriver ut en velkomst
		velkomst("Hei du", navn);
	}
	
	public static void tallTesten() {
		// Bruker utskrift metoden for aa be bruker om tall
		utskrift("Gi meg et tall");
		// Lager Scanner - merk at det er annerledes "rekkefoelge" fra over,
		// for det er ikke ved deklarering/initialisering vi henter bruker, det er nextLine() delen.
		Scanner tastatur = new Scanner(System.in);
		// Henter tallet som tekst, eller String
		String somTekst = tastatur.nextLine();
		// Konverterer String til int med linjen under, parseInt(..) metoden tar 1 parameter av type String
		int somTall = Integer.parseInt(somTekst);
		// Spoer bruker hva den vil gjoer - bedre informasjon er oensket paa deres program(!)
		utskrift("Vil du gjoer 1, 2, eller 3");
		// Kan _gjenbruke_ variabel fra tidligere, siden programmet naa er ferdig med _verdien_ som var lagret
		// i somTekst variabelen.
		// Deklarerer den ikke paa nytt, gir den bare en ny verdi - som denne gangen er hva brukeren vil "gjoer"
		somTekst = tastatur.nextLine();
		if (somTekst.equals("1")) {
			// 1 er oek med fem
			oekMedFem(somTall);
		} else if (somTekst.equals("2")) {
			// 2 er oek med 10
			oekMedTi(somTall);
		} else if (somTekst.equals("3")) {
			// 3 er trekk fra 10
			System.out.println("Tallet foer metoden: " + somTall);
			trekkFraTi(somTall);
			System.out.println("Tallet etter metoden: " + somTall); // Vil vaere det samme tallet
		} else {
			// Alt annet er ugyldig, og brukeren kan faa beskjed om det
			// == OBS == dette er nytt etter timen
			utskrift("Ugyldig kommando");
		}
	}
	
	public static void utskrift(String tekst) {
		// Denne metoden skriver ut String objektet 'tekst' som kommer med som parameter
		// De som var igjen etter timen husker at tekst kan vaere hva som helst, vi kalte den
		// Ogsaa for alpha
		System.out.println(alpha);
	}
	
	public static void velkomst(String velkomstSetning, String navn) {
		// Skriver ut en velkomstsetning med navnet, legg merke til at det er 2 krevde argumenter/parametre
		System.out.println( velkomstSetning + " " + navn);
	}
	
	public static void oekMedTi(int somTall) {
		System.out.println(somTall);
	}
	
	public static void oekMedFem(int somTall) {
		System.out.println(somTall+5);
	}
	
	public static void trekkFraTi(int somTall) {
		// Utvidet her for aa vise at selv om variabelen endres i metoden, endres den ikke i
		// de opprinnelige metoden
		somTall = somTall - 10;
		System.out.println(somTall);
	}

}

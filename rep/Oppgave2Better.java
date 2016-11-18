import java.util.Scanner;

public class Oppgave2Better {

	Scanner stdin = new Scanner(System.in);

	public void metode() {
		String navn, telefonnummer, gateaddresse;
		int alder, postnummer;

		navn = fraBruker("Skriv ditt navn");

		telefonnummer = fraBruker("Skriv ditt telefonnummer (paa det format du vil)");

		alder = Integer.parseInt(fraBruker("Hvor gammel er du? (skriv et tall)"));

		gateaddresse = fraBruker("Hva er gateaddressen din?");

		postnummer = Integer.parseInt(fraBruker("Til slutt, postnummeret som et tall"));
		
	}

	private String fraBruker( String forklaring ) {
		System.out.print(forklaring + ": ");
		return stdin.nextLine();
	}
	
}

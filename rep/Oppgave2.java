import java.util.Scanner;

public class Oppgave2 {

	public void metode() {
		String navn, telefonnummer, gateaddresse;
		int alder, postnummer;

		Scanner stdin = new Scanner(System.in);

		System.out.println("Skriv ditt navn:");
		navn = stdin.nextLine();

		System.out.println("Skriv ditt telefonnummer (paa det format du vil)");
		telefonnummer = stdin.nextLine();

		System.out.println("Hvor gammel er du? (skriv et tall)");
		alder = Integer.parseInt(stdin.nextLine());

		System.out.println("Hva er gateaddressen din?");
		gateaddresse = stdin.nextLine();

		System.out.println("Til slutt, postnummeret som et tall");
		postnummer = Integer.parseInt(stdin.nextLine());
		
	}
	
}

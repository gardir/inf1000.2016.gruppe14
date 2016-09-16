import java.util.Scanner;

public class Primtall {

	public static void main(String[] args) {
		sjekkBaadeOmPrimtallOgAlleUnder();
	}

	// Dette var det som ble skrevet i timen
	public static void sjekkBareOmPrimtall() {
		Scanner tastatur = new Scanner(System.in);

		System.out.println("Tast et tall");
		int tallet = Integer.parseInt(tastatur.nextLine());

		int divisor = 2;
//		System.out.print(tallet + ": "); // Hjelpeutskrift
		while(tallet % divisor != 0 && divisor < tallet) {
			// Hvis baade tallet MODULO divisor IKKE er 0 (det er ikke en faktor)
			// OG vi ikke har sjekket alle tall mindre enn 'tallet'
			
//			System.out.print(divisor + ", "); // Hjelpeutskrift
			divisor = divisor + 1; // oppdater divisor
		}
//		System.out.println(); // Hjelpeutskrift
			
		if (tallet == divisor) {
			System.out.println(tallet + " er et primtall");
		} else {
			System.out.println(tallet + " er ikke et primtall");
		}		
	}

	public static void sjekkBaadeOmPrimtallOgAlleUnder() {
		Scanner tastatur = new Scanner(System.in);

		System.out.println("Tast et tall");
		int tallet = Integer.parseInt(tastatur.nextLine());
		int teller = 1; // denne skal telle seg opp til tallet
		int divisor = 2; // kan deklarere

		// Merk en egen teller som gaar _opp_ mot tallet
		while(teller<tallet) {
			// Skal sjekke _alle_ tall under tallet etter primtall, og skrive ut alle
			while(teller%divisor != 0 && divisor < teller) { // sjekker bare opp mot teller, ikke tallet, tallet er kun begrensning paa foerste loekke
				divisor = divisor + 1;
			}

			if (divisor == teller) { // hvis divisor kom til teller, da er det et primtall (ingen av tallene under var faktor i tallet)
				System.out.print(teller + ", ");
			}
			teller = teller + 1; // oppdater teller
			divisor = 2; // reset av divisor for neste runde
		}
		System.out.println(); // nylinje
	}
	
}

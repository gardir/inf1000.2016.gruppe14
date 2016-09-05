import java.util.Scanner;

public class EvigLokke {

	public static void main(String[] args) {
		testOmAlder();
		metodenavn();
		metodenavn();
	}

	public static void metodenavn() {
		Scanner tastatur = new Scanner(System.in);
		System.out.println("Hvor har du vaert?");
		String destinasjon = tastatur.nextLine();
		metodenavn(); // Denne soerger for at metoden aldri slutter, det maa man unngaa!
		System.out.println("Kult at du har vaert i " + destinasjon);
	}

	public static void testOmAlder() {
		String tekstalder = "18";
		int alder = Integer.parseInt(tekstalder);
		System.out.println("Din alder er altsaa " + (alder + alder)); // ved aa bruke parentes oppnaar man addering av alder, uten blir de 'concatenated' => lagt etter hverandre
	}

	public static void vanskeligIf() {
		// Dette viste scope, String navn maa deklareres foer if kroellparentesene - ikke inni
		int alder = 18;
		String navn;
		if (alder == 18) {
			navn = "Gard";
		} else {
			navn = "UMYNDIG!!";
		}

		System.out.println(navn);
		
	}
	
}

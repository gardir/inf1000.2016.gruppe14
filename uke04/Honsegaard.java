import java.util.Scanner;

public class Honsegaard {

	public static void println(String utskrift) {
		System.out.println(utskrift);
	}

	public static void main(String[] args) {
		Scanner tastatur = new Scanner(System.in);

		println("Hvor mange hoenere er det?");
		int hoener = Integer.parseInt(tastatur.nextLine());

		// Versjonen ved at man henter foerste input _i_ while loekka
		String revenKom ="";

		// Hent input og sjekk at input er OK
		// Merk at det er litt motsatt, vi sjekker at de er false, for det tilsvarer at brukeren ikke tastet et av tilfellene vi vil ha.
		while (revenKom.equals("ja") == false && revenKom.equals("nei") == false) {
				println("Kommer reven?");
				revenKom = tastatur.nextLine();
		}

		// Versjonen ved at man henter foerste input _foer_ while loekka
		println("Sover bonden?");
		String bondenSover = tastatur.nextLine();

		// Sjekk at input er OK, hvis ikke hent ny til input er OK
		while (bondenSover.equals("ja") == false && bondenSover.equals("nei") == false) {
				println("Svar enten 'ja' eller 'nei'. Sover bonden?");
				bondenSover = tastatur.nextLine();
		}

		// Dersom reven kommer og bonden sover, blir én høne spist av reven.
		if ((revenKom.equals("ja") || revenKom.equals("Ja")) && bondenSover.equals("ja")) {
			hoener = hoener-1;
			println("Det bor naa " + hoener + " hoens i gaarden");
		}

		// Dersom reven kommer og bonden ikke sover, blir ingen høner spist, og bonden selger reveskinnet for 190 kr.
		else if (revenKom.equals("ja") && bondenSover.equals("nei")) {
			println("Reven ble flaadd for 190kr");
		}

		// Dersom reven ikke kommer, skjer ingenting.
		else { //(revenKom.equals("nei")){
			println("Kjedelig natt");
		}
	}
}

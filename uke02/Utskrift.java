import java.util.Scanner;

public class Utskrift {

	public static void main(String[] args) {
		
		//tekstTesten();
		tallTesten();
	}
	
	public static void tekstTesten() {
		Scanner tastatur = new Scanner(System.in);
		utskrift("Gi meg et navn");
		String navn = tastatur.nextLine();
		velkomst("Hei du", navn);
		int mittTall = 10;
		oekMedTi(mittTall);
		System.out.println(mittTall);
	}
	
	public static void tallTesten() {
		utskrift("Gi meg et tall");
		Scanner tastatur = new Scanner(System.in);
		String somTekst = tastatur.nextLine();
		int somTall = Integer.parseInt(somTekst);
		utskrift("Vil du gjoer 1, 2, eller 3");
		somTekst = tastatur.nextLine();
		if (somTekst.equals("1")) {
			oekMedFem(somTall);
		} else if (somTekst.equals("2")) {
			oekMedTi(somTall);
		} else {
			trekkFraTi(somTall);
		}
	}
	
	public static void utskrift(String alpha) {
		System.out.println(alpha);
	}
	
	public static void velkomst(String velkomstSetning, String navn) {
		System.out.println( velkomstSetning + " " + navn);
	}
	
	public static void oekMedTi(int somTall) {
		System.out.println(somTall+10);
	}
	
	public static void oekMedFem(int somTall) {
		System.out.println(somTall+5);
	}
	
	public static void trekkFraTi(int somTall) {
		System.out.println(somTall-10);
	}

}
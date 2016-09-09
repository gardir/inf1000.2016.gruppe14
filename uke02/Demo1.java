import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args){
		Scanner tastatur = new Scanner(System.in);
		hentNavn(tastatur);
		hentBosted(tastatur);
	}
	
	public static void hentFraBruker() {
		Scanner tastatur = new Scanner(System.in);
		
		println("Skriv inn et tall");
		String fraBruker = tastatur.nextLine();
		
		// Under her er oppgava a)
		//System.out.println("Tallet ditt var" + fraBruker);
		
		// Gjoer om strengen til et heltall
		int somTall = Integer.parseInt(fraBruker);
		println("Tallet ditt pluss 10 er" + (somTall + 10));
	}

	public static void println(String tekst) {
		System.out.println(tekst);
	}

	public static void hentNavn(Scanner tastatur) {
		println("Hva heter du?");
		String navn = tastatur.nextLine();
		skrivUtNavn(navn);
		skrivUtNavn(navn);
	}

	public static void skrivUtNavn(String navn) {
		println("Hei " + navn);
		navn = "IKKE DET SAMME";
	}

	public static void hentBosted(Scanner tastatur) {
		println("Hvor bor du?");
		String bosted = tastatur.nextLine();
		println("Jassa, du bor paa " + bosted);
	}

}

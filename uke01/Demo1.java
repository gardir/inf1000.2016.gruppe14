import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args){
		
		hentFraBruker();
		hentFraBruker();
		hentFraBruker();
		
	}
	
	public static void hentFraBruker() {
		Scanner tastatur = new Scanner(System.in);
		
		System.out.println("Skriv inn et tall");
		String fraBruker = tastatur.nextLine();
		
		// Under her er oppgava a)
		//System.out.println("Tallet ditt var" + fraBruker);
		
		// Gjoer om strengen til et heltall
		int somTall = Integer.parseInt(fraBruker);
		System.out.println("Tallet ditt pluss 10 er" + (somTall + 10));
	}

}
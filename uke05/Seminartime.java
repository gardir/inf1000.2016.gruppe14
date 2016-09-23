import java.util.Scanner;
import java.io.*;

public class Seminartime {

	public static void main(String[] args) throws Exception {
		lesFil();
		String utskrift = metodeMedReturverdi();
		int a = 5;
		int b = 15;
		int c = summer(a, b);
	}

	public static int summer(int tall1, int tall2) {
		int summen = tall1 + tall2;
		return summen;
	}

	public static String metodeMedReturverdi(){
		String utskriften = "Si hallo program";
		return utskriften;
	}

	public static void lesFil() throws Exception {
		Scanner tastatur = new Scanner(System.in);
//		String fraBruker = tastatur.nextLine();

		File selveFila = new File("manuelt.txt");
		Scanner fila = new Scanner(selveFila);

		while (fila.hasNextLine()) {
			String linjeFraFil = fila.nextLine();
			System.out.println(linjeFraFil);
		}

		for(int maanedIndex = 0; maanedIndex<12; maanedIndex++) {
			String linjeFraFil = fila.nextLine();
			System.out.println(linjeFraFil);
		}
		
	}
	
	public static void forEkvivalens() {
		int teller = 0;
		while( teller < 10) {
			System.out.println(teller);
			teller++;
		}

		for (int i=0; i < 10; i++) {
			System.out.println(i);
		}		
	}

	
	
}

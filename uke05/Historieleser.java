import java.util.Scanner;
import java.io.*;

public class Historieleser {

	public static void main(String[] args) throws Exception {
		lesFraFil();
	}

	public static void lesFraFil() throws Exception {
		String filnavn = "historie.txt";
		File selveFila = new File(filnavn);
		Scanner fila = new Scanner(selveFila);

		String[] historie1 = new String[21];
		String[] historie2 = new String[21];

		int historieteller1 = 0;
		int historieteller2 = 0;
		int teller = 0;
		
		while(fila.hasNextLine()){
			String linje = fila.nextLine();
			if (teller%2 == 0) {
				historie1[historieteller1] = linje;
				historieteller1++;
			} else {
				historie2[historieteller2] = linje;
				historieteller2++;
			}
			teller++;
		}

		skrivUtHistorie(historie1);
		skrivUtHistorie(historie2);
	}

	public static void skrivUtHistorie(String[] historien) {
		for (int i=0; i<historien.length; i++) {
			System.out.println(historien[i]);
		}
	}
	
}

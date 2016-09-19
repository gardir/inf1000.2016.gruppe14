import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class LesFraFil {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner innfil = new Scanner(new File("filnavn"));
		int antallJa = 0;
		while (innfil.hasNextLine()) {
//			System.out.println(innfil.nextLine());
			String linje = innfil.nextLine();
			if (linje.equals("ja")) {
				//System.out.println(linje);
				antallJa++;
			}
//			System.out.println("Har naa " + antallJa + " ja");
		}

		System.out.println("Det var " + antallJa + " i fila");
		
	}

	
}

import java.util.Scanner;

public class ArrayDemo {


	public static void main(String[] args) {
		Scanner tastatur = new Scanner(System.in);
		arrayMaaten(tastatur);
	}

	public static void tungvinnMaate(Scanner tastatur) {
		int sporsmaal1poeng = 0;
		int sporsmaal2poeng = 0;
		int sporsmaal3poeng = 0;
		String sporsmaal1 = "spm1";
		String sporsmaal2 = "spm2";
		String sporsmaal3 = "spm3";
		String svar;

		
		println(sporsmaal1);
		svar = tastatur.nextLine();
		if (svar.equals("ja")) {
			sporsmaal1poeng = 1;
		}
		
		println(sporsmaal2);
		svar = tastatur.nextLine();
		if (svar.equals("ja")) {
			sporsmaal2poeng = 1;
		}

		
		println(sporsmaal3);
		svar = tastatur.nextLine();
		if (svar.equals("ja")) {
			sporsmaal3poeng = 1;
		}

		int totalpoengsum = sporsmaal1poeng + sporsmaal2poeng + sporsmaal3poeng;
		println("Du fikk totalt " + totalpoengsum);
		
	}

	public static void arrayMaaten(Scanner tastatur) {
		int[] sporsmaalpoeng = new int[3];
		String[] sporsmaal = {"spm1", "spm2", "spm3"};
		String svar;

		
		println(sporsmaal[0]);
		svar = tastatur.nextLine();
		if (svar.equals("ja")) {
			sporsmaalpoeng[0] = 1;
		}
		
		println(sporsmaal[1]);
		svar = tastatur.nextLine();
		if (svar.equals("ja")) {
			sporsmaalpoeng[1] = 1;
		}

		
		println(sporsmaal[2]);
		svar = tastatur.nextLine();
		if (svar.equals("ja")) {
			sporsmaalpoeng[2] = 1;
		}

		int totalpoengsum = 0;
		int teller = 0;
		int lengde = sporsmaalpoeng.length;
		while(teller<lengde) {
			totalpoengsum = totalpoengsum + sporsmaalpoeng[teller];
			teller = teller + 1;
		}
		println("Du fikk totalt " + totalpoengsum);
		println("DEBUG:");
		printArray(sporsmaal);
	}

	public static void printArray(String[] arrayet) {
		int teller = 0;
		while(teller<arrayet.length) {
			println("["+teller+"]="+arrayet[teller]);
			teller++;
		}
	}
	
	public static void println(String tekst) {
		System.out.println(tekst);
	}
	
}

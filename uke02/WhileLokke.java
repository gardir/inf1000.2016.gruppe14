import java.util.Scanner;

public class WhileLokke {


	public static void main(String[] args) {
		Scanner tastatur = new Scanner(System.in);
		vilFortsette();
		String fortsette = tastatur.nextLine();
		while (!fortsette.equals("n")) {
			if (fortsette.equals("si hei")) {
				println("hei!");
			}
			vilFortsette();
			fortsette = tastatur.nextLine();
		}
	}

	public static void println(String tekst) {
		System.out.println(tekst);
	}

	public static void vilFortsette() {
		println("Vil du fortsette? (n for nei)");
	}
	
}

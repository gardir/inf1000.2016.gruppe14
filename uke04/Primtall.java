import java.util.Scanner;

public class Primtall {

	public static void main(String[] args) {
		Scanner tastatur = new Scanner(System.in);

		System.out.println("Tast et tall");
		int tallet = Integer.parseInt(tastatur.nextLine());

		int divisor = 2;
//		System.out.print(tallet + ": ");
		while(tallet%divisor != 0 && divisor < tallet) {
//			System.out.print(divisor + ", ");
			divisor = divisor + 1;
		}
//		System.out.println();
			
		if (tallet==divisor) {
			System.out.println(tallet + " er et primtall");
		} else {
			System.out.println(tallet + " er ikke et primtall");
		}
		
	}
	
}

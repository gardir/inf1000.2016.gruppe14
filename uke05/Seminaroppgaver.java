public class Seminaroppgaver {

	public static void skrivSkille() {
		System.out.println(" - - - - - == - - - - - -");
	}
	
	public static void main(String[] args) {
		oppgave1a();
		skrivSkille();
		
		oppgave1b();
		skrivSkille();
		
		oppgave1c();
		skrivSkille();
		
		finnPartall(10);
		skrivSkille();
		
		int summen = finnPartallsum(10);
		System.out.println(summen);
		skrivSkille();
		
		summen = finnOddetallsum(10);
		System.out.println(summen);
	}

	public static void oppgave1a() {
		/*
		  1
		  2
		  3
		  4
		  5
		 */
		int i;
		for (i=1; i<=5; i++) {

			System.out.println(i);
		}
	}

	public static void oppgave1b() {
		/*
		  0
		  2
		  4
		  6
		  8
		 */
		int j = 0;
		while(j<10) {
			System.out.println(j);
			j = j+2;
		}
	}

	public static void oppgave1c() {
		/*
		  10
		  7
		  4
		  1
		 */
		for (int i=10; i>0; i-- ) {
			if (i%3 == 1) {
				System.out.println(i);
			}
		}
	}

	public static void finnPartall(int inntil) {
		for(int i=0; i<inntil; i+=2) {
			System.out.println(i);
		}
	}

	public static int finnPartallsum(int inntil) {
		int sum = 0;
		for (int i=0; i<inntil; i+=2) {
			sum += i; // sum = sum + i;
		}
		return sum;
	}

	public static int finnOddetallsum(int inntil) {
		int sum = 0;
		for (int i=1; i<inntil; i+=2) {
			sum += i;
		}
		return sum;
	}

	
}

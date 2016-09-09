public class Myndighet {

	public static void main(String[] args) {
		int myndighetsAlder = 18;
		int umyndigAlder = 10;
		int myndigAlder = 27;
		int grenseAlder = 18;
		
		testMyndig(myndighetsAlder, umyndigAlder);
		testMyndig(myndighetsAlder, myndigAlder);
		testMyndig(myndighetsAlder, grenseAlder);
	}

	public static void testMyndig(int myndighet, int alder) {
		if (alder<myndighet) {
			System.out.println("Du er umyndig med alder " + alder);
		}
		else {
			System.out.println("Du er myndig med alder " + alder);
		}
	}
	   
	
}

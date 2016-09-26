public class MainBord {

	public static void main(String[] args) {

		Bord mittBord = new Bord("Gul");
		String fargenFraMittBord = mittBord.hentFarge();
		
		Bord andresBord = new Bord("Blaa");
		String fargenFraAndresBord = andresBord.hentFarge();

		System.out.println("Mitt bord har fargen " + fargenFraMittBord);
		System.out.println("Andre sitt bord har fargen " + fargenFraAndresBord);
		
	}
	
}

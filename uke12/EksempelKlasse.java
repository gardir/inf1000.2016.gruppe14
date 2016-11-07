public class EksempelKlasse {

	public static void main(String[] args) {
		String enTekst = "Vi har\nen linje for alt";

		System.out.println( enTekst );

		System.out.println("Vi har");
		System.out.println("en linje for alt");

		InstansKlasse ik = new InstansKlasse();
		EksempelKlasse ek = new EksempelKlasse();

		EksempelKlasse.publicStatic();
		EksempelKlasse.privatStatic();
		InstansKlasse.instansStaticPublic();
		ik.instansPublic();
	}

	private static void privatStatic() {
		System.out.println("privatStatic()");
	}

	private void privat() {
		System.out.println("privat()");
	}

	public static void publicStatic() {
		System.out.println("publicStatic()");
	}

	public void offentlig() {
		System.out.println("offentlig()");
	}
	
}

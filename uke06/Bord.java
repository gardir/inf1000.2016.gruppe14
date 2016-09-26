public class Bord {

	// instansvariabelen til bord
	private String farge;

	// Konstruktoeren som gir med fargen bordet skal ha
	public Bord(String fargen) {
		farge = fargen;
	}

	// metode som henter fargen, merk _IKKE_ static
	public String hentFarge() {
		return farge;
	}
	
}

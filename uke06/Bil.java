/*
Skriv en klasse Bil. En bil har følgende egenskaper:
• String farge
• String modell
• double utslipp
• int vekt

Lag en konstruktør, samt metoder for å hente ut data fra hver variabel.

Lag en klasse TestBil med en main-metode. Opprett
*/

public class Bil {

	private String farge;
	private String modell;
	private double utslipp;
	private int vekt;

	public Bil(String fargen,
	           String modellen,
	           double utslippet,
	           int vekten) {
		farge = fargen;
		modell = modellen;
		utslipp = utslippet;
		vekt = vekten;
	}

	public String hentFarge() {
		return farge;
	}

	public String hentModell() {
		return modell;
	}

	public double hentUtslipp() {
		return utslipp;
	}

	public int hentVekt() {
		return vekt;
	}
	
}

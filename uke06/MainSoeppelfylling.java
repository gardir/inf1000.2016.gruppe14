public class MainSoeppelfylling {

	public static void main(String[] args) {
		// Lager en ny dynge med plass til 40km^2 soeppel
		Soeppelfylling fyllinga = new Soeppelfylling(40);

		// Sender mange lastebiler med soeppel til dynga
		fyllinga.fyllPaaSoeppel(25);

		// Sender flere lastebiler med soeppel til dynga,
		// skal gi feilmelding og gi tilbake false, testen skal _ikke_ slaa til
		if (fyllinga.fyllPaaSoeppel(25)) {
			System.out.println("Det er noe feil med dynga, klarte aa fylle paa for mye soeppel");
			System.out.println("25+25 > 40 som er grensa");
		} else {
			System.out.println("Dynga hadde ikke plass til mer, sjekk utskriften fra dynga selv.");
		}

		// proever aa brenne 1, sjekker at svaret _ikke_ ble negativ
		if (fyllinga.brennSoeppel()) {
			System.out.println("Dynga brant soeppel som den skulle.");
		} else {
			System.out.println("Dynga skulle kunne benne soeppel men gjorde det ikke");
		}

		// Spoer hvor mye som kan brennes, for aa vaere pyroman og brenne alt...
		int antall = fyllinga.hentMaksBrenneAntall();
		for(int i=0; i<antall; i++) {
			if (!fyllinga.brennSoeppel()) {
				System.out.println("Antall brenninger stemte ikke, fikk ikke brent #" + (i+1));
			}
		}

		// Sjekker at det ikke er mulig aa brenne mer soeppel
		if (fyllinga.brennSoeppel()) {
			System.out.println("Klarte aa brenne etter at alt skal vaere brent, noe er galt");
		} else {
			System.out.println("Fikk brent alt, haha!");
		}
		
	}
	
}

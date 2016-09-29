/*
 * Simulering av en soeppeldynge.
 * Soeppeldyngen har en hvis stoerrelse som blir satt naar soeppeldynga blir laga.
 * Den har mulighet til aa brenne 5 enheter soeppel ved et kall paa brennSoeppel(), hvis det ikke er nok enheter skal det komme feilmelding.
 */
public class Soeppelfylling {

	private int storrelse; // hvor mye soeppel det er plass til
	private int soeppel = 0; // hvor mye soeppel det er akkurat naa, starter paa 0
	
	public Soeppelfylling(int storrelsen) {
		storrelse = storrelsen;
	}

	public boolean fyllPaaSoeppel(int merSoeppel) {
		// antar det aldri kommer negativ verdi i merSoeppel
		if ( (merSoeppel + soeppel) > storrelse ) { // bruker parentes for sikkerhets skyld
			// kan ikke overfylle
			System.out.println("Det var ikke plass til " + merSoeppel + " soeppel siden det allerede er " + soeppel + " paa dynga og det er bare plass til " + storrelse);
			return false;
		} else {
			// det var plass
			soeppel = soeppel + merSoeppel;
			return true;
		}
	}

	public boolean brennSoeppel() {
		if (soeppel > 5) {
			soeppel = soeppel - 5;
			return true;
		} else {
			System.out.println(soeppel + " er ikke nok for aa brenne, trenger 5 enheter");
			return false;
		}
	}

	public int hentSoeppelmengde() {
		return soeppel;
	}

	public int hentMaksBrenneAntall() {
		/*
		 * denne skal gi tilbake hvor mange ganger man kunne kalt paa 'brennSoeppel()'
		 * det er _mange_ maater aa gjoer dette paa, typisk modulo,
		 * men proever meg paa teller
		 */
		int brenneAntall = 0;
		// vil oeke teller _hvis_ det er nok soeppel etter oekning, sjekker derfor
		// teller + 1
		while( (brenneAntall + 1) * 5 < soeppel ) {
			// det var mulig aa oeke teller med 1, ettersom
			// det er fortsatt mindre enn soeppel
			brenneAntall++; 
		}
		return brenneAntall;
	}
	
}

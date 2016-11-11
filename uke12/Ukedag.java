class Ukedag {

	private Aktivitet[] aktiviteter = new Aktivitet[24];

	Ukedag(String dag) {}
	// Konstruktør
	
/* Oppretter og setter inn ny
   aktivitet på angitt
   klokkeslett, og gir feilmelding på
   terminal om tidspunktet er opptatt*/
	void settInn(String hva, int kl) {
		if ( aktiviteter[kl] == null ) {
			aktiviteter[kl] = new Aktivitet(hva, kl);
		} else {
			System.out.println("Det er allerede aktivitet kl. " + kl);
		}
	}

	/* Returnerer når på dagen den første
	   aktiviteten starter (-1 hvis det
	   ikke finnes noen aktivitet denne
	   dagen)*/
	int tidligste() {
		int tidligsteStart = -1;
		for ( int i=0; i<aktiviteter.length; i++ ) {
			if ( aktiviteter[i] != null ) {
				tidligsteStart = i;
				i = aktiviteter.length;
			}
		}
		return tidligsteStart;
	}
	
// Returnerer når seneste aktivitet
// den dagen starter (-1 hvis ingen
// aktiviteter)
	int seneste() {
		int sisteStart = -1;
		for ( int i=0; i<aktiviteter.length; i++ ) {
			if ( aktiviteter[i] != null ) {
				sisteStart = i;
			}
		}
		return sisteStart;
	}
	
		// Beregner og returnerer antall
// aktiviteter den dagen
	int antall() {
		int antallAktiviteter = 0;
		for ( int i=0; i<aktiviteter.length; i++ ) {
			if ( aktiviteter[i] != null ) {
				antallAktiviteter++;
			}
		}
		return antallAktiviteter;		
	}

		/*Hvis kalenderen er full, skal metoden skrive ut
		  en feilmelding.*/

/*Hvis det ikke er noen aktiviteter fra før den dagen, skal aktiviteten starte kl 12.00.*/
		
		/*Ellers skal metoden helst sette inn den nye aktiviteten i en ledig time mellom tidligste og seneste aktivitet;*/
		
		/*hvis det ikke er mulig, skal den settes rett etter den hittil seneste aktiviteten;*/
		
/*om heller ikke det er
  mulig, settes aktiviteten inn rett før den hittil tidligste.*/
	void settInnLedig(String hva) {
		if ( erFull() ) {
			System.out.println("Ukedagen er full");
		} else if ( erTom() ) {
			settInn( hva, 12 );
		} else {
			int tidligste = finnTidligste();
			int seneste = finnSeneste();
			if ( tidligste == seneste ) {
				settInn(hva, tidligste+1);
			} else if ( seneste - tidligste > 1) {
				boolean sattInn = settInnMellom(tidligste, seneste);//
				if ( !sattInn) {
					if ( seneste != 23 ) {
						settInn(hva, seneste+1);
					} else {
						settInn(hva, tidligste+1);
					}
				}
			}
		}
	}

	boolean erFull() {
		boolean full = true;
		for (int i=0; i<aktiviteter.length; i++) {
			if ( aktiviteter[i] == null ) {
				full = false;
				i = aktiviteter.length;
			}
		}
		return full;
	}

	boolean erTom() {
		boolean tom = true;
		for (int i=0; i<aktiviteter.length; i++) {
			if ( aktiviteter[i] != null ) {
				full = false;
				i = aktiviteter.length;
			}
		}
		return tom;
	}

}

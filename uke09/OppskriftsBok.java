import java.util.Scanner;
import java.util.HashMap;
import java.io.File;

public class OppskriftsBok {

	private HashMap<String, Oppskrift> oppskrifter = new HashMap<String, Oppskrift>();



	public boolean finnesOppskrift(String oppskriftstittel) {
		return oppskrifter.containsKey(oppskriftstittel);
	}
	
	public void lesFraFil(String filnavn) throws Exception {
		/**
		   Tittel:
		   <Tittel-til-oppskrift-1>
		   <Ingrediens-1>
		   ...
		   Oppskrift:
		   <linje-1>
		   ...
		   <mellomrom>
		 */

		Scanner innfil = new Scanner(new File(filnavn));
		while (innfil.hasNextLine()) {
			String linje = innfil.nextLine();
			String tittel = innfil.nextLine();
			Oppskrift oppskriften = new Oppskrift(tittel);
			linje = innfil.nextLine();
			while ( !linje.equals("Oppskrift:") ) {
				linje = innfil.nextLine();
				oppskriften.leggTilIngrediens(linje);
			}
			linje = innfil.nextLine();
			while ( !linje.equals("") ) {
				linje = innfil.nextLine();
				oppskriften.leggTilOppskriftslinje(linje);
			}
			oppskrifter.put(tittel, oppskriften);
		}
	}
	
	public void skrivUtAlleOppskrifter() {
		for ( Oppskrift o : oppskrifter.values() ) {
			o.skrivUtOppskrift();
		}
	}

	public void skrivUtOppskrift(String oppskriftstittel) {
		if ( finnesOppskrift(oppskriftstittel) ) {
			Oppskrift oppskriften = oppskrifter.get(oppskriftstittel);
			oppskriften.skrivUtOppskrift();
		} else {
			System.out.println(oppskriftstittel + " finnes ikke");
		}
	}
	
}

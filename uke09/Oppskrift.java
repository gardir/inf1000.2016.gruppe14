import java.util.HashMap;
import java.util.ArrayList;

public class Oppskrift {

	/**
	 * Innser i ettertid at HashMap<String, String> er tullete - ettersom
	 * at har man String'en som man skal hente, saa er det ingen vits i aa
	 * ha en hashmap aa hente stringen fra!
	 * Dere vil senere laere "bedre" implementasjoner for saa her tullete loesninger,
	 * men for naa bruk ArrayList<String> slik jeg har endret koden til.
	 * Takk til studentene som spurte!
	 */
//	private HashMap<String, String> ingredienser = new HashMap<String, String>();
	private ArrayList<String> ingredienser = new ArrayList<String>();
	private ArrayList<String> oppskriftstekst = new ArrayList<String>();
	private String tittel;

	public Oppskrift(String tittelen) {
		tittel = tittelen;
	}

	public void skrivUtOppskrift() {
		System.out.println(tittel);
		skrivUtAlleIngredienser();
		for(String linje : oppskriftstekst) {
			System.out.println(linje);
		}
	}

	public void leggTilIngrediens(String ingrediens) {
//		ingredienser.put(ingrediens, ingrediens);
		ingredienser.add(ingrediens);
	}

	public void leggTilOppskriftslinje(String linje) {
		oppskriftstekst.add(linje);
	}

	public void skrivUtAlleIngredienser() {
		/*
		for (String ingrediens : ingredienser.values()) {
			System.out.println(ingrediens);
		}
		*/
		for (String ingrediens : ingredienser) {
			System.out.println(ingrediens);
		}
	}

	public String toString() {
		return tittel;
	}
	
	
}

import java.util.HashMap;
import java.util.ArrayList;

public class Oppskrift {

	private HashMap<String, String> ingredienser = new HashMap<String, String>();
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
		ingredienser.put(ingrediens, ingrediens);
	}

	public void leggTilOppskriftslinje(String linje) {
		oppskriftstekst.add(linje);
	}

	public void skrivUtAlleIngredienser() {
		for (String ingrediens : ingredienser.values()) {
			System.out.println(ingrediens);
		}
	}

	public String toString() {
		return tittel;
	}
	
	
}

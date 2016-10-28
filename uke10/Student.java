import java.util.Map;
import java.util.HashMap;
public class Student {

	private Map<String, Fag> fagene = new HashMap<String, Fag>();
	private String navn;

	public Student( String navnet ) {
		navn = navnet;
	}

	public String hentNavn() {
		return navn;
	}

	public int hentAntallFag() {
		return fagene.size();
	}

	public void skrivUtAlleFag() {
		System.out.println("Fagene " + navn + " tar:");
		// for hver variabel String med navn faget får sin verdi fra fagene.keySet
		for ( String faget: fagene.keySet() ) {
			System.out.println(faget);
		}
	}

	public void leggTilFag(Fag faget) {
		fagene.put(faget.hentNavn(), faget);
//		faget.leggTilStudent(this); // FY FY
	}

	public void fjernFag(Fag faget) {
		fagene.remove(faget.hentNavn());
	}
	
}

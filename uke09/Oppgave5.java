public class Oppgave5 {

	public static void main(String[] args) throws Exception {
/*
		Oppskrift oppskrift = new Oppskrift("Eplekake");
		oppskrift.leggTilIngrediens("200 epler");
		oppskrift.leggTilIngrediens("1 ts smoer");
		oppskrift.leggTilOppskriftslinje("Kok opp vann");
		oppskrift.leggTilOppskriftslinje("Putt i epler");
		oppskrift.leggTilOppskriftslinje("Putt i smoer");
		oppskrift.skrivUtOppskrift();
*/

		OppskriftsBok oppskrifter = new OppskriftsBok();
		oppskrifter.lesFraFil("oppskrifter.txt");
		oppskrifter.skrivUtOppskrift("Grillet paprikasalat");
	}
	
}

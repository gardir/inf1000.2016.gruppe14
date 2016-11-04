import java.util.ArrayList;
import java.util.HashMap;

public class SemOppgave {

	public static void main(String[] args) {
		int[] tallrekken = {1,4,6,2,4,65,87,2,23};
		ArrayList<Person> personliste = new ArrayList<Person>();
		HashMap<Integer, Person> personmap = new HashMap<Integer, Person>();
		for ( int tall : tallrekken ) {
			Person personen = new Person( tall );
			personliste.add( personen );
			personmap.put(tall, personen );
			// Ble brukt til debugging
			//System.out.format( "%.2f (%d)\n", finnGjennomsnittligHoyde( personmap ), personmap.size() );
		}
		// array []
		System.out.format("%.2f (%d)\n", finnGjennomsnitt( tallrekken ), tallrekken.length ); // 21.56 (9)
		System.out.println( finnGjennomsnitt( tallrekken ) + "(" + tallrekken.length + ")" ); // 21.555555555555557(9)

		// ArrayList - AL
		System.out.format( "%.2f (%d)\n", finnGjennomsnittligHoyde( personliste ), personliste.size() ); // 21.56 (9)
		System.out.println( finnGjennomsnittligHoyde( personliste ) + "(" + personliste.size() + ")" ); // 21.555555555555557(9)

		// HashMap - HM
		System.out.format( "%.2f (%d)\n", finnGjennomsnittligHoyde( personmap ), personmap.size() ); // 26.86 (7)
		System.out.println( finnGjennomsnittligHoyde( personmap ) + "(" + personmap.size() + ")" ); // 26.857142857142858(7)

		/*
		 * Skriver ut referansene til personene, for aa vise tilfeldig rekkefoelge i HM vs. AL
		 */
		/*
		for ( Person p : personliste ) {
			System.out.println(p);
		}
		for ( Person p : personmap.values() ) {
			System.out.println(p);
		}
		*/
		
	}

	public static double finnGjennomsnittligHoyde( HashMap<Integer, Person> personliste ) {
		double sum = 0;

		for ( Person p : personliste.values() ) {
			sum += p.hentHoyde();
		}

		return sum/personliste.size();
	}

	public static double finnGjennomsnittligHoyde( ArrayList<Person> personliste ) {
		double sum = 0;

		for ( int i=0; i<personliste.size(); i++ ) {
			Person p = personliste.get( i );
			sum += p.hentHoyde();
		}

		return sum/personliste.size();
	}

	public static double finnGjennomsnitt( int[] tallrekke ) {

		double sum = 0;

		for ( int i=0; i<tallrekke.length; i++ ) {
			sum += tallrekke[i];
		}

		/*
		  for ( int tall : tallrekke ) {
		      sum += tall;
		  }
		 */

		return sum/tallrekke.length;
		
	}
	
	
}

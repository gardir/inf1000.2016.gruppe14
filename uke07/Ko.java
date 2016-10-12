import java.util.ArrayList;

public class Ko {

	private static ArrayList<Person> ko = new ArrayList<Person>();

	public static void main(String[] args) {
//		ko = new ArrayList<Person>();
		
		seminarGjgangKoen();
		System.out.println(); // newline
		seminarOppgKoen();
		
	}

	private static void seminarGjgangKoen() {
		/*
		 * Her legger vi folk til / fra koen for aa vise
		 * hvordan en arraylist endrer posisjon/index
		 * etterhvert som det blir lag til/fjernet
		 * elementer
		 */
		Person p1 = new Person("Mathias");
		Person p2 = new Person("Ida");
		Person p3 = new Person("Nicolai");

		System.out.println("Legger til " + p1);
		ko.add(p1);
		skrivUtKoAntall(ko);
		System.out.println("Legger til " + p2);
		ko.add(p2);
		System.out.println("Legger til " + p3);
		ko.add(p3);
		skrivUtKoAntall(ko);
		skrivUtKoForEach(ko);
		System.out.println(); // newline
		// remove fjerner _OG_ gir tilbake (return) det fjerna elementet
		System.out.println("Ekspederer " + ko.remove(0));
		skrivUtKoAntall(ko);
		skrivUtKoForEach(ko);

		fjernHeleKoen();		
	}

	private static void seminarOppgKoen() {
		/*
		 * Her har jeg proevd aa illustrere
		 * _hvordan_ indexof egentlig fungerer.
		 * Legg merke til at Person instanser
		 * _ikke_ vil finnes selv om de "ser"
		 * like ut, ettersom det er to forskjellige
		 * new-calls og dermed to forskjellige
		 * instanser
		 */
		Person p1 = new Person("Mathias");
		Person p2 = new Person("Mathias");
		
		ko.add(p1);
		System.out.println("Har p1 samme plass som p2? (-1 er nei): " + ko.indexOf(p2));

		/*
		 * Derimot er _String_ spesiell, selv om det er instans
		 * kan det av-og-til være at javac skjønner at det
		 * er samme String, men det er ikke garantert.
		 * Naar jeg kjoerte programmet her saa faar jeg '0'
		 */
		ArrayList<String> tekstKo = new ArrayList<String>();
		tekstKo.add("Test");
		System.out.println("Har 'Test' samme plass som 'Test'? (-1 er nei): " + tekstKo.indexOf("Test"));
	}
	
	private static void skrivUtKoAntall(ArrayList<Person> ko) {
		System.out.println("Koen bestaar naa av " + ko.size() + " person(er)");
	}


	private static void skrivUtKoForGammel(ArrayList<Person> ko) {
		for (int i=0; i<ko.size(); i++) {
			Person p = ko.get(i);
			System.out.println(p);
		}
	}
	
	private static void skrivUtKoForEach(ArrayList<Person> ko) {
		for ( Person p : ko ) {
			System.out.println(p);
		}
	}

	private static void fjernHeleKoen() {
		while( !ko.isEmpty() ) {
			Person p = ko.remove(0);
			System.out.println(p + " ble ekspedert vekk");
		}
	}
}

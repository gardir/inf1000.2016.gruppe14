import java.util.ArrayList;

public class Ko {

	private static ArrayList<Person> ko = new ArrayList<Person>();

	public static void main(String[] args) {
//		ko = new ArrayList<Person>();
		Person p1 = new Person("Mathias");
		Person p2 = new Person("Ida");
		Person p3 = new Person("Nicolai");

		ko.add(p1);
		skrivUtKoAntall(ko);
		ko.add(p2);
		ko.add(p3);
		skrivUtKoAntall(ko);
		skrivUtKoForEach(ko);
		System.out.println(); // newline
		ko.remove(0);
		skrivUtKoAntall(ko);
		skrivUtKoForEach(ko);

		fjernHeleKoen();
		
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

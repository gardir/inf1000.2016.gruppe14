import java.util.ArrayList;

public class Ko {

	private static ArrayList<Person> ko = new ArrayList<Person>();

	public static void main(String[] args) {
//		ko = new ArrayList<Person>();
		

//		seminarGjgangKoen();
		seminarOppgKoen();
		
	}

	private static void seminarGjgangKoen() {
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

	private static void seminarOppgKoen() {
		Person p1 = new Person("Mathias");
		Person p2 = new Person("Mathias");
		
		ko.add(p1);
		System.out.println(ko.indexOf(p2));
		
		ArrayList<String> tekstKo = new ArrayList<String>();
		tekstKo.add("Test");
		System.out.println(tekstKo.indexOf("Test"));
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

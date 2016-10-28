import java.util.List;
import java.util.ArrayList;
public class Fag {
	private String navn;
	private List<Student> studenter = new ArrayList<Student>();

	public Fag( String navn ) {
		this.navn = navn;
	}
	
	public String hentNavn() {
		return navn;
	}

	public int hentAntallStudenter() {
		return studenter.size();
	}

	public void skrivUtAlleStudenter() {
		System.out.println("Emnet " + navn + " har studentene:" );
		for ( Student studenten : studenter ) {
			System.out.println(studenten.hentNavn());
		}
	}

	public void leggTilStudent(Student student) {
		studenter.add(student);
	}

	public void fjernStudent(Student student) {
		studenter.remove(student);
	}

	
	public void fjernStudent(String navn) {
/**
	 * Dette gaar ikke bra!
	 */
		Student fjern = new Student(navn);
		studenter.remove(fjern);

		// Dette gaar ikke bra i runtime:
		/*
Exception in thread "main" java.util.ConcurrentModificationException
	at java.util.ArrayList$Itr.checkForComodification(ArrayList.java:901)
	at java.util.ArrayList$Itr.next(ArrayList.java:851)
	at Fag.fjernStudent(Fag.java:43)
	at StudentSystem.testFag(StudentSystem.java:27)
	at StudentSystem.main(StudentSystem.java:5)

		 */
		for( Student student : studenter) {
			if ( student.hentNavn().equals(navn)) {
				studenter.remove(student);
			}
		}
	}
	
}

import java.io.*;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class StudentSystem {

	private static Scanner tastatur = new Scanner(System.in);	
	private static Map<String, Fag> alleFag = new HashMap<String, Fag>();
	private static List<Student> alleStudenter = new ArrayList<Student>();

	public static void main(String[] args) throws Exception {
		// testStudent();
		// testFag();

		lesFraFil("emnestudenter.txt");
		skrivUtAlt();
		kommandoLoekke();
	}

	private static void skrivUsage() {
		System.out.println("== Kommando -- forklaring ==");
		System.out.println("1 -- Legge til student ny");
		System.out.println("2 -- Legge til nytt fag");
		System.out.println("3 -- Legge til et nytt fag til en student/legge til en ny student til et fag");
		System.out.println("4 -- Skrive ut alle fag en student tar");
		System.out.println("5 -- Skrive ut alle studenter som tar et fag");
		System.out.println("6 -- Fjerne en student fra et fag/fjerne et fag fra en student");
		System.out.println("7 -- Finne ut hvilken student som tar flest fag");
		System.out.println("8 -- Finne ut hvilket fag som blir tatt av flest studenter");
		System.out.println("9 -- Skriver ut all informasjon");
		System.out.println("h -- Skriver ut denne informasjonen");
		System.out.println("q -- Avslutt program");
	}

	private static void kommandoLoekke() {
		skrivUsage();
		System.out.println("Kommando: " );
		String kommando = tastatur.nextLine();
		while ( !kommando.equals("q") ) {
			if ( kommando.equals("1") || kommando.equals("ny student" ) ){
				lagNyStudent();
			} else if ( kommando.equals("2") || kommando.equals("nytt fag")) {
				lagNyttFag();
			} else if ( kommando.equals("3")) {
				giStudentTilFag();
			} else if ( kommando.equals("4")) {
				skrivUtStudent();
			} else if ( kommando.equals("5")) {
				skrivUtFag();
			} else if ( kommando.equals("6")) {
				fjernStudent();
			} else if ( kommando.equals("7")) {
				finnProduktivStudent();
			} else if ( kommando.equals("8")) {
				finnPopulaertFag();
			} else if ( kommando.equals("9")) {
				skrivUtAlt();
			} else if ( kommando.equals("h")) {
				skrivUsage();
			} else {
				System.out.println("Ugyldig kommando: " + kommando);
			}
			kommando = fraBruker("Kommando");
		}
	}

	private static String fraBruker(String forklaring) {
		System.out.println(forklaring + ": ");
		return tastatur.nextLine();
	}

	private static void lagNyStudent() {
		System.out.println("Ny studentnavn: ");
		String studentnavn = tastatur.nextLine();
		Student studenten = hentStudent( studentnavn );
		if ( studenten == null ) {
			alleStudenter.add( new Student(studentnavn) );
			System.out.println("Studenten '" + studentnavn + "' lagt til.");
		} else {
			System.out.println("Studenten '" + studentnavn + "' fins allerede.");
		}
	}

	private static void lagNyttFag() {
		String fagnavn = fraBruker("Nytt fagnavn");
		if ( alleFag.containsKey( fagnavn ) ) {
			System.out.println("Faget '" + fagnavn + "' fins allerede.");
		} else {
			alleFag.put( fagnavn, new Fag(fagnavn) );
			System.out.println("Faget '" + fagnavn + "' lagt til.");
		}
	}
	
	private static void giStudentTilFag() {
		skrivUtAlleStudenter();
		String studentnavn = fraBruker("navn");
		Student studenten = hentStudent(studentnavn);
		skrivUtAlleFag();
		String fagnavn = fraBruker("fag");
		Fag faget = alleFag.get(fagnavn);
		faget.leggTilStudent(studenten);
		studenten.leggTilFag(faget);
	}
	
	private static void skrivUtStudent() {
		String studentnavn = fraBruker("Studentens navn");
		Student studenten = hentStudent( studentnavn );
		if ( studenten != null ) {
			studenten.skrivUtAlleFag();
		} else {
			System.out.println("Var ingen student ved navn '" + studentnavn + "'");
		}
	}

	private static void skrivUtFag() {
		String fagnavn = fraBruker("Fagets navn");
		if ( alleFag.containsKey( fagnavn ) ) {
			alleFag.get( fagnavn ).skrivUtAlleStudenter();
			/*
			  Fag faget = alleFag.get( fagnavn );
			  faget.skrivUtAlleStudenter();
			 */
		} else {
			System.out.println("Ingen fag med navn '" + fagnavn + "'");
		}
	}
	
	private static void fjernStudent() {
		String studentnavn = fraBruker("Studenten som skal fjernes");
		Student studenten = hentStudent( studentnavn );
		if ( studenten != null ) {
			alleStudenter.remove( studenten );
			System.out.println("Studenten '" + studentnavn + "' er fjernet.");
		} else {
			System.out.println("Ingen studenter ved navn '" + studentnavn + "'");
		}
	}

	private static void fjernFag() {
		String fagnavn = fraBruker("Fagets som skal fjernes");
		Fag fag = alleFag.get(fagnavn);
		if ( alleFag.remove(fagnavn, fag)) {
			System.out.println("Faget ble fjernet");
		} else {
			System.out.println("Faget ble IKKE fjernet");
		}
	}
	
	private static void finnProduktivStudent() {
		Student studenten = null;
		int mestFag = 0;
		for ( Student student : alleStudenter) {
			if ( student.hentAntallFag() > mestFag ) {
				studenten = student;
				mestFag = student.hentAntallFag();
			}
		}
		System.out.println("Studenten " + studenten.hentNavn() + " hadde flest fag med " + mestFag + " fag");
	}

	private static void finnPopulaertFag() {
		Fag faget = null;
		int antallStudenter = 0;
		for ( Fag fag : alleFag.values() ) {
			if ( fag.hentAntallStudenter() > antallStudenter ) {
				faget = fag;
				antallStudenter = fag.hentAntallStudenter();
			}
		}
		System.out.println("Faget " + faget.hentNavn() + " hadde flest studenter med " + antallStudenter + " studenter");
	}
	
	private static Student hentStudent( String navn ) {
		Student studenten = null;
		for ( Student s : alleStudenter ) {
			if ( s.hentNavn().equals(navn)) {
				studenten = s;
			}
		}
		return studenten;
	}
	
	private static void skrivUtAlt() {
		for (Fag fag : alleFag.values()) {
			fag.skrivUtAlleStudenter();
		}
		for (Student student : alleStudenter) {
			student.skrivUtAlleFag();
		}
	}

	private static void skrivUtAlleFag() {
		System.out.print("Tilgjengelige fag: ");
		for ( String fag : alleFag.keySet() ) {
			System.out.print(fag + ", ");
		}
		System.out.println(); // newline
	}

	private static void skrivUtAlleStudenter() {
		System.out.print("Tilgjengelige studenter: ");
		for ( Student student : alleStudenter ) {
			System.out.print(student.hentNavn() + ", ");
		}
		System.out.println(); // newline
	}
	
	private static void lesFraFil( String filnavn ) throws Exception {
		/*
*MAT1001
Emilie
Jonathan
Henrik
Mari
Esben
Gard
Fritjof
*MAT1100
Mathias
Ole Petter
Elsie
Andreas
Martin
		 */
		Scanner innfil = new Scanner( new File( filnavn ) );
		
		String linje = innfil.nextLine();
		while ( innfil.hasNextLine() ) {
			String emnenavn = linje.substring(1);
//			System.out.println("Fag: " + emnenavn);
			Fag faget = new Fag(emnenavn);
			alleFag.put(emnenavn, faget); // legges inn i HM
			linje = innfil.nextLine();
//			System.out.println("Student: " + linje);
			lagNyStudentTilFag(linje, faget);
			while (innfil.hasNextLine() && linje.charAt(0) != '*') {
				linje = innfil.nextLine();
				if (linje.charAt(0) != '*') {
//					System.out.println("Student: " + linje);
					lagNyStudentTilFag(linje, faget);
				}
			}
		}
	}

	private static void lagNyStudentTilFag(String studentnavn, Fag faget) {		
		Student student = new Student(studentnavn);
		alleStudenter.add(student);
		faget.leggTilStudent(student);
		student.leggTilFag(faget);
	}

	private static void testFag() {
		Fag fag = new Fag("INF1000");
		Student student = new Student("Ivar");
		if ( 0 == fag.hentAntallStudenter() ) {
			System.out.println("Riktig antall studenter");
		} else {
			System.out.println("FEIL I ANTALL STUDENTER");
		}

		fag.leggTilStudent(student);

		if ( 1 != fag.hentAntallStudenter() ) {
			System.out.println("FEIL I ANTALL STUDENTER");
		}

		fag.skrivUtAlleStudenter();

		fag.fjernStudent(student.hentNavn());

		if ( 0 != fag.hentAntallStudenter() ) {
			System.out.println("FEIL I ANTALL STUDENTER");
		}		
	}

	private static void testStudent() {
		Student student = new Student("Ivar");
		System.out.println("0 == " + student.hentAntallFag() );

		Fag faget = new Fag("INF1000");
		student.leggTilFag(faget);

		System.out.println("1 == " + student.hentAntallFag() );

		student.skrivUtAlleFag();

		student.fjernFag(faget);

		System.out.println("0 == " + student.hentAntallFag() );

	}
}

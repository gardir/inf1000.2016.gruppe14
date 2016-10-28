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
		System.out.println("Kommando -- forklaring");
		System.out.println("ny student -- lager ny student");
		System.out.println("nytt fag -- lager nytt fag");
		System.out.println("4 -- gir student til fag");
	}

	private static void kommandoLoekke() {
		skrivUsage();
		System.out.println("Kommando: " );
		String kommando = tastatur.nextLine();
		while ( !kommando.equals("q") ) {
			if ( kommando.equals("ny student" ) ){
				System.out.println("Navn: ");
				String studentnavn = tastatur.nextLine();
				System.out.println("student: " + studentnavn);
			} else if ( kommando.equals("nytt fag")) {
				String fagnavn = fraBruker("Fagnavn");
				System.out.println("fag: " + fagnavn);
			} else if ( kommando.equals("4")) {
				giStudentTilFag();
			} else if ( kommando.equals("h")) {
				skrivUsage();
			} else if ( kommando.equals("5")) {
				skrivUtAlt();
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

	private static void giStudentTilFag() {
//		skrivUtAlleStudenter();
		String studentnavn = fraBruker("navn");
		Student studenten = hentStudent(studentnavn);
//		skrivUtAlleFag();
		String fagnavn = fraBruker("fag");
		Fag faget = alleFag.get(fagnavn);
		faget.leggTilStudent(studenten);
		studenten.leggTilFag(faget);
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

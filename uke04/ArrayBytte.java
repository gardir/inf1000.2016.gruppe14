public class ArrayBytte {

	public static void main(String[] args) {
		// a)
		int[] heltallsArray1 = {1,2,3};
		int[] heltallsArray2 = {13, -15, 5};

		//finnMinsteVerdi(heltallsArray1);
		//finnMinsteVerdi(heltallsArray2);
		//finnStorsteVerdi(heltallsArray2);
		byttMinsteOgStorste(heltallsArray2);
		
	}

	public static void finnMinsteVerdi(int[] array) {
		int teller = 0;
		int lengde = array.length;
		int minsteVerdi = array[0];
		while(teller<lengde) {
			//System.out.println(array[teller]);
			if (array[teller] < minsteVerdi) {
				minsteVerdi = array[teller];
			}
			teller++; // teller = teller + 1;
		}
		System.out.println("minsteverdi er: " + minsteVerdi);
	}

	public static void finnStorsteVerdi(int[] array) {
		int teller = 0;
		int lengde = array.length;
		int storsteVerdi = array[0];
		while(teller<lengde) {
			//System.out.println(array[teller]);
			if (array[teller] > storsteVerdi) {
				storsteVerdi = array[teller];
			}
			teller++; // teller = teller + 1;
		}
		System.out.println("minsteverdi er: " + storsteVerdi);
	}

	public static void byttMinsteOgStorste(int[] array) {
		skrivUtArray(array);

        // Felles variable
		int teller = 0;
		int lengde = array.length;
		
		int storsteVerdi = array[0];
		int storsteVerdiIndex = 0;
		while(teller<lengde) {
			//System.out.println(array[teller]);
			if (array[teller] > storsteVerdi) {
				storsteVerdi = array[teller];
				storsteVerdiIndex = teller;
			}
			teller++; // teller = teller + 1;
		}

		// minsteverdi
		teller = 0;
		int minsteVerdi = array[0];
		int minsteVerdiIndex = 0;
		while(teller<lengde) {
			//System.out.println(array[teller]);
			if (array[teller] < minsteVerdi) {
				minsteVerdi = array[teller];
				minsteVerdiIndex = teller;
			}
			teller++; // teller = teller + 1;
		}


		// OBS OBS uten mellomlagring av storste/minste maa dere huske paa temp
		//int temp = array[minsteVerdiIndex];
		//array[minsteVerdiIndex] = array[storsteVerdiIndex];
		//array[storsteVerdiIndex] = array[minsteVerdiIndex];

		array[minsteVerdiIndex] = storsteVerdi;
		array[storsteVerdiIndex] = minsteVerdi;
		
		skrivUtArray(array);
		
	}

	public static void skrivUtArray(int[] array) {
		
		int teller = 0;
		while(teller < array.length) {
			System.out.print(array[teller] + ", ");
			teller++;
		}
		System.out.println(); // nylinje
	
	}

}

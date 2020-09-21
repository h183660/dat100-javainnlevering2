package no.hvl.dat100.lab5.tabeller;
//import java.lang.reflect.Array;
public class Tabeller {
	// a)
	public static void skrivUt(int[] tabell) {
		for(int i = 0; i < tabell.length;i++) {
			System.out.println(tabell[i]);
		}
	}
	// b)
	public static String tilStreng(int[] tabell) {
		String streng = "[";
		for (int i = 0;i < tabell.length;i++) {
			streng = streng + String.valueOf(tabell[i]);
			if(i < tabell.length - 1) {
				streng = streng + ",";
			}
		}
		streng = streng + "]";
		return streng;
	}
	// c)
	public static int summer(int[] tabell) {
		int sum = 0;
		int i = 0;	
		for (i = 0;i < tabell.length;i++) {
			sum = sum + tabell[i];
		}
		//gjør sum og i lik 0 for å kunne bruke variablene igjen
		i = 0;
		sum = 0;
		while(i < tabell.length) {
			sum = sum + tabell[i];
			i++;
		}
		sum = 0;
		for (int tall : tabell) {
			sum = sum + tall;
		}
		return sum;
	}
	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		boolean finnes = false;
		for(int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				finnes = true;
			}
		}
		return finnes;
	}
	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		int pos = -1;
		for(int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				pos = i;
			}
		}
		return pos;
	}
	// f)
	public static int[] reverser(int[] tabell) {
		int[] byttet = new int[tabell.length];
		for(int j = 0; j < tabell.length; j++) {
			byttet[j] = tabell[j];
		}
		for (int i = 0;i < byttet.length/2; i++) {
			int bytt = byttet[i];
			byttet[i] = byttet[byttet.length - i - 1];
			byttet[byttet.length - i - 1] = bytt;
		}
		return byttet;
	}
	// g)
	public static boolean erSortert(int[] tabell) {
		boolean sortert = false;
		if(tabell.length <= 1) {
			sortert = true;
		}else{
			for(int i = 0;i < tabell.length-1; i++) {
				if(tabell[i] <= tabell[i+1]) {
					sortert = true;
				}
			}
		}
		System.out.print(sortert);
		System.out.println(tabell.length);
		return sortert;
	}
	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int[] sammen = new int[tabell1.length + tabell2.length];
		int i = 0;
		for (int tall : tabell1) {
			sammen[i++] = tall;
		}for (int tall : tabell2) {
			sammen[i++] = tall;
		}
		return sammen;
	}
}
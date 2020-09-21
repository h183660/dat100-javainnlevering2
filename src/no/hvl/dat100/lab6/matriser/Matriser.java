package no.hvl.dat100.lab6.matriser;
public class Matriser {
	// a)
	public static void skrivUt(int[][] matrise) {
		/*for(int tabell[] : matrise) {
			for(int tall : tabell) {
				System.out.print(tall + ",");
			}System.out.println("");
		}*/
	}
	// b)
	public static String tilStreng(int[][] matrise) {
		String streng = "";
		for(int tabell[] : matrise) {
			for(int tall : tabell) {
				streng = streng + tall +" ";
			}
			streng = streng + "\n";
		}
		return streng;
	}
	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] m = new int[matrise.length][matrise[0].length];
		for(int i = 0;i < matrise.length;i++) {
			for(int j = 0; j < matrise[i].length;j++) {
				m[i][j]= (matrise[i][j]) * tall;
			}
		}return m;
	}
	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		boolean lik = true;
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				if (a[i][j]!=b[i][j]) {
					lik = false;
				}
			}
		}
		return lik;
	}
	// e)
	public static int[][] speile(int[][] matrise) {
		int[][] speil = new int[matrise.length][matrise[0].length];
		for(int i = 0;i < matrise.length; i++) {
			for(int j = 0;j < matrise[i].length; j++) {
				speil[i][j]=matrise[j][i];
			}
		}
		return speil;
	}
	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		int[][] multi = new int[a.length][b[0].length];
		if(a.length==b[0].length) {
			for(int i = 0;i < a.length; i++) {
				for(int j = 0;j < a[i].length; j++) {
					for(int k = 0;k < a[i].length; k++) {
						multi[i][j] += a[i][k] * b[k][j];
					}
				}
			}
		}
		return multi;
	}
}
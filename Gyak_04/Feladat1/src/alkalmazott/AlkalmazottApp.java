package alkalmazott;

import java.util.Iterator;
import java.util.Scanner;

public class AlkalmazottApp {
	final static int n = 5;
	public static void main(String[] args) {
		Alkalmazott alk[] = new Alkalmazott[n];
		feltolt(alk);
		kiir(alk);
		System.out.println("Átlagfizetés: " + atlag(alk));
		System.out.println("Legmagasabb fizetés: " + maxFizet(alk));
	}
	
	public static void feltolt(Alkalmazott a[]) {
		
		Scanner sc = new Scanner(System.in);
		String nev;
		int fizetes;
		for (int i = 0; i < a.length; i++) {
			System.out.println("Alkalmazott neve:");
			nev=sc.nextLine();
			System.out.println("Alkalmazott fizetése:");
			fizetes=sc.nextInt();
			sc.nextLine();
			a[i]=new Alkalmazott(nev, fizetes);
		}
	}
	
	public static void kiir(Alkalmazott alk[]) {
		for(Alkalmazott elem : alk) {
			System.out.println(elem);
		}
	}
	
	public static double atlag(Alkalmazott alk[]) {
		int osszeg=0;
		for(Alkalmazott elem : alk) {
			osszeg+=elem.getFizetes();
		}
		return osszeg/alk.length;
	}
	
	public static Alkalmazott maxFizet(Alkalmazott alk[]) {
		int max=0;
		for(int i = 1;i<alk.length;i++) {
			if(alk[i].getFizetes()> alk[max].getFizetes()) {
				max=i;
			}
		}
		return alk[max];
	}

}

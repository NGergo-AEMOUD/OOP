package Feladatok;

import java.util.ArrayList;
import java.util.Scanner;

public class Feladat_01 {

	public static void main(String[] args) {
		Scanner sc = megnyitInput();
		ArrayList<String> szavak;
		szavak = szavakEltarol(sc);
		kiir(szavak);
	}
	
	static Scanner megnyitInput() {
		return new Scanner(System.in);
		
	} 
	
	static String beolvas(Scanner sc) {
		return sc.nextLine();
	}
	
	static ArrayList<String> szavakEltarol(Scanner sc){
		ArrayList<String> szavak = new ArrayList<String>();
		String szo;
		do {
			szo = kovetkezoszo(sc);
			if(szo.equals('*')) {
				return szavak;
			}else {
				szavak.add(szo);
			}
		}while( !(szo.equals('*')));
		return szavak;
		
	}
	
	static String kovetkezoszo(Scanner sc) {
		String szo;
		szo = beolvas(sc);
		return szo;
	}
	
	static void kiir(ArrayList<String> tomb) {
		for(String elem : tomb) {
			System.out.println(elem + "\n");
		}
	}

}

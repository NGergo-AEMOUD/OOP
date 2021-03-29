package alkalmazott;

import java.util.Scanner;

public class Bolt {
	private int letszam;
	private Alkalmazott[] alk;
	
	public Bolt(int letszam) {
		super();
		this.letszam = letszam;
		this.alk = new Alkalmazott[letszam];
		feltolt();
	}

	public int getLetszam() {
		return letszam;
	}

	public Alkalmazott[] getAlk() {
		return alk;
	}

	private void feltolt() {
		
		try (Scanner sc = new Scanner(System.in)) {
			String nev;
			int fizetes;
			for (int i = 0; i < alk.length; i++) {
				System.out.println("Alkalmazott neve:");
				nev=sc.nextLine();
				System.out.println("Alkalmazott fizetése:");
				fizetes=sc.nextInt();
				sc.nextLine();
				alk[i]=new Alkalmazott(nev, fizetes);
			}
		}
	}

	

	
}

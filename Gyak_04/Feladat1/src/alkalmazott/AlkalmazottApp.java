package alkalmazott;

public class AlkalmazottApp {

	public static void main(String[] args) {
		Alkalmazott a1 = new Alkalmazott("Nagy Gergő",1000000);
		/*a1.nev="Nagy Gergő";
		a1.fizetes=1000000;*/
		System.out.println(a1);
		a1.Fizetesnovel(35);
		System.out.println(a1);
	}

}

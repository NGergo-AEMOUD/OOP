package alkalmazott;

public class Kimutatasok {
	private Bolt b = new Bolt(5);
	private Alkalmazott alk[] = b.getAlk();

	public Alkalmazott maxFizet() {
		int max=0;
		for(int i = 1;i<alk.length;i++) {
			if(alk[i].getFizetes()> alk[max].getFizetes()) {
				max=i;
			}
		}
		return alk[max];
	}
	
	public double atlag() {
		int osszeg=0;
		for(Alkalmazott elem : alk) {
			osszeg+=elem.getFizetes();
		}
		return osszeg/alk.length;
	}
	
	public void kiir() {
		for(Alkalmazott elem : alk) {
			System.out.println(elem);
		}
	}
}

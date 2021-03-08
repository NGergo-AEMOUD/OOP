package alkalmazott;

public class Alkalmazott {
	private final String nev;
	private int fizetes;
	
	public Alkalmazott(String nev, int fizetes) {
		super();
		this.nev = nev;
		this.fizetes = fizetes;
	}

	public String getNev() {
		return nev;
	}


	public int getFizetes() {
		return fizetes;
	}

	public void setFizetes(int fizetes) {
		this.fizetes = fizetes;
	}

	public void Fizetesnovel(double szazalek) {
		fizetes+=(int)(fizetes*(szazalek/100));
	}

	@Override
	public String toString() {
		return "Alkalmazott [Név = " + this.nev + ", Fizetés = " + this.fizetes + " Ft]";
	}
	
	
}

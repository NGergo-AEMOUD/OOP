package alkalmazott;

public class Alkalmazott {
	String nev;
	int fizetes;
	
	void Fizetesnovel(double szazalek) {
		fizetes+=(int)(fizetes*(szazalek/100));
	}

	@Override
	public String toString() {
		return "Alkalmazott [Név = " + this.nev + ", Fizetés = " + this.fizetes + " Ft]";
	}
	
	
}

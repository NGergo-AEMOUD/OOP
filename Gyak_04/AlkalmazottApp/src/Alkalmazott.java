
public class Alkalmazott {
	private String nev;
	private int kor;
	private int fizetes;
	private static int nyugdijkorhatar = 65;
	
	
	
	public Alkalmazott(String nev, int kor, int fizetes) {
		super();
		this.nev = nev;
		this.kor = kor;
		this.fizetes = fizetes;
	}



	public Alkalmazott(String nev, int kor) {
		super();
		this.nev = nev;
		this.kor = kor;
		this.fizetes = 10000;
	}
	
	public int getKor() {
		return kor;
	}


	public static void setNyugdijkorhatar(int nyugdijkorhatar) {
		Alkalmazott.nyugdijkorhatar = nyugdijkorhatar;
	}



	public int nyugdijig() {
		return (nyugdijkorhatar - this.kor);
	}
	
	public Alkalmazott fiatalabb(Alkalmazott A1, Alkalmazott A2) {
		if(A1.nyugdijig()<A2.nyugdijig()) {
			return A2;
		}else {
			return A1;
		}
	}



	@Override
	public String toString() {
		return "Alkalmazott [nev=" + nev + ", kor=" + kor + ", fizetes=" + fizetes + " evek nyugdijig=" + nyugdijig() + "]";
	}
	
	
	
	
}

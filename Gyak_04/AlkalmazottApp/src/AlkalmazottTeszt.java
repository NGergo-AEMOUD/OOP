import java.util.Random;

public class AlkalmazottTeszt {
	private Alkalmazott[] alkalmazottak;

	public AlkalmazottTeszt(int num) {
		super();
		alkalmazottak= new Alkalmazott[num];
		feltolt(num);
	}
	
	private void feltolt(int num) {
		
		Random r = new Random();
		for (int i = 0;i < num; i++) {
			alkalmazottak[i]= new Alkalmazott("Pista" + i, r.nextInt(41)+26);
		}
	}
	
	public void alkList() {
		for (Alkalmazott elem : alkalmazottak) {
			System.out.println(elem);
		}
		System.out.println("\n");
	}
	
	public void newOrder(int newAge) {
		Alkalmazott.setNyugdijkorhatar(newAge);
		alkList();
	}
	
	public void shortNyug() {
		for (Alkalmazott elem : alkalmazottak) {
			if(elem.nyugdijig()<5) {
				System.out.println(elem);
			}
		}
	}
	
	public void aboveAVG() {
		double atlag = atlagEvek();
		for (Alkalmazott elem : alkalmazottak) {
			if(elem.getKor()>atlag) {
				System.out.println(elem);
			}
		}
	}
	
	private double atlagEvek() {
		int db = 0;
		double atlag = 0;
		for (Alkalmazott elem : alkalmazottak) {
			if(elem.nyugdijig()>0) {
				atlag+= elem.getKor();
				db++;
			}
		}
		if(db == 0) {
			System.out.println("Hiba!");
			return 0;
		}else {
			System.out.println(atlag/db);
			return (atlag/db);
		}
	}
	
	
	
}

import java.util.ArrayList;

public class DistantnaZastita extends Zastita{
	
	private boolean faza_L1_poticaj = false;
	private boolean faza_L2_poticaj = false;
	private boolean faza_L3_poticaj = false;
	private boolean zemljospoj_poticaj = false;
	
	static ArrayList<String> distantnaZastitaSignali = new ArrayList<String>();
	
	public DistantnaZastita(String ID) {
		
		super(ID);
		
		distantnaZastitaSignali.clear();
		distantnaZastitaSignali.add("faza_L1_poticaj: " + Boolean.toString(faza_L1_poticaj));
		distantnaZastitaSignali.add("faza_L2_poticaj: " + Boolean.toString(faza_L2_poticaj));
		distantnaZastitaSignali.add("faza_L3_poticaj: " + Boolean.toString(faza_L3_poticaj));
		distantnaZastitaSignali.add("zemljospoj_poticaj: " + Boolean.toString(zemljospoj_poticaj));
		
	}

	public boolean isFaza_L1_poticaj() {
		return faza_L1_poticaj;
	}

	public void setFaza_L1_poticaj(boolean faza_L1_poticaj) {
		this.faza_L1_poticaj = faza_L1_poticaj;
	}

	public boolean isFaza_L2_poticaj() {
		return faza_L2_poticaj;
	}

	public void setFaza_L2_poticaj(boolean faza_L2_poticaj) {
		this.faza_L2_poticaj = faza_L2_poticaj;
	}

	public boolean isFaza_L3_poticaj() {
		return faza_L3_poticaj;
	}

	public void setFaza_L3_poticaj(boolean faza_L3_poticaj) {
		this.faza_L3_poticaj = faza_L3_poticaj;
	}

	public boolean isZemljospoj_poticaj() {
		return zemljospoj_poticaj;
	}

	public void setZemljospoj_poticaj(boolean zemljospoj_poticaj) {
		this.zemljospoj_poticaj = zemljospoj_poticaj;
	}
	
	
}

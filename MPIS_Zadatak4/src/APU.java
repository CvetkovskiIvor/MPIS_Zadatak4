 
public class APU {
	private final String ID;
	private String stanje;
	private boolean APU_ukljucenje;
	private boolean APU_1p;
	private boolean APU_3p;
	private boolean APU_blokada;
	
	public void ukljuèi(PrekidacDP prekidac) {
		
		prekidac.setStanje("ON");
		
	}
	
	public APU (String ID) {
		this.ID = ID;
	}

	public String getStanje() {
		return stanje;
	}

	public void setStanje(String stanje) {
		this.stanje = stanje;
	}

	public String getID() {
		return ID;
	}
}

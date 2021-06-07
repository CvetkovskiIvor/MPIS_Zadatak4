
public class Zastita {
	private final String ID;
	private String stanje;
	
	public void iskljuèi(PrekidacDP prekidac) {
		
		prekidac.setStanje("OFF");
		
	}
	
	public Zastita (String ID) {
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

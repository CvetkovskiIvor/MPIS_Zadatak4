
public class Zastita {
	private final String ID;
	private String stanje;
	
	public void iskljuci(PrekidacDP prekidac) {
		
		prekidac.isklop(prekidac);
		
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

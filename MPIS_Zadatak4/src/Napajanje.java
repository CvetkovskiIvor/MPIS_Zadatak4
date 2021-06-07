
public class Napajanje {
	private final String ID;
	private String stanje;
	
	public String provjera_stanja() {
		return "";
	}
	
	public Napajanje(String ID) {
		this.ID = ID;
		setStanje("ON");
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

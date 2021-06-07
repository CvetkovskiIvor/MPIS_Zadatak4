
public class RastavljacSP extends SpojnoPolje{
	private final String ID;
	private String stanje;
	
	public String provjera_stanja() {
		return "";
	}
	
	RastavljacSP (String ID){
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


public class RastavljacSP extends SpojnoPolje{
	private final String ID;
	private String stanje;
	
	public String provjera_stanja(PrekidacSP prekidac) {
		
		return prekidac.getStanje();
		
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

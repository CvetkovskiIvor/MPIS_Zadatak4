
public class RastavljacDP extends DalekovodnoPolje{
	private final String ID;
	private String stanje;
	
	public RastavljacDP (String ID){
		this.ID = ID;
	}
	
	public String provjera_stanja() {
		return "";
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

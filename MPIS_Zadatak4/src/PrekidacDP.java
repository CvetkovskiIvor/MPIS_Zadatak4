
public class PrekidacDP extends DalekovodnoPolje{
	private final String ID;
	private String stanje;
	private boolean upravljanje;
	
	public void uklop(PrekidacDP prek) {
		
		prek.setStanje("on");
		
	}
	
	public void isklop(PrekidacDP prek) {
		
		prek.setStanje("off");
		
	}
	
	public String provjera_stanja() {
		return "";
	}
	
	public PrekidacDP(String ID){
		this.ID = ID;
	}

	public String getStanje() {
		return stanje;
	}

	public void setStanje(String stanje) {
		this.stanje = stanje;
	}

	public boolean isUpravljanje() {
		return upravljanje;
	}

	public void setUpravljanje(boolean upravljanje) {
		this.upravljanje = upravljanje;
	}

	public String getID() {
		return ID;
	}
}

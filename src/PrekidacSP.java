
public class PrekidacSP extends SpojnoPolje{
	private final String ID;
	private String stanje;
	private String upravljanje = "Daljinsko";
	
	public void uklop(PrekidacSP prek) {
		
		prek.setStanje("on");
		
	}
	
	public void isklop(PrekidacSP prek) {
		
		prek.setStanje("off");
		
	}
	
	public String provjera_stanja() {
		return "";
	}
	
	public PrekidacSP(String ID){
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

	public String getUpravljanje() {
		return upravljanje;
	}

	public void setUpravljanje(String upravljanje) {
		this.upravljanje = upravljanje;
	}
}

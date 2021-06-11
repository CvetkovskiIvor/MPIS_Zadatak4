
public class PrekidacDP extends DalekovodnoPolje{
	private final String ID;
	private String stanje;
	private String upravljanje = "Daljinsko";
	
	@SuppressWarnings("unchecked")
	public void uklop(PrekidacDP prek) {
		
		prek.setStanje("ON");
		StartScr.signali.add(ID + ": " + prek.getStanje());
		
	}
	
	public void isklop(PrekidacDP prek) {
		
		prek.setStanje("OFF");
		StartScr.signali.remove(ID + ": " + prek.getStanje());
		
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

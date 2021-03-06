import java.util.ArrayList;

public class PrekidacDP extends DalekovodnoPolje{
	private final String ID;
	private String stanje;
	private String upravljanje = "Daljinsko";
	
	static ArrayList<String> prekidacDPSignali = new ArrayList<String>();
	
	public void uklop(PrekidacDP prek) {
		
		if(prek.getStanje() != "ON") {
			
			prekidacDPSignali.remove(getID() + ": " + "OFF");
			prek.setStanje("ON");
			prekidacDPSignali.add(getID() + ": " + prek.getStanje());
			
		}
		
	}
	
	public void isklop(PrekidacDP prek) {
		
		if(prek.getStanje() != "OFF") {
			
			prekidacDPSignali.remove(ID + ": " + "ON");
			prek.setStanje("OFF");
			
			prekidacDPSignali.add(ID + ": " + prek.getStanje());
			
		}
		
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

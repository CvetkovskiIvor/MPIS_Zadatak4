import java.util.ArrayList;

public class PrekidacSP extends SpojnoPolje{
	private final String ID;
	private String stanje;
	private String upravljanje = "Daljinsko";
	
	static ArrayList<String> prekidacSPSignali = new ArrayList<String>();
	
	PrekidacSP(String ID) {
		
		this.ID = ID;
//		prekidacSPSignali.remove(ID + ": " + "OFF");
//		prekidacSPSignali.add(ID + ": " + "OFF");
		
	}
	
	public void uklop(PrekidacSP prek) {
		
		if(prek.getStanje() != "ON") {
			
			prekidacSPSignali.remove(getID() + ": " + "OFF");
			prek.setStanje("ON");

			prekidacSPSignali.add(getID() + ": " + prek.getStanje());
			
		}
		
	}
	
	public void isklop(PrekidacSP prek) {
		
		if(prek.getStanje() != "OFF") {
			
			prekidacSPSignali.remove(getID() + ": " + "ON");
			prek.setStanje("OFF");
			
			prekidacSPSignali.add(getID() + ": " + prek.getStanje());
			
		}
		
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

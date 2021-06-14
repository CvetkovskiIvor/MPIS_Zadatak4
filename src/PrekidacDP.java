
public class PrekidacDP extends DalekovodnoPolje{
	private final String ID;
	private String stanje;
	private String upravljanje = "Daljinsko";
	
	public void uklop(PrekidacDP prek) {
		
		if(prek.getStanje() != "ON") {
			
			StartScr.svi_Signali.remove(getID() + ": " + prek.getStanje());
			prek.setStanje("ON");
			StartScr.signali.add(ID + ": " + prek.getStanje());
			StartScr.svi_Signali.add(ID + ": " + prek.getStanje());
			DalekovodnoScr.dalekovodnoSignali.add(getID() + ": " + prek.getStanje());
			
		}
		
	}
	
	public void isklop(PrekidacDP prek) {
		
		if(prek.getStanje() != "OFF") {
			
			StartScr.signali.remove(ID + ": " + prek.getStanje());
			StartScr.svi_Signali.remove(ID + ": " + prek.getStanje());
			
			DalekovodnoScr.dalekovodnoSignali.remove(getID() + ": " + prek.getStanje());
			prek.setStanje("OFF");
			
			StartScr.svi_Signali.add(ID + ": " + prek.getStanje());
			
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

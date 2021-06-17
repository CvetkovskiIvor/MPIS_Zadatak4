import java.util.ArrayList;

public class PrekidacSP extends SpojnoPolje{
	private final String ID;
	private String stanje;
	private String upravljanje = "Daljinsko";
	
	static ArrayList<String> prekidacSPSignali = new ArrayList<String>();
	
	public void uklop(PrekidacSP prek) {
		
		if(prek.getStanje() != "ON") {
			
			prekidacSPSignali.remove(getID() + ": " + prek.getStanje());
			prek.setStanje("ON");
			/*StartScr.signali.add(ID + ": " + prek.getStanje());
			StartScr.svi_Signali.add(ID + ": " + prek.getStanje());*/

			prekidacSPSignali.add(getID() + ": " + prek.getStanje());
			
		}
		
	}
	
	public void isklop(PrekidacSP prek) {
		
		if(prek.getStanje() != "OFF") {
			
			prekidacSPSignali.remove(ID + ": " + prek.getStanje());
			/*StartScr.svi_Signali.remove(ID + ": " + prek.getStanje());
			
			SpojnoScr.spojnoSignali.remove(getID() + ": " + prek.getStanje());*/
			prek.setStanje("OFF");
			
			prekidacSPSignali.add(ID + ": " + prek.getStanje());
			
		}
		
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

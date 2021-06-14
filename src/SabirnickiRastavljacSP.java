
public class SabirnickiRastavljacSP extends RastavljacSP{
	
	SabirnickiRastavljacSP(String ID) {
		
		super(ID);
		
	}

	public void uklop(SabirnickiRastavljacSP rast) {
		
		if(rast.getStanje() != "ON") {
			
			StartScr.svi_Signali.remove(getID() + ": " + rast.getStanje());
			rast.setStanje("ON");
			StartScr.signali.add(getID() + ": " + getStanje());
			StartScr.svi_Signali.add(getID() + ": " + getStanje());

			SpojnoScr.spojnoSignali.add(getID() + ": " + getStanje());
			
		}
		
	}
	
	public void isklop(SabirnickiRastavljacSP rast) {
		
		if(rast.getStanje() != "OFF") {
			
			StartScr.signali.remove(getID() + ": " + getStanje());
			StartScr.svi_Signali.remove(getID() + ": " + getStanje());
			
			SpojnoScr.spojnoSignali.remove(getID() + ": " + getStanje());
			rast.setStanje("OFF");
			
			StartScr.svi_Signali.add(getID() + ": " + getStanje());
			
		}
		
	}
}

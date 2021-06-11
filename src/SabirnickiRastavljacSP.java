
public class SabirnickiRastavljacSP extends RastavljacSP{
	
	SabirnickiRastavljacSP(String ID) {
		super(ID);
	}

	@SuppressWarnings("unchecked")
	public void uklop(SabirnickiRastavljacSP rast) {
		
		rast.setStanje("ON");
		StartScr.signali.add(getID() + ": " + rast.getStanje());
		
	}
	
	public void isklop(SabirnickiRastavljacSP rast) {
		
		rast.setStanje("OFF");
		StartScr.signali.remove(getID() + ": " + rast.getStanje());
		
	}
}

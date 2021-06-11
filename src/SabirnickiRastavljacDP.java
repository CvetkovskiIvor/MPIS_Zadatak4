
public class SabirnickiRastavljacDP extends RastavljacDP{
	
	public SabirnickiRastavljacDP(String ID) {
		
		super(ID);
		
	}
	
	@SuppressWarnings("unchecked")
	public void uklop(SabirnickiRastavljacDP rast) {
		
		rast.setStanje("ON");
		StartScr.signali.add(getID() + ": " + rast.getStanje());
		
	}
	
	public void isklop(SabirnickiRastavljacDP rast) {
		
		rast.setStanje("OFF");
		StartScr.signali.remove(getID() + ": " + rast.getStanje());
		
	}
	
	
}

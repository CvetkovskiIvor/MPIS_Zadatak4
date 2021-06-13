
public class SabirnickiRastavljacDP extends RastavljacDP{
	
	public SabirnickiRastavljacDP(String ID) {
		
		super(ID);
		
	}
	
	public void uklop(SabirnickiRastavljacDP rast) {
		
		if(rast.getStanje() != "ON") {
			
			rast.setStanje("ON");
			StartScr.signali.add(getID() + ": " + rast.getStanje());
			DalekovodnoScr.dalekovodnoSignali.add(getID() + ": " + rast.getStanje());
			StartScr.svi_Signali.add(getID() + ": " + rast.getStanje());

		}
		
	}
	
	public void isklop(SabirnickiRastavljacDP rast) {
		
		if(rast.getStanje() != "OFF") {

			StartScr.signali.remove(getID() + ": " + rast.getStanje());
			StartScr.svi_Signali.remove(getID() + ": " + rast.getStanje());
			StartScr.svi_Signali.add(getID() + ": " + rast.getStanje());


			DalekovodnoScr.dalekovodnoSignali.remove(getID() + ": " + rast.getStanje());
			rast.setStanje("OFF");
			
		}
		
	}
	
	
}

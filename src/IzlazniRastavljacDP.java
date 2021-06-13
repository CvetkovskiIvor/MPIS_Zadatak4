
public class IzlazniRastavljacDP extends RastavljacDP{
	public IzlazniRastavljacDP(String ID) {
		super(ID);
		// TODO Auto-generated constructor stub
	}

	public void uklop(IzlazniRastavljacDP rast) {
		
		if(rast.getStanje() != "ON") {
			
			rast.setStanje("ON");
			StartScr.signali.add(getID() + ": " + rast.getStanje());
			DalekovodnoScr.dalekovodnoSignali.add(getID() + ": " + rast.getStanje());
			StartScr.svi_Signali.add(getID() + ": " + rast.getStanje());

			
		}
		
	}
	
	public void isklop(IzlazniRastavljacDP rast) {
		
		if(rast.getStanje() != "OFF") {
			
			StartScr.signali.remove(getID() + ": " + rast.getStanje());
			StartScr.svi_Signali.remove(getID() + ": " + rast.getStanje());
			
			DalekovodnoScr.dalekovodnoSignali.remove(getID() + ": " + rast.getStanje());
			rast.setStanje("OFF");
			
			StartScr.svi_Signali.add(getID() + ": " + rast.getStanje());
			
		}
		
	}
}

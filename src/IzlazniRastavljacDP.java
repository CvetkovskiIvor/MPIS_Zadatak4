import java.util.ArrayList;

public class IzlazniRastavljacDP extends RastavljacDP{
	
	ArrayList<String> izlazniRastavljacDPSignali = new ArrayList<String>();
	
	public IzlazniRastavljacDP(String ID) {
		super(ID);
		// TODO Auto-generated constructor stub
	}

	public void uklop(IzlazniRastavljacDP rast) {
		
		if(rast.getStanje() != "ON") {
			
			StartScr.svi_Signali.remove(getID() + ": " + rast.getStanje());
			rast.setStanje("ON");
			StartScr.signali.add(getID() + ": " + rast.getStanje());
			DalekovodnoScr.dalekovodnoSignali.add(getID() + ": " + rast.getStanje());
			StartScr.svi_Signali.add(getID() + ": " + rast.getStanje());
			izlazniRastavljacDPSignali.add(getID() + ": " + rast.getStanje());

		}
		
	}
	
	public void isklop(IzlazniRastavljacDP rast) {
		
		if(rast.getStanje() != "OFF") {
			
			StartScr.signali.remove(getID() + ": " + rast.getStanje());
			StartScr.svi_Signali.remove(getID() + ": " + rast.getStanje());
			
			DalekovodnoScr.dalekovodnoSignali.remove(getID() + ": " + rast.getStanje());
			izlazniRastavljacDPSignali.remove(getID() + ": " + rast.getStanje());
			
			rast.setStanje("OFF");
			
			StartScr.svi_Signali.add(getID() + ": " + rast.getStanje());
			
		}
		
	}
}

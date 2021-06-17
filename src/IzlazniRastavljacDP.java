import java.util.ArrayList;

public class IzlazniRastavljacDP extends RastavljacDP{
	
	static ArrayList<String> izlazniRastavljacDPSignali = new ArrayList<String>();
	
	public IzlazniRastavljacDP(String ID) {
		
		super(ID);
		izlazniRastavljacDPSignali.remove(ID + ": " + "OFF");
		izlazniRastavljacDPSignali.add(ID + ": " + "OFF");
		
	}

	public void uklop(IzlazniRastavljacDP rast) {
		
		if(rast.getStanje() != "ON") {
			
			izlazniRastavljacDPSignali.remove(getID() + ": " + "OFF");
			rast.setStanje("ON");
			/*StartScr.signali.add(getID() + ": " + rast.getStanje());
			DalekovodnoScr.dalekovodnoSignali.add(getID() + ": " + rast.getStanje());
			StartScr.svi_Signali.add(getID() + ": " + rast.getStanje());*/
			izlazniRastavljacDPSignali.add(getID() + ": " + rast.getStanje());

		}
		
	}
	
	public void isklop(IzlazniRastavljacDP rast) {
		
		if(rast.getStanje() != "OFF") {
			
			/*StartScr.signali.remove(getID() + ": " + rast.getStanje());
			StartScr.svi_Signali.remove(getID() + ": " + rast.getStanje());
			DalekovodnoScr.dalekovodnoSignali.remove(getID() + ": " + rast.getStanje());*/
			
			
			izlazniRastavljacDPSignali.remove(getID() + ": " + "ON");
			
			rast.setStanje("OFF");
			
			izlazniRastavljacDPSignali.add(getID() + ": " + rast.getStanje());
			
		}
		
	}
}

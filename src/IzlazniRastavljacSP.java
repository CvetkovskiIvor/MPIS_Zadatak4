import java.util.ArrayList;

public class IzlazniRastavljacSP extends RastavljacSP{
	
	ArrayList<String> izlazniRastavljacSPSignali = new ArrayList<String>();
	
	IzlazniRastavljacSP(String ID) {
		
		super(ID);
		
	}

	public void uklop(IzlazniRastavljacSP rast) {
		
		if(rast.getStanje() != "ON") {
			
			rast.setStanje("ON");
			StartScr.signali.add(getID() + ": " + rast.getStanje());
			StartScr.svi_Signali.add(getID() + ": " + rast.getStanje());

			SpojnoScr.spojnoSignali.add(getID() + ": " + rast.getStanje());
			izlazniRastavljacSPSignali.add(getID() + ": " + rast.getStanje());
			
		}
		
	}
	
	public void isklop(IzlazniRastavljacSP rast) {
		
		if(rast.getStanje() != "OFF") {
			
			StartScr.signali.remove(getID() + ": " + rast.getStanje());
			StartScr.svi_Signali.remove(getID() + ": " + rast.getStanje());
			
			SpojnoScr.spojnoSignali.remove(getID() + ": " + rast.getStanje());
			rast.setStanje("OFF");
			
			StartScr.svi_Signali.add(getID() + ": " + rast.getStanje());
			
		}
		
		
	}
}

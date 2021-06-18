import java.util.ArrayList;

public class IzlazniRastavljacSP extends RastavljacSP{
	
	static ArrayList<String> izlazniRastavljacSPSignali = new ArrayList<String>();
	
	IzlazniRastavljacSP(String ID) {
		
		super(ID);
		izlazniRastavljacSPSignali.remove(ID + ": " + "ON");
		izlazniRastavljacSPSignali.add(ID + ": " + "ON");
		
	}

	public void uklop(IzlazniRastavljacSP rast) {
		
		if(rast.getStanje() != "ON") {
			
			izlazniRastavljacSPSignali.remove(getID() + ": " + "OFF");
			rast.setStanje("ON");
			izlazniRastavljacSPSignali.add(getID() + ": " + rast.getStanje());
			
		}
		
	}
	
	public void isklop(IzlazniRastavljacSP rast) {
		
		if(rast.getStanje() != "OFF") {
			
			izlazniRastavljacSPSignali.remove(getID() + ": " + "ON");
			rast.setStanje("OFF");
			
			izlazniRastavljacSPSignali.add(getID() + ": " + rast.getStanje());
			
		}
		
		
	}
	
}

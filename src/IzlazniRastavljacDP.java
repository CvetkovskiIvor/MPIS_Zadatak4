import java.util.ArrayList;

public class IzlazniRastavljacDP extends RastavljacDP{
	
	static ArrayList<String> izlazniRastavljacDPSignali = new ArrayList<String>();
	
	public IzlazniRastavljacDP(String ID) {
		
		super(ID);
		
	}

	public void uklop(IzlazniRastavljacDP rast) {
		
		if(rast.getStanje() != "ON") {
			
			izlazniRastavljacDPSignali.remove(getID() + ": " + "OFF");
			rast.setStanje("ON");
			izlazniRastavljacDPSignali.add(getID() + ": " + rast.getStanje());

		}
		
	}
	
	public void isklop(IzlazniRastavljacDP rast) {
		
		if(rast.getStanje() != "OFF") {
			
			izlazniRastavljacDPSignali.remove(getID() + ": " + "ON");
			
			rast.setStanje("OFF");
			
			izlazniRastavljacDPSignali.add(getID() + ": " + rast.getStanje());
			
		}
		
	}
}

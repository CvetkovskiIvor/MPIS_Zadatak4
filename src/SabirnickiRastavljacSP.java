import java.util.ArrayList;

public class SabirnickiRastavljacSP extends RastavljacSP{
	
	static ArrayList<String> sabirnickiRastavljacSPSignali = new ArrayList<String>();
	
	public SabirnickiRastavljacSP(String ID) {
		
		super(ID);
		
	}

	public void uklop(SabirnickiRastavljacSP rast, PrekidacSP prekidac) {
		
		if(rast.getStanje() != "ON") {
			
			sabirnickiRastavljacSPSignali.remove(getID() + ": " + "OFF");
			rast.setStanje("ON");
			sabirnickiRastavljacSPSignali.add(getID() + ": " + getStanje());
			
		}
		
	}
	
	public void isklop(SabirnickiRastavljacSP rast, PrekidacSP prekidac) {
		
		if(rast.provjera_stanja(prekidac) == "ON") {
			
			System.out.println("problem: pokusaj upravljanja rastavljacem dok je prekidac ukljucen");
			return;
			
		}
		
		if(rast.getStanje() != "OFF") {
			
			sabirnickiRastavljacSPSignali.remove(getID() + ": " + "ON");
			rast.setStanje("OFF");
			
			sabirnickiRastavljacSPSignali.add(getID() + ": " + getStanje());
			
		}
		
	}
	
}
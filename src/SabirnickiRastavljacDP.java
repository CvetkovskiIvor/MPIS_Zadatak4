import java.util.ArrayList;

public class SabirnickiRastavljacDP extends RastavljacDP{
	
	static ArrayList<String> sabirnickiRastavljacDPSignali = new ArrayList<String>();
	
	public SabirnickiRastavljacDP(String ID) {
		
		super(ID);
		sabirnickiRastavljacDPSignali.remove(ID + ": " + "OFF");
		sabirnickiRastavljacDPSignali.add(ID + ": " + "OFF");
		
	}
	
	public void uklop(SabirnickiRastavljacDP rast, PrekidacDP prekidac) {
		
		if(rast.getStanje() != "ON") {
			
			sabirnickiRastavljacDPSignali.remove(getID() + ": " + "OFF");
			rast.setStanje("ON");
			sabirnickiRastavljacDPSignali.add(getID() + ": " + getStanje());

		}
		
	}
	
	public void isklop(SabirnickiRastavljacDP rast, PrekidacDP prekidac) {
		
		if(rast.provjera_stanja(prekidac) == "ON") {
			
			System.out.println("problem: pokusaj upravljanja rastavljacem dok je prekidac ukljucen");
			return;
			
		}
		
		if(rast.getStanje() != "OFF") {

			sabirnickiRastavljacDPSignali.remove(getID() + ": " + "ON");
			rast.setStanje("OFF");
			
			sabirnickiRastavljacDPSignali.add(getID() + ": " + getStanje());
			
		}
		
	}
	
}
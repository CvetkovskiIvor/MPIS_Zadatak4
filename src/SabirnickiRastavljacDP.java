import java.util.ArrayList;

public class SabirnickiRastavljacDP extends RastavljacDP{
	
	ArrayList<String> sabirnickiRastavljacDPSignali = new ArrayList<String>();
	
	public SabirnickiRastavljacDP(String ID) {
		
		super(ID);
		sabirnickiRastavljacDPSignali.add(ID + ": " + "OFF");
		
	}
	
	public void uklop(SabirnickiRastavljacDP rast, PrekidacDP prekidac) {
		
		/*if(rast.provjera_stanja(prekidac) == "ON") {
			
			System.out.println("problem: pokusaj upravljanja rastavljacem dok je prekidac ukljucen");
			return;
			
		}*/
		
		if(rast.getStanje() != "ON") {
			
			sabirnickiRastavljacDPSignali.remove(getID() + ": " + "OFF");
			rast.setStanje("ON");
			/*StartScr.signali.add(getID() + ": " + rast.getStanje());
			DalekovodnoScr.dalekovodnoSignali.add(getID() + ": " + rast.getStanje());*/
			sabirnickiRastavljacDPSignali.add(getID() + ": " + rast.getStanje());

		}
		
	}
	
	public void isklop(SabirnickiRastavljacDP rast, PrekidacDP prekidac) {
		
		if(rast.provjera_stanja(prekidac) == "ON") {
			
			System.out.println("problem: pokusaj upravljanja rastavljacem dok je prekidac ukljucen");
			return;
			
		}
		
		if(rast.getStanje() != "OFF") {

			/*StartScr.signali.remove(getID() + ": " + rast.getStanje());
			StartScr.svi_Signali.remove(getID() + ": " + rast.getStanje());*/

			sabirnickiRastavljacDPSignali.remove(getID() + ": " + "ON");
			
			rast.setStanje("OFF");
			
			sabirnickiRastavljacDPSignali.add(getID() + ": " + rast.getStanje());
			
		}
		
	}
	
	
}

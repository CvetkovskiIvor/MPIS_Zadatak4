
public class SabirnickiRastavljacDP extends RastavljacDP{
	
	String sabirnica = "";
	
	public SabirnickiRastavljacDP(String ID) {
		super(ID);
		// TODO Auto-generated constructor stub
	}

public void uklop(SabirnickiRastavljacDP rast, String sabirnica) {
		
		rast.stanje = "on";
		rast.sabirnica = sabirnica;
		
	}
	
	public void isklop(SabirnickiRastavljacDP rast) {
		
		rast.stanje = "off";
		rast.sabirnica = "";
		
	}
}

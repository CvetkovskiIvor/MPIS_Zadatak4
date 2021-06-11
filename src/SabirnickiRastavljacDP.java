
public class SabirnickiRastavljacDP extends RastavljacDP{
	
	public SabirnickiRastavljacDP(String ID) {
		super(ID);
	}

	public void uklop(SabirnickiRastavljacDP rast) {
		
		rast.setStanje("ON");
		
	}
	
	public void isklop(SabirnickiRastavljacDP rast) {
		
		rast.setStanje("OFF");
		
	}
	
	
}


public class SabirnickiRastavljacSP extends RastavljacSP{
	
	SabirnickiRastavljacSP(String ID) {
		super(ID);
	}

	public void uklop(SabirnickiRastavljacSP rast) {
		
		rast.setStanje("ON");
		
	}
	
	public void isklop(SabirnickiRastavljacSP rast) {
		
		rast.setStanje("OFF");
		
	}
}

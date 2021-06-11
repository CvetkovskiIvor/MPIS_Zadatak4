
public class SabirnickiRastavljacSP extends RastavljacSP{
	
	SabirnickiRastavljacSP(String ID) {
		super(ID);
	}

	public void uklop(SabirnickiRastavljacSP rast) {
		
		rast.setStanje("on");
		
	}
	
	public void isklop(SabirnickiRastavljacSP rast) {
		
		rast.setStanje("off");
		
	}
}


public class SabirnickiRastavljacDP extends RastavljacDP{
	
	public SabirnickiRastavljacDP(String ID) {
		super(ID);
	}

	public void uklop(SabirnickiRastavljacDP rast) {
		
		rast.setStanje("on");
		
	}
	
	public void isklop(SabirnickiRastavljacDP rast) {
		
		rast.setStanje("off");
		
	}
	
	
}

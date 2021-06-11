
public class IzlazniRastavljacDP extends RastavljacDP{
	public IzlazniRastavljacDP(String ID) {
		super(ID);
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("unchecked")
	public void uklop(IzlazniRastavljacDP rast) {
		
		rast.setStanje("ON");
		StartScr.signali.add(getID() + ": " + rast.getStanje());
		
	}
	
	public void isklop(IzlazniRastavljacDP rast) {
		
		rast.setStanje("OFF");
		StartScr.signali.remove(getID() + ": " + rast.getStanje());
		
	}
}

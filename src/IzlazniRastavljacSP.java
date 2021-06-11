
public class IzlazniRastavljacSP extends RastavljacSP{
	
	IzlazniRastavljacSP(String ID) {
		super(ID);
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("unchecked")
	public void uklop(IzlazniRastavljacSP rast) {
		
		rast.setStanje("ON");
		StartScr.signali.add(getID() + ": " + rast.getStanje());
		
	}
	
	public void isklop(IzlazniRastavljacSP rast) {
		
		rast.setStanje("OFF");
		StartScr.signali.remove(getID() + ": " + rast.getStanje());
		
	}
}

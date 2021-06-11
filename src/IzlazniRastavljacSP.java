
public class IzlazniRastavljacSP extends RastavljacSP{
	
	IzlazniRastavljacSP(String ID) {
		super(ID);
		// TODO Auto-generated constructor stub
	}

	public void uklop(IzlazniRastavljacSP rast) {
		
		rast.setStanje("ON");
		
	}
	
	public void isklop(IzlazniRastavljacSP rast) {
		
		rast.setStanje("OFF");
		
	}
}

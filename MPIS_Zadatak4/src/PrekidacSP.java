
public class PrekidacSP extends SpojnoPolje{
	private final String ID;
	public String stanje;
	public boolean upravljanje;
	
	public void uklop(PrekidacSP prek) {
		
		prek.stanje = "on";
		
	}
	
	public void isklop(PrekidacSP prek) {
		
		prek.stanje = "off";
		
	}
	
	public String provjera_stanja() {
		return "";
	}
	
	public PrekidacSP(String ID){
		this.ID = ID;
	}
}

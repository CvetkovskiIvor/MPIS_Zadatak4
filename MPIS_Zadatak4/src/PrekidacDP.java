
public class PrekidacDP extends DalekovodnoPolje{
	private final String ID;
	public String stanje;
	public boolean upravljanje;
	
	public void uklop(PrekidacDP prek) {
		
		prek.stanje = "on";
		
	}
	
	public void isklop(PrekidacDP prek) {
		
		prek.stanje = "off";
		
	}
	
	public String provjera_stanja() {
		return "";
	}
	
	public PrekidacDP(String ID){
		this.ID = ID;
	}
}

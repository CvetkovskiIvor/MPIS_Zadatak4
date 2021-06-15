import java.util.ArrayList;

public class Napajanje {
	private final String ID;
	private String stanje;
	
	ArrayList<String> napajanjeSignali = new ArrayList<String>();
	
	public Napajanje(String ID) {
		
		this.ID = ID;
		setStanje("ON");
		//StartScr.signali.add(ID + this.getStanje());
		napajanjeSignali.add(ID + ": " + getStanje());
		
	}
	
	public String provjera_stanjaRastavljacDP(Napajanje napajanjeRastavljac) {
		return napajanjeRastavljac.getStanje();
	}
	
	public String provjera_stanjaRastavljacSP(Napajanje napajanjeRastavljac) {
		return napajanjeRastavljac.getStanje();
	}
	
	public String provjera_stanjaAPU(Napajanje napajanjeAPU) {
		return napajanjeAPU.getStanje();
	}
	
	public String provjera_stanjaZastita(Napajanje napajanjeZastita) {
		return napajanjeZastita.getStanje();
	}
	
	public String getStanje() {
		return stanje;
	}

	public void setStanje(String stanje) {
		this.stanje = stanje;
	}

	public String getID() {
		return ID;
	}
	
	
}

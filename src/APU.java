 
public class APU {
	private final String ID;
	private String stanje;
	private boolean APU_ukljucenje;
	private boolean APU_1p;
	private boolean APU_3p;
	private boolean APU_blokada;
	
	SabirnickiRastavljacSP sp = new SabirnickiRastavljacSP(null);
	
	public void ukljuci(PrekidacDP prekidac) {
		
		prekidac.uklop(prekidac);
		
	}
	
	public APU (String ID) {
		this.ID = ID;
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

	public boolean isAPU_ukljucenje() {
		return APU_ukljucenje;
	}

	public void setAPU_ukljucenje(boolean aPU_ukljucenje) {
		APU_ukljucenje = aPU_ukljucenje;
	}

	public boolean isAPU_1p() {
		return APU_1p;
	}

	public void setAPU_1p(boolean aPU_1p) {
		APU_1p = aPU_1p;
	}

	public boolean isAPU_3p() {
		return APU_3p;
	}

	public void setAPU_3p(boolean aPU_3p) {
		APU_3p = aPU_3p;
	}

	public boolean isAPU_blokada() {
		return APU_blokada;
	}

	public void setAPU_blokada(boolean aPU_blokada) {
		APU_blokada = aPU_blokada;
	}
}

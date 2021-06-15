import java.util.ArrayList;

public class SpojnoPolje {
	
	private boolean SF6_N2_ulje_blokada  = false;
	private boolean gubitak_N2_blokada  = false;
	private boolean	gubitak_SF6_upozorenje  = false;
	private boolean gubitak_SF6_blokada  = false;
	private boolean nesklad_polova_3P_isklop  = false;
	private boolean gubitak_N2_upozorenje  = false;
	private boolean gubitak_ulje_blokadaUklop  = false;
	private boolean APU_blokada  = false;
	private boolean gubitak_ulje_blokada  = false;
	private boolean grijanje_kvar  = false; 
	
	ArrayList<String> spojnoPoljeSignali = new ArrayList<String>();
	
	SpojnoPolje() {
		
		spojnoPoljeSignali.add("SF6_N2_ulje_blokada: " + Boolean.toString(SF6_N2_ulje_blokada));
		spojnoPoljeSignali.add("gubitak_N2_blokada: " + Boolean.toString(gubitak_N2_blokada));
		spojnoPoljeSignali.add("gubitak_SF6_upozorenje: " + Boolean.toString(gubitak_SF6_upozorenje));
		spojnoPoljeSignali.add("gubitak_SF6_blokada: " + Boolean.toString(gubitak_SF6_blokada));
		spojnoPoljeSignali.add("nesklad_polova_3P_isklop: " + Boolean.toString(nesklad_polova_3P_isklop));
		spojnoPoljeSignali.add("gubitak_N2_upozorenje: " + Boolean.toString(gubitak_N2_upozorenje));
		spojnoPoljeSignali.add("gubitak_ulje_blokadaUklop: " + Boolean.toString(gubitak_ulje_blokadaUklop));
		spojnoPoljeSignali.add("APU_blokada: " + Boolean.toString(APU_blokada));
		spojnoPoljeSignali.add("gubitak_ulje_blokada: " + Boolean.toString(gubitak_ulje_blokada));
		spojnoPoljeSignali.add("grijanje_kvar: " + Boolean.toString(grijanje_kvar));
		
	}
	
	public static void uklop(SabirnickiRastavljacSP rast1, SabirnickiRastavljacSP rast2, PrekidacSP prekidac) {
		///
		/// ukljuciti oba sab. rastavljaca, ukljuciti prekidac
		///
		
		rast1.uklop(rast1, prekidac);
		rast2.uklop(rast2, prekidac);
		prekidac.uklop(prekidac);
		
	}
	
	public static void isklop(SabirnickiRastavljacSP rast1,SabirnickiRastavljacSP rast2, PrekidacSP prekidac){
		///
		/// iskljuciti prekidac, iskljuciti oba sab. rastavljaca
		///
		
		prekidac.isklop(prekidac);
		rast1.isklop(rast1, prekidac);
		rast2.isklop(rast2, prekidac);
		
	}
	
public static boolean provjeri(SpojnoPolje sp, PrekidacSP prekidac, RastavljacUzemljenjaSP rastUz, Napajanje rastNapajanje) {
		
		// provjera napajanja
		
		if(rastNapajanje.provjera_stanjaRastavljacSP(rastNapajanje) == "OFF") {
			
			System.out.println("tu se dogodila greska");
			return false;
			
		}
		
		// provjera sigurne razine plina SF6
		
		
		if(sp.isGubitak_SF6_upozorenje() || sp.isGubitak_SF6_blokada()) {
			
			return false;
			
		}
		
		// provjera daljinskog upravljanja na prekidacu
		
		if(prekidac.getUpravljanje() != "Daljinsko") {
			
			return false;
			
		}
		
		// provjera stanja sklopnih uredaja
		
		if(prekidac.getStanje() == "nepoznato" || rastUz.posaljiZahtjev("Provjeriti stanje rastavljaca")) {
			
			return false;
			
		}
		
		return true;
		
	}
	
	public boolean isGubitak_SF6_upozorenje() {
		return gubitak_SF6_upozorenje;
	}

	public void setGubitak_SF6_upozorenje(boolean gubitak_SF6_upozorenje) {
		this.gubitak_SF6_upozorenje = gubitak_SF6_upozorenje;
	}

	public boolean isGubitak_SF6_blokada() {
		return gubitak_SF6_blokada;
	}

	public void setGubitak_SF6_blokada(boolean gubitak_SF6_blokada) {
		this.gubitak_SF6_blokada = gubitak_SF6_blokada;
	}

	public boolean isSF6_N2_ulje_blokada() {
		return SF6_N2_ulje_blokada;
	}

	public void setSF6_N2_ulje_blokada(boolean sF6_N2_ulje_blokada) {
		SF6_N2_ulje_blokada = sF6_N2_ulje_blokada;
	}

	public boolean isGubitak_N2_blokada() {
		return gubitak_N2_blokada;
	}

	public void setGubitak_N2_blokada(boolean gubitak_N2_blokada) {
		this.gubitak_N2_blokada = gubitak_N2_blokada;
	}

	public boolean isNesklad_polova_3P_isklop() {
		return nesklad_polova_3P_isklop;
	}

	public void setNesklad_polova_3P_isklop(boolean nesklad_polova_3P_isklop) {
		this.nesklad_polova_3P_isklop = nesklad_polova_3P_isklop;
	}

	public boolean isGubitak_N2_upozorenje() {
		return gubitak_N2_upozorenje;
	}

	public void setGubitak_N2_upozorenje(boolean gubitak_N2_upozorenje) {
		this.gubitak_N2_upozorenje = gubitak_N2_upozorenje;
	}

	public boolean isGubitak_ulje_blokadaUklop() {
		return gubitak_ulje_blokadaUklop;
	}

	public void setGubitak_ulje_blokadaUklop(boolean gubitak_ulje_blokadaUklop) {
		this.gubitak_ulje_blokadaUklop = gubitak_ulje_blokadaUklop;
	}

	public boolean isAPU_blokada() {
		return APU_blokada;
	}

	public void setAPU_blokada(boolean aPU_blokada) {
		APU_blokada = aPU_blokada;
	}

	public boolean isGubitak_ulje_blokada() {
		return gubitak_ulje_blokada;
	}

	public void setGubitak_ulje_blokada(boolean gubitak_ulje_blokada) {
		this.gubitak_ulje_blokada = gubitak_ulje_blokada;
	}

	public boolean isGrijanje_kvar() {
		return grijanje_kvar;
	}

	public void setGrijanje_kvar(boolean grijanje_kvar) {
		this.grijanje_kvar = grijanje_kvar;
	}
	
}



public class DalekovodnoPolje {
	
	private boolean SF6_N2_ulje_blokada;
	private boolean gubitak_N2_blokada;
	private boolean	gubitak_SF6_upozorenje;
	private boolean gubitak_SF6_blokada;
	private boolean nesklad_polova_3P_isklop;
	private boolean gubitak_N2_upozorenje;
	private boolean gubitak_ulje_blokadaUklop;
	private boolean APU_blokada;
	private boolean gubitak_ulje_blokada;
	private boolean grijanje_kvar;
	private boolean iskljucenje;
	private boolean stupanj2_iskljucenje;
	private boolean stupanj3_iskljucenje;
	private boolean stupanj4_iskljucenje;
	private boolean njihanje_energije_blokada;
	private boolean TKsignal_iskljucenje;
	private boolean napajanje_nestanak;
	private boolean uredaj_kvar;
	private boolean NPC_iskljucenje;
	private boolean VPC_iskljucenje;
    private boolean zemljospojna_iskljucenje;
    private boolean preopterecenje_upozorenje;
    private boolean preopterecenje_iskljucenje;
    private boolean relej_kvar;
    private boolean alarm;
    
    public static void uklop(RastavljacUzemljenjaDP rastUz, SabirnickiRastavljacDP rast, PrekidacDP prekidac) {
		///
		/// 
		///
    	
    	rastUz.setStanje("off");
    	rast.uklop(rast);
    	
    	// TODO linijski rastavljac
		
    	prekidac.uklop(prekidac);
		
	}
	
	public static void isklop(RastavljacUzemljenjaDP rastUz, SabirnickiRastavljacDP rast, PrekidacDP prekidac){
		///
		/// 
		///
		
		prekidac.isklop(prekidac);
		
		// TODO linijski rastavljac
		
		rast.isklop(rast);
		rastUz.setStanje("on");
		
	}
	
	public static boolean provjeri(DalekovodnoPolje dp, Zastita zastita, PrekidacDP prekidac, SabirnickiRastavljacDP rast, Napajanje rastUzNapajanje, Napajanje rastNapajanje, Napajanje prekidacNapajanje) {
		
		//provjera zastite
		
		if(zastita.getStanje() == "prorada") {
			return false;
		}
		
		//provjera napajanja
		
		if(rastUzNapajanje.getStanje() == "OFF"  || rastNapajanje.getStanje() == "OFF" || prekidacNapajanje.getStanje() == "OFF") {
			
			System.out.println("tu se dogodila greska");
			return false;
		}
		
		//provjera sigurne razine plina SF6
		
		
		if(dp.isGubitak_SF6_upozorenje() || dp.isGubitak_SF6_blokada()) {
			return false;
		}
		
		//provjera stanja sklopnih uredaja
		
		if(prekidac.getStanje() == "nepoznato" || rast.getStanje() == "nepoznato") {
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
	
}

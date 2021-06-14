import java.util.ArrayList;

public class DalekovodnoPolje{
	
	private boolean SF6_N2_ulje_blokada = false;
	private boolean gubitak_N2_blokada = false;
	private boolean	gubitak_SF6_upozorenje = false;
	private boolean gubitak_SF6_blokada = false;
	private boolean nesklad_polova_3P_isklop = false;
	private boolean gubitak_N2_upozorenje = false;
	private boolean gubitak_ulje_blokadaUklop = false;
	private boolean APU_blokada = false;
	private boolean gubitak_ulje_blokada = false;
	private boolean grijanje_kvar = false;
	private boolean iskljucenje = false;
	private boolean stupanj2_iskljucenje = false;
	private boolean stupanj3_iskljucenje = false;
	private boolean stupanj4_iskljucenje = false;
	private boolean njihanje_energije_blokada = false;
	private boolean TKsignal_iskljucenje = false;
	private boolean napajanje_nestanak = false;
	private boolean uredaj_kvar = false;
	private boolean NPC_iskljucenje = false;
	private boolean VPC_iskljucenje = false;
    private boolean zemljospojna_iskljucenje = false;
    private boolean preopterecenje_upozorenje = false;
    private boolean preopterecenje_iskljucenje = false;
    private boolean relej_kvar = false;
    private boolean alarm = false;
    
    ArrayList<String> dalekovodnoPoljeSignali = new ArrayList<String>();
    
    public DalekovodnoPolje(){
    	
    	dalekovodnoPoljeSignali.add(Boolean.toString(SF6_N2_ulje_blokada));
    	dalekovodnoPoljeSignali.add(Boolean.toString(gubitak_N2_blokada));
    	dalekovodnoPoljeSignali.add(Boolean.toString(gubitak_SF6_upozorenje));
    	dalekovodnoPoljeSignali.add(Boolean.toString(gubitak_SF6_blokada));
    	dalekovodnoPoljeSignali.add(Boolean.toString(nesklad_polova_3P_isklop));
    	dalekovodnoPoljeSignali.add(Boolean.toString(gubitak_N2_upozorenje));
    	dalekovodnoPoljeSignali.add(Boolean.toString(gubitak_ulje_blokadaUklop));
    	dalekovodnoPoljeSignali.add(Boolean.toString(APU_blokada));
    	dalekovodnoPoljeSignali.add(Boolean.toString(gubitak_ulje_blokada));
    	dalekovodnoPoljeSignali.add(Boolean.toString(grijanje_kvar));
    	dalekovodnoPoljeSignali.add(Boolean.toString(iskljucenje));
    	dalekovodnoPoljeSignali.add(Boolean.toString(stupanj2_iskljucenje));
    	dalekovodnoPoljeSignali.add(Boolean.toString(stupanj3_iskljucenje));
    	dalekovodnoPoljeSignali.add(Boolean.toString(stupanj4_iskljucenje));
    	dalekovodnoPoljeSignali.add(Boolean.toString(njihanje_energije_blokada));
    	dalekovodnoPoljeSignali.add(Boolean.toString(TKsignal_iskljucenje));
    	dalekovodnoPoljeSignali.add(Boolean.toString(napajanje_nestanak));
    	dalekovodnoPoljeSignali.add(Boolean.toString(uredaj_kvar));
    	dalekovodnoPoljeSignali.add(Boolean.toString(NPC_iskljucenje));
    	dalekovodnoPoljeSignali.add(Boolean.toString(VPC_iskljucenje));
    	dalekovodnoPoljeSignali.add(Boolean.toString(zemljospojna_iskljucenje));
    	dalekovodnoPoljeSignali.add(Boolean.toString(preopterecenje_upozorenje));
    	dalekovodnoPoljeSignali.add(Boolean.toString(preopterecenje_iskljucenje));
    	dalekovodnoPoljeSignali.add(Boolean.toString(relej_kvar));
    	dalekovodnoPoljeSignali.add(Boolean.toString(alarm));
    	
    	
    }
    
    public static void uklop(RastavljacUzemljenjaDP rastUz, SabirnickiRastavljacDP rast, IzlazniRastavljacDP rastIz, PrekidacDP prekidac) {
		
    	rastUz.posaljiZahtjev("Promijeniti stanje u OFF");
    	rast.uklop(rast);
    	rastIz.uklop(rastIz);
    	prekidac.uklop(prekidac);
    	
		
	}
	
	public static void isklop(RastavljacUzemljenjaDP rastUz, SabirnickiRastavljacDP rast, IzlazniRastavljacDP rastIz, PrekidacDP prekidac){
		
		prekidac.isklop(prekidac);
		rastIz.isklop(rastIz);
		rast.isklop(rast);
		rastUz.posaljiZahtjev("Promijeniti stanje u ON");
		
	}
	
	public static boolean provjeri(DalekovodnoPolje dp, Zastita zastita, PrekidacDP prekidac, RastavljacUzemljenjaDP rastUz, Napajanje rastNapajanje) {
		
		// provjera zastite
		
		if(zastita.getStanje() == "prorada") {
			
			return false;
			
		}
		
		// provjera napajanja
		
		if(rastNapajanje.provjera_stanjaRastavljacDP(rastNapajanje) == "OFF") {
			
			return false;
			
		}
		
		// provjera sigurne razine plina SF6
		
		if(dp.isGubitak_SF6_upozorenje() || dp.isGubitak_SF6_blokada()) {
			
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
	
	/*public static boolean provjeriRastS1(SabirnickiRastavljacDP rastS1, Napajanje napajanjeRastS1) {
		
		if(rastS1.getStanje() == "nepoznato") {
			return false;
		}
		
		if(napajanjeRastS1.getStanje() == "OFF") {
			return false;
		}
		
		return true;
	}
	
	public static boolean provjeriRastS2(SabirnickiRastavljacDP rastS2, Napajanje napajanjeRastS2) {
		
		if(rastS2.getStanje() == "nepoznato") {
			return false;
		}
		
		if(napajanjeRastS2.getStanje() == "OFF") {
			return false;
		}
		
		return true;
	}*/
	
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

	public boolean isIskljucenje() {
		return iskljucenje;
	}

	public void setIskljucenje(boolean iskljucenje) {
		this.iskljucenje = iskljucenje;
	}

	public boolean isStupanj2_iskljucenje() {
		return stupanj2_iskljucenje;
	}

	public void setStupanj2_iskljucenje(boolean stupanj2_iskljucenje) {
		this.stupanj2_iskljucenje = stupanj2_iskljucenje;
	}

	public boolean isStupanj3_iskljucenje() {
		return stupanj3_iskljucenje;
	}

	public void setStupanj3_iskljucenje(boolean stupanj3_iskljucenje) {
		this.stupanj3_iskljucenje = stupanj3_iskljucenje;
	}

	public boolean isStupanj4_iskljucenje() {
		return stupanj4_iskljucenje;
	}

	public void setStupanj4_iskljucenje(boolean stupanj4_iskljucenje) {
		this.stupanj4_iskljucenje = stupanj4_iskljucenje;
	}

	public boolean isNjihanje_energije_blokada() {
		return njihanje_energije_blokada;
	}

	public void setNjihanje_energije_blokada(boolean njihanje_energije_blokada) {
		this.njihanje_energije_blokada = njihanje_energije_blokada;
	}

	public boolean isTKsignal_iskljucenje() {
		return TKsignal_iskljucenje;
	}

	public void setTKsignal_iskljucenje(boolean tKsignal_iskljucenje) {
		TKsignal_iskljucenje = tKsignal_iskljucenje;
	}

	public boolean isNapajanje_nestanak() {
		return napajanje_nestanak;
	}

	public void setNapajanje_nestanak(boolean napajanje_nestanak) {
		this.napajanje_nestanak = napajanje_nestanak;
	}

	public boolean isUredaj_kvar() {
		return uredaj_kvar;
	}

	public void setUredaj_kvar(boolean uredaj_kvar) {
		this.uredaj_kvar = uredaj_kvar;
	}

	public boolean isNPC_iskljucenje() {
		return NPC_iskljucenje;
	}

	public void setNPC_iskljucenje(boolean nPC_iskljucenje) {
		NPC_iskljucenje = nPC_iskljucenje;
	}

	public boolean isVPC_iskljucenje() {
		return VPC_iskljucenje;
	}

	public void setVPC_iskljucenje(boolean vPC_iskljucenje) {
		VPC_iskljucenje = vPC_iskljucenje;
	}

	public boolean isZemljospojna_iskljucenje() {
		return zemljospojna_iskljucenje;
	}

	public void setZemljospojna_iskljucenje(boolean zemljospojna_iskljucenje) {
		this.zemljospojna_iskljucenje = zemljospojna_iskljucenje;
	}

	public boolean isPreopterecenje_upozorenje() {
		return preopterecenje_upozorenje;
	}

	public void setPreopterecenje_upozorenje(boolean preopterecenje_upozorenje) {
		this.preopterecenje_upozorenje = preopterecenje_upozorenje;
	}

	public boolean isPreopterecenje_iskljucenje() {
		return preopterecenje_iskljucenje;
	}

	public void setPreopterecenje_iskljucenje(boolean preopterecenje_iskljucenje) {
		this.preopterecenje_iskljucenje = preopterecenje_iskljucenje;
	}

	public boolean isRelej_kvar() {
		return relej_kvar;
	}

	public void setRelej_kvar(boolean relej_kvar) {
		this.relej_kvar = relej_kvar;
	}

	public boolean isAlarm() {
		return alarm;
	}

	public void setAlarm(boolean alarm) {
		this.alarm = alarm;
	}
	
}

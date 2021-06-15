import java.util.ArrayList;

public class DalekovodnoPolje{
	
	// prekidac
	static	private boolean SF6_N2_ulje_blokada = false;
	static	private boolean gubitak_N2_blokada = false;
	static	private boolean	gubitak_SF6_upozorenje = false;
	static	private boolean gubitak_SF6_blokada = false;
	static	private boolean nesklad_polova_3P_isklop = false;
	static	private boolean gubitak_N2_upozorenje = false;
	static	private boolean gubitak_ulje_blokadaUklop = false;
	static	private boolean APU_blokada = false;
	static	private boolean gubitak_ulje_blokada = false;
	static	private boolean grijanje_kvar = false;
	
	// distantna zastita
	static	private boolean iskljucenje = false;
	static	private boolean stupanj2_iskljucenje = false;
	static	private boolean stupanj3_iskljucenje = false;
	static	private boolean stupanj4_iskljucenje = false;
	static	private boolean njihanje_energije_blokada = false;
	static	private boolean TKsignal_iskljucenje = false;
	static	private boolean napajanje_nestanak = false;
	static	private boolean uredaj_kvar = false;
	
	// nadstrujna zastita
	static	private boolean NPC_iskljucenje = false;
	static	private boolean VPC_iskljucenje = false;
	static  private boolean zemljospojna_iskljucenje = false;
	static  private boolean preopterecenje_upozorenje = false;
	static  private boolean preopterecenje_iskljucenje = false;
	static  private boolean relej_kvar = false;
    
    private boolean alarm = false;
    
    ArrayList<String> dalekovodnoPoljeSignali = new ArrayList<String>();
    
    public DalekovodnoPolje(){
    	
    	dalekovodnoPoljeSignali.add("SF6_N2_ulje_blokada: " + Boolean.toString(SF6_N2_ulje_blokada));
    	dalekovodnoPoljeSignali.add("gubitak_N2_blokada: " + Boolean.toString(gubitak_N2_blokada));
    	dalekovodnoPoljeSignali.add("gubitak_SF6_upozorenje: " + Boolean.toString(gubitak_SF6_upozorenje));
    	dalekovodnoPoljeSignali.add("gubitak_SF6_blokada: " + Boolean.toString(gubitak_SF6_blokada));
    	dalekovodnoPoljeSignali.add("nesklad_polova_3P_isklop: " + Boolean.toString(nesklad_polova_3P_isklop));
    	dalekovodnoPoljeSignali.add("gubitak_N2_upozorenje: " + Boolean.toString(gubitak_N2_upozorenje));
    	dalekovodnoPoljeSignali.add("gubitak_ulje_blokadaUklop: " + Boolean.toString(gubitak_ulje_blokadaUklop));
    	dalekovodnoPoljeSignali.add("APU_blokada: " + Boolean.toString(APU_blokada));
    	dalekovodnoPoljeSignali.add("gubitak_ulje_blokada: " + Boolean.toString(gubitak_ulje_blokada));
    	dalekovodnoPoljeSignali.add("grijanje_kvar: " + Boolean.toString(grijanje_kvar));
    	dalekovodnoPoljeSignali.add("iskljucenje: " + Boolean.toString(iskljucenje));
    	dalekovodnoPoljeSignali.add("stupanj2_iskljucenje: " + Boolean.toString(stupanj2_iskljucenje));
    	dalekovodnoPoljeSignali.add("stupanj3_iskljucenje: " + Boolean.toString(stupanj3_iskljucenje));
    	dalekovodnoPoljeSignali.add("stupanj4_iskljucenje: " + Boolean.toString(stupanj4_iskljucenje));
    	dalekovodnoPoljeSignali.add("njihanje_energije_blokada: " + Boolean.toString(njihanje_energije_blokada));
    	dalekovodnoPoljeSignali.add("TKsignal_iskljucenje: " + Boolean.toString(TKsignal_iskljucenje));
    	dalekovodnoPoljeSignali.add("napajanje_nestanak: " + Boolean.toString(napajanje_nestanak));
    	dalekovodnoPoljeSignali.add("uredaj_kvar: " + Boolean.toString(uredaj_kvar));
    	dalekovodnoPoljeSignali.add("NPC_iskljucenje: " + Boolean.toString(NPC_iskljucenje));
    	dalekovodnoPoljeSignali.add("VPC_iskljucenje: " + Boolean.toString(VPC_iskljucenje));
    	dalekovodnoPoljeSignali.add("zemljospojna_iskljucenje: " + Boolean.toString(zemljospojna_iskljucenje));
    	dalekovodnoPoljeSignali.add("preopterecenje_upozorenje: " + Boolean.toString(preopterecenje_upozorenje));
    	dalekovodnoPoljeSignali.add("preopterecenje_iskljucenje: " + Boolean.toString(preopterecenje_iskljucenje));
    	dalekovodnoPoljeSignali.add("relej_kvar: " + Boolean.toString(relej_kvar));
    	dalekovodnoPoljeSignali.add("alarm: " + Boolean.toString(alarm));
    		
    }
    
    public static void uklop(RastavljacUzemljenjaDP rastUz, SabirnickiRastavljacDP rast, IzlazniRastavljacDP rastIz, PrekidacDP prekidac) {
		
    	rastUz.posaljiZahtjev("Promijeniti stanje u OFF");
    	rast.uklop(rast, prekidac);
    	rastIz.uklop(rastIz);
    	prekidac.uklop(prekidac);
    	
		
	}
	
	public static void isklop(RastavljacUzemljenjaDP rastUz, SabirnickiRastavljacDP rast, IzlazniRastavljacDP rastIz, PrekidacDP prekidac){
		
		prekidac.isklop(prekidac);
		rastIz.isklop(rastIz);
		rast.isklop(rast, prekidac);
		rastUz.posaljiZahtjev("Promijeniti stanje u ON");
		
	}
	
	public static boolean provjeri(DalekovodnoPolje dp, DistantnaZastita zastita, PrekidacDP prekidac, RastavljacUzemljenjaDP rastUz, Napajanje rastNapajanje) {
		
		// provjera lokalnih varijabli distantne zastite
		
		if(zastita.isFaza_L1_poticaj() == true || zastita.isFaza_L2_poticaj() == true || zastita.isZemljospoj_poticaj() == true) {
			
			
			return false;
			
		}
		
		// provjera grupnih varijabli distantne zastite
		
		if(iskljucenje == true || stupanj2_iskljucenje == true || stupanj3_iskljucenje == true || stupanj4_iskljucenje == true || njihanje_energije_blokada == true || TKsignal_iskljucenje == true || napajanje_nestanak == true || uredaj_kvar == true) {
			
			return false;
			
		}
		
		// provjera grupnih varijabli nadstrujne zastite
		
		if(NPC_iskljucenje == true || VPC_iskljucenje == true || zemljospojna_iskljucenje == true || preopterecenje_upozorenje == true || preopterecenje_iskljucenje == true || relej_kvar == true) {
			
			return false;
			
		}
		
		// provjera napajanja
		
		if(rastNapajanje.provjera_stanjaRastavljacDP(rastNapajanje) == "OFF") {
			
			return false;
			
		}
		
		// provjera sigurne razine plina SF6
		
		if(gubitak_N2_upozorenje || gubitak_SF6_blokada) {
			
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

}

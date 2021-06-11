
public class SpojnoPolje {
	
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
	
	public static void uklop(SabirnickiRastavljacSP rast1, SabirnickiRastavljacSP rast2, PrekidacSP prekidac) {
		///
		/// ukljuciti oba sab. rastavljaca, ukljuciti prekidac
		///
		
		rast1.uklop(rast1);
		rast2.uklop(rast2);
		prekidac.uklop(prekidac);
		
	}
	
	public static void isklop(SabirnickiRastavljacSP rast1,SabirnickiRastavljacSP rast2, PrekidacSP prekidac){
		///
		/// iskljuciti prekidac, iskljuciti oba sab. rastavljaca
		///
		
		prekidac.isklop(prekidac);
		rast1.isklop(rast1);
		rast2.isklop(rast2);
		
	}
	
public static boolean provjeri(SpojnoPolje sp, PrekidacSP prekidac, RastavljacUzemljenjaSP rastUz, Napajanje rastNapajanje, Napajanje prekidacNapajanje) {
		
		// provjera napajanja
		
		if(rastNapajanje.provjera_stanjaRastavljacSP(rastNapajanje) == "OFF"  || prekidacNapajanje.provjera_stanjaPrekidacSP(prekidacNapajanje) == "OFF") {
			
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
		
		if(prekidac.getStanje() == "nepoznato" || rastUz.getStanje() == "nepoznato") {
			
			return false;
			
		}
		
		return true;
		
	}
	
	/*public static boolean provjeriRastS1(SabirnickiRastavljacSP rastS1, Napajanje napajanjeRastS1) {
		
		if(rastS1.getStanje() == "nepoznato") {
			return false;
		}
		
		if(napajanjeRastS1.getStanje() == "OFF") {
			return false;
		}
		
		return true;
	}
	
	public static boolean provjeriRastS2(SabirnickiRastavljacSP rastS2, Napajanje napajanjeRastS2) {
		
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
	
}
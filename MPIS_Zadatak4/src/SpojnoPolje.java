
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
	
	public static void uklop(SabirnickiRastavljacSP rast1,SabirnickiRastavljacSP rast2, PrekidacSP prekidac) {
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
	
	public static boolean provjeri() {
	
		return false;
		
	}
	
}

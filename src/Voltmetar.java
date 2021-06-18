
public class Voltmetar extends Mjerenje{
	
	private float napon;
	
	public Voltmetar(String ID) {
		super(ID);
	}

	public float getNapon() {
		return napon;
	}

	public void setNapon(float napon) {
		this.napon = napon;
	}

	
}

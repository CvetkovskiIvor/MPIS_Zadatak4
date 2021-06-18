
public class Watmetar extends Mjerenje{
	
	private float radna_snaga;
	
	public Watmetar(String ID) {
		super(ID);
	}

	public float getRadna_snaga() {
		return radna_snaga;
	}

	public void setRadna_snaga(float radna_snaga) {
		this.radna_snaga = radna_snaga;
	}

}

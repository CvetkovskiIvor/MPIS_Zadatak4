import java.util.ArrayList;

public class Brojilo extends Mjerenje{
	
	private boolean alarm = false;
	private float radna_energija;
	
	ArrayList<String> brojiloSignali = new ArrayList<String>();
	
	public Brojilo(String ID) {
		super(ID);
		
		brojiloSignali.add("alarm brojila: " + Boolean.toString(alarm));
		
	}

	public boolean isAlarm() {
		return alarm;
	}

	public void setAlarm(boolean alarm) {
		this.alarm = alarm;
	}

	public float getRadna_energija() {
		return radna_energija;
	}

	public void setRadna_energija(float radna_energija) {
		this.radna_energija = radna_energija;
	}
	
}

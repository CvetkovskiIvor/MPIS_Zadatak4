import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UredajiScr extends StartScr implements ActionListener{
	
	static JFrame frame = new JFrame("Uredaji");
	
	public static void uredajiScr() {
		
		JPanel panel = new JPanel();

		frame.setSize(400, 200);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.add(panel);

		panel.setLayout(null);

		JLabel uredaji = new JLabel("Polje");
		uredaji.setBounds(188, 20, 80, 25);

		panel.add(uredaji);

		frame.setVisible(true);
		
	}
	
	public static boolean vidljivost() {

		return frame.isShowing();

	}
	
	
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand() == "") {
			
			prekidacSP.uklop(prekidacSP);
			
		}
		
		if(e.getActionCommand() == "") {
			
			prekidacSP.isklop(prekidacSP);
			
		}

		if(e.getActionCommand() == "") {
			
			prekidacDP.uklop(prekidacDP);
			
		}
		
		if(e.getActionCommand() == "") {
			
			prekidacDP.isklop(prekidacDP);
			
		}

		if(e.getActionCommand() == "") {
	
			izlazniRastavljacDP.uklop(izlazniRastavljacDP);
	
		}

		if(e.getActionCommand() == "") {
	
			izlazniRastavljacDP.isklop(izlazniRastavljacDP);
	
		}

		if(e.getActionCommand() == "") {
	
			izlazniRastavljacSP.uklop(izlazniRastavljacSP);
	
		}

		if(e.getActionCommand() == "") {
	
			izlazniRastavljacSP.isklop(izlazniRastavljacSP);
	
		}
		
		if(e.getActionCommand() == "") {
			
			sabirnickiRastavljacDPS1.uklop(sabirnickiRastavljacDPS1, prekidacDP);
	
		}

		if(e.getActionCommand() == "") {
	
			sabirnickiRastavljacDPS1.isklop(sabirnickiRastavljacDPS1, prekidacDP);
	
		}

		if(e.getActionCommand() == "") {
	
			sabirnickiRastavljacDPS2.uklop(sabirnickiRastavljacDPS2, prekidacDP);
	
		}

		if(e.getActionCommand() == "") {
	
			sabirnickiRastavljacDPS2.isklop(sabirnickiRastavljacDPS2, prekidacDP);
	
		}
		
		if(e.getActionCommand() == "") {
			
			sabirnickiRastavljacSPS1.uklop(sabirnickiRastavljacSPS1, prekidacSP);
	
		}

		if(e.getActionCommand() == "") {
	
			sabirnickiRastavljacSPS1.isklop(sabirnickiRastavljacSPS1, prekidacSP);
	
		}

		if(e.getActionCommand() == "") {
	
			sabirnickiRastavljacSPS2.uklop(sabirnickiRastavljacSPS2, prekidacSP);
	
		}

		if(e.getActionCommand() == "") {
	
			sabirnickiRastavljacSPS2.isklop(sabirnickiRastavljacSPS2, prekidacSP);
	
		}
		
	}
	
}

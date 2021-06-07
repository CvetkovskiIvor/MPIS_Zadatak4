import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SpojnoScr extends StartScr implements ActionListener{
	
	JFrame frame = new JFrame("Spojno");
	
	public void spojnoScr() {
		
		JPanel panel = new JPanel();
		
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		panel.setLayout(null);
		
		JLabel iskljuciLbl = new JLabel("iskljuci");
		iskljuciLbl.setBounds(10, 20, 80, 25);
		panel.add(iskljuciLbl);
		
		JLabel ukljuciLbl = new JLabel("ukljuci");
		ukljuciLbl.setBounds(10, 60, 80, 25);
		panel.add(ukljuciLbl);
		
		JButton IskljuciBtn = new JButton("Iskljuci polje");
		IskljuciBtn.setBounds(100, 20, 80, 25);
		IskljuciBtn.setSize(125, 30);
		IskljuciBtn.addActionListener(new SpojnoScr());
		panel.add(IskljuciBtn);
		
		JButton UkljuciBtn = new JButton("Ukljuci polje");
		UkljuciBtn.setBounds(100, 60, 80, 25);
		UkljuciBtn.setSize(125, 30);
		UkljuciBtn.addActionListener(new SpojnoScr());
		panel.add(UkljuciBtn);
		
		frame.setVisible(true);
		
	}
	
	public boolean vidljivost() {
		
		return frame.isShowing();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getActionCommand() == "Iskljuci polje") {
			
			System.out.println("Polje se iskljucuje");
			SpojnoPolje.isklop(sabirnickiRastavljacSPS1, sabirnickiRastavljacSPS2, prekidacSP);
			//System.out.println(sabirnickiRastavljac.stanje);
		}
		
		if (e.getActionCommand() == "Ukljuci polje") {
			
			System.out.println("Polje se ukljucuje");
			SpojnoPolje.uklop(sabirnickiRastavljacSPS1, sabirnickiRastavljacSPS2, prekidacSP);
			//System.out.println(sabirnickiRastavljac.stanje);
		}
	}
}

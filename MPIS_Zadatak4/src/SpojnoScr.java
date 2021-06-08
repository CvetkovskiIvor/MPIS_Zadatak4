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
		
		frame.setSize(400, 200);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.add(panel);
		
		panel.setLayout(null);
		
		JLabel iskljuciLbl = new JLabel("Polje");
		iskljuciLbl.setBounds(188, 20, 80, 25);
		
		panel.add(iskljuciLbl);
		
		/*JLabel ukljuciLbl = new JLabel("ukljuci");
		ukljuciLbl.setBounds(10, 60, 80, 25);
		panel.add(ukljuciLbl); */
		
		JButton IskljuciBtn = new JButton("Iskljuci polje");
		IskljuciBtn.setBounds(55, 70, 80, 25);
		IskljuciBtn.setSize(125, 30);
		IskljuciBtn.addActionListener(new SpojnoScr());
		panel.add(IskljuciBtn);
		
		JButton UkljuciBtn = new JButton("Ukljuci polje");
		UkljuciBtn.setBounds(220, 70, 80, 25);
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
			
			if(SpojnoPolje.provjeri(sp, prekidacSP, rastavljacUzemljenjaSP, napajanjeRastavljacSP, napajanjePrekidacSP)) {
				
				System.out.println("Polje se iskljucuje");
				SpojnoPolje.isklop(sabirnickiRastavljacSPS1, sabirnickiRastavljacSPS2, prekidacSP);
				//System.out.println(sabirnickiRastavljac.stanje);
				
			}else
				
				System.out.println("ups");
			
		}
		
		if (e.getActionCommand() == "Ukljuci polje") {
			
			if(SpojnoPolje.provjeri(sp, prekidacSP, rastavljacUzemljenjaSP, napajanjeRastavljacSP, napajanjePrekidacSP)) {
				
				System.out.println("Polje se ukljucuje");
				SpojnoPolje.uklop(sabirnickiRastavljacSPS1, sabirnickiRastavljacSPS2, prekidacSP);
				//System.out.println(sabirnickiRastavljac.stanje);
				
			}else 
				
				System.out.println("ups");
			
		}
	}
}

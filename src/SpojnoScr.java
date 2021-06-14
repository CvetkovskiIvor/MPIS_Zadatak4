import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SpojnoScr extends StartScr implements ActionListener{
	
	static JFrame frame = new JFrame("Spojno");
	
	static ArrayList<String> spojnoSignali = new ArrayList<String>();
	
	public static void spojnoScr() {
		
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
		IskljuciBtn.addActionListener(spoj);
		panel.add(IskljuciBtn);
		
		JButton UkljuciBtn = new JButton("Ukljuci polje");
		UkljuciBtn.setBounds(220, 70, 80, 25);
		UkljuciBtn.setSize(125, 30);
		UkljuciBtn.addActionListener(spoj);
		panel.add(UkljuciBtn);
		
		frame.setVisible(true);
		
		
	}
	
	public static boolean vidljivost() {
		
		return frame.isShowing();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
//		if (e.getActionCommand() == "Iskljuci") {
//			
//			
//			if(SpojnoPolje.provjeri(sp, prekidacSP, rastavljacUzemljenjaSP, napajanjeRastavljacSP)) {
//				
//				System.out.println("Polje se iskljucuje");
//				
//				//System.out.println(sabirnickiRastavljacSPS1.getStanje());
//				
//				signal = sabirnickiRastavljacSPS1.getID() + ": " + sabirnickiRastavljacSPS1.getStanje();
//				
//				System.out.println(signal);
//				
//				StartScr.signali.remove(signal);
//				SpojnoScr.spojnoSignali.remove(sabirnickiRastavljacSPS1.getID() + ": " + "ON");
//				
//				SpojnoPolje.isklop(sabirnickiRastavljacSPS1, sabirnickiRastavljacSPS2, prekidacSP);
//				
//			}else
//				
//				System.out.println("ups");
//			
//		}
//		
//		if (e.getActionCommand() == "Ukljuci") {
//			
//			if(SpojnoPolje.provjeri(sp, prekidacSP, rastavljacUzemljenjaSP, napajanjeRastavljacSP)) {
//				
//				System.out.println("Polje se ukljucuje");
//				SpojnoPolje.uklop(sabirnickiRastavljacSPS1, sabirnickiRastavljacSPS2, prekidacSP);
//				//System.out.println(sabirnickiRastavljacSPS1.getStanje());
//				
//
//				
//				
//			}else 
//				
//				System.out.println("ups");
//			
//		}
	}
	
	/*public void initialise() {
		
		SpojnoPolje.isklop(sabirnickiRastavljacSPS1, sabirnickiRastavljacSPS2, prekidacSP);
		
	}*/
}

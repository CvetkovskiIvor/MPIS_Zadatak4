import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DalekovodnoScr extends StartScr implements ActionListener{
	
	JFrame frame = new JFrame("Dalekovodno");
	
	public void dalekovodnoScr() {
		
		JPanel panel = new JPanel();
		
		frame.setSize(800, 300);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.add(panel);
		
		panel.setLayout(null);
		
		JLabel dalekovodnoLbl = new JLabel("S1");
		dalekovodnoLbl.setBounds(250, 20, 80, 25);
		panel.add(dalekovodnoLbl);
		
		JLabel spojnoLbl = new JLabel("S2");
		spojnoLbl.setBounds(550, 20, 80, 25);
		panel.add(spojnoLbl);
		
		
		JButton iskljuciS1Btn = new JButton("Iskljuci S1");
		iskljuciS1Btn.setBounds(195, 80, 80, 25);
		iskljuciS1Btn.setSize(125, 30);
		iskljuciS1Btn.addActionListener(new DalekovodnoScr());
		panel.add(iskljuciS1Btn);
		
		JButton iskljuciS2Btn = new JButton("Iskljuci S2");
		iskljuciS2Btn.setBounds(495, 80, 80, 25);
		iskljuciS2Btn.setSize(125, 30);
		iskljuciS2Btn.addActionListener(new DalekovodnoScr());
		panel.add(iskljuciS2Btn);
		
		JButton ukljuciS1Btn = new JButton("Ukljuci S1");
		ukljuciS1Btn.setBounds(195, 130, 80, 25);
		ukljuciS1Btn.setSize(125, 30);
		ukljuciS1Btn.addActionListener(new DalekovodnoScr());
		panel.add(ukljuciS1Btn);
		
		JButton ukljuciS2Btn = new JButton("Ukljuci S2");
		ukljuciS2Btn.setBounds(495, 130, 80, 25);
		ukljuciS2Btn.setSize(125, 30);
		ukljuciS2Btn.addActionListener(new DalekovodnoScr());
		panel.add(ukljuciS2Btn);
		
		JButton prespojiS1Btn = new JButton("Prespoji S1");
		prespojiS1Btn.setBounds(195, 180, 80, 25);
		prespojiS1Btn.setSize(125, 30);
		prespojiS1Btn.addActionListener(new DalekovodnoScr());
		panel.add(prespojiS1Btn);
		
		JButton prespojiS2Btn = new JButton("Prespoji S2");
		prespojiS2Btn.setBounds(495, 180, 80, 25);
		prespojiS2Btn.setSize(125, 30);
		prespojiS2Btn.addActionListener(new DalekovodnoScr());
		panel.add(prespojiS2Btn);
		
		frame.setVisible(true);
	}
	
	public boolean vidljivost() {
		
		return frame.isShowing();
	}
	
	public void actionPerformed(ActionEvent e) {
		
		// prespoji
		
		if (e.getActionCommand() == "Iskljuci sa S1") {
			
			//napajanjeRastavljacUzemljenjaDP.setStanje("OFF");
			//napajanjeSabirnickiRastavljacDPS1.setStanje("OFF");
			
			if(DalekovodnoPolje.provjeri(dp, distantnaZastita, prekidacDP, rastavljacUzemljenjaDP, napajanjeRastavljacDP, napajanjePrekidacDP)) {
				
				System.out.println("Polje se iskljucuje");
				DalekovodnoPolje.isklop(rastavljacUzemljenjaDP, sabirnickiRastavljacDPS1, prekidacDP);
				//System.out.println(sabirnickiRastavljac.stanje);
				//System.out.println(sabirnickiRastavljacDPS1.getStanje());
			
			}else
				
				System.out.println("dogodila se greska");
			
		}
		
		if (e.getActionCommand() == "Iskljuci sa S2") {
			
			if(DalekovodnoPolje.provjeri(dp, distantnaZastita, prekidacDP, rastavljacUzemljenjaDP, napajanjeRastavljacDP, napajanjePrekidacDP)) {
				
				System.out.println("Polje se iskljucuje");
				DalekovodnoPolje.isklop(rastavljacUzemljenjaDP, sabirnickiRastavljacDPS2, prekidacDP);
				//System.out.println(sabirnickiRastavljac.stanje + sabirnickiRastavljac.sabirnica);
				System.out.println(sabirnickiRastavljacDPS2.getStanje());
			
			}else
				
				System.out.println("dogodila se greska");
		}
		
		if (e.getActionCommand() == "Ukljuci na S1") {
			
			if(DalekovodnoPolje.provjeri(dp, distantnaZastita, prekidacDP, rastavljacUzemljenjaDP, napajanjeRastavljacDP, napajanjePrekidacDP)) {
				
				System.out.println("Polje se iskljucuje");
				DalekovodnoPolje.uklop(rastavljacUzemljenjaDP, sabirnickiRastavljacDPS1, prekidacDP);
				System.out.println(sabirnickiRastavljacDPS1.getStanje());
			
			}else
				
				System.out.println("dogodila se greska");
		}
		
		if (e.getActionCommand() == "Ukljuci na S2") {
			
			if(DalekovodnoPolje.provjeri(dp, distantnaZastita, prekidacDP, rastavljacUzemljenjaDP, napajanjeRastavljacDP, napajanjePrekidacDP)) {
				System.out.println("Polje se iskljucuje");
				DalekovodnoPolje.uklop(rastavljacUzemljenjaDP, sabirnickiRastavljacDPS2, prekidacDP);
				System.out.println(sabirnickiRastavljacDPS2.getStanje());
			
			}else
				
				System.out.println("dogodila se greska");
		}
		
		if (e.getActionCommand() == "Prespoji na S1") {
			
			if(DalekovodnoPolje.provjeri(dp, distantnaZastita, prekidacDP, rastavljacUzemljenjaDP, napajanjeRastavljacDP, napajanjePrekidacDP)) {
				
				System.out.println("Polje se prespaja na S1");
				
				SpojnoPolje.uklop(sabirnickiRastavljacSPS1, sabirnickiRastavljacSPS2, prekidacSP);
				
				DalekovodnoPolje.uklop(rastavljacUzemljenjaDP, sabirnickiRastavljacDPS1, prekidacDP);
				DalekovodnoPolje.isklop(rastavljacUzemljenjaDP, sabirnickiRastavljacDPS2, prekidacDP);
				
				SpojnoPolje.isklop(sabirnickiRastavljacSPS1, sabirnickiRastavljacSPS2, prekidacSP);
			
			}else
				
				System.out.println("dogodila se greska");
		}
		
		if (e.getActionCommand() == "Prespoji na S2") {
			
			if(DalekovodnoPolje.provjeri(dp, distantnaZastita, prekidacDP, rastavljacUzemljenjaDP, napajanjeRastavljacDP, napajanjePrekidacDP)) {
				
				System.out.println("Polje se prespaja na S2");
				
				SpojnoPolje.uklop(sabirnickiRastavljacSPS1, sabirnickiRastavljacSPS2, prekidacSP);
				
				DalekovodnoPolje.uklop(rastavljacUzemljenjaDP, sabirnickiRastavljacDPS2, prekidacDP);
				DalekovodnoPolje.isklop(rastavljacUzemljenjaDP, sabirnickiRastavljacDPS1, prekidacDP);
				
				SpojnoPolje.isklop(sabirnickiRastavljacSPS1, sabirnickiRastavljacSPS2, prekidacSP);
			
			}else
				
				System.out.println("dogodila se greska");
			
		}
		
	}

}

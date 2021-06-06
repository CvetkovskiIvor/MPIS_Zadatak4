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
		
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		panel.setLayout(null);
		
		JLabel dalekovodnoLbl = new JLabel("iskljuci");
		dalekovodnoLbl.setBounds(10, 20, 80, 25);
		panel.add(dalekovodnoLbl);
		
		JLabel spojnoLbl = new JLabel("ukljuci");
		spojnoLbl.setBounds(10, 60, 80, 25);
		panel.add(spojnoLbl);
		
		JButton iskljuciS1Btn = new JButton("Iskljuci sa S1");
		iskljuciS1Btn.setBounds(100, 20, 80, 25);
		iskljuciS1Btn.setSize(125, 30);
		iskljuciS1Btn.addActionListener(new DalekovodnoScr());
		panel.add(iskljuciS1Btn);
		
		JButton iskljuciS2Btn = new JButton("Iskljuci sa S2");
		iskljuciS2Btn.setBounds(100, 60, 80, 25);
		iskljuciS2Btn.setSize(125, 30);
		iskljuciS2Btn.addActionListener(new DalekovodnoScr());
		panel.add(iskljuciS2Btn);
		
		JButton ukljuciS1Btn = new JButton("Ukljuci na S1");
		ukljuciS1Btn.setBounds(100, 100, 80, 25);
		ukljuciS1Btn.setSize(125, 30);
		ukljuciS1Btn.addActionListener(new DalekovodnoScr());
		panel.add(ukljuciS1Btn);
		
		JButton ukljuciS2Btn = new JButton("Ukljuci na S2");
		ukljuciS2Btn.setBounds(100, 140, 80, 25);
		ukljuciS2Btn.setSize(125, 30);
		ukljuciS2Btn.addActionListener(new DalekovodnoScr());
		panel.add(ukljuciS2Btn);
		
		JButton prespojiS1Btn = new JButton("Prespoji na S1");
		prespojiS1Btn.setBounds(100, 180, 80, 25);
		prespojiS1Btn.setSize(125, 30);
		prespojiS1Btn.addActionListener(new DalekovodnoScr());
		panel.add(prespojiS1Btn);
		
		JButton prespojiS2Btn = new JButton("Prespoji na S2");
		prespojiS2Btn.setBounds(100, 220, 80, 25);
		prespojiS2Btn.setSize(125, 30);
		prespojiS2Btn.addActionListener(new DalekovodnoScr());
		panel.add(prespojiS2Btn);
		
		
		
		frame.setVisible(true);
	}
	
	public boolean vidljivost() {
		
		return frame.isShowing();
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		//prespoji
		
		if (e.getActionCommand() == "Iskljuci sa S1") {
			
			//napajanjeRastavljacUzemljenjaDP.setStanje("OFF");
			//napajanjeSabirnickiRastavljacDPS1.setStanje("OFF");
			
			if(DalekovodnoPolje.provjeri(dp, distantnaZastita, prekidacDP, sabirnickiRastavljacDPS1, napajanjeRastavljacUzemljenjaDP, napajanjeSabirnickiRastavljacDPS1, napajanjePrekidacDP)) {
				System.out.println("Polje se iskljucuje");
				DalekovodnoPolje.isklop(rastavljacUzemljenjaDP, sabirnickiRastavljacDPS1, prekidacDP);
				//System.out.println(sabirnickiRastavljac.stanje);
				//System.out.println(sabirnickiRastavljacDPS1.getStanje());
			}else
				System.out.println("dogodila se greska");
			
			
		}
		
		if (e.getActionCommand() == "Iskljuci sa S2") {
			
			if(DalekovodnoPolje.provjeri(dp, distantnaZastita, prekidacDP, sabirnickiRastavljacDPS2, napajanjeRastavljacUzemljenjaDP, napajanjeSabirnickiRastavljacDPS1, napajanjePrekidacDP)) {
				System.out.println("Polje se iskljucuje");
				DalekovodnoPolje.isklop(rastavljacUzemljenjaDP, sabirnickiRastavljacDPS2, prekidacDP);
				//System.out.println(sabirnickiRastavljac.stanje + sabirnickiRastavljac.sabirnica);
				System.out.println(sabirnickiRastavljacDPS2.getStanje());
			}else
				System.out.println("dogodila se greska");
		}
		
		if (e.getActionCommand() == "Ukljuci na S1") {
			
			if(DalekovodnoPolje.provjeri(dp, distantnaZastita, prekidacDP, sabirnickiRastavljacDPS1, napajanjeRastavljacUzemljenjaDP, napajanjeSabirnickiRastavljacDPS1, napajanjePrekidacDP)) {
				System.out.println("Polje se iskljucuje");
				DalekovodnoPolje.uklop(rastavljacUzemljenjaDP, sabirnickiRastavljacDPS1, prekidacDP);
				System.out.println(sabirnickiRastavljacDPS1.getStanje());
			}else
				System.out.println("dogodila se greska");
		}
		
		if (e.getActionCommand() == "Ukljuci na S2") {
			
			if(DalekovodnoPolje.provjeri(dp, distantnaZastita, prekidacDP, sabirnickiRastavljacDPS2, napajanjeRastavljacUzemljenjaDP, napajanjeSabirnickiRastavljacDPS1, napajanjePrekidacDP)) {
				System.out.println("Polje se iskljucuje");
				DalekovodnoPolje.uklop(rastavljacUzemljenjaDP, sabirnickiRastavljacDPS2, prekidacDP);
				System.out.println(sabirnickiRastavljacDPS2.getStanje());
			}else
				System.out.println("dogodila se greska");
		}
		
		if (e.getActionCommand() == "Prespoji na S1") {
			
			if(DalekovodnoPolje.provjeri(dp, distantnaZastita, prekidacDP, sabirnickiRastavljacDPS1, napajanjeRastavljacUzemljenjaDP, napajanjeSabirnickiRastavljacDPS1, napajanjePrekidacDP)) {
				System.out.println("Polje se prespaja na S1");
				
				SpojnoPolje.uklop(sabirnickiRastavljacSPS1, sabirnickiRastavljacSPS2, prekidacSP);
				
				DalekovodnoPolje.uklop(rastavljacUzemljenjaDP, sabirnickiRastavljacDPS1, prekidacDP);
				DalekovodnoPolje.isklop(rastavljacUzemljenjaDP, sabirnickiRastavljacDPS2, prekidacDP);
				
				SpojnoPolje.isklop(sabirnickiRastavljacSPS1, sabirnickiRastavljacSPS2, prekidacSP);
			}else
				System.out.println("dogodila se greska");
		}
		
		if (e.getActionCommand() == "Prespoji na S2") {
			
			if(DalekovodnoPolje.provjeri(dp, distantnaZastita, prekidacDP, sabirnickiRastavljacDPS1, napajanjeRastavljacUzemljenjaDP, napajanjeSabirnickiRastavljacDPS1, napajanjePrekidacDP)) {
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

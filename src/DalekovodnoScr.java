import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class DalekovodnoScr extends StartScr implements ActionListener{
	
	static JFrame frame = new JFrame("Dalekovodno");
	
	static ArrayList<String> dalekovodnoSignali = new ArrayList<String>();
	
	static JTextArea text2 = new JTextArea();
	
	static JLabel sab1 = new JLabel();
	static JLabel sab2 = new JLabel();
	
	static JLabel pow1 = new JLabel();
	static JLabel pow2 = new JLabel();
	
	public static void dalekovodnoScr() {
		
		JPanel panel = new JPanel();
		
		frame.setSize(1500, 1000);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.add(panel);
		
		panel.setLayout(null);
		
		//text2.setBounds(50, 530, 700, 200);
		text2.setLineWrap(true);
		text2.setWrapStyleWord(true);
		text2.setEditable(false);
		text2.setVisible(true);
		
		
		JScrollPane scroll = new JScrollPane(text2);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroll.setBounds(750, 730, 700, 200);
		panel.add(scroll);
		
		sab1.setBounds(100, 50, 1300, 16);
		//dlkhor.setForeground(Color.blue);
		sab1.setBackground(Color.blue);
		sab1.setOpaque(true);
		panel.add(sab1);


		sab2.setBounds(100, 100, 1300, 16);
		//spjhor.setForeground(Color.blue);
		sab2.setBackground(Color.green);
		sab2.setOpaque(true);
		panel.add(sab2);
		
		JLabel sys1 = new JLabel("Sabirnica I");
		sys1.setBounds(30, 45, 80, 25);
		panel.add(sys1);

		JLabel sys2 = new JLabel("Sabirnica II");
		sys2.setBounds(30, 95, 80, 25);
		panel.add(sys2);

		pow1.setText("0 kV");
		pow1.setBounds(1370, 30, 80, 25);
		pow1.setForeground(Color.blue);
		//powoff.setBackground(Color.black);
		pow1.setOpaque(true);
		panel.add(pow1);

		pow2.setText("220 kV");
		pow2.setBounds(1360, 80, 80, 25);
		pow2.setForeground(Color.green);
		//powon.setBackground(Color.black);
		pow2.setOpaque(true);
		panel.add(pow2);
		
		
		
		
		
		
		frame.setVisible(true);
		
	}
	
	public static boolean vidljivost() {
		
		return frame.isShowing();
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		/*if (e.getActionCommand() == "Iskljuci S1") {
			
			//napajanjeRastavljacUzemljenjaDP.setStanje("OFF");
			//napajanjeSabirnickiRastavljacDPS1.setStanje("OFF");
			
			//iskljuciS1();
			
			if(DalekovodnoPolje.provjeri(dp, distantnaZastita, prekidacDP, rastavljacUzemljenjaDP, napajanjeRastavljacDP)) {
				
				System.out.println("Polje se iskljucuje");
				DalekovodnoPolje.isklop(rastavljacUzemljenjaDP, sabirnickiRastavljacDPS1, izlazniRastavljacDP, prekidacDP);
				//System.out.println(sabirnickiRastavljac.stanje);
				//System.out.println(sabirnickiRastavljacDPS1.getStanje());
				
				System.out.println("Globalno stanje rastavljaca " + sabirnickiRastavljacDPS1.getStanje());
			
			}else
				
				System.out.println("dogodila se greska");
			
		}
		
		if (e.getActionCommand() == "Iskljuci S2") {
			
			if(DalekovodnoPolje.provjeri(dp, distantnaZastita, prekidacDP, rastavljacUzemljenjaDP, napajanjeRastavljacDP)) {
				
				System.out.println("Polje se iskljucuje");
				DalekovodnoPolje.isklop(rastavljacUzemljenjaDP, sabirnickiRastavljacDPS2, izlazniRastavljacDP, prekidacDP);
				//System.out.println(sabirnickiRastavljac.stanje + sabirnickiRastavljac.sabirnica);
				System.out.println(sabirnickiRastavljacDPS2.getStanje());
				
			
			}else
				
				System.out.println("dogodila se greska");
		}
		
		if (e.getActionCommand() == "Ukljuci S1") {
			
			if(DalekovodnoPolje.provjeri(dp, distantnaZastita, prekidacDP, rastavljacUzemljenjaDP, napajanjeRastavljacDP)) {
				
				System.out.println("Polje se ukljucuje");
				DalekovodnoPolje.uklop(rastavljacUzemljenjaDP, sabirnickiRastavljacDPS1, izlazniRastavljacDP, prekidacDP);
				System.out.println("Globalno stanje rastavljaca " + sabirnickiRastavljacDPS1.getStanje());
			
			}else
				
				System.out.println("dogodila se greska");
		}
		
		if (e.getActionCommand() == "Ukljuci S2") {
			
			if(DalekovodnoPolje.provjeri(dp, distantnaZastita, prekidacDP, rastavljacUzemljenjaDP, napajanjeRastavljacDP)) {
				System.out.println("Polje se ukljucuje");
				DalekovodnoPolje.uklop(rastavljacUzemljenjaDP, sabirnickiRastavljacDPS2, izlazniRastavljacDP, prekidacDP);
				System.out.println(sabirnickiRastavljacDPS2.getStanje());
			
			}else
				
				System.out.println("dogodila se greska");
		}
		
		if (e.getActionCommand() == "Prespoji S1") {
			
			if(DalekovodnoPolje.provjeri(dp, distantnaZastita, prekidacDP, rastavljacUzemljenjaDP, napajanjeRastavljacDP)) {
				
				System.out.println("Polje se prespaja na S1");
				
				SpojnoPolje.uklop(sabirnickiRastavljacSPS1, sabirnickiRastavljacSPS2, prekidacSP);
				
				DalekovodnoPolje.isklop(rastavljacUzemljenjaDP, sabirnickiRastavljacDPS2, izlazniRastavljacDP, prekidacDP);
				DalekovodnoPolje.uklop(rastavljacUzemljenjaDP, sabirnickiRastavljacDPS1, izlazniRastavljacDP, prekidacDP);
				
				SpojnoPolje.isklop(sabirnickiRastavljacSPS1, sabirnickiRastavljacSPS2, prekidacSP);
			
			}else
				
				System.out.println("dogodila se greska");
		}
		
		if (e.getActionCommand() == "Prespoji S2") {
			
			if(DalekovodnoPolje.provjeri(dp, distantnaZastita, prekidacDP, rastavljacUzemljenjaDP, napajanjeRastavljacDP)) {
				
				System.out.println("Polje se prespaja na S2");
				
				SpojnoPolje.uklop(sabirnickiRastavljacSPS1, sabirnickiRastavljacSPS2, prekidacSP);
				
				DalekovodnoPolje.isklop(rastavljacUzemljenjaDP, sabirnickiRastavljacDPS1, izlazniRastavljacDP, prekidacDP);
				DalekovodnoPolje.uklop(rastavljacUzemljenjaDP, sabirnickiRastavljacDPS2, izlazniRastavljacDP, prekidacDP);
			
				SpojnoPolje.isklop(sabirnickiRastavljacSPS1, sabirnickiRastavljacSPS2, prekidacSP);
			
			}else
				
				System.out.println("dogodila se greska");
			
		}*/
		
	}
	
	/*public void initialise() {
		
		DalekovodnoPolje.uklop(rastavljacUzemljenjaDP, sabirnickiRastavljacDPS1, izlazniRastavljacDP, prekidacDP);
		
		System.out.println(sabirnickiRastavljacDPS1.getStanje());
		
	}*/
	
//	public void iskljuciS1() {
//		//System.out.println("Globalno stanje rastavljaca " + sabirnickiRastavljacDPS1.getStanje());
//		
//		if(DalekovodnoPolje.provjeri(dp, distantnaZastita, prekidacDP, rastavljacUzemljenjaDP, napajanjeRastavljacDP)) {
//			
//			System.out.println("Polje se iskljucuje");
//			DalekovodnoPolje.isklop(rastavljacUzemljenjaDP, sabirnickiRastavljacDPS1, izlazniRastavljacDP, prekidacDP);
//			//System.out.println(sabirnickiRastavljac.stanje);
//			//System.out.println(sabirnickiRastavljacDPS1.getStanje());
//			
//			System.out.println("Globalno stanje rastavljaca " + sabirnickiRastavljacDPS1.getStanje());
//		
//		}else
//			
//			System.out.println("dogodila se greska");
//	}

}

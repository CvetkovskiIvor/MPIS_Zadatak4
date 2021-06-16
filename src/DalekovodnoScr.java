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
	static JLabel koc1 = new JLabel();
	static JLabel koc2 = new JLabel();
	static JLabel koc3 = new JLabel();
	static JLabel koc4 = new JLabel();
	static JLabel vert1 = new JLabel();
	static JLabel vert2 = new JLabel();
	static JLabel vert3 = new JLabel();
	static JLabel vert4 = new JLabel();
	static JLabel vert5 = new JLabel();
	
	static JButton rastavljac1 = new JButton("RastavljacDPS1");
	static JButton rastavljac2 = new JButton("RastavljacDPS2");
	static JButton rastavljacuz = new JButton("Rastavljac uzemljenja");
	static JButton rastavljaciz = new JButton("Izlazni rastavljac");
	static JButton prekidac = new JButton("Prekidac");
	
	public static void dalekovodnoScr() {
		
		JPanel panel = new JPanel();
		
		frame.setSize(1000, 1000);
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
		scroll.setBounds(100, 730, 800, 200);
		panel.add(scroll);
		
		koc1.setBounds(295, 44, 20, 28);
		//dlkhor.setForeground(Color.blue);
		koc1.setBackground(Color.blue);
		koc1.setOpaque(true);
		panel.add(koc1);
		
		koc2.setBounds(100, 50, 800, 16);
		//dlkhor.setForeground(Color.blue);
		koc2.setBackground(Color.blue);
		koc2.setOpaque(true);
		panel.add(koc2);
		
		koc3.setBounds(100, 50, 800, 16);
		//dlkhor.setForeground(Color.blue);
		koc3.setBackground(Color.blue);
		koc3.setOpaque(true);
		panel.add(koc3);
		
		koc4.setBounds(100, 50, 800, 16);
		//dlkhor.setForeground(Color.blue);
		koc4.setBackground(Color.blue);
		koc4.setOpaque(true);
		panel.add(koc4);
		
		vert1.setBounds(100, 50, 800, 16);
		//dlkhor.setForeground(Color.blue);
		vert1.setBackground(Color.blue);
		vert1.setOpaque(true);
		panel.add(vert1);
		
		vert2.setBounds(100, 50, 800, 16);
		//dlkhor.setForeground(Color.blue);
		vert2.setBackground(Color.blue);
		vert2.setOpaque(true);
		panel.add(vert2);
		
		vert3.setBounds(100, 50, 800, 16);
		//dlkhor.setForeground(Color.blue);
		vert3.setBackground(Color.blue);
		vert3.setOpaque(true);
		panel.add(vert3);
		
		vert4.setBounds(100, 50, 800, 16);
		//dlkhor.setForeground(Color.blue);
		vert4.setBackground(Color.blue);
		vert4.setOpaque(true);
		panel.add(vert4);
		
		vert5.setBounds(100, 50, 800, 16);
		//dlkhor.setForeground(Color.blue);
		vert5.setBackground(Color.blue);
		vert5.setOpaque(true);
		panel.add(vert5);
		
		sab1.setBounds(100, 50, 800, 16);
		//dlkhor.setForeground(Color.blue);
		sab1.setBackground(Color.blue);
		sab1.setOpaque(true);
		panel.add(sab1);


		sab2.setBounds(100, 100, 800, 16);
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
		pow1.setBounds(870, 30, 80, 25);
		pow1.setForeground(Color.blue);
		//powoff.setBackground(Color.black);
		pow1.setOpaque(true);
		panel.add(pow1);

		pow2.setText("220 kV");
		pow2.setBounds(860, 80, 80, 25);
		pow2.setForeground(Color.green);
		//powon.setBackground(Color.black);
		pow2.setOpaque(true);
		panel.add(pow2);
		
		prekidac.setBounds(430, 350, 80, 25);
		prekidac.setSize(150, 100);
		prekidac.setForeground(Color.blue);
		prekidac.setBackground(Color.lightGray);
		prekidac.setOpaque(true);
		prekidac.addActionListener(start);
		panel.add(prekidac);

		rastavljac1.setBounds(230, 180, 80, 25);
		rastavljac1.setSize(150, 100);
		rastavljac1.setForeground(Color.green);
		rastavljac1.setBackground(Color.lightGray);
		rastavljac1.setBorderPainted(true);
		rastavljac1.setOpaque(true);
		rastavljac1.addActionListener(start);
		panel.add(rastavljac1);
		
		rastavljac2.setBounds(630, 180, 80, 25);
		rastavljac2.setSize(150, 100);
		rastavljac2.setForeground(Color.green);
		rastavljac2.setBackground(Color.lightGray);
		rastavljac2.setBorderPainted(true);
		rastavljac2.setOpaque(true);
		rastavljac2.addActionListener(start);
		panel.add(rastavljac2);
		
		rastavljaciz.setBounds(430, 500, 80, 25);
		rastavljaciz.setSize(150, 100);
		rastavljaciz.setForeground(Color.green);
		rastavljaciz.setBackground(Color.lightGray);
		rastavljaciz.setBorderPainted(true);
		rastavljaciz.setOpaque(true);
		rastavljaciz.addActionListener(start);
		panel.add(rastavljaciz);
		
		rastavljacuz.setBounds(250, 620, 80, 25);
		rastavljacuz.setSize(150, 100);
		rastavljacuz.setForeground(Color.green);
		rastavljacuz.setBackground(Color.lightGray);
		rastavljacuz.setBorderPainted(true);
		rastavljacuz.setOpaque(true);
		rastavljacuz.addActionListener(start);
		panel.add(rastavljacuz);
		
		
		
		
		
		
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

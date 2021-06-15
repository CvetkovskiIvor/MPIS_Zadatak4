import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

public class StartScr extends Zadatak4 implements ActionListener{
	
	DalekovodnoPolje dp = new DalekovodnoPolje();
	SpojnoPolje sp = new SpojnoPolje();
	
	static ArrayList<String> signali = new ArrayList<String>();
	static ArrayList<String> svi_Signali = new ArrayList<String>();
	
	static ArrayList<String> rastavljacSignali = new ArrayList<String>();
	static ArrayList<String> prekidacSignali = new ArrayList<String>();

	
	APU apu = new APU("APU");
	Brojilo brojilo = new Brojilo("brojilo");
	DistantnaZastita distantnaZastita = new DistantnaZastita("distantna zastita");
	IzlazniRastavljacDP izlazniRastavljacDP = new IzlazniRastavljacDP("izlazni rastavljacDP");
	NadstrujnaZastita nadstrujnaZastita = new NadstrujnaZastita("nadstrujna zastita");
	Napajanje napajanje = new Napajanje("napajanje");
	PrekidacDP prekidacDP = new PrekidacDP("prekidacDP");
	RastavljacUzemljenjaDP rastavljacUzemljenjaDP = new RastavljacUzemljenjaDP("rastavljac uzemljenjaDP");
	SabirnickiRastavljacDP sabirnickiRastavljacDPS1 = new SabirnickiRastavljacDP("sabirnicki rastavljac DPS1");
	SabirnickiRastavljacDP sabirnickiRastavljacDPS2 = new SabirnickiRastavljacDP("sabirnicki rastavljac DPS2");
	Voltmetar voltmetar = new Voltmetar("voltmetar");
	Watmetar watmetar = new Watmetar("watmetar");
	
	IzlazniRastavljacSP izlazniRastavljacSP = new IzlazniRastavljacSP("izlazni rastavljacSP");
	PrekidacSP prekidacSP = new PrekidacSP("prekidacSP");
	RastavljacUzemljenjaSP rastavljacUzemljenjaSP = new RastavljacUzemljenjaSP("rastavljac uzemljenjaSP");
	SabirnickiRastavljacSP sabirnickiRastavljacSPS1 = new SabirnickiRastavljacSP("sabirnicki rastavljac SPS1");
	SabirnickiRastavljacSP sabirnickiRastavljacSPS2 = new SabirnickiRastavljacSP("sabirnicki rastavljac SPS2");
	
	Napajanje napajanjeAPU = new Napajanje("napajanje APU");
	Napajanje napajanjeBrojilo = new Napajanje("napajanje brojilo");
	Napajanje napajanjeDistantnaZastita = new Napajanje("napajanje distantna zastita");
	Napajanje napajanjeRastavljacDP = new Napajanje("napajanjerastavljac DP");
	Napajanje napajanjeRastavljacSP = new Napajanje("napajanjerastavljac SP");
	Napajanje napajanjeNadstrujnaZastita = new Napajanje("napajanje nadstrujna zastita");
	Napajanje napajanjeVoltmetar = new Napajanje("napajanje voltmetar");
	Napajanje napajanjeWatmetar = new Napajanje("napajanje watmetar");
	
	JPopupMenu popupD = new JPopupMenu();
	JPopupMenu popupS = new JPopupMenu();
	
	JLabel dlkhor = new JLabel();
	JLabel spjhor = new JLabel();
	JLabel koc1 = new JLabel();
	JLabel koc2 = new JLabel();
	JLabel koc3 = new JLabel();
	JLabel koc4 = new JLabel();
	JLabel vert1 = new JLabel();
	JLabel vert2 = new JLabel();
	JLabel vert3 = new JLabel();
	JLabel vert4 = new JLabel();
	JLabel vert5 = new JLabel();
	JLabel vert6 = new JLabel();
	
	JButton spojnoBtn = new JButton("Spojno");
	JButton dalekovodnoBtn = new JButton("Dalekovodno");
	
	JLabel powoff = new JLabel("0 kV");
	JLabel powon = new JLabel("220 kV");
	
	public void startScr() {
		
		JFrame frame = new JFrame("Start");
		JPanel panel = new JPanel();
		
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		panel.setLayout(null);
		
		dlkhor.setBounds(100, 50, 600, 16);
		dlkhor.setForeground(Color.blue);
		dlkhor.setBackground(Color.blue);
		dlkhor.setOpaque(true);
		panel.add(dlkhor);


		spjhor.setBounds(100, 100, 600, 16);
		spjhor.setForeground(Color.blue);
		spjhor.setBackground(Color.green);
		spjhor.setOpaque(true);
		panel.add(spjhor);

		koc1.setBounds(180, 94, 20, 28);
		koc1.setForeground(Color.blue);
		koc1.setBackground(Color.green);
		koc1.setOpaque(true);
		panel.add(koc1);

		koc2.setBounds(250, 44, 20, 28);
		koc2.setForeground(Color.blue);
		koc2.setBackground(Color.blue);
		koc2.setOpaque(true);
		panel.add(koc2);

		koc3.setBounds(480, 94, 20, 28);
		koc3.setForeground(Color.blue);
		koc3.setBackground(Color.green);
		koc3.setOpaque(true);
		panel.add(koc3);

		koc4.setBounds(550, 44, 20, 28);
		koc4.setForeground(Color.blue);
		koc4.setBackground(Color.blue);
		koc4.setOpaque(true);
		panel.add(koc4);

		vert1.setBounds(188, 94, 4, 180);
		vert1.setForeground(Color.blue);
		vert1.setBackground(Color.green);
		vert1.setOpaque(true);
		panel.add(vert1);

		vert2.setBounds(258, 44, 4, 230);
		vert2.setForeground(Color.blue);
		vert2.setBackground(Color.blue);
		vert2.setOpaque(true);
		panel.add(vert2);

		vert3.setBounds(488, 94, 4, 180);
		vert3.setForeground(Color.blue);
		vert3.setBackground(Color.green);
		vert3.setOpaque(true);
		panel.add(vert3);

		vert4.setBounds(558, 44, 4, 230);
		vert4.setForeground(Color.blue);
		vert4.setBackground(Color.blue);
		vert4.setOpaque(true);
		panel.add(vert4);

		spojnoBtn.setBounds(450, 274, 80, 25);
		spojnoBtn.setSize(150, 100);
		spojnoBtn.setForeground(Color.blue);
		spojnoBtn.setBackground(Color.lightGray);
		spojnoBtn.setOpaque(true);
		spojnoBtn.addActionListener(start);
		panel.add(spojnoBtn);

		dalekovodnoBtn.setBounds(150, 274, 80, 25);
		dalekovodnoBtn.setSize(150, 100);
		dalekovodnoBtn.setForeground(Color.green);
		dalekovodnoBtn.setBackground(Color.lightGray);
		dalekovodnoBtn.setBorderPainted(true);
		dalekovodnoBtn.setOpaque(true);
		dalekovodnoBtn.addActionListener(start);
		panel.add(dalekovodnoBtn);

		vert5.setBounds(225, 274, 4, 230);
		vert5.setForeground(Color.blue);
		vert5.setBackground(Color.green);
		vert5.setOpaque(true);
		panel.add(vert5);

		vert6.setBounds(525, 274, 4, 230);
		vert6.setForeground(Color.blue);
		vert6.setBackground(Color.blue);
		vert6.setOpaque(true);
		panel.add(vert6);

		JLabel sys1 = new JLabel("Sabirnica I");
		sys1.setBounds(30, 45, 80, 25);
		panel.add(sys1);

		JLabel sys2 = new JLabel("Sabirnica II");
		sys2.setBounds(30, 95, 80, 25);
		panel.add(sys2);

		powoff.setBounds(670, 30, 80, 25);
		powoff.setForeground(Color.blue);
		//powoff.setBackground(Color.black);
		powoff.setOpaque(true);
		panel.add(powoff);

		powon.setBounds(660, 80, 80, 25);
		powon.setForeground(Color.green);
		//powon.setBackground(Color.black);
		powon.setOpaque(true);
		panel.add(powon);
		
		JMenuItem uklj = new JMenuItem("Ukljuci");
		JMenuItem isklj = new JMenuItem("Iskljuci");
		uklj.addActionListener(start);
		isklj.addActionListener(start);
		popupS.add(uklj);
	    popupS.add(isklj);
		
	    JMenuItem ukljS1 = new JMenuItem("Ukljuci S1");
	    JMenuItem iskljS1 = new JMenuItem("Iskljuci S1");
	    ukljS1.addActionListener(start);
	    iskljS1.addActionListener(start);
		popupD.add(ukljS1);
	    popupD.add(iskljS1);
	    popupD.addSeparator();
	      
	    JMenuItem ukljS2 = new JMenuItem("Ukljuci S2");
	    JMenuItem iskljS2 = new JMenuItem("Iskljuci S2");
	    ukljS2.addActionListener(start);
	    iskljS2.addActionListener(start);
	    popupD.add(ukljS2);
	    popupD.add(iskljS2);
	    popupD.addSeparator();
	      
	    JMenuItem prespS1 = new JMenuItem("Prespoji S1");
	    JMenuItem prespS2 = new JMenuItem("Prespoji S2");
	    prespS1.addActionListener(start);
	    prespS2.addActionListener(start);
	    popupD.add(prespS1);
	    popupD.add(prespS2);
	      
	    panel.addMouseListener(new MouseAdapter() {
	       public void mouseReleased(MouseEvent me) {
	          showPopup(me); // showPopup() is our own user-defined method
	       }
	    }) ;
	      
	    dalekovodnoBtn.setComponentPopupMenu(popupD);
	    spojnoBtn.setComponentPopupMenu(popupS);
	    
	    
	    
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getActionCommand() == "Dalekovodno") {
			if(DalekovodnoScr.vidljivost() == true) {
				System.out.println("vidljiv sam!");
			}else
				DalekovodnoScr.dalekovodnoScr();
		}
		
		if (e.getActionCommand() == "Spojno") {
			
			/*if(SpojnoScr.vidljivost() == true) {
				System.out.println("vidljiv sam!");
			}else
				SpojnoScr.spojnoScr();*/
			rastavljacSignali.clear();
			rastavljacSignali.addAll(sabirnickiRastavljacDPS1.sabirnickiRastavljacDPSignali);
			rastavljacSignali.addAll(sabirnickiRastavljacDPS2.sabirnickiRastavljacDPSignali);
			rastavljacSignali.addAll(izlazniRastavljacDP.izlazniRastavljacDPSignali);
			rastavljacSignali.addAll(sabirnickiRastavljacSPS1.sabirnickiRastavljacSPSignali);
			rastavljacSignali.addAll(sabirnickiRastavljacSPS2.sabirnickiRastavljacSPSignali);
			rastavljacSignali.addAll(izlazniRastavljacSP.izlazniRastavljacSPSignali);
			
			Collections.sort(rastavljacSignali);
			System.out.println("Signali rastavljaca u svim poljima:\n" + rastavljacSignali + "\n");
			
			prekidacSignali.clear();
			prekidacSignali.addAll(prekidacDP.prekidacDPSignali);
			prekidacSignali.addAll(prekidacSP.prekidacSPSignali);
			
			Collections.sort(prekidacSignali);
			System.out.println("Signali prekidaca u svim poljima:\n" + prekidacSignali + "\n");
			
			// dodavanje svih pripadnih signala u listu signala dalekovodnog polja
			DalekovodnoScr.dalekovodnoSignali.clear();
			DalekovodnoScr.dalekovodnoSignali.addAll(dp.dalekovodnoPoljeSignali);
			DalekovodnoScr.dalekovodnoSignali.addAll(prekidacDP.prekidacDPSignali);
			DalekovodnoScr.dalekovodnoSignali.addAll(sabirnickiRastavljacDPS1.sabirnickiRastavljacDPSignali);
			DalekovodnoScr.dalekovodnoSignali.addAll(sabirnickiRastavljacDPS2.sabirnickiRastavljacDPSignali);
			DalekovodnoScr.dalekovodnoSignali.addAll(izlazniRastavljacDP.izlazniRastavljacDPSignali);
			DalekovodnoScr.dalekovodnoSignali.addAll(distantnaZastita.distantnaZastitaSignali);
			//DalekovodnoScr.dalekovodnoSignali.addAll(apu);
			DalekovodnoScr.dalekovodnoSignali.addAll(brojilo.brojiloSignali);
			
			Collections.sort(DalekovodnoScr.dalekovodnoSignali);
			System.out.println("Signali u dalekovodnom polju:\n" + DalekovodnoScr.dalekovodnoSignali + "\n");
			
			// dodavanje svih pripadnih signala u listu signala spojnog polja
			SpojnoScr.spojnoSignali.clear();
			SpojnoScr.spojnoSignali.addAll(prekidacSP.prekidacSPSignali);
			SpojnoScr.spojnoSignali.addAll(sabirnickiRastavljacSPS1.sabirnickiRastavljacSPSignali);
			SpojnoScr.spojnoSignali.addAll(sabirnickiRastavljacSPS2.sabirnickiRastavljacSPSignali);
			SpojnoScr.spojnoSignali.addAll(izlazniRastavljacSP.izlazniRastavljacSPSignali);
			
			Collections.sort(SpojnoScr.spojnoSignali);
			System.out.println("Signali u spojnom polju:\n" + SpojnoScr.spojnoSignali + "\n");
			
			// dodavanje svih pripadnih signala u listu svih signala
			svi_Signali.clear();
			svi_Signali.addAll(SpojnoScr.spojnoSignali);
			svi_Signali.addAll(DalekovodnoScr.dalekovodnoSignali);
			Collections.sort(svi_Signali);
			System.out.println("Svi signali:\n" + svi_Signali + "\n");
			
			signali.clear();
			for(String s : svi_Signali) {
				if(s.substring(s.length() - 2).equals("ON"))
					signali.add(s);
				
				if(s.substring(s.length() - 4).equals("true"))
					signali.add(s);
			}

			Collections.sort(signali);
			System.out.println("Svi trenutni signali:\n" + signali + "\n");
			
		}
		/*if (e.getActionCommand() == "Lista uredaja") {
			
			
			if(UredajiScr.vidljivost() == true) {
				System.out.println("vidljiv sam!");
			}else
				UredajiScr.uredajiScr();
			
		}*/
		
		if (e.getActionCommand() == "Iskljuci S1") {
			
			if(DalekovodnoPolje.provjeri(dp, distantnaZastita, prekidacDP, rastavljacUzemljenjaDP, napajanjeRastavljacDP)) {
				
				System.out.println("Iskljucujem dalekovodno polje sa S1... ");
				DalekovodnoPolje.isklop(rastavljacUzemljenjaDP, sabirnickiRastavljacDPS1, izlazniRastavljacDP, prekidacDP);
				
			}else
				
				System.out.println("dogodila se greska");
			
		}
		
		if (e.getActionCommand() == "Iskljuci S2") {
			
			if(DalekovodnoPolje.provjeri(dp, distantnaZastita, prekidacDP, rastavljacUzemljenjaDP, napajanjeRastavljacDP)) {
				
				System.out.println("Iskljucujem dalekovodno polje sa S2... ");
				DalekovodnoPolje.isklop(rastavljacUzemljenjaDP, sabirnickiRastavljacDPS2, izlazniRastavljacDP, prekidacDP);
				
			}else
				
				System.out.println("dogodila se greska");
		}
		
		if (e.getActionCommand() == "Ukljuci S1") {
			
			if(DalekovodnoPolje.provjeri(dp, distantnaZastita, prekidacDP, rastavljacUzemljenjaDP, napajanjeRastavljacDP)) {
				
				System.out.println("Ukljucujem dalekovodno polje na S1... ");
				DalekovodnoPolje.uklop(rastavljacUzemljenjaDP, sabirnickiRastavljacDPS1, izlazniRastavljacDP, prekidacDP);
				
			}else
				
				System.out.println("dogodila se greska");
		}
		
		if (e.getActionCommand() == "Ukljuci S2") {
			
			if(DalekovodnoPolje.provjeri(dp, distantnaZastita, prekidacDP, rastavljacUzemljenjaDP, napajanjeRastavljacDP)) {
				System.out.println("Ukljucujem dalekovodno polje na S2... ");
				DalekovodnoPolje.uklop(rastavljacUzemljenjaDP, sabirnickiRastavljacDPS2, izlazniRastavljacDP, prekidacDP);
				
			}else
				
				System.out.println("dogodila se greska");
		}
		
		if (e.getActionCommand() == "Prespoji S1") {
			
			if(DalekovodnoPolje.provjeri(dp, distantnaZastita, prekidacDP, rastavljacUzemljenjaDP, napajanjeRastavljacDP)) {
				
				System.out.println("Polje se prespaja na S1... ");
				
				SpojnoPolje.uklop(sabirnickiRastavljacSPS1, sabirnickiRastavljacSPS2, prekidacSP);
				
				DalekovodnoPolje.isklop(rastavljacUzemljenjaDP, sabirnickiRastavljacDPS2, izlazniRastavljacDP, prekidacDP);
				DalekovodnoPolje.uklop(rastavljacUzemljenjaDP, sabirnickiRastavljacDPS1, izlazniRastavljacDP, prekidacDP);
				
				SpojnoPolje.isklop(sabirnickiRastavljacSPS1, sabirnickiRastavljacSPS2, prekidacSP);
			
			}else
				
				System.out.println("dogodila se greska");
		}
		
		if (e.getActionCommand() == "Prespoji S2") {
			
			if(DalekovodnoPolje.provjeri(dp, distantnaZastita, prekidacDP, rastavljacUzemljenjaDP, napajanjeRastavljacDP)) {
				
				System.out.println("Polje se prespaja na S2... ");
				
				SpojnoPolje.uklop(sabirnickiRastavljacSPS1, sabirnickiRastavljacSPS2, prekidacSP);
				
				DalekovodnoPolje.isklop(rastavljacUzemljenjaDP, sabirnickiRastavljacDPS1, izlazniRastavljacDP, prekidacDP);
				DalekovodnoPolje.uklop(rastavljacUzemljenjaDP, sabirnickiRastavljacDPS2, izlazniRastavljacDP, prekidacDP);
			
				SpojnoPolje.isklop(sabirnickiRastavljacSPS1, sabirnickiRastavljacSPS2, prekidacSP);
			
			}else
				
				System.out.println("dogodila se greska");
			
		}
		
		if (e.getActionCommand() == "Iskljuci") {
			
			
			if(SpojnoPolje.provjeri(sp, prekidacSP, rastavljacUzemljenjaSP, napajanjeRastavljacSP)) {
				
				System.out.println("Iskljucujem spojno polje");
				SpojnoPolje.isklop(sabirnickiRastavljacSPS1, sabirnickiRastavljacSPS2, prekidacSP);
				
			}else
				
				System.out.println("ups");
			
		}
		
		if (e.getActionCommand() == "Ukljuci") {
			
			if(SpojnoPolje.provjeri(sp, prekidacSP, rastavljacUzemljenjaSP, napajanjeRastavljacSP)) {
				
				System.out.println("Ukljucujem spojno polje");
				SpojnoPolje.uklop(sabirnickiRastavljacSPS1, sabirnickiRastavljacSPS2, prekidacSP);
				
			}else 
				
				System.out.println("ups");
			
		}
		
	}
	
	void showPopup(MouseEvent me) {
	      
		if(me.isPopupTrigger()) {
			
	    	  popupD.show(me.getComponent(), me.getX(), me.getY());
		      popupS.show(me.getComponent(), me.getX(), me.getY());
		      
	      }
	      
	   }
	
	public void initialise() {
		
		DalekovodnoPolje.uklop(rastavljacUzemljenjaDP, sabirnickiRastavljacDPS1, izlazniRastavljacDP, prekidacDP);
		SpojnoPolje.isklop(sabirnickiRastavljacSPS1, sabirnickiRastavljacSPS2, prekidacSP);
		
	}
	
}

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
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

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
	
	JLabel sys1 = new JLabel("Sabirnica I");
	JLabel sys2 = new JLabel("Sabirnica II");
	
	JLabel sab1 = new JLabel();
	JLabel sab2 = new JLabel();
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
	
	JTextArea text = new JTextArea();
	
	
	JButton spojnoBtn = new JButton("Spojno");
	JButton dalekovodnoBtn = new JButton("Dalekovodno");
	
	JLabel pow1 = new JLabel();
	JLabel pow2 = new JLabel();
	
	public void startScr() {
		
		JFrame frame = new JFrame("Start");
		JPanel panel = new JPanel();
		
		
		frame.setSize(800, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.setLocationRelativeTo(null);
		
		panel.setLayout(null);
		
		JButton signaliBtn = new JButton("Svi signali");
		signaliBtn.setBounds(300, 520, 80, 25);
		signaliBtn.setSize(190, 30);
		signaliBtn.addActionListener(start);
		panel.add(signaliBtn);
		
		JButton trenutniSignaliBtn = new JButton("Svi trenutni signali");
		trenutniSignaliBtn.setBounds(50, 590, 80, 25);
		trenutniSignaliBtn.setSize(190, 30);
		trenutniSignaliBtn.addActionListener(start);
		panel.add(trenutniSignaliBtn);
		
		JButton prekidacSignaliBtn = new JButton("Svi signali prekidaca");
		prekidacSignaliBtn.setBounds(300, 590, 80, 25);
		prekidacSignaliBtn.setSize(190, 30);
		prekidacSignaliBtn.addActionListener(start);
		panel.add(prekidacSignaliBtn);
		
		JButton rastavljacSignaliBtn = new JButton("Svi signali rastavljaca");
		rastavljacSignaliBtn.setBounds(560, 590, 80, 25);
		rastavljacSignaliBtn.setSize(190, 30);
		rastavljacSignaliBtn.addActionListener(start);
		panel.add(rastavljacSignaliBtn);
		
		
		text.setLineWrap(true);
		text.setWrapStyleWord(true);
		text.setEditable(false);
		text.setVisible(true);
		
		JScrollPane scroll = new JScrollPane(text);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroll.setBounds(50, 630, 700, 200);
		panel.add(scroll);
		
		sab1.setBounds(100, 50, 600, 16);
		sab1.setBackground(Color.green);
		sab1.setOpaque(true);
		panel.add(sab1);

		sab2.setBounds(100, 100, 600, 16);
		sab2.setBackground(Color.blue);
		sab2.setOpaque(true);
		panel.add(sab2);

		koc1.setBounds(180, 94, 20, 28);
		koc1.setBackground(Color.blue);
		koc1.setOpaque(true);
		panel.add(koc1);

		koc2.setBounds(250, 44, 20, 28);
		koc2.setBackground(Color.green);
		koc2.setOpaque(true);
		panel.add(koc2);

		koc3.setBounds(480, 94, 20, 28);
		koc3.setBackground(Color.blue);
		koc3.setOpaque(true);
		panel.add(koc3);

		koc4.setBounds(550, 44, 20, 28);
		koc4.setBackground(Color.green);
		koc4.setOpaque(true);
		panel.add(koc4);

		vert1.setBounds(188, 94, 4, 180);
		vert1.setBackground(Color.blue);
		vert1.setOpaque(true);
		panel.add(vert1);

		vert2.setBounds(258, 44, 4, 230);
		vert2.setBackground(Color.green);
		vert2.setOpaque(true);
		panel.add(vert2);

		vert3.setBounds(488, 94, 4, 180);
		vert3.setBackground(Color.blue);
		vert3.setOpaque(true);
		panel.add(vert3);

		vert4.setBounds(558, 44, 4, 230);
		vert4.setBackground(Color.green);
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

		sys1.setBounds(30, 45, 80, 25);
		panel.add(sys1);

		sys2.setBounds(30, 95, 80, 25);
		panel.add(sys2);

		pow1.setText("220 kV");
		pow1.setBounds(660, 30, 80, 25);
		pow1.setForeground(Color.green);
		pow1.setOpaque(true);
		panel.add(pow1);

		pow2.setText("0 kV");
		pow2.setBounds(670, 80, 80, 25);
		pow2.setForeground(Color.blue);
		pow2.setOpaque(true);
		panel.add(pow2);
		
		JMenuItem uklj = new JMenuItem("Ukljuci");
		JMenuItem isklj = new JMenuItem("Iskljuci");
		uklj.addActionListener(start);
		isklj.addActionListener(start);
		popupS.add(uklj);
	    popupS.add(isklj);
	    popupS.addSeparator();
	    
	    JMenuItem spPrek = new JMenuItem("Izlistaj signale: spojno polje");
	    spPrek.addActionListener(start);
	    popupS.add(spPrek);
		
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
	    popupD.addSeparator();
	    
	    JMenuItem dpPrek = new JMenuItem("Izlistaj signale: dalekovodno polje");
	    dpPrek.addActionListener(start);
	    popupD.add(dpPrek);
	      
	    panel.addMouseListener(new MouseAdapter() {
	       public void mouseReleased(MouseEvent me) {
	          showPopup(me);
	       }
	    }) ;
	      
	    dalekovodnoBtn.setComponentPopupMenu(popupD);
	    spojnoBtn.setComponentPopupMenu(popupS);
	    
	    
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		rastavljacSignali.clear();
		rastavljacSignali.addAll(SabirnickiRastavljacDP.sabirnickiRastavljacDPSignali);
		rastavljacSignali.addAll(IzlazniRastavljacDP.izlazniRastavljacDPSignali);
		rastavljacSignali.addAll(SabirnickiRastavljacSP.sabirnickiRastavljacSPSignali);
		rastavljacSignali.addAll(IzlazniRastavljacSP.izlazniRastavljacSPSignali);
		
		prekidacSignali.clear();
		prekidacSignali.addAll(PrekidacDP.prekidacDPSignali);
		prekidacSignali.addAll(PrekidacSP.prekidacSPSignali);
		
		// dalekovodno
		DalekovodnoScr.dalekovodnoSignali.clear();
		DalekovodnoScr.dalekovodnoSignali.addAll(dp.dalekovodnoPoljeSignali);
		DalekovodnoScr.dalekovodnoSignali.addAll(PrekidacDP.prekidacDPSignali);
		DalekovodnoScr.dalekovodnoSignali.addAll(SabirnickiRastavljacDP.sabirnickiRastavljacDPSignali);
		DalekovodnoScr.dalekovodnoSignali.addAll(IzlazniRastavljacDP.izlazniRastavljacDPSignali);
		DalekovodnoScr.dalekovodnoSignali.addAll(DistantnaZastita.distantnaZastitaSignali);
		DalekovodnoScr.dalekovodnoSignali.addAll(apu.apuSignali);
		DalekovodnoScr.dalekovodnoSignali.addAll(brojilo.brojiloSignali);
		
		// spojno
		SpojnoScr.spojnoSignali.clear();
		SpojnoScr.spojnoSignali.addAll(PrekidacSP.prekidacSPSignali);
		SpojnoScr.spojnoSignali.addAll(SabirnickiRastavljacSP.sabirnickiRastavljacSPSignali);
		SpojnoScr.spojnoSignali.addAll(IzlazniRastavljacSP.izlazniRastavljacSPSignali);
		
		// dodavanje svih pripadnih signala u listu svih signala
		svi_Signali.clear();
		svi_Signali.addAll(SpojnoScr.spojnoSignali);
		svi_Signali.addAll(DalekovodnoScr.dalekovodnoSignali);
		Collections.sort(svi_Signali);
		
		signali.clear();
		for(String s : svi_Signali) {
			if(s.substring(s.length() - 2).equals("ON"))
				signali.add(s);
			
			if(s.substring(s.length() - 4).equals("true"))
				signali.add(s);
		}

		Collections.sort(signali);
		
		if (e.getActionCommand() == "Dalekovodno") {
			if(DalekovodnoScr.vidljivost() == true) {
				text.append("Prozor dalekovodnog polja je vec ukljucen." + "\n");
			}else
				DalekovodnoScr.dalekovodnoScr();
		}
		
		if (e.getActionCommand() == "Spojno") {
			
			if(SpojnoScr.vidljivost() == true) {
				System.out.println("vidljiv sam!");
			}else
				SpojnoScr.spojnoScr();
			
		}
		
		if (e.getActionCommand() == "Iskljuci S1") {
			
			if(DalekovodnoPolje.provjeri(dp, distantnaZastita, prekidacDP, rastavljacUzemljenjaDP, napajanjeRastavljacDP)) {
				
				DalekovodnoScr.sab1.setBackground(Color.blue);
				DalekovodnoScr.pow1.setForeground(Color.blue);
				DalekovodnoScr.pow1.setText("0 kV");
				DalekovodnoScr.pow1.setBounds(870, 30, 80, 25);
				DalekovodnoScr.prekidac.setForeground(Color.blue);
				DalekovodnoScr.rastavljac1.setForeground(Color.blue);
				DalekovodnoScr.rastavljaciz.setForeground(Color.blue);
				DalekovodnoScr.rastavljacuz.setForeground(Color.green);
				DalekovodnoScr.koc1.setBackground(Color.blue);
				DalekovodnoScr.koc3.setBackground(Color.blue);
				DalekovodnoScr.vert1.setBackground(Color.blue);
				DalekovodnoScr.vert3.setBackground(Color.blue);
				DalekovodnoScr.vert4.setBackground(Color.blue);
				DalekovodnoScr.vert5.setBackground(Color.blue);
				sab1.setBackground(Color.blue);
				koc2.setBackground(Color.blue);
				koc4.setBackground(Color.blue);
				vert2.setBackground(Color.blue);
				vert4.setBackground(Color.blue);
				pow1.setText("0 kV");
				pow1.setForeground(Color.blue);
				pow1.setBounds(670, 30, 80, 25);
				
				SpojnoScr.sab1.setBackground(Color.blue);
				SpojnoScr.pow1.setForeground(Color.blue);
				SpojnoScr.pow1.setText("0 kV");
				SpojnoScr.pow1.setBounds(870, 30, 80, 25);
				SpojnoScr.koc1.setBackground(Color.blue);
				
				text.append("Iskljucujem dalekovodno polje sa S1... " + "\n");
				DalekovodnoPolje.isklop(rastavljacUzemljenjaDP, sabirnickiRastavljacDPS1, izlazniRastavljacDP, prekidacDP);
				
			}else
				
				text.append("Dogodila se greska u dalekovodnom polju!" + "\n");
				
		}
		
		if (e.getActionCommand() == "Iskljuci S2") {
			
			
			if(DalekovodnoPolje.provjeri(dp, distantnaZastita, prekidacDP, rastavljacUzemljenjaDP, napajanjeRastavljacDP)) {
				
				DalekovodnoScr.sab2.setBackground(Color.blue);
				DalekovodnoScr.pow2.setForeground(Color.blue);
				DalekovodnoScr.pow2.setText("0 kV");
				DalekovodnoScr.pow2.setBounds(870, 80, 80, 25);
				DalekovodnoScr.prekidac.setForeground(Color.blue);
				DalekovodnoScr.rastavljac2.setForeground(Color.blue);
				DalekovodnoScr.rastavljaciz.setForeground(Color.blue);
				DalekovodnoScr.rastavljacuz.setForeground(Color.green);
				DalekovodnoScr.koc2.setBackground(Color.blue);
				DalekovodnoScr.koc3.setBackground(Color.blue);
				DalekovodnoScr.vert2.setBackground(Color.blue);
				DalekovodnoScr.vert3.setBackground(Color.blue);
				DalekovodnoScr.vert4.setBackground(Color.blue);
				DalekovodnoScr.vert5.setBackground(Color.blue);
				sab2.setBackground(Color.blue);
				koc1.setBackground(Color.blue);
				koc3.setBackground(Color.blue);
				vert1.setBackground(Color.blue);
				vert3.setBackground(Color.blue);
				pow2.setText("0 kV");
				pow2.setForeground(Color.blue);
				pow2.setBounds(670, 80, 80, 25);
				
				SpojnoScr.sab2.setBackground(Color.blue);
				SpojnoScr.pow2.setForeground(Color.blue);
				SpojnoScr.pow2.setText("0 kV");
				SpojnoScr.pow2.setBounds(870, 80, 80, 25);
				SpojnoScr.koc2.setBackground(Color.blue);
				
				text.append("Iskljucujem dalekovodno polje sa S2... " + "\n");
				DalekovodnoPolje.isklop(rastavljacUzemljenjaDP, sabirnickiRastavljacDPS2, izlazniRastavljacDP, prekidacDP);
				
			}else
				
				text.append("Dogodila se greska u dalekovodnom polju!" + "\n");
		}
		
		
		if (e.getActionCommand() == "Ukljuci S1") {
			
			if(DalekovodnoPolje.provjeri(dp, distantnaZastita, prekidacDP, rastavljacUzemljenjaDP, napajanjeRastavljacDP)) {
				
				DalekovodnoScr.sab1.setBackground(Color.green);
				DalekovodnoScr.pow1.setForeground(Color.green);
				DalekovodnoScr.pow1.setText("220 kV");
				DalekovodnoScr.pow1.setBounds(860, 30, 80, 25);
				DalekovodnoScr.prekidac.setForeground(Color.green);
				DalekovodnoScr.rastavljac1.setForeground(Color.green);
				DalekovodnoScr.rastavljaciz.setForeground(Color.green);
				DalekovodnoScr.rastavljacuz.setForeground(Color.blue);
				DalekovodnoScr.koc1.setBackground(Color.green);
				DalekovodnoScr.koc3.setBackground(Color.green);
				DalekovodnoScr.vert1.setBackground(Color.green);
				DalekovodnoScr.vert3.setBackground(Color.green);
				DalekovodnoScr.vert4.setBackground(Color.green);
				DalekovodnoScr.vert5.setBackground(Color.green);
				sab1.setBackground(Color.green);
				koc2.setBackground(Color.green);
				koc4.setBackground(Color.green);
				vert2.setBackground(Color.green);
				vert4.setBackground(Color.green);
				pow1.setText("220 kV");
				pow1.setForeground(Color.green);
				pow1.setBounds(660, 30, 80, 25);
				vert5.setBackground(Color.green);
				dalekovodnoBtn.setForeground(Color.green);
				
				SpojnoScr.sab1.setBackground(Color.green);
				SpojnoScr.pow1.setForeground(Color.green);
				SpojnoScr.pow1.setText("220 kV");
				SpojnoScr.pow1.setBounds(860, 30, 80, 25);
				SpojnoScr.koc1.setBackground(Color.green);
				
				text.append("Ukljucujem dalekovodno polje na S1... " + "\n");
				DalekovodnoPolje.uklop(rastavljacUzemljenjaDP, sabirnickiRastavljacDPS1, izlazniRastavljacDP, prekidacDP);
				
			}else
				
				text.append("Dogodila se greska u dalekovodnom polju!" + "\n");
		}
		
		
		if (e.getActionCommand() == "Ukljuci S2") {
			
			if(DalekovodnoPolje.provjeri(dp, distantnaZastita, prekidacDP, rastavljacUzemljenjaDP, napajanjeRastavljacDP)) {
				
				DalekovodnoScr.sab2.setBackground(Color.green);
				DalekovodnoScr.pow2.setForeground(Color.green);
				DalekovodnoScr.pow2.setText("220 kV");
				DalekovodnoScr.pow2.setBounds(860, 80, 80, 25);
				DalekovodnoScr.prekidac.setForeground(Color.green);
				DalekovodnoScr.rastavljac2.setForeground(Color.green);
				DalekovodnoScr.rastavljaciz.setForeground(Color.green);
				DalekovodnoScr.rastavljacuz.setForeground(Color.blue);
				DalekovodnoScr.koc2.setBackground(Color.green);
				DalekovodnoScr.koc3.setBackground(Color.green);
				DalekovodnoScr.vert2.setBackground(Color.green);
				DalekovodnoScr.vert3.setBackground(Color.green);
				DalekovodnoScr.vert4.setBackground(Color.green);
				DalekovodnoScr.vert5.setBackground(Color.green);
				sab2.setBackground(Color.green);
				koc1.setBackground(Color.green);
				koc3.setBackground(Color.green);
				vert1.setBackground(Color.green);
				vert3.setBackground(Color.green);
				pow2.setText("220 kV");
				pow2.setForeground(Color.green);
				pow2.setBounds(660, 80, 80, 25);
				vert5.setBackground(Color.green);
				dalekovodnoBtn.setForeground(Color.green);
				
				SpojnoScr.sab2.setBackground(Color.green);
				SpojnoScr.pow2.setForeground(Color.green);
				SpojnoScr.pow2.setText("220 kV");
				SpojnoScr.pow2.setBounds(860, 80, 80, 25);
				SpojnoScr.koc2.setBackground(Color.green);
				
				text.append("Ukljucujem dalekovodno polje na S2... " + "\n");
				DalekovodnoPolje.uklop(rastavljacUzemljenjaDP, sabirnickiRastavljacDPS2, izlazniRastavljacDP, prekidacDP);
				
			}else
				
				text.append("Dogodila se greska u dalekovodnom polju!" + "\n");
		}
		
		if (e.getActionCommand() == "Prespoji S1") {
			
			if(DalekovodnoPolje.provjeri(dp, distantnaZastita, prekidacDP, rastavljacUzemljenjaDP, napajanjeRastavljacDP)) {
				
				if(vert2.getBackground() == Color.blue) {
					
					DalekovodnoScr.sab1.setBackground(Color.green);
					DalekovodnoScr.sab2.setBackground(Color.blue);
					DalekovodnoScr.pow1.setForeground(Color.green);
					DalekovodnoScr.pow1.setText("220 kV");
					DalekovodnoScr.pow1.setBounds(860, 30, 80, 25);
					DalekovodnoScr.prekidac.setForeground(Color.green);
					DalekovodnoScr.rastavljac1.setForeground(Color.green);
					DalekovodnoScr.rastavljac2.setForeground(Color.blue);
					DalekovodnoScr.rastavljaciz.setForeground(Color.green);
					DalekovodnoScr.rastavljacuz.setForeground(Color.blue);
					DalekovodnoScr.vert1.setBackground(Color.green);
					DalekovodnoScr.koc1.setBackground(Color.green);
					DalekovodnoScr.vert2.setBackground(Color.blue);
					DalekovodnoScr.koc2.setBackground(Color.blue);
					DalekovodnoScr.pow2.setText("0 kV");
					DalekovodnoScr.pow2.setBounds(870, 80, 80, 25);
					DalekovodnoScr.pow2.setForeground(Color.blue);
					vert1.setBackground(Color.blue);
					sab2.setBackground(Color.blue);
					koc1.setBackground(Color.blue);
					koc3.setBackground(Color.blue);
					vert3.setBackground(Color.blue);
					pow2.setText("0 kV");
					pow2.setForeground(Color.blue);
					pow2.setBounds(670, 80, 80, 25);
					
					SpojnoScr.sab1.setBackground(Color.green);
					SpojnoScr.pow1.setForeground(Color.green);
					SpojnoScr.pow1.setText("220 kV");
					SpojnoScr.pow1.setBounds(860, 30, 80, 25);
					SpojnoScr.koc1.setBackground(Color.green);
					
					SpojnoScr.sab2.setBackground(Color.blue);
					SpojnoScr.pow2.setForeground(Color.blue);
					SpojnoScr.pow2.setText("0 kV");
					SpojnoScr.pow2.setBounds(870, 80, 80, 25);
					SpojnoScr.koc2.setBackground(Color.blue);
					
					vert2.setBackground(Color.green);
					sab1.setBackground(Color.green);
					koc2.setBackground(Color.green);
					koc4.setBackground(Color.green);
					vert4.setBackground(Color.green);
					pow1.setText("220 kV");
					pow1.setForeground(Color.green);
					pow1.setBounds(660, 30, 80, 25);
					
				}
				
				text.append("Polje se prespaja na S1... " + "\n");
				
				SpojnoPolje.uklop(sabirnickiRastavljacSPS1, sabirnickiRastavljacSPS2, prekidacSP);
				
				DalekovodnoPolje.isklop(rastavljacUzemljenjaDP, sabirnickiRastavljacDPS2, izlazniRastavljacDP, prekidacDP);
				DalekovodnoPolje.uklop(rastavljacUzemljenjaDP, sabirnickiRastavljacDPS1, izlazniRastavljacDP, prekidacDP);
				
				SpojnoPolje.isklop(sabirnickiRastavljacSPS1, sabirnickiRastavljacSPS2, prekidacSP);
			
			}else
				
				text.append("Dogodila se greska u dalekovodnom polju!" + "\n");
		}
		
		if (e.getActionCommand() == "Prespoji S2") {
			
			
			
			if(DalekovodnoPolje.provjeri(dp, distantnaZastita, prekidacDP, rastavljacUzemljenjaDP, napajanjeRastavljacDP)) {
				
				if(vert1.getBackground() == Color.blue) {
					DalekovodnoScr.sab1.setBackground(Color.blue);
					DalekovodnoScr.sab2.setBackground(Color.green);
					DalekovodnoScr.pow2.setForeground(Color.green);
					DalekovodnoScr.pow2.setText("220 kV");
					DalekovodnoScr.pow2.setBounds(860, 80, 80, 25);
					DalekovodnoScr.prekidac.setForeground(Color.green);
					DalekovodnoScr.rastavljac1.setForeground(Color.blue);
					DalekovodnoScr.rastavljac2.setForeground(Color.green);
					DalekovodnoScr.rastavljaciz.setForeground(Color.green);
					DalekovodnoScr.rastavljacuz.setForeground(Color.blue);
					DalekovodnoScr.vert2.setBackground(Color.green);
					DalekovodnoScr.koc2.setBackground(Color.green);
					DalekovodnoScr.vert1.setBackground(Color.blue);
					DalekovodnoScr.koc1.setBackground(Color.blue);
					DalekovodnoScr.pow1.setText("0 kV");
					DalekovodnoScr.pow1.setBounds(870, 30, 80, 25);
					DalekovodnoScr.pow1.setForeground(Color.blue);
					
					SpojnoScr.sab1.setBackground(Color.blue);
					SpojnoScr.pow1.setForeground(Color.blue);
					SpojnoScr.pow1.setText("0 kV");
					SpojnoScr.pow1.setBounds(870, 30, 80, 25);
					SpojnoScr.koc1.setBackground(Color.blue);
					
					SpojnoScr.sab2.setBackground(Color.green);
					SpojnoScr.pow2.setForeground(Color.green);
					SpojnoScr.pow2.setText("220 kV");
					SpojnoScr.pow2.setBounds(860, 80, 80, 25);
					SpojnoScr.koc2.setBackground(Color.green);
					
					
					vert2.setBackground(Color.blue);
					sab1.setBackground(Color.blue);
					koc2.setBackground(Color.blue);
					koc4.setBackground(Color.blue);
					vert4.setBackground(Color.blue);
					pow1.setText("0 kV");
					pow1.setForeground(Color.blue);
					pow1.setBounds(670, 30, 80, 25);
					
					vert1.setBackground(Color.green);
					sab2.setBackground(Color.green);
					koc1.setBackground(Color.green);
					koc3.setBackground(Color.green);
					vert3.setBackground(Color.green);
					pow2.setText("220 kV");
					pow2.setForeground(Color.green);
					pow2.setBounds(660, 80, 80, 25);
					
				}
				
				text.append("Polje se prespaja na S2... " + "\n");
				
				SpojnoPolje.uklop(sabirnickiRastavljacSPS1, sabirnickiRastavljacSPS2, prekidacSP);
				
				DalekovodnoPolje.isklop(rastavljacUzemljenjaDP, sabirnickiRastavljacDPS1, izlazniRastavljacDP, prekidacDP);
				DalekovodnoPolje.uklop(rastavljacUzemljenjaDP, sabirnickiRastavljacDPS2, izlazniRastavljacDP, prekidacDP);
			
				SpojnoPolje.isklop(sabirnickiRastavljacSPS1, sabirnickiRastavljacSPS2, prekidacSP);
			
			}else
				
				text.append("Dogodila se greska u dalekovodnom polju!" + "\n");
			
		}
		
		if (e.getActionCommand() == "Izlistaj signale: dalekovodno polje") {
			
			Collections.sort(DalekovodnoScr.dalekovodnoSignali);
			text.append("Signali u dalekovodnom polju:\n" + DalekovodnoScr.dalekovodnoSignali + "\n" + "\n");
			
		}
		
		if (e.getActionCommand() == "Iskljuci") {
			
			
				
			if(SpojnoPolje.provjeri(sp, prekidacSP, rastavljacUzemljenjaSP, napajanjeRastavljacSP)) {
				
				//SpojnoScr.sab1.setBackground(Color.blue);
				//SpojnoScr.sab2.setBackground(Color.blue);
				//SpojnoScr.pow1.setForeground(Color.blue);
				//SpojnoScr.pow1.setText("0 kV");
				//SpojnoScr.pow1.setBounds(870, 30, 80, 25);
				SpojnoScr.prekidac.setForeground(Color.blue);
				SpojnoScr.rastavljac1.setForeground(Color.blue);
				SpojnoScr.rastavljac2.setForeground(Color.blue);
				SpojnoScr.rastavljaciz.setForeground(Color.blue);
				SpojnoScr.rastavljacuz.setForeground(Color.green);
				SpojnoScr.vert1.setBackground(Color.blue);
				SpojnoScr.vert2.setBackground(Color.blue);
				SpojnoScr.vert3.setBackground(Color.blue);
				SpojnoScr.vert4.setBackground(Color.blue);
				SpojnoScr.vert5.setBackground(Color.blue);
				SpojnoScr.koc3.setBackground(Color.blue);
				//SpojnoScr.koc1.setBackground(Color.blue);
				//SpojnoScr.koc2.setBackground(Color.blue);
				//SpojnoScr.pow2.setText("0 kV");
				//SpojnoScr.pow2.setBounds(870, 80, 80, 25);
				//SpojnoScr.pow2.setForeground(Color.blue);
				vert3.setBackground(Color.blue);
				vert4.setBackground(Color.blue);
				
				if(koc3.getBackground() == Color.green) {
					vert3.setBackground(Color.green);
				}
				
				if(koc4.getBackground() == Color.green) {
					vert4.setBackground(Color.green);
				}
				
				if(SpojnoScr.koc1.getBackground() == Color.green) {
					vert4.setBackground(Color.green);
				}
				
				if(SpojnoScr.koc2.getBackground() == Color.green) {
					vert4.setBackground(Color.green);
				}
				
				vert6.setBackground(Color.blue);
				spojnoBtn.setForeground(Color.blue);
				text.append("Iskljucujem spojno polje" + "\n");
				SpojnoPolje.isklop(sabirnickiRastavljacSPS1, sabirnickiRastavljacSPS2, prekidacSP);
				
			}else
				
				text.append("Dogodila se greska u spojnom polju!" + "\n");
			
		}
		
		if (e.getActionCommand() == "Ukljuci") {
			
			
			
			if(SpojnoPolje.provjeri(sp, prekidacSP, rastavljacUzemljenjaSP, napajanjeRastavljacSP)) {
				
				//SpojnoScr.sab1.setBackground(Color.green);
				//SpojnoScr.sab2.setBackground(Color.green);
				//SpojnoScr.pow1.setForeground(Color.green);
				//SpojnoScr.pow1.setText("220 kV");
				//SpojnoScr.pow1.setBounds(860, 30, 80, 25);
				SpojnoScr.prekidac.setForeground(Color.green);
				SpojnoScr.rastavljac1.setForeground(Color.green);
				SpojnoScr.rastavljac2.setForeground(Color.green);
				SpojnoScr.rastavljaciz.setForeground(Color.green);
				SpojnoScr.rastavljacuz.setForeground(Color.blue);
				SpojnoScr.vert1.setBackground(Color.green);
				//SpojnoScr.koc1.setBackground(Color.green);
				SpojnoScr.vert2.setBackground(Color.green);
				SpojnoScr.vert3.setBackground(Color.green);
				SpojnoScr.vert4.setBackground(Color.green);
				SpojnoScr.vert5.setBackground(Color.green);
				SpojnoScr.koc3.setBackground(Color.green);
				//SpojnoScr.koc2.setBackground(Color.green);
				//SpojnoScr.pow2.setText("220 kV");
				//SpojnoScr.pow2.setBounds(860, 80, 80, 25);
				//SpojnoScr.pow2.setForeground(Color.green);
				vert3.setBackground(Color.green);
				vert4.setBackground(Color.green);
				
				vert6.setBackground(Color.green);
				spojnoBtn.setForeground(Color.green);
				text.append("Ukljucujem spojno polje" + "\n");
				SpojnoPolje.uklop(sabirnickiRastavljacSPS1, sabirnickiRastavljacSPS2, prekidacSP);
				
			}else 
				
				text.append("Dogodila se greska u spojnom polju!" + "\n");
			
		}
		
		if (e.getActionCommand() == "Izlistaj signale: spojno polje") {
			
			Collections.sort(SpojnoScr.spojnoSignali);
			text.append("Signali u spojnom polju:\n" + SpojnoScr.spojnoSignali + "\n" + "\n");
			
		}
		
		if (e.getActionCommand() == "Svi signali") {
			
			Collections.sort(SpojnoScr.svi_Signali);
			text.append("Svi signali:\n" + svi_Signali + "\n" + "\n");
			
		}
		
		if (e.getActionCommand() == "Svi trenutni signali") {
			
			Collections.sort(signali);
			text.append("Svi trenutni signali:\n" + signali + "\n" + "\n");
			
		}

		if (e.getActionCommand() == "Svi signali prekidaca") {
	
			Collections.sort(prekidacSignali);
			text.append("Svi signali prekidaca:\n" + prekidacSignali + "\n" + "\n");
	
		}

		if (e.getActionCommand() == "Svi signali rastavljaca") {
	
			Collections.sort(rastavljacSignali);
			text.append("Svi signali rastavljaca:\n" + rastavljacSignali + "\n" + "\n");
	
		}
		
		if (vert1.getBackground() == Color.blue && vert2.getBackground() == Color.blue) {
			dalekovodnoBtn.setForeground(Color.blue);
			vert5.setBackground(Color.blue);
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
		DalekovodnoScr.sab1.setBackground(Color.green);
		DalekovodnoScr.sab2.setBackground(Color.blue);
		DalekovodnoScr.pow1.setForeground(Color.green);
		DalekovodnoScr.pow1.setText("220 kV");
		DalekovodnoScr.pow1.setBounds(860, 30, 80, 25);
		DalekovodnoScr.prekidac.setForeground(Color.green);
		DalekovodnoScr.rastavljac1.setForeground(Color.green);
		DalekovodnoScr.rastavljac2.setForeground(Color.blue);
		DalekovodnoScr.rastavljaciz.setForeground(Color.green);
		DalekovodnoScr.rastavljacuz.setForeground(Color.blue);
		DalekovodnoScr.pow2.setForeground(Color.blue);
		DalekovodnoScr.pow2.setText("0 kV");
		DalekovodnoScr.pow2.setBounds(870, 80, 80, 25);
		DalekovodnoScr.vert1.setBackground(Color.green);
		DalekovodnoScr.koc1.setBackground(Color.green);
		DalekovodnoScr.vert2.setBackground(Color.blue);
		DalekovodnoScr.koc2.setBackground(Color.blue);
		DalekovodnoScr.vert3.setBackground(Color.green);
		DalekovodnoScr.koc3.setBackground(Color.green);
		DalekovodnoScr.vert4.setBackground(Color.green);
		DalekovodnoScr.koc4.setBackground(Color.green);
		DalekovodnoScr.vert5.setBackground(Color.green);
		DalekovodnoScr.vert6.setBackground(Color.green);
		DalekovodnoScr.vert7.setBackground(Color.green);
		
		
		SpojnoPolje.isklop(sabirnickiRastavljacSPS1, sabirnickiRastavljacSPS2, prekidacSP);
		
		SpojnoScr.sab1.setBackground(Color.green);
		SpojnoScr.sab2.setBackground(Color.blue);
		SpojnoScr.pow1.setForeground(Color.green);
		SpojnoScr.pow1.setText("220 kV");
		SpojnoScr.pow1.setBounds(860, 30, 80, 25);
		SpojnoScr.prekidac.setForeground(Color.blue);
		SpojnoScr.rastavljac1.setForeground(Color.blue);
		SpojnoScr.rastavljac2.setForeground(Color.blue);
		SpojnoScr.rastavljaciz.setForeground(Color.blue);
		SpojnoScr.rastavljacuz.setForeground(Color.green);
		SpojnoScr.pow2.setForeground(Color.blue);
		SpojnoScr.pow2.setText("0 kV");
		SpojnoScr.pow2.setBounds(870, 80, 80, 25);
		SpojnoScr.koc1.setBackground(Color.green);
		SpojnoScr.vert6.setBackground(Color.green);
		SpojnoScr.vert7.setBackground(Color.green);
		SpojnoScr.koc4.setBackground(Color.green);
	}
	
}

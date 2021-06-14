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
	
	public void startScr() {
		
		JFrame frame = new JFrame("Start");
		JPanel panel = new JPanel();
		
		frame.setSize(800, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		panel.setLayout(null);
		
		JLabel dalekovodnoLbl = new JLabel("         Polje");
		dalekovodnoLbl.setBounds(360, 50, 80, 25);
		dalekovodnoLbl.setForeground(Color.blue);
		dalekovodnoLbl.setBackground(Color.lightGray);
		dalekovodnoLbl.setOpaque(true);
		panel.add(dalekovodnoLbl);
		
		
		/*JLabel spojnoLbl = new JLabel("Spojno polje");
		spojnoLbl.setBounds(10, 60, 80, 25);
		panel.add(spojnoLbl);
		*/
		
		JLabel uredajiLbl = new JLabel("Uredaji");
		uredajiLbl.setBounds(380, 200, 80, 25);
		panel.add(uredajiLbl);
		
		JButton dalekovodnoBtn = new JButton("Dalekovodno");
		dalekovodnoBtn.setBounds(230, 90, 80, 25);
		dalekovodnoBtn.setSize(150, 30);
		dalekovodnoBtn.addActionListener(start);
		panel.add(dalekovodnoBtn);
		
		JButton spojnoBtn = new JButton("Spojno");
		spojnoBtn.setBounds(420, 90, 80, 25);
		spojnoBtn.setSize(150, 30);
		spojnoBtn.addActionListener(start);
		panel.add(spojnoBtn);
		
		JButton uredajiBtn = new JButton("Lista uredaja");
		uredajiBtn.setBounds(340, 230, 80, 25);
		uredajiBtn.setSize(120, 30);
		uredajiBtn.addActionListener(start);
		
		panel.add(uredajiBtn);
		
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
			
			if(SpojnoScr.vidljivost() == true) {
				System.out.println("vidljiv sam!");
			}else
				SpojnoScr.spojnoScr();
		}
		if (e.getActionCommand() == "Lista uredaja") {
			
			
			Collections.sort(signali);
			System.out.println(signali);
			
			Collections.sort(DalekovodnoScr.dalekovodnoSignali);
			System.out.println(DalekovodnoScr.dalekovodnoSignali);
			
			Collections.sort(SpojnoScr.spojnoSignali);
			System.out.println(SpojnoScr.spojnoSignali);
			
			Collections.sort(svi_Signali);
			System.out.println(svi_Signali);
			
		}
		
		if (e.getActionCommand() == "Iskljuci S1") {
			
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
			
		}
		
		if (e.getActionCommand() == "Iskljuci") {
			
			
			if(SpojnoPolje.provjeri(sp, prekidacSP, rastavljacUzemljenjaSP, napajanjeRastavljacSP)) {
				
				System.out.println("Polje se iskljucuje");
				SpojnoPolje.isklop(sabirnickiRastavljacSPS1, sabirnickiRastavljacSPS2, prekidacSP);
				
			}else
				
				System.out.println("ups");
			
		}
		
		if (e.getActionCommand() == "Ukljuci") {
			
			if(SpojnoPolje.provjeri(sp, prekidacSP, rastavljacUzemljenjaSP, napajanjeRastavljacSP)) {
				
				System.out.println("Polje se ukljucuje");
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
		System.out.println(sabirnickiRastavljacDPS1.getStanje());
		
	}
	
}

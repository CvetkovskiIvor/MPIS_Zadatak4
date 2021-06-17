import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class SpojnoScr extends StartScr implements ActionListener{
	
	static JFrame frame = new JFrame("Spojno");
	
	static JTextArea text3 = new JTextArea();
	
	static JPopupMenu popupS1 = new JPopupMenu();
	static JPopupMenu popupS2 = new JPopupMenu();
	static JPopupMenu popupIz = new JPopupMenu();
	static JPopupMenu popupUz = new JPopupMenu();
	static JPopupMenu popupPrek = new JPopupMenu();
	
	static JButton rastavljac1 = new JButton("RastavljacDPS1");
	static JButton rastavljac2 = new JButton("RastavljacDPS2");
	static JButton rastavljacuz = new JButton("Rastavljac uzemljenja");
	static JButton rastavljaciz = new JButton("Izlazni rastavljac");
	static JButton prekidac = new JButton("Prekidac");
	
	static ArrayList<String> spojnoSignali = new ArrayList<String>();
	
	public static void spojnoScr() {
		
		JPanel panel = new JPanel();
		
		frame.setSize(1000, 1000);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.add(panel);
		
		panel.setLayout(null);
		
		text3.setLineWrap(true);
		text3.setWrapStyleWord(true);
		text3.setEditable(false);
		text3.setVisible(true);
		
		JScrollPane scroll = new JScrollPane(text3);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroll.setBounds(100, 730, 800, 200);
		panel.add(scroll);
		
		prekidac.setBounds(430, 350, 80, 25);
		prekidac.setSize(150, 100);
		//prekidac.setForeground(Color.blue);
		prekidac.setBackground(Color.lightGray);
		prekidac.setOpaque(true);
		panel.add(prekidac);

		rastavljac1.setBounds(230, 180, 80, 25);
		rastavljac1.setSize(150, 100);
		//rastavljac1.setForeground(Color.green);
		rastavljac1.setBackground(Color.lightGray);
		rastavljac1.setBorderPainted(true);
		rastavljac1.setOpaque(true);
		panel.add(rastavljac1);
		
		rastavljac2.setBounds(630, 180, 80, 25);
		rastavljac2.setSize(150, 100);
		//rastavljac2.setForeground(Color.green);
		rastavljac2.setBackground(Color.lightGray);
		rastavljac2.setBorderPainted(true);
		rastavljac2.setOpaque(true);
		panel.add(rastavljac2);
		
		rastavljaciz.setBounds(430, 500, 80, 25);
		rastavljaciz.setSize(150, 100);
		//rastavljaciz.setForeground(Color.green);
		rastavljaciz.setBackground(Color.lightGray);
		rastavljaciz.setBorderPainted(true);
		rastavljaciz.setOpaque(true);
		panel.add(rastavljaciz);
		
		rastavljacuz.setBounds(250, 620, 80, 25);
		rastavljacuz.setSize(150, 100);
		//rastavljacuz.setForeground(Color.green);
		rastavljacuz.setBackground(Color.lightGray);
		rastavljacuz.setBorderPainted(true);
		rastavljacuz.setOpaque(true);
		panel.add(rastavljacuz);
		
		/*JLabel iskljuciLbl = new JLabel("Polje");
		iskljuciLbl.setBounds(188, 20, 80, 25);
		
		panel.add(iskljuciLbl);*/
		
		/*JLabel ukljuciLbl = new JLabel("ukljuci");
		ukljuciLbl.setBounds(10, 60, 80, 25);
		panel.add(ukljuciLbl); */
		
		/*JButton IskljuciBtn = new JButton("Iskljuci polje");
		IskljuciBtn.setBounds(55, 70, 80, 25);
		IskljuciBtn.setSize(125, 30);
		IskljuciBtn.addActionListener(spoj);
		panel.add(IskljuciBtn);
		
		JButton UkljuciBtn = new JButton("Ukljuci polje");
		UkljuciBtn.setBounds(220, 70, 80, 25);
		UkljuciBtn.setSize(125, 30);
		UkljuciBtn.addActionListener(spoj);
		panel.add(UkljuciBtn);*/
		
		JMenuItem ukljS1 = new JMenuItem("Ukljuci rastS1");
	    JMenuItem iskljS1 = new JMenuItem("Iskljuci rastS1");
	    JMenuItem sigS1 = new JMenuItem("Izlistaj signale: rastS1");
	    ukljS1.addActionListener(spoj);
	    iskljS1.addActionListener(spoj);
	    sigS1.addActionListener(spoj);
	    popupS1.add(ukljS1);
	    popupS1.add(iskljS1);
	    popupS1.add(sigS1);

	    JMenuItem ukljS2 = new JMenuItem("Ukljuci rastS2");
	    JMenuItem iskljS2 = new JMenuItem("Iskljuci rastS2");
	    JMenuItem sigS2 = new JMenuItem("Izlistaj signale: rastS2");
	    ukljS2.addActionListener(spoj);
	    iskljS2.addActionListener(spoj);
	    sigS2.addActionListener(spoj);
	    popupS2.add(ukljS2);
	    popupS2.add(iskljS2);
	    popupS2.add(sigS2);
	    
	    JMenuItem ukljIz = new JMenuItem("Ukljuci rastIz");
	    JMenuItem iskljIz = new JMenuItem("Iskljuci rastIz");
	    JMenuItem sigIz = new JMenuItem("Izlistaj signale: rastIz");
	    ukljIz.addActionListener(spoj);
	    iskljIz.addActionListener(spoj);
	    sigIz.addActionListener(spoj);
	    popupIz.add(ukljIz);
	    popupIz.add(iskljIz);
	    popupIz.add(sigIz);
	    
	    JMenuItem ukljUz = new JMenuItem("Ukljuci rastUz");
	    JMenuItem iskljUz = new JMenuItem("Iskljuci rastUz");
	    JMenuItem sigUz = new JMenuItem("Izlistaj signale: rastUz");
	    ukljUz.addActionListener(spoj);
	    iskljUz.addActionListener(spoj);
	    sigUz.addActionListener(spoj);
	    popupUz.add(ukljUz);
	    popupUz.add(iskljUz);
	    popupUz.add(sigUz);
	    
	    JMenuItem ukljPrek = new JMenuItem("Ukljuci prekidac");
	    JMenuItem iskljPrek = new JMenuItem("Iskljuci prekidac");
	    JMenuItem sigPrek = new JMenuItem("Izlistaj signale: prekidac");
	    ukljPrek.addActionListener(spoj);
	    iskljPrek.addActionListener(spoj);
	    sigPrek.addActionListener(spoj);
	    popupPrek.add(ukljPrek);
	    popupPrek.add(iskljPrek);
	    popupPrek.add(sigPrek);
	    
	    panel.addMouseListener(new MouseAdapter() {
		       public void mouseReleased(MouseEvent me) {
		          showPopupSpojno(me);
		       }
		    }) ;
		
	    rastavljac1.setComponentPopupMenu(popupS1);
	    rastavljac2.setComponentPopupMenu(popupS2);
	    rastavljaciz.setComponentPopupMenu(popupIz);
	    rastavljacuz.setComponentPopupMenu(popupUz);
	    prekidac.setComponentPopupMenu(popupPrek);
		
		frame.setVisible(true);
		
		
	}
	
	public static boolean vidljivost() {
		
		return frame.isShowing();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getActionCommand() == "Ukljuci rastS1") {
			
			sabirnickiRastavljacSPS1.uklop(sabirnickiRastavljacSPS1, prekidacSP);
			
		}
		
		if (e.getActionCommand() == "Iskljuci rastS1") {
			
			sabirnickiRastavljacSPS1.isklop(sabirnickiRastavljacSPS1, prekidacSP);
			
		}
		
		if (e.getActionCommand() == "Izlistaj signale: rastS1") {
			
			Collections.sort(SabirnickiRastavljacSP.sabirnickiRastavljacSPSignali);
			text3.append(SabirnickiRastavljacSP.sabirnickiRastavljacSPSignali.toString());
			
		}

		if (e.getActionCommand() == "Ukljuci rastS2") {
	
			sabirnickiRastavljacSPS2.uklop(sabirnickiRastavljacSPS2, prekidacSP);
	
		}

		if (e.getActionCommand() == "Iskljuci rastS2") {
	
			sabirnickiRastavljacSPS2.isklop(sabirnickiRastavljacSPS2, prekidacSP);
			
		}
		
		if (e.getActionCommand() == "Izlistaj signale: rastS2") {
			
			Collections.sort(SabirnickiRastavljacSP.sabirnickiRastavljacSPSignali);
			text3.append(SabirnickiRastavljacSP.sabirnickiRastavljacSPSignali.toString());
			
		}

		if (e.getActionCommand() == "Ukljuci rastIz") {
	
			izlazniRastavljacSP.uklop(izlazniRastavljacSP);
	
		}

		if (e.getActionCommand() == "Iskljuci rastIz") {
	
			izlazniRastavljacSP.uklop(izlazniRastavljacSP);
			
		}
		
		if (e.getActionCommand() == "Izlistaj signale: rastIz") {
			
			Collections.sort(IzlazniRastavljacSP.izlazniRastavljacSPSignali);
			text3.append(IzlazniRastavljacSP.izlazniRastavljacSPSignali.toString());
			
		}

		if (e.getActionCommand() == "Ukljuci rastUz") {
	
			rastavljacUzemljenjaSP.posaljiZahtjev("Ukljuci");
	
		}

		if (e.getActionCommand() == "Iskljuci rastUz") {
	
			rastavljacUzemljenjaSP.posaljiZahtjev("Iskljuci");
	
		}
		
		if (e.getActionCommand() == "Izlistaj signale: rastUz") {
			
			text3.append("rastavljac uzemljenja: poslan zahtjev za provjerom stanja!");
			
		}

		if (e.getActionCommand() == "Ukljuci prekidac") {
	
			prekidacSP.uklop(prekidacSP);
			
		}

		if (e.getActionCommand() == "Iskljuci prekidac") {
	
			prekidacSP.isklop(prekidacSP);
	
		}
		
		if (e.getActionCommand() == "Izlistaj signale: prekidac") {
			
			Collections.sort(PrekidacSP.prekidacSPSignali);
			text3.append(PrekidacSP.prekidacSPSignali.toString());
			
		}
	}
	
	static void showPopupSpojno(MouseEvent me) {
	      
		if(me.isPopupTrigger()) {
			
	    	  popupS1.show(me.getComponent(), me.getX(), me.getY());
		      popupS2.show(me.getComponent(), me.getX(), me.getY());
		      popupIz.show(me.getComponent(), me.getX(), me.getY());
		      popupUz.show(me.getComponent(), me.getX(), me.getY());
		      popupPrek.show(me.getComponent(), me.getX(), me.getY());
		      
	      }
	      
	   }
	
}

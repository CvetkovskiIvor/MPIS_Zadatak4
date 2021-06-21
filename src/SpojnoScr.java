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
	
	static JLabel sab1 = new JLabel();
	static JLabel sab2 = new JLabel();
	
	static JLabel pow1 = new JLabel();
	static JLabel pow2 = new JLabel();
	static JLabel koc1 = new JLabel();
	static JLabel koc2 = new JLabel();
	static JLabel horiz3 = new JLabel();
	static JLabel horiz4 = new JLabel();
	static JLabel koc4 = new JLabel();
	static JLabel vert1 = new JLabel();
	static JLabel vert2 = new JLabel();
	static JLabel vert3 = new JLabel();
	static JLabel vert4 = new JLabel();
	static JLabel vert5 = new JLabel();
	static JLabel vert6 = new JLabel();
	static JLabel vert7 = new JLabel();
	
	static JPopupMenu popupS1 = new JPopupMenu();
	static JPopupMenu popupS2 = new JPopupMenu();
	static JPopupMenu popupIz = new JPopupMenu();
	static JPopupMenu popupUz = new JPopupMenu();
	static JPopupMenu popupPrek = new JPopupMenu();
	
	static JButton rastavljac1 = new JButton("RastavljacSPS1");
	static JButton rastavljac2 = new JButton("RastavljacSPS2");
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
		
		
		
		koc1.setBounds(295, 44, 20, 28);
		koc1.setOpaque(true);
		panel.add(koc1);
		
		koc2.setBounds(695, 94, 20, 28);
		koc2.setOpaque(true);
		panel.add(koc2);
		
		/*koc3.setBounds(495, 219, 20, 28);
		koc3.setOpaque(true);
		panel.add(koc3);
		
		koc4.setBounds(495, 656, 20, 28);
		koc4.setOpaque(true);
		panel.add(koc4);*/
		
		vert1.setBounds(303, 72, 5, 308);
		vert1.setOpaque(true);
		panel.add(vert1);
		
		vert2.setBounds(703, 122, 5, 258);
		vert2.setOpaque(true);
		panel.add(vert2);
		
		horiz3.setBounds(380, 430, 50, 5);
		horiz3.setOpaque(true);
		horiz3.setBackground(Color.BLUE);
		panel.add(horiz3);
		
		horiz4.setBounds(580, 430, 50, 5);
		horiz4.setOpaque(true);
		horiz4.setBackground(Color.blue);
		panel.add(horiz4);
		
		/*vert4.setBounds(503, 225, 5, 125);
		vert4.setOpaque(true);
		panel.add(vert4);
		
		vert5.setBounds(503, 450, 5, 50);
		vert5.setOpaque(true);
		panel.add(vert5);
		
		vert6.setBounds(503, 600, 5, 120);
		vert6.setOpaque(true);
		panel.add(vert6);
		
		vert7.setBounds(400, 668, 100, 5);
		vert7.setOpaque(true);
		panel.add(vert7);*/
		
		sab1.setBounds(100, 50, 800, 16);
		sab1.setOpaque(true);
		panel.add(sab1);


		sab2.setBounds(100, 100, 800, 16);
		sab2.setOpaque(true);
		panel.add(sab2);
		
		JLabel sys1 = new JLabel("Sabirnica I");
		sys1.setBounds(30, 45, 80, 25);
		panel.add(sys1);

		JLabel sys2 = new JLabel("Sabirnica II");
		sys2.setBounds(30, 95, 80, 25);
		panel.add(sys2);

		pow1.setOpaque(true);
		panel.add(pow1);

		pow2.setOpaque(true);
		panel.add(pow2);
		
		prekidac.setBounds(430, 380, 80, 25);
		prekidac.setSize(150, 100);
		prekidac.setBackground(Color.lightGray);
		prekidac.setOpaque(true);
		panel.add(prekidac);

		rastavljac1.setBounds(230, 380, 80, 25);
		rastavljac1.setSize(150, 100);
		//rastavljac1.setForeground(Color.green);
		rastavljac1.setBackground(Color.lightGray);
		rastavljac1.setBorderPainted(true);
		rastavljac1.setOpaque(true);
		panel.add(rastavljac1);
		
		rastavljac2.setBounds(630, 380, 80, 25);
		rastavljac2.setSize(150, 100);
		rastavljac2.setBackground(Color.lightGray);
		rastavljac2.setBorderPainted(true);
		rastavljac2.setOpaque(true);
		panel.add(rastavljac2);
		
		/*rastavljaciz.setBounds(430, 500, 80, 25);
		rastavljaciz.setSize(150, 100);
		rastavljaciz.setBackground(Color.lightGray);
		rastavljaciz.setBorderPainted(true);
		rastavljaciz.setOpaque(true);
		panel.add(rastavljaciz);
		
		rastavljacuz.setBounds(250, 620, 80, 25);
		rastavljacuz.setSize(150, 100);
		rastavljacuz.setBackground(Color.lightGray);
		rastavljacuz.setBorderPainted(true);
		rastavljacuz.setOpaque(true);
		panel.add(rastavljacuz);*/
		
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
	    
	    /*JMenuItem ukljIz = new JMenuItem("Ukljuci rastIz");
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
	    popupUz.add(sigUz);*/
	    
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
			
			if(sabirnickiRastavljacSPS1.provjera_stanja(prekidacSP) == "OFF") {
				
				rastavljac1.setForeground(Color.green);
				vert1.setBackground(Color.green);
				
				sabirnickiRastavljacSPS1.uklop(sabirnickiRastavljacSPS1, prekidacSP);
				
			}
			
		}
		
		if (e.getActionCommand() == "Iskljuci rastS1") {
			
			if(sabirnickiRastavljacSPS1.provjera_stanja(prekidacSP) == "OFF") {
				
				rastavljac1.setForeground(Color.blue);
				vert1.setBackground(Color.blue);
				
				sabirnickiRastavljacSPS1.isklop(sabirnickiRastavljacSPS1, prekidacSP);
				
			}
			
		}
		
		if (e.getActionCommand() == "Izlistaj signale: rastS1") {
			
			Collections.sort(SabirnickiRastavljacSP.sabirnickiRastavljacSPSignali);
			text3.append(SabirnickiRastavljacSP.sabirnickiRastavljacSPSignali.toString() + "\n");
			
		}

		if (e.getActionCommand() == "Ukljuci rastS2") {
			
			if(sabirnickiRastavljacSPS1.provjera_stanja(prekidacSP) == "OFF") {
				
				rastavljac2.setForeground(Color.green);
				vert2.setBackground(Color.green);
		
				sabirnickiRastavljacSPS2.uklop(sabirnickiRastavljacSPS2, prekidacSP);
				
			}

		}

		if (e.getActionCommand() == "Iskljuci rastS2") {
			
			if(sabirnickiRastavljacSPS2.provjera_stanja(prekidacSP) == "OFF") {
				
				rastavljac2.setForeground(Color.blue);
				vert2.setBackground(Color.blue);
		
				sabirnickiRastavljacSPS2.isklop(sabirnickiRastavljacSPS2, prekidacSP);
				
			}
			
			
		}
		
		if (e.getActionCommand() == "Izlistaj signale: rastS2") {
			
			Collections.sort(SabirnickiRastavljacSP.sabirnickiRastavljacSPSignali);
			text3.append(SabirnickiRastavljacSP.sabirnickiRastavljacSPSignali.toString() + "\n");
			
		}

		if (e.getActionCommand() == "Ukljuci rastIz") {
			
			if(izlazniRastavljacSP.provjera_stanja(prekidacSP) == "OFF") {
				
				rastavljaciz.setForeground(Color.green);
				vert5.setBackground(Color.green);
		
				izlazniRastavljacSP.uklop(izlazniRastavljacSP);
				
			}
			
		}

		if (e.getActionCommand() == "Iskljuci rastIz") {
			
			if(izlazniRastavljacSP.provjera_stanja(prekidacSP) == "OFF") {
				
				rastavljaciz.setForeground(Color.blue);
				vert5.setBackground(Color.blue);
		
				izlazniRastavljacSP.isklop(izlazniRastavljacSP);
				
			}
			
		}
		
		if (e.getActionCommand() == "Izlistaj signale: rastIz") {
			
			Collections.sort(IzlazniRastavljacSP.izlazniRastavljacSPSignali);
			text3.append(IzlazniRastavljacSP.izlazniRastavljacSPSignali.toString() + "\n");
			
		}

		if (e.getActionCommand() == "Ukljuci rastUz") {
			rastavljacuz.setForeground(Color.green);
	
			rastavljacUzemljenjaSP.posaljiZahtjev("Ukljuci");
	
		}

		if (e.getActionCommand() == "Iskljuci rastUz") {
			rastavljacuz.setForeground(Color.blue);
	
			rastavljacUzemljenjaSP.posaljiZahtjev("Iskljuci");
	
		}
		
		if (e.getActionCommand() == "Izlistaj signale: rastUz") {
			
			text3.append("rastavljac uzemljenja: poslan zahtjev za provjerom stanja!\n");
			
		}

		if (e.getActionCommand() == "Ukljuci prekidac") {
			prekidac.setForeground(Color.green);
			horiz3.setBackground(Color.green);
			horiz4.setBackground(Color.green);
			koc3.setBackground(Color.green);
	
			prekidacSP.uklop(prekidacSP);
			
		}

		if (e.getActionCommand() == "Iskljuci prekidac") {
			prekidac.setForeground(Color.blue);
			horiz3.setBackground(Color.blue);
			horiz4.setBackground(Color.blue);
			koc3.setBackground(Color.blue);
	
			prekidacSP.isklop(prekidacSP);
	
		}
		
		if (e.getActionCommand() == "Izlistaj signale: prekidac") {
			
			Collections.sort(PrekidacSP.prekidacSPSignali);
			text3.append(PrekidacSP.prekidacSPSignali.toString() + "\n");
			
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

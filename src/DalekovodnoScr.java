import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
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
	
	static JPopupMenu popupS1 = new JPopupMenu();
	static JPopupMenu popupS2 = new JPopupMenu();
	static JPopupMenu popupIz = new JPopupMenu();
	static JPopupMenu popupUz = new JPopupMenu();
	static JPopupMenu popupPrek = new JPopupMenu();
	
	public static void dalekovodnoScr() {
		
		JPanel panel = new JPanel();
		
		frame.setSize(1000, 1000);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.add(panel);
		
		panel.setLayout(null);
		
		text2.setLineWrap(true);
		text2.setWrapStyleWord(true);
		text2.setEditable(false);
		text2.setVisible(true);
		
		
		JScrollPane scroll = new JScrollPane(text2);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroll.setBounds(100, 730, 800, 200);
		panel.add(scroll);
		
		koc1.setBounds(295, 44, 20, 28);
		koc1.setBackground(Color.blue);
		koc1.setOpaque(true);
		panel.add(koc1);
		
//		koc2.setBounds(100, 50, 800, 16);
//		koc2.setBackground(Color.blue);
//		koc2.setOpaque(true);
//		panel.add(koc2);
//		
//		koc3.setBounds(100, 50, 800, 16);
//		koc3.setBackground(Color.blue);
//		koc3.setOpaque(true);
//		panel.add(koc3);
//		
//		koc4.setBounds(100, 50, 800, 16);
//		koc4.setBackground(Color.blue);
//		koc4.setOpaque(true);
//		panel.add(koc4);
//		
//		vert1.setBounds(100, 50, 800, 16);
//		vert1.setBackground(Color.blue);
//		vert1.setOpaque(true);
//		panel.add(vert1);
//		
//		vert2.setBounds(100, 50, 800, 16);
//		vert2.setBackground(Color.blue);
//		vert2.setOpaque(true);
//		panel.add(vert2);
//		
//		vert3.setBounds(100, 50, 800, 16);
//		vert3.setBackground(Color.blue);
//		vert3.setOpaque(true);
//		panel.add(vert3);
//		
//		vert4.setBounds(100, 50, 800, 16);
//		vert4.setBackground(Color.blue);
//		vert4.setOpaque(true);
//		panel.add(vert4);
//		
//		vert5.setBounds(100, 50, 800, 16);
//		vert5.setBackground(Color.blue);
//		vert5.setOpaque(true);
//		panel.add(vert5);
		
		sab1.setBounds(100, 50, 800, 16);
		//sab1.setBackground(Color.blue);
		sab1.setOpaque(true);
		panel.add(sab1);


		sab2.setBounds(100, 100, 800, 16);
		//sab2.setBackground(Color.green);
		sab2.setOpaque(true);
		panel.add(sab2);
		
		JLabel sys1 = new JLabel("Sabirnica I");
		sys1.setBounds(30, 45, 80, 25);
		panel.add(sys1);

		JLabel sys2 = new JLabel("Sabirnica II");
		sys2.setBounds(30, 95, 80, 25);
		panel.add(sys2);

		//pow1.setText("0 kV");
		pow1.setBounds(870, 30, 80, 25);
		//pow1.setForeground(Color.blue);
		pow1.setOpaque(true);
		panel.add(pow1);

		//pow2.setText("220 kV");
		pow2.setBounds(860, 80, 80, 25);
		//pow2.setForeground(Color.green);
		pow2.setOpaque(true);
		panel.add(pow2);
		
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
		
		JMenuItem ukljS1 = new JMenuItem("Ukljuci rastS1");
	    JMenuItem iskljS1 = new JMenuItem("Iskljuci rastS1");
	    JMenuItem sigS1 = new JMenuItem("Izlistaj signale: rastS1");
	    ukljS1.addActionListener(dalk);
	    iskljS1.addActionListener(dalk);
	    sigS1.addActionListener(dalk);
	    popupS1.add(ukljS1);
	    popupS1.add(iskljS1);
	    popupS1.add(sigS1);

	    JMenuItem ukljS2 = new JMenuItem("Ukljuci rastS2");
	    JMenuItem iskljS2 = new JMenuItem("Iskljuci rastS2");
	    JMenuItem sigS2 = new JMenuItem("Izlistaj signale: rastS2");
	    ukljS2.addActionListener(dalk);
	    iskljS2.addActionListener(dalk);
	    sigS2.addActionListener(dalk);
	    popupS2.add(ukljS2);
	    popupS2.add(iskljS2);
	    popupS2.add(sigS2);
	    
	    JMenuItem ukljIz = new JMenuItem("Ukljuci rastIz");
	    JMenuItem iskljIz = new JMenuItem("Iskljuci rastIz");
	    JMenuItem sigIz = new JMenuItem("Izlistaj signale: rastIz");
	    ukljIz.addActionListener(dalk);
	    iskljIz.addActionListener(dalk);
	    sigIz.addActionListener(dalk);
	    popupIz.add(ukljIz);
	    popupIz.add(iskljIz);
	    popupIz.add(sigIz);
	    
	    JMenuItem ukljUz = new JMenuItem("Ukljuci rastUz");
	    JMenuItem iskljUz = new JMenuItem("Iskljuci rastUz");
	    JMenuItem sigUz = new JMenuItem("Izlistaj signale: rastUz");
	    ukljUz.addActionListener(dalk);
	    iskljUz.addActionListener(dalk);
	    sigUz.addActionListener(dalk);
	    popupUz.add(ukljUz);
	    popupUz.add(iskljUz);
	    popupUz.add(sigUz);
	    
	    JMenuItem ukljPrek = new JMenuItem("Ukljuci prekidac");
	    JMenuItem iskljPrek = new JMenuItem("Iskljuci prekidac");
	    JMenuItem sigPrek = new JMenuItem("Izlistaj signale: prekidac");
	    ukljPrek.addActionListener(dalk);
	    iskljPrek.addActionListener(dalk);
	    sigPrek.addActionListener(dalk);
	    popupPrek.add(ukljPrek);
	    popupPrek.add(iskljPrek);
	    popupPrek.add(sigPrek);
	    
	    panel.addMouseListener(new MouseAdapter() {
		       public void mouseReleased(MouseEvent me) {
		          showPopupDalk(me);
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
	
	public void actionPerformed(ActionEvent e) {
		
		if (e.getActionCommand() == "Ukljuci rastS1") {
			
			sabirnickiRastavljacDPS1.uklop(sabirnickiRastavljacDPS1, prekidacDP);
			
		}
		
		if (e.getActionCommand() == "Iskljuci rastS1") {
			
			sabirnickiRastavljacDPS1.isklop(sabirnickiRastavljacDPS1, prekidacDP);
			
		}
		
		if (e.getActionCommand() == "Izlistaj signale: rastS1") {
			
			text2.append(SabirnickiRastavljacDP.sabirnickiRastavljacDPSignali.toString());
			
		}

		if (e.getActionCommand() == "Ukljuci rastS2") {
	
			sabirnickiRastavljacDPS2.uklop(sabirnickiRastavljacDPS2, prekidacDP);
	
		}

		if (e.getActionCommand() == "Iskljuci rastS2") {
	
			sabirnickiRastavljacDPS2.isklop(sabirnickiRastavljacDPS2, prekidacDP);
			
		}
		
		if (e.getActionCommand() == "Izlistaj signale: rastS2") {
			
			text2.append(SabirnickiRastavljacDP.sabirnickiRastavljacDPSignali.toString());
			
		}

		if (e.getActionCommand() == "Ukljuci rastIz") {
	
			izlazniRastavljacDP.uklop(izlazniRastavljacDP);
	
		}

		if (e.getActionCommand() == "Iskljuci rastIz") {
	
			izlazniRastavljacDP.uklop(izlazniRastavljacDP);
			
		}
		
		if (e.getActionCommand() == "Izlistaj signale: rastIz") {
			
			text2.append(IzlazniRastavljacDP.izlazniRastavljacDPSignali.toString());
			
		}

		if (e.getActionCommand() == "Ukljuci rastUz") {
	
			rastavljacUzemljenjaDP.posaljiZahtjev("Ukljuci");
	
		}

		if (e.getActionCommand() == "Iskljuci rastUz") {
	
			rastavljacUzemljenjaDP.posaljiZahtjev("Iskljuci");
	
		}
		
		if (e.getActionCommand() == "Izlistaj signale: rastUz") {
			
			//text2.append(rast);
			
		}

		if (e.getActionCommand() == "Ukljuci prekidac") {
	
			prekidacDP.uklop(prekidacDP);
			
		}

		if (e.getActionCommand() == "Iskljuci prekidac") {
	
			prekidacDP.isklop(prekidacDP);
	
		}
		
		if (e.getActionCommand() == "Izlistaj signale: prekidac") {
			
			text2.append(PrekidacDP.prekidacDPSignali.toString());
			
		}
		
	}
	
	static void showPopupDalk(MouseEvent me) {
	      
		if(me.isPopupTrigger()) {
			
	    	  popupS1.show(me.getComponent(), me.getX(), me.getY());
		      popupS2.show(me.getComponent(), me.getX(), me.getY());
		      popupIz.show(me.getComponent(), me.getX(), me.getY());
		      popupUz.show(me.getComponent(), me.getX(), me.getY());
		      popupPrek.show(me.getComponent(), me.getX(), me.getY());
		      
	      }
	      
	   }
	
}

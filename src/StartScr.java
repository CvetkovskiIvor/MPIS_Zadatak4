import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StartScr extends Zadatak4 implements ActionListener{
	
	DalekovodnoPolje dp = new DalekovodnoPolje();
	SpojnoPolje sp = new SpojnoPolje();
	
	static ArrayList<String> signali = new ArrayList<String>();
	static ArrayList<String> svi_Signali = new ArrayList<String>();

	
	APU apu = new APU("APU");
	Brojilo brojilo = new Brojilo("brojilo");
	DistantnaZastita distantnaZastita = new DistantnaZastita("distantna zastita");
	IzlazniRastavljacDP izlazniRastavljacDP = new IzlazniRastavljacDP("izlazni rastavljac");
	NadstrujnaZastita nadstrujnaZastita = new NadstrujnaZastita("nadstrujna zastita");
	Napajanje napajanje = new Napajanje("napajanje");
	PrekidacDP prekidacDP = new PrekidacDP("prekidac");
	RastavljacUzemljenjaDP rastavljacUzemljenjaDP = new RastavljacUzemljenjaDP("rastavljac uzemljenja");
	SabirnickiRastavljacDP sabirnickiRastavljacDPS1 = new SabirnickiRastavljacDP("sabirnicki rastavljac DPS1");
	SabirnickiRastavljacDP sabirnickiRastavljacDPS2 = new SabirnickiRastavljacDP("sabirnicki rastavljac DPS2");
	Voltmetar voltmetar = new Voltmetar("voltmetar");
	Watmetar watmetar = new Watmetar("watmetar");
	
	IzlazniRastavljacSP izlazniRastavljacSP = new IzlazniRastavljacSP("izlazni rastavljac");
	PrekidacSP prekidacSP = new PrekidacSP("prekidac");
	RastavljacUzemljenjaSP rastavljacUzemljenjaSP = new RastavljacUzemljenjaSP("rastavljac uzemljenja");
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
			
			System.out.println(signali);
			System.out.println(DalekovodnoScr.dalekovodnoSignali);
			System.out.println(SpojnoScr.spojnoSignali);
			System.out.println(svi_Signali);
			
		}
	}
	
	
}

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StartScr implements ActionListener{
	
	DalekovodnoPolje dp = new DalekovodnoPolje();
	SpojnoPolje sp = new SpojnoPolje();
	
	APU apu = new APU("APU");
	Brojilo brojilo = new Brojilo("brojilo");
	DistantnaZastita distantnaZastita = new DistantnaZastita("distantna zastita");
	IzlazniRastavljacDP izlazniRastavljacDP = new IzlazniRastavljacDP("izlazni rastavljac");
	NadstrujnaZastita nadstrujnaZastita = new NadstrujnaZastita("nadstrujna zastita");
	Napajanje napajanje = new Napajanje("napajanje");
	PrekidacDP prekidacDP = new PrekidacDP("prekidac");
	RastavljacUzemljenjaDP rastavljacUzemljenjaDP = new RastavljacUzemljenjaDP("rastavljac uzemljenja");
	SabirnickiRastavljacDP sabirnickiRastavljacDPS1 = new SabirnickiRastavljacDP("sabirnicki rastavljac S1");
	SabirnickiRastavljacDP sabirnickiRastavljacDPS2 = new SabirnickiRastavljacDP("sabirnicki rastavljac S2");
	Voltmetar voltmetar = new Voltmetar("voltmetar");
	Watmetar watmetar = new Watmetar("watmetar");
	
	IzlazniRastavljacSP izlazniRastavljacSP = new IzlazniRastavljacSP("izlazni rastavljac");
	PrekidacSP prekidacSP = new PrekidacSP("prekidac");
	RastavljacUzemljenjaSP rastavljacUzemljenjaSP = new RastavljacUzemljenjaSP("rastavljac uzemljenja");
	SabirnickiRastavljacSP sabirnickiRastavljacSPS1 = new SabirnickiRastavljacSP("sabirnicki rastavljac S1");
	SabirnickiRastavljacSP sabirnickiRastavljacSPS2 = new SabirnickiRastavljacSP("sabirnicki rastavljac S2");
	
	Napajanje napajanjeAPU = new Napajanje("napajanje APU");
	Napajanje napajanjeBrojilo = new Napajanje("napajanje brojilo");
	Napajanje napajanjeDistantnaZastita = new Napajanje("napajanje distantna zastita");
	Napajanje napajanjeIzlazniRastavljacDP = new Napajanje("napajanje izlazni rastavljac DP");
	Napajanje napajanjeIzlazniRastavljacSP = new Napajanje("napajanje izlazni rastavljac SP");
	Napajanje napajanjeNadstrujnaZastita = new Napajanje("napajanje nadstrujna zastita");
	Napajanje napajanjePrekidacDP = new Napajanje("napajanje prekidac DP");
	Napajanje napajanjePrekidacSP = new Napajanje("napajanje prekidac SP");
	Napajanje napajanjeRastavljacUzemljenjaDP = new Napajanje("napajanje rastavljac uzemljenja DP");
	Napajanje napajanjeRastavljacUzemljenjaSP = new Napajanje("napajanje rastavljac uzemljenja SP");
	Napajanje napajanjeSabirnickiRastavljacDPS1 = new Napajanje("napajanje sabirnicki rastavljac DP S1");
	Napajanje napajanjeSabirnickiRastavljacDPS2 = new Napajanje("napajanje sabirnicki rastavljac DP S2");
	Napajanje napajanjeSabirnickiRastavljacSPS1 = new Napajanje("napajanje sabirnicki rastavljac SP S1");
	Napajanje napajanjeSabirnickiRastavljacSPS2 = new Napajanje("napajanje sabirnicki rastavljac SP S2");
	Napajanje napajanjeVoltmetar = new Napajanje("napajanje voltmetar");
	Napajanje napajanjeWatmetar = new Napajanje("napajanje watmetar");
	
	
	
	public void startScr() {
		
		JFrame frame = new JFrame("Start");
		JPanel panel = new JPanel();
		
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		panel.setLayout(null);
		
		JLabel dalekovodnoLbl = new JLabel("dalekovodno");
		dalekovodnoLbl.setBounds(10, 20, 80, 25);
		panel.add(dalekovodnoLbl);
		
		JLabel spojnoLbl = new JLabel("spojno");
		spojnoLbl.setBounds(10, 60, 80, 25);
		panel.add(spojnoLbl);
		
		JLabel uredajiLbl = new JLabel("uredaji");
		uredajiLbl.setBounds(10, 100, 80, 25);
		panel.add(uredajiLbl);
		
		JButton dalekovodnoBtn = new JButton("Dalekovodno");
		dalekovodnoBtn.setBounds(100, 20, 80, 25);
		dalekovodnoBtn.setSize(125, 30);
		dalekovodnoBtn.addActionListener(new StartScr());
		panel.add(dalekovodnoBtn);
		
		JButton spojnoBtn = new JButton("Spojno");
		spojnoBtn.setBounds(100, 60, 80, 25);
		spojnoBtn.setSize(125, 30);
		spojnoBtn.addActionListener(new StartScr());
		panel.add(spojnoBtn);
		
		JButton uredajiBtn = new JButton("Uredaji");
		uredajiBtn.setBounds(100, 100, 80, 25);
		uredajiBtn.setSize(125, 30);
		uredajiBtn.addActionListener(new StartScr());
		panel.add(uredajiBtn);
		
		
		
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		DalekovodnoScr dalekovodnoScr = new DalekovodnoScr();
		if (e.getActionCommand() == "Dalekovodno") {
			if(dalekovodnoScr.vidljivost() == true) {
				System.out.println("vidljiv sam!");
			}else
				dalekovodnoScr.dalekovodnoScr();
		}
		
		if (e.getActionCommand() == "Spojno") {
			SpojnoScr spojnoScr = new SpojnoScr();
			if(spojnoScr.vidljivost() == true) {
				System.out.println("vidljiv sam!");
			}else
				spojnoScr.spojnoScr();
		}
	}
	
}

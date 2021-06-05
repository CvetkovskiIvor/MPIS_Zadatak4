import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StartScr implements ActionListener{
	
	SpojnoPolje sp = new SpojnoPolje();
	DalekovodnoPolje dp = new DalekovodnoPolje();
	
	APU apu = new APU("APU");
	Brojilo brojilo = new Brojilo("brojilo");
	DistantnaZastita DZ = new DistantnaZastita("distantna zastita");
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
	
	public void startScr() {
		
		JFrame frame = new JFrame("Testni frame");
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
		
		
		
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		DalekovodnoScr dalekovodnoScr = new DalekovodnoScr();
		if (e.getActionCommand() == "Dalekovodno") {
			System.out.println("dalekovodno");
			if(dalekovodnoScr.vidljivost() == true) {
				System.out.println("vidljiv sam!");
			}else
				dalekovodnoScr.dalekovodnoScr();
		}
		
		if (e.getActionCommand() == "Spojno") {
			System.out.println("spojno");
			
			SpojnoScr spojnoScr = new SpojnoScr();
			if(spojnoScr.vidljivost() == true) {
				System.out.println("vidljiv sam!");
			}else
				spojnoScr.spojnoScr();
		}
	}
	
}

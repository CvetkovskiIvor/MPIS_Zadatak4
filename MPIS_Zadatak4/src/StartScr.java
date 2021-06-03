import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StartScr implements ActionListener{
	
	DalekovodnoScr dalekovodno = new DalekovodnoScr();
	SpojnoScr spojno = new SpojnoScr();
	
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
		
		if (e.getActionCommand() == "Dalekovodno") {
			System.out.println("dalekovodno");
			if(dalekovodno.vidljivost() == true) {
				System.out.println("vidljiv sam!");
			}else
				dalekovodno.startScr();
		}
		
		if (e.getActionCommand() == "Spojno") {
			System.out.println("spojno");
			if(spojno.vidljivost() == true) {
				System.out.println("vidljiv sam!");
			}else
				spojno.startScr();
		}
	}
	
}

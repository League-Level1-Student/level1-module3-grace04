import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	public static void main(String[] args) {
		ChuckleClicker cc = new ChuckleClicker();
		cc.makeButtons();
	}
	
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	
	public void makeButtons() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		b1.setText("joke");
		b2.setText("PUNchline");
		JPanel panel = new JPanel();
		panel.add(b1);
		panel.add(b2);
		frame.add(panel);
		b1.addActionListener(this);
		b2.addActionListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed.equals(b1)) {
			JOptionPane.showMessageDialog(null, "I'm ready!");
		}
		else if (buttonPressed.equals(b2)) {
			JOptionPane.showMessageDialog(null, "Hi ready, I'm dad.");
		}
	}
}

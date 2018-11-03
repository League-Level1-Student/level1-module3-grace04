import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JLabel l1 = new JLabel();
	JLabel l2 = new JLabel();
	JLabel l3 = new JLabel();

	Random ge1 = new Random();
	int g1 = ge1.nextInt(3);
	Random ge2 = new Random();
	int g2 = ge2.nextInt(3);
	Random ge3 = new Random();
	int g3 = ge3.nextInt(3);

	public static void main(String[] args) {
		SlotMachine sm = new SlotMachine();
		sm.run();
	}

	public void run() {
		frame.setVisible(true);
		frame.add(panel);
		l1.setSize(200, 100);
		l2.setSize(200, 100);
		l3.setSize(200, 100);
		panel.add(l1);
		panel.add(l2);
		panel.add(l3);
		panel.add(button);
		button.setText("SPIN");
		button.addActionListener(this);
		frame.setSize(600, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void spin() {
		if (g1 == 0) {
			l1 = loadImage("cherry.jpg");
		} else if (g1 == 1) {
			l1 = loadImage("orange.jpg");
		} else if (g1 == 2) {
			l1 = loadImage("lime.jpg");
		}

		if (g2 == 0) {
			l2 = loadImage("cherry.jpg");
		} else if (g2 == 1) {
			l2 = loadImage("orange.jpg");
		} else if (g2 == 2) {
			l2 = loadImage("lime.jpg");
		}

		if (g3 == 0) {
			l3 = loadImage("cherry.jpg");
		} else if (g3 == 1) {
			l3 = loadImage("orange.jpg");
		} else if (g3 == 2) {
			l3 = loadImage("lime.jpg");
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed.equals(button)) {
			spin();
		}

		if (g1 == 0 && g2 == 0 && g3 == 0) {
			JOptionPane.showMessageDialog(null, "YOU WIN");
		} else if (g1 == 1 && g2 == 1 && g3 == 1) {
			JOptionPane.showMessageDialog(null, "YOU WIN");
		} else if (g1 == 2 && g2 == 2 && g3 == 2) {
			JOptionPane.showMessageDialog(null, "YOU WIN");
		}
	}

	private JLabel loadImage(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}
}
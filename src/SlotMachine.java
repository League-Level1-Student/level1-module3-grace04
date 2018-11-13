import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
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
	ImageIcon che = new ImageIcon("cherry.jpg");
	ImageIcon ora = new ImageIcon("orange.jpg");
	ImageIcon lim = new ImageIcon("lime.jpg");

	Random ge1 = new Random();
	int g1;
	Random ge2 = new Random();
	int g2;
	Random ge3 = new Random();
	int g3;

	public static void main(String[] args) throws MalformedURLException {
		SlotMachine sm = new SlotMachine();
		sm.run();
	}

	public void run() throws MalformedURLException {
		frame.setVisible(true);
		frame.add(panel);
		panel.setLayout(new GridLayout());
		l1 = createLabelImage("cherry.jpg");
		l2 = createLabelImage("orange.jpg");
		l3 = createLabelImage("lime.jpg");
		panel.add(l1);
		panel.add(l2);
		panel.add(l3);
		panel.add(button);
		button.setText("SPIN");
		button.addActionListener(this);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
			try {
				spin();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	}

	public void spin() throws MalformedURLException {
		
		g1 = ge1.nextInt(3);
		System.out.println(g1);
		g2 = ge2.nextInt(3);
		System.out.println(g2);
		g3 = ge3.nextInt(3);
		System.out.println(g3);
		
		if (g1 == 0) {
			l1 = createLabelImage("cherry.jpg");
		}
		else if (g2 == 0) {
			l2 = createLabelImage("cherry.jpg");
		}
		else if (g3 == 0) {
			l3 = createLabelImage("cherry.jpg");
		}
		else if (g1 == 1) {
			l1 = createLabelImage("orange.jpg");
		}
		else if (g2 == 1) {
			l2 = createLabelImage("orange.jpg");
		}
		else if (g3 == 1) {
			l3 = createLabelImage("orange.jpg");
		}
		else if (g1 == 2) {
			l1 = createLabelImage("lime.jpg");
		}
		else if (g2 == 2) {
			l2 = createLabelImage("lime.jpg");
		}
		else if (g3 == 2) {
			l3 = createLabelImage("lime.jpg");
		}
	}
	
	private JLabel createLabelImage(String fileName) throws MalformedURLException {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}
}
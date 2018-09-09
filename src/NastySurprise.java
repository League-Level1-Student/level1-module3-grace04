import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements MouseListener {

	JButton b1 = new JButton("Trick");
	JButton b2 = new JButton("Treat");

	public static void main(String[] args) {
		NastySurprise ns = new NastySurprise();
		ns.showButton();
	}

	private void showButton() {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b1.addMouseListener(this);
		b2.addMouseListener(this);
		panel.add(b1);
		panel.add(b2);
		frame.pack();
	}

	private void showPictureFromInternet(String imageUrl) {
		try {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			JLabel imageLabel = new JLabel(icon);
			JFrame frame = new JFrame();
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.pack();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		JButton mouseClicked = (JButton) e.getSource();
		if (mouseClicked.equals(b1)) {
			showPictureFromInternet(
					"https://www.google.com/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&cad=rja&uact=8&ved=2ahUKEwi_xIOAxqzdAhUKCKwKHTMaCqcQjRx6BAgBEAU&url=https%3A%2F%2Fwww.youtube.com%2Fwatch%3Fv%3DGw_xvtWJ6q0&psig=AOvVaw2Z-fPFyEIoGCYxr54l2KVh&ust=1536535189798438");
		} else if (mouseClicked.equals(b2)) {
			showPictureFromInternet(
					"https://www.google.com/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&cad=rja&uact=8&ved=2ahUKEwirrbDu0KzdAhVFYK0KHZZfAo8QjRx6BAgBEAU&url=https%3A%2F%2Fwww.cubecraft.net%2Fthreads%2Fhappy-spooktober.164101%2F&psig=AOvVaw3pqaZ2RQwtb8oeY3ygikiU&ust=1536538158252897");
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}

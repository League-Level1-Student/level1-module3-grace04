import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener {

	JButton b1 = new JButton("Trick");
	JButton b2 = new JButton("Treat");
	JFrame jframe = new JFrame();
	JPanel panel = new JPanel();

	public static void main(String[] args) {
		NastySurprise ns = new NastySurprise();
		ns.showButton();
	}

	private void showButton() {
		// TODO Auto-generated method stub
		jframe.add(panel);
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b1.addActionListener(this);
		b2.addActionListener(this);
		panel.add(b1);
		panel.add(b2);
		jframe.pack();
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
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton jbutton = (JButton) e.getSource();
		if (jbutton == b1) {
			showPictureFromInternet("https://ybxzcgnc7b-flywheel.netdna-ssl.com/wp-content/uploads/2017/11/cute.jpg");
		} else if (jbutton == b2) {
			showPictureFromInternet("http://www.likecovers.com/covers/original/big-scary-cute-domo.jpg?i");
		}
		jframe.pack();
	}

}

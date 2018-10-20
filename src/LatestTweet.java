
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LatestTweet implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton sear = new JButton();
	JTextField tf = new JTextField(8);

	public static void main(String[] args) {
		LatestTweet lt = new LatestTweet();
		lt.run();
	}

	void run() {
		panel.add(tf);
		panel.add(sear);
		frame.add(panel);
		frame.setVisible(true);
		sear.setText("Search the Twitterverse");
		sear.addActionListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed.equals(sear)) {
			System.out.println("Tweet, Tweet");
		}
	}
}

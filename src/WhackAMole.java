import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	int miss = 0;

	public static void main(String[] args) {
		WhackAMole wm = new WhackAMole();
		wm.run();
	}

	public void run() {
		frame.setVisible(true);
		frame.setSize(250, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		Random ran = new Random();
		int n = ran.nextInt(24);
		for (int i = 0; i < 24; i++) {
			JButton button = new JButton();
			if (n == i) {
				button.setText("mole!");
			}
			button.addActionListener(this);
			panel.add(button);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed.getText().equals("mole!")) {
			speak("Hit");
		} else {
			speak("Miss");
			miss++;
		}
		frame.dispose();
		frame = new JFrame();
		panel = new JPanel();
		run();
	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null, "Your whack rate is "
				+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
	}
}

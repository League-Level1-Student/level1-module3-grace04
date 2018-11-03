import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	int miss = 0;
	int hit = 0;
	Date timeAtStart = new Date();

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
			hit++;
			playSound("shiny-objects.wav");
		} else {
			speak("Miss");
			miss++;
		}

		if (hit == 10) {
			JOptionPane.showMessageDialog(null, "You won!");
			endGame(timeAtStart, hit);
		} else if (miss == 5) {
			JOptionPane.showMessageDialog(null, "You lost!");
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

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}
}

// https://docs.google.com/document/d/e/2PACX-1vT5XdG77iUZkibeAysT3aaSrGHJxjdPyKvxIt7TX7A2H9n9Uo7FKbO9VTgiQacxa2U3_FRb7oSOXepf/pub
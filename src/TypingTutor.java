import java.awt.Label;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TypingTutor implements KeyListener {
	
	char currentLetter;
	JLabel label = new JLabel();
	JFrame frame = new JFrame();

	public static void main(String[] args) {
		TypingTutor tt= new TypingTutor();
		tt.run();
	}

	public void run() {
		currentLetter = generateRandomLetter();
		
		String s=Character.toString(currentLetter);
		label.setText(s);
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		frame.add(label);
		frame.setVisible(true);
		frame.addKeyListener(this);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
		static char generateRandomLetter() {
		      Random r = new Random();
		      return (char) (r.nextInt(26) + 'a');
		}
		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			System.out.println(e);
			if (e.equals(currentLetter)) {
				System.out.println("correct");
				frame.setB
			}
		}
		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			currentLetter = currentLetter;
			label.updateUI();
		}
}

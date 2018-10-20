import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {

	JFrame frame = new JFrame();
	JButton a = new JButton();
	JButton s = new JButton();
	JButton m = new JButton();
	JButton d = new JButton();
	JTextField text = new JTextField(4);
	JTextField field = new JTextField(4);
	JPanel panel = new JPanel();

	void run() {
		panel.add(a);
		panel.add(s);
		panel.add(m);
		panel.add(d);
		panel.add(text);
		panel.add(field);
		frame.add(panel);
		frame.setVisible(true);
		a.setText("add");
		a.addActionListener(this);
		s.setText("sub");
		s.addActionListener(this);
		m.setText("mul");
		m.addActionListener(this);
		d.setText("div");
		d.addActionListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
	}

	double add(double text, double field) {
		return text + field;
	}

	double sub(double text, double field) {
		return text - field;
	}

	double mul(double text, double field) {
		return text * field;
	}

	double div(double text, double field) {
		return text / field;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed.equals(a)) {
			JOptionPane.showMessageDialog(null,
					add(Double.parseDouble(text.getText()), Double.parseDouble(field.getText())));
		} else if (buttonPressed.equals(s)) {
			JOptionPane.showMessageDialog(null,
					sub(Double.parseDouble(text.getText()), Double.parseDouble(field.getText())));
		} else if (buttonPressed.equals(m)) {
			JOptionPane.showMessageDialog(null,
					mul(Double.parseDouble(text.getText()), Double.parseDouble(field.getText())));
		} else if (buttonPressed.equals(d)) {
			JOptionPane.showMessageDialog(null,
					div(Double.parseDouble(text.getText()), Double.parseDouble(field.getText())));
		}
	}
}

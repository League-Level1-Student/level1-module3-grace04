import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calculator implements MouseListener {
	JFrame frame = new JFrame();
	JButton a = new JButton();
	JButton s = new JButton();
	JButton m = new JButton();
	JButton d = new JButton();
	JTextField text = new JTextField();
	JTextField field = new JTextField();
	JPanel panel = new JPanel();
	
	public void Calculator() {
		panel.add(a);
		panel.add(s);
		panel.add(m);
		panel.add(d);
		panel.add(text);
		panel.add(field);
		frame.add(panel);
		frame.setVisible(true);
		a.setText("add");
		a.addMouseListener(this);
		s.setText("sub");
		s.addMouseListener(this);
		m.setText("mul");
		m.addMouseListener(this);
		d.setText("div");
		d.addMouseListener(this);
		frame.pack();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

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
  	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

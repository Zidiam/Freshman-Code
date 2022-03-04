import java.awt.*;
import javax.swing.*;
public class FlowPanel extends JPanel{
	
	public FlowPanel() {
		setLayout(new FlowLayout());
		
		setBackground(Color.green);
		
		JButton b1 = new JButton("BUTTON 1");
		JButton b2 = new JButton("BUTTON 2");
		JButton b3 = new JButton("BUTTON 3");
		JButton b4 = new JButton("BUTTON 4");
		JButton b5 = new JButton("BUTTON 5");
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
	}
}

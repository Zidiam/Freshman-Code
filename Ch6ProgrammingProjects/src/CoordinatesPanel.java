/*
 * 
 */
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;

public class CoordinatesPanel extends JPanel{
	private final int SIZE = 6;
	
	private int x = 50, y = 50;
	
	public CoordinatesPanel() {
		addMouseListener(new CoordinatesListener());
		
		setBackground(Color.black);
		setPreferredSize(new Dimension(300, 200));
	}
	
	public void paintComponent(Graphics page) {
		super.paintComponent(page);
		
		page.setColor(Color.green);
		
		page.fillOval(x, y, SIZE, SIZE);
		
		page.drawString("Coordinates: (" + x + ", " + y + ")" , 5, 15);
	}
	
	private class CoordinatesListener implements MouseListener{
		public void mousePressed(MouseEvent event) {
		}

		public void mouseClicked(MouseEvent event) {
			x = event.getX();
			y = event.getY();
			repaint();
		}

		public void mouseEntered(MouseEvent arg0) {}

		public void mouseExited(MouseEvent arg0) {}

		public void mouseReleased(MouseEvent arg0) {
			
		}
	}

}

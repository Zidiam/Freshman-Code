/*
 * 
 */
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;

public class RubberLinesPanel extends JPanel{
	private Point point1 = null, point2 = null;
	
	public RubberLinesPanel() {
		LineListener listener = new LineListener();
		addMouseListener(listener);
		addMouseMotionListener(listener);
		
		setBackground(Color.black);
		setPreferredSize(new Dimension(400, 200));
	}
	
	public void paintComponent(Graphics page) {
		super.paintComponent(page);
		
		page.setColor(Color.yellow);
		if(point1 != null && point2 != null)
			page.drawLine(point1.x, point1.y, point2.x, point2.y);
	}
	
	private class LineListener implements MouseListener, MouseMotionListener{
		public void mousePressed(MouseEvent event) {
			point1 = event.getPoint();
		}
		public void mouseDragged(MouseEvent event) {
			point2 = event.getPoint();
			repaint();
		}
		@Override
		public void mouseMoved(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mouseClicked(MouseEvent e) {
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
		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
}

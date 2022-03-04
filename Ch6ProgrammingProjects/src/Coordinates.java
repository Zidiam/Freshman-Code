/*
 * 
 */
import javax.swing.JFrame;
public class Coordinates {
	public static void main(String [] args) {
		JFrame frame = new JFrame("Coordinates");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new CoordinatesPanel());
		
		frame.pack();
		frame.setVisible(true);
	}
}

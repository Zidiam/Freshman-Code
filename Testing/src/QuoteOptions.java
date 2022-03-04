/*
 * 
 */
import javax.swing.JFrame;
public class QuoteOptions {
	public static void main(String [] args) {
		JFrame frame = new JFrame("Quote Options");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new QuoteOptionsPanel());
		
		frame.pack();
		frame.setVisible(true);
		
	}
}

import javax.swing.JOptionPane;

public class GuessTree extends QTree{
	
	
	/*
	 * Constructor
	 * @param question -- A single name or object with article
	 */
	public GuessTree(String question) {
		this.question = question;
	}
	
	public void printTree() {
		System.out.println("G(" + question + ")");
	}
	
	public QTree play() {
		
		int choice = JOptionPane.showConfirmDialog(null, "Is it " + question + "?");
		if(choice == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Ha! I knew it all along!");
			return this;
		}
		else {
			String correctAnswer = JOptionPane.showInputDialog("Darn it: What is it?");
			String correctQuestion = JOptionPane.showInputDialog("Give me a question that's YES for " + correctAnswer + 
																	"\n and NO for " + question + ".");
			return new QueryTree(correctQuestion, new GuessTree(correctAnswer), this);
		}
	}
}

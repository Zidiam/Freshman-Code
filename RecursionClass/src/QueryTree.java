import javax.swing.JOptionPane;

public class QueryTree extends QTree{
	
	private QTree yesTree;
	private QTree noTree;
	
	public QueryTree(String question, QTree yesTree, QTree noTree) {
		this.question = question;
		this.yesTree = yesTree;
		this.noTree = noTree;
	}
	
	public void printTree() {
		System.out.println("Q{" + question + "\n");
		System.out.print("\tY:");
		yesTree.printTree();
		System.out.println("\tN:");
		noTree.printTree();
		System.out.println("}");
	}
	
	public QTree play() {
		int choice = JOptionPane.showConfirmDialog(null, question);
		if(choice == JOptionPane.YES_OPTION)
			yesTree = yesTree.play();
		else
			noTree = noTree.play();
		return this;
	}
}

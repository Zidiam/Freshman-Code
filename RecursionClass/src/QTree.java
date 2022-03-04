import java.io.File;
import java.io.Serializable;

public abstract class QTree implements Serializable{
	protected String question;
	
	abstract QTree play();
	
	abstract void printTree();
	
	//abstract QTree readTree(File file);
}

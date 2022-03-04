import java.io.FileNotFoundException;
import java.io.*;

import javax.swing.JOptionPane;

/*
 * GuessAnAnimalApp.java
 * Jason Melnik
 * CSC 121
 * 4/5/2019
 */
public class GuessAnAnimalApp {
	
	public static void main(String [] args){
		
		QTree gameTree = null;
		
		try {
			FileInputStream fis = new FileInputStream("gameTree.out");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			gameTree = (QTree) ois.readObject();
			ois.close();
			fis.close();
		}
		catch(ClassNotFoundException e) {
			System.out.println("Unrecoverable error");
			System.exit(0);
		}
		catch(IOException e) {
			System.out.println("No input file, starting new tree");
			gameTree = new GuessTree("Jimmy Neutron");
		}
		
		gameTree.printTree();
		
		do {
			gameTree = gameTree.play();
			
			int choice = JOptionPane.showConfirmDialog(null, "Do you want to play again?");
			if(choice != JOptionPane.YES_OPTION)
				break;
		}while(true);
		
		gameTree.printTree();
		
		try {
			FileOutputStream fos = new FileOutputStream("gameTree.out");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(gameTree);
			oos.close();
			fos.close();
		}
		catch(IOException e) {
			System.out.println("Screwed uo simeplace");
		}
		
	}
}

/*
 * Project5_6.java -- Tester class for the Box object
 * Jason Melnik
 * 10/28/2018
 * CSC 120
 */
import java.util.Scanner;
public class Project5_6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter 3 values with spaces to create a box with (Height Width Depth)");
		Box box1 = new Box(scan.nextDouble(), scan.nextDouble(), scan.nextDouble());//This creates a new Box object
		System.out.println(box1);//this prints the toString()
		System.out.println("Enter 3 values with spaces to create a box with (Height Width Depth)");
		Box box2 = new Box(scan.nextDouble(), scan.nextDouble(), scan.nextDouble());
		System.out.println(box2);
		System.out.println("How fast do you want the depth to be increasing? ");
		double counter = scan.nextDouble();
		System.out.println("Calculating which box will get full first...");
		while(!(box1.getFull()) && !(box2.getFull())) {//This will loop until one of the boxes are full
			box1.setDepth(box1.getDepth() + counter);
			box2.setDepth(box2.getDepth() + counter);
		}
		
		System.out.println("box1: " + box1);
		System.out.println("box2: " + box2);
		
		if (box1.getFull())//This tests if a box is full
			box1.toggleFull();//then sets it back to false
		if(box2.getFull())
			box2.toggleFull();
		System.out.println("Enter 3 values with spaces to create a box with (Height Width Depth)");
		box1.setHeight(scan.nextDouble());//We can set a new height for the object with the setter method
		box1.setWidth(scan.nextDouble());
		box1.setDepth(scan.nextDouble());
		System.out.println(box1);
		System.out.println("Enter 3 values with spaces to create a box with (Height Width Depth)");
		box2.setHeight(scan.nextDouble());
		box2.setWidth(scan.nextDouble());
		box2.setDepth(scan.nextDouble());
		System.out.println(box2);
		System.out.println("How fast do you want the depth to be increasing? ");
		counter = scan.nextDouble();
		System.out.println("Calculating which box will get full first...");
		while(!(box1.getFull()) && !(box2.getFull())) {
			box1.setDepth(box1.getDepth() + counter);
			box2.setDepth(box2.getDepth() + counter);
		}
		
		System.out.println("box1: ");
		System.out.println("Volume: " + box1.getVolume());//we can get the volume and more using getter methods
		System.out.println("Height: " + box1.getHeight());
		System.out.println("Width: " + box1.getWidth());
		System.out.println("Depth: " + box1.getDepth());
        System.out.println("Full? " + box1.getFull());
		System.out.println("box2: ");
		System.out.println("Volume: " + box2.getVolume());
		System.out.println("Height: " + box2.getHeight());
		System.out.println("Width: " + box2.getWidth());
		System.out.println("Depth: " + box2.getDepth());
		System.out.println("Full? " + box2.getFull());
	}
}

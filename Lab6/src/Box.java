/*
 * Box.java -- Simulates a box and its properties
 * Jason Melnik
 * 10/8/2018
 * CSC 120
 */
public class Box {
	
	//variables
	private double height, width, depth, volume;
	private boolean full = false;
	
	public Box(double height, double width, double depth) {//Box takes in parameters for the class
		this.height = height;
		this.width = width;
		this.depth = depth;
		volume = height * width * depth;
	}
	
	public double getHeight() {//this is a getter method which returns the height of the Box
		return height;
	}
	
	public double getWidth() {//this is a getter method which returns the width of the Box
		return width;
	}
	
	public double getDepth(){//this is a getter method which returns the depth of the Box
		return depth;
	}
	
	public double getVolume(){//this is a getter method which returns the volume of the Box
		return depth*height*width;
	}
	
	public boolean getFull() {//this is a getter method which returns true or false if the Box is full
		if(depth >= height)
			full = true;
		return full;
	}
	
	public void setHeight(double height) {//this is a setter method which sets the height of the Box
		this.height = height;
	}
	
	public void setWidth(double width) {//this is a setter method which sets the width of the Box
		this.width = width;
	}
	
	public void setDepth(double depth) {//this is a setter method which sets the depth of the Box
		this.depth = depth;
	}
	
	public void toggleFull() {//this is a setter method which can make the box full if its empty or vise versa 
		this.full = !full;
	}
	
	//This is what is returned when a Box object is called
	public String toString() {
		return "Volume: " + volume + " Height: " + height + " Width: " + width + " Depth: " + depth + " Full? " + full;
	}
}

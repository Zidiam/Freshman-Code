import java.util.Random;

/*
 * Customer -- General Customer
 * Jason Melnik
 * CSC - 121
 * 3/19/2019
 */

public class Customer{
	private String name;
	private int orderNumber;
	private String food; 
	private Random rand = new Random();
	Customer(String name, int orderNumber, String food){
		this.name = name;
		this.orderNumber = orderNumber;
		this.food = food;
	}
	Customer(){
		this.name = "Customer" + rand.nextInt(10000);
		this.orderNumber = rand.nextInt(100000) + 1000;
		if(rand.nextInt(10) > 5) {
			this.food = "HotDog";
		}
		else
			this.food = "Taco";
	}
	
	public String toString() {
		return name + "               " + orderNumber + "               " + food;
	}
}
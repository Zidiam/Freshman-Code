/*
 * Dog.java -- Simulated a Dog's properties
 * Jason Melnik
 * CSC 120
 * 10/28/2018
 */
public class Dog {
	
	//variables
	private String name;
	private int age;
	
	public Dog(String itsName, int itsAge) {
		name = itsName;
		age = itsAge;
	}
	
	//getter method to get the name of the dog
	public String getName() {
		return name;
	}
	
	//getter method to get the age of the dog
	public int getAge() {
		return age;
	}
	
	//This is a setter method which sets a new age for the dog
	public void setAge(int newAge) {
		age = newAge;
	}
	
	//This is a setter method that changes the name of the Dog
	public void setName(String newName) {
		name = newName;
	}
	
	//This returns the dogs age in human years
	public int getAgeInPersonYears() {
		return age * 7;
	}
	
	//This is what is returned when the object is called
	public String toString() {
		return "Name of dog: " + name + " Age: " + age;
	}
	
	
}

/*
 * Project5_5.java -- Testing the Dog class
 * Jason Melnik
 * 10/28/2018
 * CSC 120
 */
public class Project5_5 {
	public static void main(String [] args) {
		Dog myDog = new Dog("Tod", 5);//Initializes the Dog object and assigns it to myDog
		Dog yourDog = new Dog("Jack", 7);
		
		System.out.println(myDog);//prints the toString()
		System.out.println(yourDog);
		
		System.out.println(myDog.getAge());//prints age
		System.out.println(yourDog.getAge());
	
		System.out.println(myDog.getName());//prints name
		System.out.println(yourDog.getName());
		
		System.out.println(myDog.getAgeInPersonYears());//prints age in human years
		System.out.println(yourDog.getAgeInPersonYears());
	
		myDog.setAge(10);//sets a new age
		yourDog.setAge(20);
		
		myDog.setName("Todder");//sets a new name
        yourDog.setName("Jack the ripper");
        
        System.out.println("This is after the changes: ");
        
        System.out.println(myDog);
		System.out.println(yourDog);
		
		System.out.println(myDog.getAge());
		System.out.println(yourDog.getAge());
	
		System.out.println(myDog.getName());
		System.out.println(yourDog.getName());
		
		System.out.println(myDog.getAgeInPersonYears());
		System.out.println(yourDog.getAgeInPersonYears());
	}
}

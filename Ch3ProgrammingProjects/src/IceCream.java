/**
 * IceCream.java -- Let's play around with enum types
 * 
 *
 */
public class IceCream {
	static enum Flavor {vanilla, strawberry, rockyroad, chocolate, superman}
	static enum Grades { A, AB , B, BC, C, CD, D, E}
	
	public static void main(String []args) {
		
		Flavor cone1 = Flavor.chocolate;
		if (cone1.ordinal() > Flavor.vanilla.ordinal())
			System.out.println("Thats the best flavor!");
		if(cone1 == Flavor.chocolate)
			System.out.println("That is the best flavor! ");
		else if (cone1 == Flavor.strawberry)
			System.out.println("Only excpetional people like strawberry!");
		System.out.println("My ice cream cone is: " + cone1.ordinal());
		
		Grades myGrade = Grades.AB;
		if (myGrade.ordinal() < Grades.C.ordinal()) {
			System.out.println("Your doing well!");
		}
		else
			System.out.println("Your not doing well!");
		
	}
}

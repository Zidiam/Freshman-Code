import java.util.ArrayList;
import java.util.Random;

/*
 * Pet.java -- Define attributes and declare capabilities of a pet
 * Jason Melnik
 * CSC 121
 * 1/25/2019
 */
//interface Garrulous{
//	
//	public String speak();
//	
//}
public abstract class Pet{//implements Garrulous
	
	public static enum Gender{Male, Female, Neuter, Androgynous};
	String name;
	String owner;
	int age;
	String favoriteFood;
	Gender g;
	
	public abstract String speak();
	
	public Pet(String name, String favoriteFood) {
		this.name = name;
		this.favoriteFood = favoriteFood;
	}
	
	
	public String getName() {
		return name;
	}

	
	public String toString() {
		return("Pet name: " + name + " Age: " + age + " Favorite Food: " + favoriteFood);
	}
	
	public void setName(String name) {
		this.name = name;
	}


	public String getOwner() {
		return owner;
	}


	public void setOwner(String owner) {
		this.owner = owner;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getFavoriteFood() {
		return favoriteFood;
	}


	public void setFavoriteFood(String favoriteFood) {
		this.favoriteFood = favoriteFood;
	}


	public Gender getG() {
		return g;
	}


	public void setG(Gender g) {
		this.g = g;
	}

	public static Pet instantiate() {
		Random rand = new Random();
		Pet newPet;
		switch (rand.nextInt(5)) {
		case 0:
		case 1:
		case 2:
			newPet = new Chicken();
			break;
		case 3:
		case 4:
		case 5:
		default:
			newPet = new Rat();
			break;
		}
		
		return newPet;
	}
	
	public static void main(String[] args) {
		
		Pet[] myPets = new Pet[17];
		
		ArrayList<Pet> pets2 = new ArrayList<Pet>();
		ArrayList<Pet> pets3 = new ArrayList<Pet>();
		//Pet myPet = new Pet("Fred", "frootloops");
		
		for(int i = 0; i < myPets.length; i++) {
			myPets[i] = instantiate();
			Pet pet = instantiate();
			pets2.add(pet);
			pets3.add(pet);
		}
		
		System.out.println(myPets[7].speak());
		
		for(Pet pet : myPets) {
			System.out.println(pet.speak());
		}
	}
}
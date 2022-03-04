import java.util.ArrayList;

class Animal {}
class Mammal extends Animal{}
class Reptile extends Animal{}

public class InheritanceVsGenericsApp {

	public static void main(String[] args) {
		Animal[] arr = new Mammal[25];
		//arr[0] = new Reptile();//This should not work!
		
		//ArrayList<Animal> arrList = new ArrayList<Mammal>();//Does not work
		ArrayList<Animal> arrList = new ArrayList<Animal>();
		arrList.add(new Mammal());
		arrList.add(new Reptile());
		
		Mammal procupine = (Mammal) arrList.get(0);
	}

}

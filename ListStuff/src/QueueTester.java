
class Dog{
	int name;
	
	public Dog(int i) {
		name = i;
	}
	
	public String bark() {
		return "woof";
	}
	
	public String toString(){
		return "name: " + name;
	}
}

public class QueueTester {
	public static void main(String[] args) {
		ArrayQueue<Dog> dogQ = new ArrayQueue<Dog>();
		
		for(int i = 0; i < 20; i++) {
			dogQ.enqueue(new Dog(i));
		}
		
		System.out.println("The first dog in line is " + dogQ.first());
		while(!dogQ.isEmpty()) {
			System.out.println("One more leaves: " + dogQ.dequeue());
		}
	}
}


public class LinkedIntList {
	int value;
	LinkedIntList rest;
	
	public LinkedIntList(int item) {
		this(item, null);
	}
	
	public LinkedIntList(int item, LinkedIntList rest) {
		value = item;
		this.rest = rest;
	}
	
	public void printList() {
		System.out.println(value);
		if(rest != null) {
			rest.printList();
		}
	}
	
	
	
}

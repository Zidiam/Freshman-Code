package chp16;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Student {
	
	String role;
	
	Student(String Role){
		this.role = Role;
	}
	
	public static void listElements(ArrayList<Student> list) {
		System.out.println("The elements in the list are: ");
		
		for(Student student : list) {
			System.out.print(student.role + " ");
		}
	}
	
	public static void iterateElements(ArrayList<Student> list) {
		System.out.println("The elements in the list are: ");
		
		Iterator<Student> slist = list.iterator();
		
		while(slist.hasNext()) {
			System.out.print(slist.next().role + " ");
		}
		
	}
	
	public static void main(String [] args) {
		Student role = new Student("ABC");
		Student role1 = new Student("DEF");
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		list.add(role);
		list.add(role1);
		
		listElements(list);
		iterateElements(list);
		
	}
}

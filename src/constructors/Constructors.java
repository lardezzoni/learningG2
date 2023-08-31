package constructors;

import java.util.Scanner;

class Student{
	
	private int studentAge;

	// this is the default constructor
	public Student() {
		
		this.studentAge = 10;
	}
	
	//this is the parameterized constructor
	public Student(int age) {
		this.studentAge = age;
	}

	public void setAge(int age2) {

		
		this.studentAge = age2;
	}
	
	public Object getAge() {
		return this.studentAge;
	}
	
	public void displayAge() {
		System.out.println("The age is: "+ studentAge);
	}
	
	
	
}


public class Constructors {
	
	// a constructor is called when an instance of a class is called
	// the new() keywork calls for a constructor 
	// it calls the default constructor if no constructor is available in the class
	// The constructor needs to have the same name as the Class without return type
	// A constructor can call another constructor
	// can be private, public use acess modifiers
	
	// there are two types of constructor: default or parameterized
	// the default has no parameters
	// the parameterized has a specific number of parameters
	
	// withouth the constructor the student Class will have a special one that sets to 0
	
	public static void main(String[] args) {
		
		int age;
		Student student = new Student();
		
		Scanner scan = new Scanner(System.in);
		
		// since there is a constructor, the default value now is 10
		student.displayAge();
		
		// now with a parameterized constructor
		Student studentP = new Student(100000);
		studentP.displayAge();
		System.out.println("Enter age: ");
		age = scan.nextInt();
		student.setAge(age);
		student.displayAge();
			
	}
	
}

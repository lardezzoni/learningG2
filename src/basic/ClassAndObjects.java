package basic;

import java.util.Scanner;

class Student {
	
	
	// Data Members of a particular class
	int studentID;
	String studentName;
	int studentAge;
	
	// if scanner is outside, all methods can use it
	Scanner scanner = new Scanner(System.in);
	
	// Member functions
	
	public void acceptDetails (){
		System.out.println("Enter student ID: ");
		studentID = scanner.nextInt();
		System.out.println("Enter student name: ");
		studentName = scanner.next();
		System.out.println("Enter student age: ");
		studentAge = scanner.nextInt();
		
	}
	
	public void displayDetails () { 
		System.out.println("The student ID is" + studentID + "And name " + studentName);
	}
}

public class ClassAndObjects {

	public static void main(String[] args) {
	//Create an Object of Class Student
	Student x = new Student();
	// the new Student() is the object creation
	
	// call the methods
	x.acceptDetails();
	x.displayDetails();
	
	// If you create another Object student there will be another memory location for it
	}
}

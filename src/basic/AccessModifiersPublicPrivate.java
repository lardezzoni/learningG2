
package basic;

import java.util.Scanner;

// if you want to access this class in another folder you need to change it to public
class Student {
	
	
	// private makes the variables only available in the class
	private int studentID;
	private String studentName;
	private int studentAge;
	

	Scanner scanner = new Scanner(System.in);
	

	
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

//this class is public because JVM will access it to comply it 
public class AccessModifiersPublicPrivate {


	// here is also public for JVM access
	public static void main(String[] args) {

	
	Student x = new Student();
	x.acceptDetails();
	x.displayDetails();
	// if you try to access the private variables studentName here it wont let you
	}
}
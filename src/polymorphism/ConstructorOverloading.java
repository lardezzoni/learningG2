package polymorphism;

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

public class ConstructorOverloading {
	
	//This allows multiple constructors with different parameters lists to be defined
	//inside a class
	//This allows developers to create objects with different initial states 
	//without having to create different classes
	public static void main(String[] args) {
	Student s = new Student();
	s.displayAge();
	System.out.println("------------------------------");
	Student s2 = new Student(100000);
	s2.displayAge();
	// so you have 2 constructors inside a class, one default and another
	//parameterized
	System.out.println("------------------------------");	
	Student s3 = new Student(4444);
	s3.displayAge();
	
	}
	
}

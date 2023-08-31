package constructors;

class Example{
	
	private String name;
	private int age;
	
	// default constructor
	public Example() {
		// this will call the constructor that has STRING then AGE
		this("go to next", 100);
		this.name = "default";
		this.age = 10;
		
	}
	public Example(String name2, int age2) {
		//this will call the constructor that has AGE then STRING
		this(1000, "next 2");
		this.name = name2;
		this.age = age2;
	}
	public Example(int age3, String name3) {
		this.name = name3;
		this.age = age3;
	}
	
	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Age:"+ age);
	}
}

public class ConstructorChaining {

	// Is the process of calling one constructor from another 
	// in respect of one Object
	// The objective is to pass different paramenters through diff constructors
	// the initialization should be done in one place
	
	// initialize the Object
	public static void main(String[] args) {
		
		Example example = new Example();
		example.display();
		// now if you call the constructor 2
		Example example2 = new Example("two", 10000);
		example2.display();
		
	}
	
		
	
	
}

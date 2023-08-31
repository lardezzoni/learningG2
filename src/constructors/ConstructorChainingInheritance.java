package constructors;

class Person2{
	
	String name;
	
	public Person2(){
		System.out.println("Person2 class invoked. ");
		this.name = "Luiz";
	}
	public Person2(String param) {
		System.out.println("Person2 parameterized invoked. ");
		this.name = param;
	}
	
}

class Employee extends Person2{
	String work;
	
	public Employee() {
		System.out.println("Employee class invoked. ");
		this.work = "Programmer";
	}
	public Employee(String param) {
		// if you add super() then whatever you add on the creation
		//will now be assigned to the child class
		super("AHAAHAHAH");
		System.out.println("Employee parameterized invoked. ");
		this.work = "param";
	}
	
}

public class ConstructorChainingInheritance {

	public static void main(String[] args) {
		//this will invoke the parent class
		
		String name = "test";
		Employee test = new Employee();
		// this will invoke the parent class but not the child because has not super() on int
		Employee test2 = new Employee(name);
		
		
			
	}
	
}

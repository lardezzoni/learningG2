package polymorphism;


class Person{
	
	public String name;
	public int age;
	
	public Person(String name1, int age2) {
		
		this.name = name1;
		this.age = age2;
		
	}
	
	public void display() {
		System.out.println("Name: "+ this.name);
		System.out.println("Age: "+ this.age);		
	}
	public void withoutSuper() {
		System.out.println("This is the parent.");		
	}
}

class Employee extends Person{
	
	public String designation;
	public float salary;
	
	public Employee(String name, int age, String designation, float salary) {
		super(name, age);
		this.designation = designation;
		this.salary = salary;
	}
	
	// this is the method override
	public void display() {
		super.display();
		System.out.println("Designation: "+ this.designation);
		System.out.println("Salary: "+ this.salary);		
	}
	public void withoutSuper() {
		System.out.println("This is the child.");		
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		
		Employee employee = new Employee("Luiz", 31, "Programmer", 10000);
		employee.display();
		//without the super in the child, the child method would be called
		employee.withoutSuper();
		
	}
	
}

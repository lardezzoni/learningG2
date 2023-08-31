package basic;


class Person{
	
	private String firstName;
	private String lastName;
	private int age;
	
	
	// this is the getter, you return the variable value
	public Object getFirstName() {
		return this.firstName;
	}
	public Object getLastName() {
		return this.lastName;
	}
	//this is the setter, you set the variable value
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}	
	public void setLastName(String firstName) {
		this.lastName = firstName;
	}	
	
	// you can create validation inside the method to check something
	public Object getAge() {
		return this.age;
	}
	public void setAge(int age2) {
		//this is the validation
		if (age2 > 18) {
			this.age = age2;
		}
		else {
			System.out.println("Invalid age");
		}
	}
}

public class Encapsulation {

	public static void main (String[] args) {
		
		Person person = new Person();
		// if you try to access person.firstName is not possible because
		// is private
		person.setFirstName("luiz");
		System.out.println(person.getFirstName());
		
		
	}
}

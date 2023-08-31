package inheritance;

class Parent {
	
	public String name;
	public int age;
	
	public Parent(){
		this.name = "test";
		this.age = 100;
	}
	
	public void display(){
		System.out.println("The name is: "+ this.name);
		System.out.println("The age is: "+ this.age);
	}
	
	public void setName(String name2) {
		this.name = name2;
	}
	public void sameMethod() {
		System.out.println("This is the parent");
	}
	
	
}

class Child extends Parent{
	
	private float number1;
	private float number2;
	protected String prot;
	
	public Child() {
		this.prot = "protected from child 1";
	}
	
	public void display1(){
		System.out.println("The number1 is: "+ this.number1);
		System.out.println("The number2 is: "+ this.number2);
	}
	
	public void setNumber(float number) {
		this.number1 = number;
	}
	public void sameMethod() {
		//super. is saying that if this is called in the child, the method from
		//the parent will be called
		super.sameMethod();
		System.out.println("This is the child");
	}
}

//multilevel inheritance
class Child2 extends Child{
	private float number3;
	
	public void display2(){
		System.out.println("The number1 is: "+ this.number3);
	}
	public void sameMethod() {
		//now this will call Child and then Parent
		super.sameMethod();
		System.out.println("This is the child2");
	}
}

class FinalChild extends Child2{
	
	private String wantsToAccess;
	
	public FinalChild() {
		this.wantsToAccess = prot;
		System.out.println(wantsToAccess);
	}
}

public class Inheritance {

	public static void main(String[] args) {
		
		Parent parent = new Parent();
		parent.display();
		System.out.println("-------------------------");
		
		// now if I create a child and want to access the parent
		Child child = new Child();
		child.display();
		// and now access the method of the child
		child.setNumber(1000);
		child.display1();
		// if the method is the same name in parent and child
		//since has super then the parent is called first
		child.sameMethod();
		System.out.println("-------------------------");
		
		// now with multilevel inheritance
		Child2 child2 = new Child2();
		child2.sameMethod();
		
		//now the final class wants to access a protected variable from Child1
		System.out.println("-------------------------");
		
		FinalChild fc = new FinalChild();
			
		
	}
	
}

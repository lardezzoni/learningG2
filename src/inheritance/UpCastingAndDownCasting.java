package inheritance;

class Vehicle {
	
	void methodDrive() {
		System.out.println("We are driving (parent)");
	}
}
class Car extends Vehicle{
	void methodDrive() {
		System.out.println("We are driving a car (child)");
	}
}


public class UpCastingAndDownCasting {
		
	//There are two types of Object typecasting in java:
	//UpCasting and DownCasting
	
	//In UpCasting we are typecasting an child object to a parent object
	//Its done automaticatly
	
	//In DownCasting a parent class reference object is given to the child during downcasting
	//Is not possible to give a  parent class reference object to a child in Java
	
	public static void main(String[] args) {
		
		//this is DownCasting
		//its not secure so you need to do explicitly
		Vehicle vehicle = new Car(); 
		Car car = (Car) vehicle;
		car.methodDrive();
		
		//this is UpCasting
		Vehicle vehicleUp = new Car();
		vehicleUp.methodDrive();
		
		
	}
	
	
}

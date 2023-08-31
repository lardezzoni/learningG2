package basics;

import java.util.Scanner;

public class ReadingInputFromUser {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = scanner.nextLine();
		System.out.print("Enter your age: ");
		int age = scanner.nextInt();

		System.out.print("Enter your contact number: ");
		double contact = scanner.nextDouble();
		
		
		System.out.println("name : "+ name);
		System.out.println("age : "+ age);

		System.out.println("contact: "+ contact);
		
	}
}

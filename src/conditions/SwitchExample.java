package conditions;

import java.util.Scanner;

public class SwitchExample {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Admin - Gets full access");
		System.out.println("Sub Admin - Gets access to create/delete courses");
		System.out.println("testprep - Gets access to create/delete test");
		System.out.println("user - Gets access to content");
		System.out.println("Enter your choice");
		String user = scanner.nextLine();
		
		switch(user){
			case "Admin":
				System.out.println("Gets full access");
				break;
			case "Sub Admin":
				System.out.println("Gets semi access");
				break;
			case "testprep":
				System.out.println("Gets semi access to tests");
				break;
			case "user":
				System.out.println("Access content");
				break;
			default:	
				System.out.println("You cannot access");
				break;
		}	
	
		
	}
}

package loops;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		
		int i = 1;
		
		while (i <= 10) {
			
			System.out.println("hello" + i);
			i++;
	
		}
		
		Scanner scanner = new Scanner(System.in);
		String input = "";
		
		while(!input.equals("quit")) {
			System.out.println("Enter message : ");
			input = scanner.nextLine().toLowerCase();
			System.out.println(input);
		}
	}
}

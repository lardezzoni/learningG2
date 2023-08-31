package loops;

import java.util.Scanner;

public class FizzBuzzExercise {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String input = "";
		int max = 20;
		int i = 1;
		
		while (!input.equals("break")) {
			System.out.println("Enter the number: ");
			input = scanner.nextLine();
			
			if (i == max || i > max) {
				input = "break";
			}
			if((i % 3) == 0) {
				if (((i % 3) == 0)&&((i%5) == 0)) 
					if (input == "FizzBuzz") {
						System.out.println(input);
						continue;
					}
					else {

								System.out.println("wrong");
							
					}
				else

					if (input == "Fizz"){
						System.out.println(input); 
						continue;
					}
					else {
						System.out.println("wrong");
					}
			}
			if((i % 5) == 0) {
				if (input == "Buzz") {
					System.out.println(input); 
					continue;
				}
					else
						System.out.println("wrong");
			}
				
			i++;

			
		}
		
				
	}
}

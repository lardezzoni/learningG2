package conditions;

public class ConditionsWithOperators {
	public static void main(String[] args) {
	
		boolean isLoggedIn = true;
		boolean isEmailVerified = false;
		boolean isCardInfoValid = true;
		
		if (isLoggedIn && isEmailVerified && isCardInfoValid) {
			System.out.println("You are allowed");
		}
		else {
			System.out.println("You are not allowed");
		}
		
		if (isLoggedIn) {
			if(isEmailVerified) {
				if(isCardInfoValid) {
					System.out.println("You are allowed");
				}
				else {
					System.out.println("You are not allowed");
				}
					
			}
			else {
				System.out.println("You are not allowed");
			}
		}
		else {
			System.out.println("You are not allowed");
		}

		
	}
}

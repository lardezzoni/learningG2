package basics;

public class TernaryOperator {
	
	public static void main(String[] args) {
		
		boolean isAuthenticated = true;
		
		if(isAuthenticated)
			System.out.println("You are authenticated");
		else 
			System.out.println("You are not authenticated");
		
		// Ternary operator (a short form of if else)
		String result = (isAuthenticated) ? "logged in" : "not logged in" ;
		System.out.println(result);
		
		
	}
}

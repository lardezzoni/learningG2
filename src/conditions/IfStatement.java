package conditions;

public class IfStatement {

	public static void main(String[] args) {
		
		boolean isAuthenticated = true;
		
		if (isAuthenticated) {
			System.out.println("logged");
		}
		if (!isAuthenticated) {
			System.out.println("not logged");
		}
		
		//or using else
		
		boolean isAuth = true;
		
		if (isAuth) {
			System.out.println("logged");
		}
		else {
			System.out.println("not logged");
		}
		
		
	}
}


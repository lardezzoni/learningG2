package conditions;

public class IfElseIfElse {
	public static void main(String[] args) {
		
		float sellingPrice = 1300, costPrice = 1000;
		
		if(sellingPrice>costPrice) 
			System.out.println("profit");
			else if(costPrice>sellingPrice)
			System.out.println("loss");
		else
			System.out.println("Neither");
		
			
		//or 
			
		if(sellingPrice>costPrice) 
				System.out.println("profit");
		else {
					if(costPrice>sellingPrice)
						System.out.println("loss");
					else
						System.out.println("Neither");
		}			
					
	}
}

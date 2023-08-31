package basics;

public class AssignmentOperators {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		int num3;
		
		num3 = num1;
		System.out.println("num 3 = num 1: " + num3);
		num1 += num2;
		System.out.println("num1 += num 2: " + num1);
		num1 *= num2;
		System.out.println("num1 *= num 2: " + num1);
		num1 /= num2;
		System.out.println("num1 /= num 2: " + num1);
		num1 -= num2;
		System.out.println("num1 -= num 2: " + num1);
		num1 %= num2;
		System.out.println("num1 %= num 2: " + num1);
		
		
	}
}

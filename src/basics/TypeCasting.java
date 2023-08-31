package basics;

public class TypeCasting {
	public static void main(String[] args) {
		
		int intValue = 100;
		
		//Implicit Type Casting from int to long
		long longValue = intValue;
		double doubleValue = longValue;
		
		System.out.println(intValue);
		System.out.println(longValue);
		System.out.println(doubleValue);
		
		System.out.println();
		//Explicit Type Casting from double to int
		double doubleValue2 = 100.56D;
		int intValue2 = (int)doubleValue2;
		
		//Explicit Type Casting from int to byte
		byte byteValue = (byte) intValue2;
		
		System.out.println(doubleValue2);
		System.out.println(intValue2);
		System.out.println(byteValue);
		
		
	}
}

package basics;

import java.util.Date;






public class VariablesAndDatatypes {
	public static void main(String[] args) {
		//Primitive datatypes
		byte age = 23;
		long viewsCount = 1_112_345_678;
		float price = 234.5F;
		char gender = 'M';
		boolean isTrue = true;
		System.out.println(age);
		System.out.println(viewsCount);
		System.out.println(price);
		System.out.println(gender);
		System.out.println(isTrue);
		System.out.println(age);
		
		//Non-Primitive datatypes
		String name = "welcome back";
		System.out.println(name);
		Date now = new Date();
		System.out.println(now);

		
		
	}
}

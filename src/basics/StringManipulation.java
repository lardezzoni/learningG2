package basics;

public class StringManipulation {
	
	public static void main(String[] args) {
		
		//String Literal
		String str1 = "Hello";
		System.out.println(str1);
		
		//String object
		String str2 = new String("World");
		System.out.println(str2);
		
		//Concatenating string litteral and object
		String str3 = str1 + " " + str2;
		System.out.println(str3);
		
		System.out.println(str3.length());
		System.out.println(str3.charAt(0));
		System.out.println(str1.concat(str2));
		System.out.println(str3.substring(0,5));
		System.out.println(str1.equals(str2));
		System.out.println(str3.contains("Hello"));
		System.out.println(str3.toUpperCase());
		System.out.println(str3.toLowerCase());
		
		
		
	}
}

package basics;

public class SingleDimensionArray {

	public static void main(String[] args) {
		
		//Declaring an array
		int marks[];
		marks = new int[5];
		// or int marks = new int[];
		
		//initializing an array
		int[] marks2 = new int[] {10, 20, 30, 40, 50};
		
		//declare and assign
		int[] marks3 = new int[5];
		marks3[0] = 1;
		marks3[1] = 2;
		marks3[2] = 3;
		marks3[3] = 4;
		marks3[4] = 5;
		
		for (int i = 0; i < marks3.length; i++) {
			int j = marks3[i];
			System.out.println(j);
		}
		
		System.out.println();
		
		for(int value: marks3) {
			System.out.println(value);
		}
		
		
	}
	
}

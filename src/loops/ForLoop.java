package loops;

public class ForLoop {

	public static void main(String[] args) {
		
		String[] output = new String[10];
		
		for (int i = 0 ; i < 10 ; i++) {
			output[i] = "hello";
			System.out.println(output[i] + i);
		}
	}
}

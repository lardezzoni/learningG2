package arrays;

public class StringBufferStringBuilder {

	public static void main(String[] args) {
		
		long time = System.currentTimeMillis();
		
		StringBuffer buffer = new StringBuffer("Hello ");
		buffer.append("World");
		System.out.println(buffer);
		
		//to initialize empty and see the capacity
		StringBuffer buffer2 = new StringBuffer();
		System.out.println(buffer2.capacity());
		
		//Builder is a class with immutable things but without the capacity of thread safety 
		StringBuilder builder = new StringBuilder("Hello ");
		System.out.println(builder.capacity());
		builder.append("World");
		System.out.println(builder);
		
		//Another example
		StringBuffer buffer3 = new StringBuffer("Hello ");
		for (int i = 0; i < 10000; i++) {
			buffer3.append("World");
		}
		System.out.println("Time taken by System Buffer : " + (System.currentTimeMillis() - time));
		
		long time2 = System.currentTimeMillis();
		
		
		StringBuilder builder2 = new StringBuilder("Hello ");
		for (int i = 0; i < 10000; i++) {
			builder.append("World");
		}
		System.out.println("Time taken by System Builder : " + (System.currentTimeMillis() - time2));

	}
}
		
		
		
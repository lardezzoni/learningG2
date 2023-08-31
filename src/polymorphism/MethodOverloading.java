package polymorphism;

class Calculation{
	
	//this is method overloading
	public static int addition (int x, int y) {
		return x+y;
	}
	public static int addition (int x, int y, int z) {
		return x+y+z;
	}	
	public static double addition (double  x, double y) {
		return x+y;
	}
	public static float addition (float x, int y) {
		return x+y;
	}
	public static void display(double a) {
		System.out.println("Number: " + a);
	}
}

public class MethodOverloading {

	// Is when you have a method with a same name but with diff parameters
	//Used when you have a similar task but with diff param
	
	public static void main(String[] args) {
		Calculation test = new Calculation();
		int x = 10;
		int y = 20;
		double k = 30;
		double w = 40;
		int ma = Calculation.addition(x,y);
		Calculation.display(ma);
		double ma1 = Calculation.addition(k, w);
		Calculation.display(ma1);
		
		
		
		
	}
	
	
}

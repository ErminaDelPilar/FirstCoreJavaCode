package Variables;

public class Modifiers {

	static final float pie = 3.14F;
	static int r = 10;
	
	public static void main(String[] args) {
		
		//public int a = 10;
		//private int b = 20;
		//protected int c = 30;
		//transient int d = 40;
		//volatile int e = 50;
		final int f = 60;  //only final keyword modifier is allowed for local variable;
		
		areaOfACircle();
	}

	
	public static void areaOfACircle() {
		
		
		// pie = 424;
		float result = pie*r*r;
		System.out.println("Area of a Circle is " +result);
		
	}
}

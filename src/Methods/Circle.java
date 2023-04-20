package Methods;

public class Circle {
 
	final static double pie = 3.147D;
	static int radius = 20;
	
	public static void diameter() {
		area();
		System.out.println("Diameter of a circle is " +2*radius);
		
	}
	
	public static void area() {
	    circumference();
		System.out.println("Area of a circle is " +pie*(radius*radius));	
	
	}
	
	public static void circumference() {
		System.out.println("Circumference of a circle is " +2*pie*radius);
		
	}
	
	public static void main(String[] args) {
		System.out.println("Nain method execution started");
		
		diameter();
		//area();
		// circumference();
		System.out.println("Nain method execution ended");

	}

}

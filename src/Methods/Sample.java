package Methods;

public class Sample {

	public static void a1() {
		System.out.println("Running in a1() method");
	}
	
	public void nonStaticMethod() {
	
	System.out.println("Running in nonStaticMethod() method");
	}

	public static void main(String[] args) {
		//method call
		a1();  //static method
		
        //create an object for the class
		
		Sample ns = new Sample(); //nonstatic method
        ns.nonStaticMethod();
        
	}

}

package Methods;

public class Test {

	/** Constructor Method 
	 * special type of a method which does not have any return type.
	 * it will always hold the name of the class
	 * it does not have any modifier (Static keyword);
	 * When an object is created for a class, authomatically constructor will get called and executed
	 * constructor will HAVE access specifier (public)
	 * 
	 *if user is not defining the constructor in a class, then compiler auto-generates the constructor and keeps it in the .class file
	 */
	
	 
	 
	public Test() {
		System.out.println("Running in Constructor");
	}

	public static void main(String[] args) {

		Test ref = new Test();

	}

}

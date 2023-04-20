package Methods;

public class Methods {
	
	int a = 300;

	public static void m1() {
		System.out.println("Running in m1()");
	}

	public static void m2() {
		m1();
		System.out.println("Running in m2()");

	}

	public static void m3() {
		m2();
		System.out.println("Running in m3()");
	}
	
	public void m4() {
		System.out.println("Running in non-stativ m4()");
	}

	public static void main(String[] args) {

		// how to call static methods
		//m1();

		// if calling a static method in a different class
		// className.methodName();
		//Methods.m2();
		//m3();
		
		Methods ref = new Methods();
		ref.m4();
		
	}

}

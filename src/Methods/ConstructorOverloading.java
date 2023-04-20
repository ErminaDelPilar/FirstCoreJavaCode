package Methods;

public class ConstructorOverloading {


	static ConstructorOverloading ref ;
	static ConstructorOverloading ref1 ;
	static ConstructorOverloading ref2 ;

	public ConstructorOverloading() {
		System.out.println("Running on contstructor");
	}

	public ConstructorOverloading(int x) {
		System.out.println("Running on contstructor and value is "+x);
	}

	public ConstructorOverloading(double d) {
		System.out.println("Running on contstructor and value is "+d);
	}

	public ConstructorOverloading(String name) {
		System.out.println("Running on contstructor and value is "+name);
	}

	public static void main(String[] args) {

		 ref  = new ConstructorOverloading();
		 ref1  = new ConstructorOverloading(30.345);
		 ref2  = new ConstructorOverloading("Rakesh");
		 
     }
	
}

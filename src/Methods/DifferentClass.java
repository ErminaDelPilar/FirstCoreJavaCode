package Methods;

public class DifferentClass {

	public static void main(String[] args) {
		
		//calling static method of Sample
		//ClassName.Methodname
		
		Sample.a1();

		//Calling non static method of Sample Class
		//Create an object of Sample
		
		Sample s = new Sample();
		s.nonStaticMethod();
		
	}

}

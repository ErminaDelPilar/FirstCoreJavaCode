package Variables;

public class StaticVariable {

	//global var
	
	static int a = 60;
	static int b = 30;
	
	
	public static void add() {
	
		int c = a + b;
		System.out.println("Addition of 2 number is " + c);
		
	}
	
	public static void sub() {
		
		int result = a - b;
				
		System.out.println("Subtraction of 2 number is " + result);
		
	}
	
	public static void multiply() {
		
		int multiply = a*b;
		System.out.println("Multiplication of 2 number is " + multiply);
	}
	public static void main(String[] args) {
		add();
		sub();
		multiply();
		
	}

}

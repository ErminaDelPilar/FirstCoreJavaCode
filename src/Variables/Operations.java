package Variables;

public class Operations {
	
	public static void add() {
		//local var, temporary var , not accessible outside this method
		int a = 60;
		int b = 10;
		int c = a + b;
		System.out.println("sum of 2 numbers " +c);
						
	}
	
	public static void sub() {
		//scope of a var.  accessibility of a var
		
		int a = 70;
		int c = 30 ;
		int d = a - c ;
		System.out.println("substraction of 2 values is " +d);
		
	}

	public static void main(String[] args) {
	    add();
	    sub();
			

	}

}

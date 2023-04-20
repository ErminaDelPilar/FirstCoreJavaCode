package Variables;

public class LocalVariables {

	
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

		public static void m1(int i) {
			
			System.out.println("value of i from m1 () " +i);
			
		}
		
		
		public static void main(String[] args) {
		    //add();
		    //sub();
		    m1(500);  //parameter to the argumented method 1()
				

		}

	}


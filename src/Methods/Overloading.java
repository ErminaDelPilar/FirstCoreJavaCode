package Methods;

public class Overloading {

		public static void m1() {
			System.out.println("Running in zero argumented m1 method");
		}

		public static void m1(int x) {
			System.out.println("Running in int argumented m1 method and value is "+x);
		}

		public static void m1(String name) {
			System.out.println("Running in String argumented m1 method and value is "+name);
		}

		public static void m1(double d) {
			System.out.println("Running in double argumented m1 method and value is "+d);
		}

		public static void main(String[] args) {
			// method calls
			m1();
			m1("Ermina");
			m1(300);
			m1(400.34653);
		}
	}



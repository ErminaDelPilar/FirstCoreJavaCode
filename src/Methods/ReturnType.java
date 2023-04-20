package Methods;

public class ReturnType {

	public static String m1() {

		String name = "Rakesh";
		return name;
	}

	public static Methods m2() {

		Methods ref = new Methods();

		return ref;
	}

	public static void main(String[] args) {

		String value = m1();
		System.out.println(m1());
		System.out.println(value);

		Methods object = m2();
		System.out.println("Value of variable from Methods object is "+object.a);
	}

}

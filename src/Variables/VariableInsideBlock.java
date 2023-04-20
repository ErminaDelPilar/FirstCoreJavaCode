package Variables;

public class VariableInsideBlock {

	public static void main(String[] args) {
		
		int x = 10;
		
		for(int j = 0 ; j<2; j++) {
			System.out.println("value of x is " +x);
			System.out.println("value of j is " +j);
		}
		System.out.println("value of j is " +x);
		//scope of local var j is not outside the for loop block
		// System.out.println("value of j is " +j);
	}

}

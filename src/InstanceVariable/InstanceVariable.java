package InstanceVariable;

public class InstanceVariable {

	//instance variable, nonstatic var
	int x = 20;
	
	
	public static void main(String[] args) {
		
		//Create an object of a class
		InstanceVariable ref = new InstanceVariable();
		System.out.println("Value of x " +ref.x);
		
	}

}

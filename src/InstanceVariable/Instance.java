package InstanceVariable;

public class Instance {

	//instance variable
	
	int x=20;
	String name;
	int rollNumber;
	static String school = "DAV School";
	
    public static void main(String[] args) {
	
   Instance i = new Instance();
   
   System.out.println("value of x " +i.x);
   System.out.println("Value of School " +school);
   System.out.println("Value of statis variable School via object " +i.school);
   i.m1();
	}

	public void m1() {
		
	System.out.println("value of x " +x);
	System.out.println("Value of School " +school);
	System.out.println("Value of Name " +name);
	System.out.println("Value of RollNumber " +rollNumber);
	
	
	}
}

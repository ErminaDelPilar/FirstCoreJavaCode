package InstanceVariable;

public class Student {

	// things that change from object to object we declare it as instance variable; do not declare as static
	 String name;
	 int age;
	 int rollNumber;
	//things that do not change from object to object we declare as static
	 static String school = "DAV school";
	
	
	 public void display() {

		 System.out.println("Name = " +name);
		 System.out.println("Age = " +age);
		 System.out.println("rollNumber = " +rollNumber);
		 System.out.println("School Name  = " +school);
		 
	 }
	 public static void main(String[] args) {
		
		Student s = new Student();
		s.name = "Ram";
		s.age = 28;
		s.rollNumber = 908;
		s.display();
		

		Student s1 = new Student();
		s1.name = "Ermina";
		s1.age = 50;
		s1.rollNumber = 909;
		s1.display();
		
		school = "Jain International School";
				
				
		Student s2 = new Student();
		s2.name = "Leo";
		s2.age = 50;
		s2.rollNumber = 1000;
		s2.display();
		
		Student s3 = new Student();
		s3.display();
		
		
	}

}
